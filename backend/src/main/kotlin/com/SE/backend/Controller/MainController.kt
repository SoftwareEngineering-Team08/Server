package com.SE.backend.Controller

import com.SE.backend.Data.Distance
import com.SE.backend.Data.ShowMapper
import com.SE.backend.Data.User
import org.springframework.web.bind.annotation.ResponseBody

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception
import kotlin.jvm.Throws

//@Controller
@RestController
class MainController {

    @Autowired
    private lateinit var showMapper: ShowMapper

    @GetMapping("/list", produces = ["application/json"])
    @ResponseBody
    @Throws(Exception::class)
    fun getList(): List<Distance>{
        return showMapper.getCityList()
    }

    @GetMapping("/userInfo", produces = ["application/json"])
    @ResponseBody
    @Throws(Exception::class)
    fun getUserList(): List<User>{
        return showMapper.getUserList()
    }
}