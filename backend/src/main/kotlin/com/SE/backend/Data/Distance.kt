package com.SE.backend.Data

import lombok.Builder
import lombok.Data
import kotlin.properties.Delegates

// lombok을 이용해 getter와 setter 세팅
// https://sehajyang.github.io/etc/2019/03/07/kotlin-and-lombok.html/ - 참고

@Data
class Distance {
    var did by Delegates.notNull<Int>()
    lateinit var location:String
    var stage by Delegates.notNull<Int>()
    var parameter by Delegates.notNull<Float>()
}


