package com.ani.easylogin.domain.user.domain.rule

enum class UserRule (
    val description: String
){
    BASIC("기본 권한"),
    ADMIN("관리자 권한")
}