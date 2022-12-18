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
    ): Call<UserSignupPostModel>

    @FormUrlEncoded
    @POST("signin.php")
    fun signin(
        @Field("id") id: String? = null,
        @Field("password") password: String? = null
    ): Call<UserSigninModel>

    companion object {
        private const val BASE_URL =
            "http://ec2-3-34-134-247.ap-northeast-2.compute.amazonaws.com"

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