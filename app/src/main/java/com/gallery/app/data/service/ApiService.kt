package com.gallery.app.data.service

import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("/photos")
    fun getAllItems(): Single<List<String>>
}