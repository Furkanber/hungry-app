package com.kodluyoruz.hungryapp.di;

import androidx.viewbinding.BuildConfig;
import com.google.gson.Gson;
import com.kodluyoruz.hungryapp.data.remote.ApiService;
import com.kodluyoruz.hungryapp.data.remote.RemoteDataSource;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bH\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/kodluyoruz/hungryapp/di/NetworkModule;", "", "()V", "provideApiService", "Lcom/kodluyoruz/hungryapp/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideEndPoint", "Lcom/kodluyoruz/hungryapp/di/EndPoint;", "provideGson", "Lcom/google/gson/Gson;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRemoteDataSource", "Lcom/kodluyoruz/hungryapp/data/remote/RemoteDataSource;", "apiService", "provideRetrofit", "okHttpClient", "gson", "endPoint", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.kodluyoruz.hungryapp.data.remote.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.di.EndPoint endPoint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.kodluyoruz.hungryapp.di.EndPoint provideEndPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.kodluyoruz.hungryapp.data.remote.RemoteDataSource provideRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.remote.ApiService apiService) {
        return null;
    }
}