package kh.virakchantrak.department_service.util;

import jakarta.annotation.PostConstruct;
import kh.virakchantrak.department_service.entity.DepartmentEntity;
import kh.virakchantrak.department_service.repository.DepartmentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DepartmentInit {
    private final DepartmentRepo departmentRepo;

    @PostConstruct
    public void init() {
        this.create();
    }

    public void create() {
        DepartmentEntity department = new DepartmentEntity();
        department.setName("IT");
        department.setDescription("Information Technology Department");
        department.setDepartmentCode("IT001");
        departmentRepo.save(department);

        department = new DepartmentEntity();
        department.setName("HR");
        department.setDescription("Human Resources Department");
        department.setDepartmentCode("HR001");
        departmentRepo.save(department);

        department = new DepartmentEntity();
        department.setName("Finance");
        department.setDescription("Finance Department");
        department.setDepartmentCode("FIN001");
        departmentRepo.save(department);
    }
}
