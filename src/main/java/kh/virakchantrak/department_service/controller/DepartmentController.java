package kh.virakchantrak.department_service.controller;

import jakarta.validation.Valid;
import kh.virakchantrak.department_service.dto.DepartmentRequestDTO;
import kh.virakchantrak.department_service.dto.DepartmentResponseDTO;
import kh.virakchantrak.department_service.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping
    public DepartmentResponseDTO create(@Valid @RequestBody DepartmentRequestDTO requestDTO) {
        return departmentService.create(requestDTO);
    }
}
