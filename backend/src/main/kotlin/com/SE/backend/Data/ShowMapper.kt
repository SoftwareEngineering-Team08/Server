package com.SE.backend.Data

import org.apache.ibatis.annotations.*

@Mapper
public interface ShowMapper {
    fun getCityList(): List<Region>
    fun getUserList(): List<User>
}