package com.ani.easylogin.domain.user.domain.repository

import com.ani.easylogin.domain.user.domain.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, String>{
}