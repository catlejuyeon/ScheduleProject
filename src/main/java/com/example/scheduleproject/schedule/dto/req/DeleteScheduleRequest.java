package com.example.scheduleproject.schedule.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class DeleteScheduleRequest {
    @NotBlank(message = "비밀번호는 필수입니다.")
    private String password;
}
