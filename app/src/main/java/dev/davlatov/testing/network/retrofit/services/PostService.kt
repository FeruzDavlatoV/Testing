package com.example.networkinghometasks.networking.retrofit.services

import dev.davlatov.testing.model.Post
import retrofit2.Call
import retrofit2.http.*



interface PostService {

    @Headers(
        "Content-type:application/json"
    )

    @GET("posts")
    fun listPost(): Call<ArrayList<Post>>

    @DELETE("posts/{id}")
    fun deletePost(@Path("id") id: Int): Call<Post>

}