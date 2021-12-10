package com.SE.backend.repository

import com.SE.backend.domain.*
import org.apache.ibatis.annotations.*

@Mapper
interface ShowMapper {
    fun getCityList(): List<Region>
    fun getUserList(): List<DBUser>
    fun getLogin(@Param("id") id: String?): DBUser
    fun getDistanceStage(@Param("rname") rname: String?): Integer
    fun getShopList(@Param("id") id: String?): List<Shop>
    fun getIdValid(@Param("id") id: String?): DBUser
    fun getAddUser(@Param("id") id: String?, @Param("pw") pw: String?,
    @Param("oname") oname: String?)
}
