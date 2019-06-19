package com.elsonji.weather.data.network.response

import com.elsonji.weather.data.db.entity.CurrentWeatherEntry
import com.elsonji.weather.data.db.entity.Location
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: CurrentWeatherEntry,
    val location: Location
)