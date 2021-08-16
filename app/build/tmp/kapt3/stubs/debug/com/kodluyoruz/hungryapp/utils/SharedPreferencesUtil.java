package com.kodluyoruz.hungryapp.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\tJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/kodluyoruz/hungryapp/utils/SharedPreferencesUtil;", "", "()V", "FIRST_LAUNCH_TOKEN", "", "TOKEN", "sharedPreferences", "Landroid/content/SharedPreferences;", "getBoolean", "", "key", "defaultVal", "getString", "getToken", "initSharedPreferences", "", "context", "Landroid/content/Context;", "saveBoolean", "value", "saveString", "saveToken", "unRegister", "app_debug"})
public final class SharedPreferencesUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.kodluyoruz.hungryapp.utils.SharedPreferencesUtil INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN = "com.kodluyoruz.hungryapp.TOKEN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIRST_LAUNCH_TOKEN = "com.kodluyoruz.hungryapp.first_launch";
    private static android.content.SharedPreferences sharedPreferences;
    
    private SharedPreferencesUtil() {
        super();
    }
    
    public final void initSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void unRegister() {
    }
    
    public final void saveString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultVal) {
        return null;
    }
    
    public final void saveBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultVal) {
        return false;
    }
    
    public final void saveToken(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
}