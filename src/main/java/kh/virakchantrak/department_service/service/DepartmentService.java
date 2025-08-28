package kh.virakchantrak.department_service.service;

import kh.virakchantrak.department_service.dto.DepartmentRequestDTO;
import kh.virakchantrak.department_service.dto.DepartmentResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DepartmentService {
    DepartmentResponseDTO create(DepartmentRequestDTO requestDTO);
    DepartmentResponseDTO getById(Long id);
    DepartmentResponseDTO getByDepartmentCode(String departmentCode);
    Page<DepartmentResponseDTO> getAllDepartments(Pageable pageable);
}
