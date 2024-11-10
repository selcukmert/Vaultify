package com.dobbytech.vaultify

import android.app.Application
import com.dobbytech.vaultify.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class VaultifyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@VaultifyApp)
            androidLogger()

            modules(appModule)
        }
    }
}