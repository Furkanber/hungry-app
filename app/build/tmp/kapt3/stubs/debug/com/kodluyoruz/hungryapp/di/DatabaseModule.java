package com.kodluyoruz.hungryapp.di;

import android.content.Context;
import com.kodluyoruz.hungryapp.data.local.LocalDataSource;
import com.kodluyoruz.hungryapp.data.local.SharedPrefManager;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/kodluyoruz/hungryapp/di/DatabaseModule;", "", "()V", "localDataSource", "Lcom/kodluyoruz/hungryapp/data/local/LocalDataSource;", "sharedPrefManager", "Lcom/kodluyoruz/hungryapp/data/local/SharedPrefManager;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.kodluyoruz.hungryapp.data.local.SharedPrefManager sharedPrefManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.kodluyoruz.hungryapp.data.local.LocalDataSource localDataSource(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.local.SharedPrefManager sharedPrefManager) {
        return null;
    }
}