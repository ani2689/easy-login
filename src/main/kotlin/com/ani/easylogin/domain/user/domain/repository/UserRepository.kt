package com.ani.easylogin.domain.user.domain.repository

import com.ani.easylogin.domain.user.domain.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, String> {

}