package kh.virakchantrak.department_service.service;

import kh.virakchantrak.department_service.dto.DepartmentRequestDTO;
import kh.virakchantrak.department_service.dto.DepartmentResponseDTO;

public interface DepartmentService {
    DepartmentResponseDTO create(DepartmentRequestDTO requestDTO);
}
