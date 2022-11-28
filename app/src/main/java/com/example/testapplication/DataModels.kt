package com.example.testapplication

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserModel(
    @Expose
    @SerializedName("result") //json에서 사용중인 key값 서버에서 받아오는 키값이랑 같아야함
    var result: String? = null
)

data class UserPostModel(
    @Expose
    @SerializedName("id")
    var id: String? = null,

    @Expose
    @SerializedName("password")
    var password: String? = null,

    @Expose
    @SerializedName("name")
    var name: String? = null,

    @Expose
    @SerializedName("result")
    var result:String?=null
)