package com.authify.shared.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // Authentication & Security
    INVALID_AUTH_HEADER(HttpStatus.BAD_REQUEST, "INVALID_AUTH_HEADER", "Invalid authorization header."),
    INVALID_CREDENTIALS(HttpStatus.UNAUTHORIZED, "INVALID_CREDENTIALS", "The provided email or password is incorrect."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "Authentication is required to access this resource."),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "ACCESS_DENIED", "You do not have permission to access this resource."),
    ACCOUNT_DELETED(HttpStatus.GONE, "ACCOUNT_DELETED", "Account deletion has been requested."),

    // JWT
    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "TOKEN_EXPIRED", "The authentication token has expired."),
    TOKEN_INVALID(HttpStatus.UNAUTHORIZED, "TOKEN_INVALID", "The authentication token is invalid or malformed."),
    TOKEN_MISSING_CLAIM(HttpStatus.UNAUTHORIZED, "TOKEN_MISSING_CLAIM", "The authentication token is missing a required claim."),
    TOKEN_SIGNATURE_INVALID(HttpStatus.UNAUTHORIZED, "TOKEN_SIGNATURE_INVALID", "Token signature verification failed."),
    TOKEN_UNSUPPORTED(HttpStatus.BAD_REQUEST, "TOKEN_UNSUPPORTED", "The provided token format is not supported."),

    // Refresh Token
    TOKEN_NOT_FOUND(HttpStatus.UNAUTHORIZED, "TOKEN_NOT_FOUND", "The refresh token was not found."),
    TOKEN_REVOKED(HttpStatus.UNAUTHORIZED, "TOKEN_REVOKED", "The refresh token has been revoked and cannot be used."),

    // User & Account
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "USER_NOT_FOUND", "The requested user was not found."),
    EMAIL_ALREADY_IN_USE(HttpStatus.CONFLICT, "EMAIL_ALREADY_IN_USE", "An account with this email address already exists."),
    EMAIL_ALREADY_VERIFIED(HttpStatus.CONFLICT, "EMAIL_ALREADY_VERIFIED", "The email address has already been verified."),

    // OTP Verification
    OTP_INVALID(HttpStatus.BAD_REQUEST, "OTP_INVALID", "The provided OTP is invalid or has already been used."),
    OTP_EXPIRED(HttpStatus.BAD_REQUEST, "OTP_EXPIRED", "The OTP has expired. Please request a new verification code."),
    OTP_MAX_ATTEMPTS_EXCEEDED(HttpStatus.TOO_MANY_REQUESTS, "OTP_MAX_ATTEMPTS_EXCEEDED", "Too many incorrect attempts. Please request a new OTP."),
    OTP_COOLDOWN_ACTIVE(HttpStatus.TOO_MANY_REQUESTS, "OTP_COOLDOWN_ACTIVE", "Please wait before requesting another code."),
    EMAIL_SEND_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, "EMAIL_SEND_FAILED", "Failed to send the verification email. Please try again later."),

    // Key Loading / Security Infrastructure
    KEY_FILE_NOT_FOUND(HttpStatus.NOT_FOUND, "KEY_FILE_NOT_FOUND", "The key file could not be found."),
    KEY_FILE_NOT_READABLE(HttpStatus.BAD_REQUEST, "KEY_FILE_NOT_READABLE", "The key file exists but cannot be read."),
    KEY_FILE_READ_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, "KEY_FILE_READ_FAILED", "Failed to read the key file."),
    INVALID_KEY_FORMAT(HttpStatus.BAD_REQUEST, "INVALID_KEY_FORMAT", "The key file format or encoding is invalid."),
    PRIVATE_KEY_LOAD_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, "PRIVATE_KEY_LOAD_FAILED", "Failed to load the private key."),
    PUBLIC_KEY_LOAD_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, "PUBLIC_KEY_LOAD_FAILED", "Failed to load the public key."),


    // General & Request
    VALIDATION_FAILED(HttpStatus.BAD_REQUEST, "VALIDATION_FAILED", "One or more request fields are invalid."),
    MALFORMED_JSON(HttpStatus.BAD_REQUEST, "MALFORMED_JSON", "Malformed JSON request body."),
    MISSING_PARAMETER(HttpStatus.BAD_REQUEST, "MISSING_PARAMETER", "Required request parameter is missing."),
    TYPE_MISMATCH(HttpStatus.BAD_REQUEST, "TYPE_MISMATCH", "Request parameter type mismatch."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "METHOD_NOT_ALLOWED", "HTTP method is not supported for this endpoint."),
    NO_HANDLER_FOUND(HttpStatus.NOT_FOUND, "NO_HANDLER_FOUND", "Endpoint does not exist."),
    DATA_INTEGRITY_VIOLATION(HttpStatus.CONFLICT, "DATA_INTEGRITY_VIOLATION", "Data integrity violation."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL_SERVER_ERROR", "An unexpected internal server error occurred.");

    private final HttpStatus status;
    private final String code;
    private final String defaultMessage;
}