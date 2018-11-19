package com.gallery.app.data.di

import com.gallery.app.data.service.UserRepositoryImpl
import com.gallery.app.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun provideUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

}