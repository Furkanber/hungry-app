package com.kodluyoruz.hungryapp.ui.splash;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kodluyoruz.hungryapp.data.ApiRepository;
import com.kodluyoruz.hungryapp.data.local.SharedPrefManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "apiRepository", "Lcom/kodluyoruz/hungryapp/data/ApiRepository;", "(Lcom/kodluyoruz/hungryapp/data/ApiRepository;)V", "firstLaunch", "Landroidx/lifecycle/MutableLiveData;", "", "token", "", "getToken", "handleAppLaunch", "", "isFirstLaunch", "Landroidx/lifecycle/LiveData;", "navigationDone", "saveFirstLaunch", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final com.kodluyoruz.hungryapp.data.ApiRepository apiRepository = null;
    private int token;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> firstLaunch;
    
    @javax.inject.Inject()
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.ApiRepository apiRepository) {
        super();
    }
    
    public final int getToken() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFirstLaunch() {
        return null;
    }
    
    public final void handleAppLaunch() {
    }
    
    public final void saveFirstLaunch() {
    }
    
    public final void navigationDone() {
    }
}