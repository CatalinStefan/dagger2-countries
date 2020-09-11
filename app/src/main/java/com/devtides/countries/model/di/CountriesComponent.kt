package com.devtides.countries.model.di

import com.devtides.countries.view.MainActivity
import com.devtides.countries.viewmodel.ListViewModel
import dagger.Component
import javax.inject.Singleton

//@Singleton
@Component(dependencies = [AppComponent::class],
    modules = [CountriesListAdapterModule::class])
@PerActivity
interface CountriesComponent {
//    fun inject(listViewModel: ListViewModel)
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun appComponent(appComponent: AppComponent): Builder
        fun build(): CountriesComponent
    }
}