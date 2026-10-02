package com.authify.shared.api;

public record ApiErrorDetail(
        String field,
        Object rejectedValue,
        String reason
) {
}
