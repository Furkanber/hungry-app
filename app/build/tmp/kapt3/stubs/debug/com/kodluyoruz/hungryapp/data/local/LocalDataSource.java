package com.kodluyoruz.hungryapp.data.local;

import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/kodluyoruz/hungryapp/data/local/LocalDataSource;", "", "sharedPrefManager", "Lcom/kodluyoruz/hungryapp/data/local/SharedPrefManager;", "(Lcom/kodluyoruz/hungryapp/data/local/SharedPrefManager;)V", "getBoolean", "", "key", "", "getInt", "", "getString", "saveBoolean", "", "data", "saveInt", "saveString", "app_debug"})
public final class LocalDataSource {
    private final com.kodluyoruz.hungryapp.data.local.SharedPrefManager sharedPrefManager = null;
    
    @javax.inject.Inject()
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.local.SharedPrefManager sharedPrefManager) {
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
}