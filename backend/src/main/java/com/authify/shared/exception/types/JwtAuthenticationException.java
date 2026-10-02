package com.authify.shared.exception.types;

import com.authify.shared.exception.ErrorCode;

public class JwtAuthenticationException extends BusinessException {

    public JwtAuthenticationException(ErrorCode errorCode) {
        super(errorCode);
    }
}
