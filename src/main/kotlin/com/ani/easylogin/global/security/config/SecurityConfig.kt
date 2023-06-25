package com.ani.easylogin.global.security.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer.withDefaults
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain
import javax.servlet.DispatcherType

@Configuration
class SecurityConfig {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain =
        http
            .csrf().disable()
            .cors().disable()
            .authorizeRequests{
                request -> request
                .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                .anyRequest().authenticated()
            }
            .logout(withDefaults())
            .build()
}