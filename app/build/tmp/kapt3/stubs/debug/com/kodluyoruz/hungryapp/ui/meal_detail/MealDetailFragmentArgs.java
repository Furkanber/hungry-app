package com.kodluyoruz.hungryapp.ui.meal_detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavArgs;
import com.kodluyoruz.hungryapp.data.entity.Menu;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import kotlin.Int;
import kotlin.Suppress;
import kotlin.jvm.JvmStatic;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/meal_detail/MealDetailFragmentArgs;", "Landroidx/navigation/NavArgs;", "clickedFood", "Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "restaurantId", "", "(Lcom/kodluyoruz/hungryapp/data/entity/Menu;I)V", "getClickedFood", "()Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "getRestaurantId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "Companion", "app_debug"})
public final class MealDetailFragmentArgs implements androidx.navigation.NavArgs {
    @org.jetbrains.annotations.NotNull()
    private final com.kodluyoruz.hungryapp.data.entity.Menu clickedFood = null;
    private final int restaurantId = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.kodluyoruz.hungryapp.ui.meal_detail.MealDetailFragmentArgs.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.ui.meal_detail.MealDetailFragmentArgs copy(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Menu clickedFood, int restaurantId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MealDetailFragmentArgs(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Menu clickedFood, int restaurantId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.entity.Menu component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.entity.Menu getClickedFood() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getRestaurantId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
    public final android.os.Bundle toBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.kodluyoruz.hungryapp.ui.meal_detail.MealDetailFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/meal_detail/MealDetailFragmentArgs$Companion;", "", "()V", "fromBundle", "Lcom/kodluyoruz/hungryapp/ui/meal_detail/MealDetailFragmentArgs;", "bundle", "Landroid/os/Bundle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.kodluyoruz.hungryapp.ui.meal_detail.MealDetailFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull()
        android.os.Bundle bundle) {
            return null;
        }
    }
}