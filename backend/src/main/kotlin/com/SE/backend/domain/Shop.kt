package com.SE.backend.domain

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data

@Data
class Shop {
    @get: JsonProperty("sid")
    var sid: String = ""

    @get: JsonProperty("sname")
    var sname: String = ""

    @get: JsonProperty("rname")
    var rname: String = ""

    @get: JsonProperty("maxPeople")
    lateinit var maxPeople: Integer

    @get: JsonProperty("limitPeople")
    var limitPeople:Integer = Integer(0)

    @get: JsonProperty("businessType")
    lateinit var businessType: BusinessType
}