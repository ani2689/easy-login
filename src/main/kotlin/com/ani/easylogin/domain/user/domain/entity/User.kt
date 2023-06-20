package com.ani.easylogin.domain.user.domain.entity;

import com.ani.easylogin.domain.user.domain.entity.role.UserRole
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class User (
    @Id
    val id: String,

    var name: String,

    val role: UserRole
)
