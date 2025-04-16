package com.example.websitelistapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class WebsiteViewModel : ViewModel() {
    private val _websites = MutableLiveData<List<Website>>()
    val websites: LiveData<List<Website>> get() = _websites

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> get() = _error

    fun fetchWebsites() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getWebsites()
                if (response.isSuccessful) {
                    _websites.postValue(response.body())
                } else {
                    _error.postValue("Failed to fetch data")
                }
            } catch (e: Exception) {
                _error.postValue(e.message)
            }
        }
    }

    fun sortWebsitesByName() {
        val sorted = _websites.value?.sortedBy { it.name } ?: emptyList()
        _websites.postValue(sorted)
    }
}