package com.gallery.app.data.service

import com.gallery.app.data.db.entities.Item
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("/photos")
    fun getAllItems(): Single<List<Item>>
}