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

        DepartmentEntity departmentEntity = mapper.toEntity(requestDTO);
        DepartmentEntity savedEntity = departmentRepo.save(departmentEntity);
        return mapper.toResponseDTO(savedEntity);
    }
}
