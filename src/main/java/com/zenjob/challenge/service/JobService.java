package com.zenjob.challenge.service;

import com.zenjob.challenge.entity.Job;
import com.zenjob.challenge.entity.Shift;
import com.zenjob.challenge.repository.JobRepository;
import com.zenjob.challenge.repository.ShiftRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@RequiredArgsConstructor
@Repository
@Transactional
public class JobService {
    private final JobRepository   jobRepository;
    private final ShiftRepository shiftRepository;

    public Job createJob(UUID uuid, UUID companyId, LocalDate date1, LocalDate date2) throws DateTimeException {
        if (ChronoUnit.DAYS.between(date1, date2) < 1) {
            throw new DateTimeException("End date must be at least 1 day after start date.");
        }
        Job job = Job.builder()
                .id(uuid)
                .companyId(companyId)
                .startTime(date1.atTime(9, 0, 0).toInstant(ZoneOffset.UTC))
                .endTime(date2.atTime(17, 0, 0).toInstant(ZoneOffset.UTC))
                .build();
        job.setShifts(LongStream.range(0, ChronoUnit.DAYS.between(date1, date2))
                .mapToObj(idx -> date1.plus(idx, ChronoUnit.DAYS))
                .map(date -> Shift.builder()
                        .id(UUID.randomUUID())
                        .job(job)
                        .startTime(date.atTime(9, 0, 0).toInstant(ZoneOffset.UTC))
                        .endTime(date.atTime(17, 0, 0).toInstant(ZoneOffset.UTC))
                        .build())
                .collect(Collectors.toList()));
        return jobRepository.save(job);
    }

    public List<Shift> getShifts(UUID id) {
        return shiftRepository.findAllByJob_Id(id);
    }

    public void bookTalent(UUID talent, UUID shiftId) {
        shiftRepository.findById(shiftId).map(shift -> shiftRepository.save(shift.setTalentId(talent)));
    }
}
