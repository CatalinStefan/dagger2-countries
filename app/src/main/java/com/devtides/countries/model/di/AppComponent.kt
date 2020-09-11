package com.devtides.countries.model.di

import com.devtides.countries.model.CountriesService
import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface AppComponent {
    fun getCountriesService(): CountriesService
}