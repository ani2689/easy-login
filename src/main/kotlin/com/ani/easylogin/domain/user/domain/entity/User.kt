package com.ani.easylogin.domain.user.domain.entity

import com.ani.easylogin.domain.user.domain.rule.UserRule
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(
    @Id
    val id: String,
    val name: String,
    val rule: UserRule
)
