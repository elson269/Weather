package com.elsonji.weather.data.repository

import androidx.lifecycle.LiveData
import com.elsonji.weather.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface WeatherRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}