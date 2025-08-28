package kh.virakchantrak.department_service.repository;

import kh.virakchantrak.department_service.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepo extends JpaRepository<DepartmentEntity, Long> {
    boolean existsByName(String name);
    boolean existsByDepartmentCode(String departmentCode);
    Optional<DepartmentEntity> findByDepartmentCode(String departmentCode);
}
