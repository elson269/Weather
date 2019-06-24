package com.elsonji.weather.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.elsonji.weather.data.repository.WeatherRepository
import com.elsonji.weather.internal.UnitSystem
import com.elsonji.weather.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val weatherRepository: WeatherRepository
) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC
    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC
    val weather by lazyDeferred { weatherRepository.getCurrentWeather(isMetric) }
}
