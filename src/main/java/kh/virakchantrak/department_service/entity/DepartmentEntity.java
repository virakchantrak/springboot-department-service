package kh.virakchantrak.department_service.entity;

import jakarta.persistence.*;
import kh.virakchantrak.library.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Getter
@Setter
@Entity
@FieldNameConstants
@Table(name = DepartmentEntity.TABLE_NAME)
public class DepartmentEntity extends BaseEntity {
    public static final String TABLE_NAME = "departments";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 255)
    private String description;
}
