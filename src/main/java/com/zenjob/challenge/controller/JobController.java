package com.zenjob.challenge.controller;

import com.zenjob.challenge.dto.ResponseDto;
import com.zenjob.challenge.entity.Job;
import com.zenjob.challenge.service.JobService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.UUID;

@Controller
@RequestMapping(path = "/job")
@RequiredArgsConstructor
public class JobController {
    private final JobService jobService;

    @PostMapping
    @ResponseBody
    public ResponseDto<RequestJobResponse> requestJob(@RequestBody @Valid RequestJobRequestDto dto) {
        try {
            Job job = jobService.createJob(UUID.randomUUID(), dto.companyId, dto.start, dto.end);
            return ResponseDto.<RequestJobResponse>builder()
                    .data(RequestJobResponse.builder()
                            .jobId(job.getId())
                            .build())
                    .build();
        } catch (DateTimeException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @DeleteMapping(path = "/{jobId}")
    @ResponseBody
    public ResponseDto<DeleteJobResponse> cancelJob(@PathVariable("jobId") UUID uuid) {
        try {
            jobService.cancelJob(uuid);
            return ResponseDto.<DeleteJobResponse>builder()
                    .data(DeleteJobResponse.builder()
                            .jobId(uuid)
                            .build())
                    .build();
        } catch (EmptyResultDataAccessException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Job id not found.");
        }
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    private static class RequestJobRequestDto {
        @NotNull
        private UUID      companyId;
        @NotNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        private LocalDate start;
        @NotNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        private LocalDate   end;
    }

    @Builder
    @Data
    private static class RequestJobResponse {
        UUID jobId;
    }

    @Builder
    @Data
    private static class DeleteJobResponse {
        UUID jobId;
    }
}
