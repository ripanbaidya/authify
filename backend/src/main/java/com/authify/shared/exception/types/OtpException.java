package com.authify.shared.exception.types;

import com.authify.shared.exception.ErrorCode;

public class OtpException extends BusinessException {

    public OtpException(ErrorCode errorCode) {
        super(errorCode);
    }

    public OtpException(ErrorCode errorCode, String userMessage) {
        super(errorCode, userMessage);
    }
}