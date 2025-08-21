package kh.virakchantrak.department_service.repository;

import kh.virakchantrak.department_service.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepo extends JpaRepository<DepartmentEntity, Long> {
    Optional<DepartmentEntity> findByName(String name);
    boolean existsByName(String name);
}
