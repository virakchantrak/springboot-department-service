package kh.virakchantrak.department_service.service;

import kh.virakchantrak.department_service.dto.DepartmentRequestDTO;
import kh.virakchantrak.department_service.dto.DepartmentResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DepartmentService {
    DepartmentResponseDTO create(DepartmentRequestDTO requestDTO);
    DepartmentResponseDTO getById(Long id);
    Page<DepartmentResponseDTO> getAllDepartments(Pageable pageable);
}
