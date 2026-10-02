package com.authify.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.security.rsa")
public record RSAProperties(
        String privateKeyPath,
        String publicKeyPath
) {
}