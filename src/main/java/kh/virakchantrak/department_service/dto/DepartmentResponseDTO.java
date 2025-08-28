package kh.virakchantrak.department_service.dto;

import lombok.Data;

@Data
public class DepartmentResponseDTO {
    private Long id;
    private String name;
    private String description;
    private String departmentCode;
}
