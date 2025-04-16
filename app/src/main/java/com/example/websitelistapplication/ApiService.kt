package com.example.websitelistapplication

import retrofit2.http.GET
import retrofit2.Response

interface ApiService {
    @GET("414edf2b4e878ab7ba1bf6bb1291a89e/raw/7537d5a0a37120e4a7127cc8f65f5265e723ff7b/websites_info.json")
    suspend fun getWebsites(): Response<List<Website>>
}