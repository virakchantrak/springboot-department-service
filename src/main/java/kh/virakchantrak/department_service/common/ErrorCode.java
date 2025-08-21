package kh.virakchantrak.department_service.common;

import kh.virakchantrak.library.exception.core.SystemCoreAware;
import org.springframework.http.HttpStatus;

public enum ErrorCode implements SystemCoreAware {
    NAME_ALREADY_EXIST("Name already exist", HttpStatus.CONFLICT),
    DEPARTMENT_NOT_FOUND("Department not found", HttpStatus.NOT_FOUND);

    private final String message;
    private final HttpStatus status;

    ErrorCode(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    @Override
    public String getCode() {
        return this.name();
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public HttpStatus getStatus() {
        return status;
    }
}
