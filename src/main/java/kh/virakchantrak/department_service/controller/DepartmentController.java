package kh.virakchantrak.department_service.controller;

import jakarta.validation.Valid;
import kh.virakchantrak.department_service.dto.DepartmentRequestDTO;
import kh.virakchantrak.department_service.dto.DepartmentResponseDTO;
import kh.virakchantrak.department_service.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping
    public DepartmentResponseDTO create(@Valid @RequestBody DepartmentRequestDTO requestDTO) {
        return departmentService.create(requestDTO);
    }

    @GetMapping("/{id}")
    public DepartmentResponseDTO getById(@PathVariable Long id) {
        return departmentService.getById(id);
    }

    @GetMapping("/code/{departmentCode}")
    public DepartmentResponseDTO getDepartmentByCode(@PathVariable String departmentCode) {
        return departmentService.getByDepartmentCode(departmentCode);
    }

    @GetMapping
    public Page<DepartmentResponseDTO> getAllDepartments(Pageable pageable) {
        return departmentService.getAllDepartments(pageable);
    }
}
