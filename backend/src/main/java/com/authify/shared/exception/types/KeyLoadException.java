package com.authify.shared.exception.types;

import com.authify.shared.exception.ErrorCode;

public class KeyLoadException extends BusinessException {

    public KeyLoadException(ErrorCode errorCode) {
        super(errorCode);
    }

    public KeyLoadException(ErrorCode errorCode, String userMessage) {
        super(errorCode, userMessage);
    }
}
