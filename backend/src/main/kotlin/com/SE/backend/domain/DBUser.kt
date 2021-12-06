package com.SE.backend.domain

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data
import kotlin.properties.Delegates

@Data
class DBUser{
    var onum by Delegates.notNull<Int>()
    lateinit var id: String
    lateinit var pw: String
    lateinit var oname: String
}