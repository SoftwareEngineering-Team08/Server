package com.SE.backend.repository

import com.SE.backend.domain.Region
import com.SE.backend.domain.DBUser
import org.apache.ibatis.annotations.*

@Mapper
interface ShowMapper {
    fun getCityList(): List<Region>
    fun getUserList(): List<DBUser>
    fun getLogin(@Param("id") id: String?): DBUser
    fun getDistanceStage(@Param("rname") rname: String?): Integer
}