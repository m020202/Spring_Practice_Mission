package javalab.umc7th_mission.web.dto.member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import javalab.umc7th_mission.domain.enums.Role;
import javalab.umc7th_mission.validation.annotation.ExistCategories;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class MemberRequestDTO {
    @Getter
    @Setter
    public static class JoinDto {
        @NotBlank
        String name;
        @NotNull
        Integer age;
        @Email
        String email;
        @NotBlank
        String password;
        @NotNull
        Integer gender;
        @NotNull
        Integer birthYear;
        @NotNull
        Integer birthMonth;
        @NotNull
        Integer birthDay;
        @Size(min = 5, max = 12)
        String address;
        @Size(min = 5, max = 12)
        String specAddress;
        @ExistCategories
        List<Long> preferCategory;
        @NotNull
        Role role;
    }
}
