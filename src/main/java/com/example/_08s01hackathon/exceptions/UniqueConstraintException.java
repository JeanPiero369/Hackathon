package com.example._08s01hackathon.exceptions;

import org.springframework.dao.DataIntegrityViolationException;

public class UniqueConstraintException extends DataIntegrityViolationException {
    public UniqueConstraintException(String message) {
        super(message);
    }
}
