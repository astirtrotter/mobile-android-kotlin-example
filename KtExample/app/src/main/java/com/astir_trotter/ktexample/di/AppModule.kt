package com.astir_trotter.ktexample.di

import android.content.Context
import com.astir_trotter.ktexample.KtExampleApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/23/17
 */

@Module
class AppModule(val app: KtExampleApplication) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return app;
    }

    @Provides
    @Singleton
    fun provideApplication(): KtExampleApplication {
        return app;
    }
}