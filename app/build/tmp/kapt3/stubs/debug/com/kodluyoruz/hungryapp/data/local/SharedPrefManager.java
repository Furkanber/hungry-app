package com.kodluyoruz.hungryapp.data.local;

import android.content.Context;
import android.content.SharedPreferences;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/kodluyoruz/hungryapp/data/local/SharedPrefManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getBoolean", "", "key", "", "getInt", "", "getString", "saveBoolean", "", "data", "saveInt", "saveString", "Companion", "app_debug"})
public final class SharedPrefManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.kodluyoruz.hungryapp.data.local.SharedPrefManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN = "com.kodluyoruz.hungryapp.TOKEN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIRST_LAUNCH = "com.kodluyoruz.hungryapp.first_launch";
    private final android.content.SharedPreferences sharedPreferences = null;
    
    public SharedPrefManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void saveString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void saveInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int data) {
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    public final void saveBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean data) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/kodluyoruz/hungryapp/data/local/SharedPrefManager$Companion;", "", "()V", "FIRST_LAUNCH", "", "TOKEN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}