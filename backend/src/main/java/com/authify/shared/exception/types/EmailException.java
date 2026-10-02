package com.authify.shared.exception.types;

import com.authify.shared.exception.ErrorCode;

public class EmailException extends BusinessException {

    public EmailException(ErrorCode errorCode) {
        super(errorCode);
    }

    public EmailException(ErrorCode errorCode, String userMessage) {
        super(errorCode, userMessage);
    }
}
