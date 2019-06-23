package com.elsonji.weather.data.network

import androidx.lifecycle.LiveData
import com.elsonji.weather.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(location: String, languageCode: String)
}