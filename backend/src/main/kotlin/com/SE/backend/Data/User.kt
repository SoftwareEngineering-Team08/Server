package com.SE.backend.Data

import lombok.Data
import kotlin.properties.Delegates

@Data
class User {
    var onum by Delegates.notNull<Int>()
    lateinit var id: String
    lateinit var pw: String
    lateinit var name: String
}