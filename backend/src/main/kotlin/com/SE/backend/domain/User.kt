package com.SE.backend.domain

import lombok.Data
import kotlin.properties.Delegates

@Data
class User{
    var onum by Delegates.notNull<Int>()
    lateinit var id: String
    lateinit var pw: String
    lateinit var oname: String

    fun init(){
        this.onum = 0
        this.id = ""
        this.pw = ""
        this.oname = ""
    }
}