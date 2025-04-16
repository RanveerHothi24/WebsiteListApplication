package com.example.websitelistapplication

interface WebsiteRepository {
    suspend fun getWebsites(): List<Website>?
}

class WebsiteRepositoryImpl(private val apiService: ApiService) : WebsiteRepository {
    override suspend fun getWebsites(): List<Website>? {
        val response = apiService.getWebsites()
        return if (response.isSuccessful) response.body() else null
    }
}