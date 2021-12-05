package com.SE.backend.Controller

import com.SE.backend.domain.Region
import com.SE.backend.repository.ShowMapper
import com.SE.backend.domain.User
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.lang.Exception
import kotlin.jvm.Throws

@RestController
class MainController {

    @Autowired
    private lateinit var showMapper: ShowMapper

    @GetMapping("/regionList", produces = ["application/json"])
    @ResponseBody
    @Throws(Exception::class)
    fun getList(): List<Region>{
        return showMapper.getCityList()
    }

//    @PostMapping("/distance-stage", produces = ["application/json"])
//    @ResponseBody
//    @Throws(Exception::class)
//    fun getDistanceStage(@RequestBody regionName: String): Int{
//        var stage = showMapper.getDistanceStage(regionName)
//        return stage
//    }


    @GetMapping("/userInfo", produces = ["application/json"])
    @ResponseBody
    @Throws(Exception::class)
    fun getUserList(): List<User>{
        return showMapper.getUserList()
    }

    @PostMapping("/login", produces = ["application/json"])
    @Throws(Exception::class)
    fun getLogin(@RequestBody data: User): User {
        var userList: List<User> = showMapper.getLogin()
        for (i in userList){
            if (data.id.equals(i.id)){
                if (data.pw.equals(i.pw)){
                    val userInfo:User = i
                    return userInfo
                } else {
                    data.pw = ""
                    return data
                }
            }
        }
        data.init()
        return data
    }


}