package com.example.testapplication

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.http.Field
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


public interface APIS {
    @GET("checkExist.php")
    fun checkExist(
        @Query("id") param1: String? = null
    ): Call<UserModel>

    @FormUrlEncoded
    @POST("signup.php")
    fun signup(
        @Field("id") id: String? = null,
        @Field("password") password: String? = null,
        @Field("name") name: String? = null
    ): Call<UserPostModel>

    @FormUrlEncoded
    @POST("createRoom.php")
    fun createRoom(
        @Field("createrUserId") createrUserId: String? = null,
        @Field("title") title: String? = null,
        @Field("region1") region1: String? = null,
        @Field("region2") region2: String? = null,
        @Field("region3") region3: String? = null,
        @Field("dateFrom") dateFrom: String? = null,
        @Field("dateTo") dateTo: String? = null,
        @Field("genre") genre: String? = null,
        @Field("difficulty") difficulty: Int? = null,
        @Field("fear") fear: Int? = null,
        @Field("activity") activity: Int? = null,
        @Field("roomIntro") roomIntro: String? = null,
    ): Call<createRoomPostModel>


    companion object {
        private const val BASE_URL =
            "http://ec2-3-35-21-6.ap-northeast-2.compute.amazonaws.com/"

        fun create(): APIS {
            val gson: Gson = GsonBuilder().setLenient().create()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(APIS::class.java)
        }
    }
}