package kh.virakchantrak.department_service.service.impl;

import kh.virakchantrak.department_service.common.ErrorCode;
import kh.virakchantrak.department_service.dto.DepartmentRequestDTO;
import kh.virakchantrak.department_service.dto.DepartmentResponseDTO;
import kh.virakchantrak.department_service.entity.DepartmentEntity;
import kh.virakchantrak.department_service.mapper.DepartmentMapper;
import kh.virakchantrak.department_service.repository.DepartmentRepo;
import kh.virakchantrak.department_service.service.DepartmentService;
import kh.virakchantrak.library.exception.core.ApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepo departmentRepo;
    private final DepartmentMapper mapper;

    @Override
    public DepartmentResponseDTO create(DepartmentRequestDTO requestDTO) {
        if (departmentRepo.existsByName(requestDTO.getName())) {
            throw new ApiException(ErrorCode.NAME_ALREADY_EXIST);
        }
        if (departmentRepo.existsByDepartmentCode(requestDTO.getDepartmentCode())) {
            throw new ApiException(ErrorCode.DEPARTMENT_CODE_ALREADY_EXIST);
        }

        DepartmentEntity departmentEntity = mapper.toEntity(requestDTO);
        DepartmentEntity savedEntity = departmentRepo.save(departmentEntity);
        return mapper.toResponseDTO(savedEntity);
    }

    @Override
    public DepartmentResponseDTO getById(Long id) {
        DepartmentEntity departmentEntity = departmentRepo.findById(id)
                .orElseThrow(() -> new ApiException(ErrorCode.DEPARTMENT_NOT_FOUND));
        return mapper.toResponseDTO(departmentEntity);
    }

    @Override
    public DepartmentResponseDTO getByDepartmentCode(String departmentCode) {
        DepartmentEntity departmentEntity = departmentRepo.findByDepartmentCode(departmentCode)
                .orElseThrow(() -> new ApiException(ErrorCode.DEPARTMENT_NOT_FOUND));
        return mapper.toResponseDTO(departmentEntity);
    }


    @Override
    public Page<DepartmentResponseDTO> getAllDepartments(Pageable pageable) {
        return departmentRepo.findAll(pageable).map(mapper::toResponseDTO);
    }
}
