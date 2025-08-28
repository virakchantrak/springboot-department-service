package kh.virakchantrak.department_service.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DepartmentRequestDTO {

    @NotNull
    private String name;
    private String description;
    @NotNull
    private String departmentCode;
}
