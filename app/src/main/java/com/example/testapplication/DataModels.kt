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

data class createRoomPostModel(
    @Expose
    @SerializedName("createrUserId")
    var createrUserId: String? = null,

    @Expose
    @SerializedName("title")
    var title: String? = null,

    @Expose
    @SerializedName("region1")
    var region1: String? = null,

    @Expose
    @SerializedName("region2")
    var region2: String? = null,

    @Expose
    @SerializedName("region3")
    var region3: String? = null,

    @Expose
    @SerializedName("dateFrom")
    var dateFrom: String? = null,

    @Expose
    @SerializedName("dateTo")
    var dateTo: String? = null,

    @Expose
    @SerializedName("genre")
    var genre: String? = null,

    @Expose
    @SerializedName("difficulty")
    var difficulty: Int? = null,

    @Expose
    @SerializedName("fear")
    var fear: Int? = null,

    @Expose
    @SerializedName("activity")
    var activity: Int? = null,

    @Expose
    @SerializedName("roomIntro")
    var roomIntro: String? = null,
)