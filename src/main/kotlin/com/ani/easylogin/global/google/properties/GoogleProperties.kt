package com.ani.easylogin.global.google.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "oauth2.google")
data class GoogleProperties (
    val clientId: String,
    val clientSecret: String,
    val redirectUri: String
)
