package kh.virakchantrak.department_service.mapper;

import kh.virakchantrak.department_service.dto.DepartmentRequestDTO;
import kh.virakchantrak.department_service.dto.DepartmentResponseDTO;
import kh.virakchantrak.department_service.entity.DepartmentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface DepartmentMapper {

    DepartmentEntity toEntity(DepartmentRequestDTO requestDTO);

    DepartmentResponseDTO toResponseDTO(DepartmentEntity entity);
}
