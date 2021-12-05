package com.SE.backend.domain

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data
import kotlin.properties.Delegates

@Data
class User{
    @get:JsonProperty("onum")
    var onum by Delegates.notNull<Int>()
    @get:JsonProperty("id")
    lateinit var id: String
    @get:JsonProperty("pw")
    lateinit var pw: String
    @get:JsonProperty("oname")
    lateinit var oname: String

    fun init(){
        this.onum = 0
        this.id = ""
        this.pw = ""
        this.oname = ""
    }
}