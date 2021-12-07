package com.SE.backend.Controller

import com.SE.backend.domain.Region
import com.SE.backend.repository.ShowMapper
import com.SE.backend.domain.DBUser
import com.SE.backend.domain.User
import org.apache.ibatis.annotations.Param

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

    @PostMapping("/distance-stage", produces = ["application/json"])
    @ResponseBody
    @Throws(Exception::class)
    fun getDistanceStage(@RequestBody regionName: String?): Integer{
        var stage = showMapper.getDistanceStage(regionName!!.replace("\"",""))
        if (stage != null){
            return stage
        } else{
            return Integer(0)
        }
    }


    @GetMapping("/userInfo", produces = ["application/json"])
    @ResponseBody
    @Throws(Exception::class)
    fun getUserList(): List<DBUser>{
        return showMapper.getUserList()
    }

    @PostMapping("/login", produces = ["application/json"])
    @Throws(Exception::class)
    fun getLogin(@RequestBody data: User, @Param("id") id: String?): User {
        val validUser: DBUser = showMapper.getLogin(data.id)
        var androidUser = User()
        if (validUser != null){
            if (data.pw.equals(validUser.pw)){  // user pw 일치할 경우
                androidUser.set(validUser.id,validUser.pw,validUser.oname)
            } else {
                androidUser.set(data.id,"password wrong","")
            }
        } else {
            androidUser.set("id invalid","","")
        }
        return androidUser
    }
}