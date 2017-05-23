package com.astir_trotter.ktexample

import android.app.Application
import android.os.StrictMode
import com.astir_trotter.ktexample.di.AppModule
import com.astir_trotter.ktexample.di.news.DaggerNewsComponent
import com.astir_trotter.ktexample.di.news.NewsComponent

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/22/17
 */
class KtExampleApplication : Application() {

    companion object {
        lateinit var newsComponent: NewsComponent
    }

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build())
            StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build())
        }

        newsComponent = DaggerNewsComponent.builder()
                .appModule(AppModule(this))
                //.newsModule(NewsModule()) Module with empty constructor is implicitly created by dagger.
                .build()

    }
}