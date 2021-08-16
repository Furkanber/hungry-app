package com.kodluyoruz.hungryapp.ui.restaurant_detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.kodluyoruz.hungryapp.R;
import com.kodluyoruz.hungryapp.data.entity.Menu;
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem;
import java.io.Serializable;
import java.lang.UnsupportedOperationException;
import kotlin.Int;
import kotlin.Suppress;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/RestaurantDetailFragmentDirections;", "", "()V", "ActionRestaurantDetailFragmentToMealAddingFragment", "ActionRestaurantDetailFragmentToMealDetailFragment", "Companion", "app_debug"})
public final class RestaurantDetailFragmentDirections {
    @org.jetbrains.annotations.NotNull()
    public static final com.kodluyoruz.hungryapp.ui.restaurant_detail.RestaurantDetailFragmentDirections.Companion Companion = null;
    
    private RestaurantDetailFragmentDirections() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/RestaurantDetailFragmentDirections$ActionRestaurantDetailFragmentToMealDetailFragment;", "Landroidx/navigation/NavDirections;", "clickedFood", "Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "restaurantId", "", "(Lcom/kodluyoruz/hungryapp/data/entity/Menu;I)V", "getClickedFood", "()Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "getRestaurantId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "getActionId", "getArguments", "Landroid/os/Bundle;", "hashCode", "toString", "", "app_debug"})
    static final class ActionRestaurantDetailFragmentToMealDetailFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull()
        private final com.kodluyoruz.hungryapp.data.entity.Menu clickedFood = null;
        private final int restaurantId = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.kodluyoruz.hungryapp.ui.restaurant_detail.RestaurantDetailFragmentDirections.ActionRestaurantDetailFragmentToMealDetailFragment copy(@org.jetbrains.annotations.NotNull()
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
        
        public ActionRestaurantDetailFragmentToMealDetailFragment(@org.jetbrains.annotations.NotNull()
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
        
        @java.lang.Override()
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
        @java.lang.Override()
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/RestaurantDetailFragmentDirections$ActionRestaurantDetailFragmentToMealAddingFragment;", "Landroidx/navigation/NavDirections;", "restaurant", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "(Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;)V", "getRestaurant", "()Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "component1", "copy", "equals", "", "other", "", "getActionId", "", "getArguments", "Landroid/os/Bundle;", "hashCode", "toString", "", "app_debug"})
    static final class ActionRestaurantDetailFragmentToMealAddingFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull()
        private final com.kodluyoruz.hungryapp.data.entity.RestaurantsItem restaurant = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.kodluyoruz.hungryapp.ui.restaurant_detail.RestaurantDetailFragmentDirections.ActionRestaurantDetailFragmentToMealAddingFragment copy(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.data.entity.RestaurantsItem restaurant) {
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
        
        public ActionRestaurantDetailFragmentToMealAddingFragment(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.data.entity.RestaurantsItem restaurant) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.kodluyoruz.hungryapp.data.entity.RestaurantsItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.kodluyoruz.hungryapp.data.entity.RestaurantsItem getRestaurant() {
            return null;
        }
        
        @java.lang.Override()
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
        @java.lang.Override()
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/RestaurantDetailFragmentDirections$Companion;", "", "()V", "actionRestaurantDetailFragmentToMealAddingFragment", "Landroidx/navigation/NavDirections;", "restaurant", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "actionRestaurantDetailFragmentToMealDetailFragment", "clickedFood", "Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "restaurantId", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections actionRestaurantDetailFragmentToMealDetailFragment(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.data.entity.Menu clickedFood, int restaurantId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections actionRestaurantDetailFragmentToMealAddingFragment(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.data.entity.RestaurantsItem restaurant) {
            return null;
        }
    }
}