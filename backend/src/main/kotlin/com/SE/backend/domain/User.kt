package com.SE.backend.domain

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data

@Data
class User {
    @get:JsonProperty("id")
    var id: String = ""
    @get:JsonProperty("pw")
    var pw: String = ""
    @get:JsonProperty("oname")
    var oname: String = ""

    fun set(_id:String, _pw:String, _oname: String){
        this.id = _id
        this.pw = _pw
        this.oname = _oname
    }
}