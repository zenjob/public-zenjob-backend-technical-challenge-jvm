package com.zenjob.challenge.service;

import com.zenjob.challenge.entity.Shift;
import com.zenjob.challenge.repository.JobRepository;
import com.zenjob.challenge.repository.ShiftRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Repository
@Transactional
public class ShiftService {
    private final ShiftRepository shiftRepository;

    public List<Shift> getShifts(UUID id) {
        return shiftRepository.findAllByJob_Id(id);
    }

    public void bookTalent(UUID talent, UUID shiftId) {
        shiftRepository.findById(shiftId).map(shift -> shiftRepository.save(shift.setTalentId(talent)));
    }

    public void cancelShift(UUID uuid) {
        shiftRepository.deleteById(uuid);
    }
}
