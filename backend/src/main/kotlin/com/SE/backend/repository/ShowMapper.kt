package com.SE.backend.repository

import com.SE.backend.domain.Region
import com.SE.backend.domain.User
import org.apache.ibatis.annotations.*

@Mapper
interface ShowMapper {
    fun getCityList(): List<Region>
    fun getUserList(): List<User>
    fun getLogin(): List<User>
//    fun getDistanceStage(rname: String): Int
}