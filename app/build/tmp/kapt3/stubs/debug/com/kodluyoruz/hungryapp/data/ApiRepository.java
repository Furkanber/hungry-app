package com.kodluyoruz.hungryapp.data;

import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem;
import com.kodluyoruz.hungryapp.data.entity.UsersItem;
import com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto;
import com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto;
import com.kodluyoruz.hungryapp.data.entity.dtos.UserDto;
import com.kodluyoruz.hungryapp.data.local.LocalDataSource;
import com.kodluyoruz.hungryapp.data.remote.RemoteDataSource;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\fJ\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u0017\u001a\u00020\u0014J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b2\u0006\u0010\u0019\u001a\u00020\fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\fJ\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\b2\u0006\u0010\u000b\u001a\u00020\u0014J\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\b2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fJ\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!J\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010$\u001a\u00020%J\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b2\u0006\u0010\'\u001a\u00020(J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\b2\u0006\u0010\"\u001a\u00020*J\u0016\u0010+\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0011J\u0016\u0010.\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0014J\u0016\u0010/\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fJ\"\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00101\u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/kodluyoruz/hungryapp/data/ApiRepository;", "", "remoteDataSource", "Lcom/kodluyoruz/hungryapp/data/remote/RemoteDataSource;", "localDataSource", "Lcom/kodluyoruz/hungryapp/data/local/LocalDataSource;", "(Lcom/kodluyoruz/hungryapp/data/remote/RemoteDataSource;Lcom/kodluyoruz/hungryapp/data/local/LocalDataSource;)V", "addMeal", "Landroidx/lifecycle/LiveData;", "Lcom/kodluyoruz/hungryapp/utils/Resource;", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "id", "", "restaurantsItem", "getAllRestaurants", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsResponse;", "getBoolean", "", "key", "getInt", "", "getOrders", "Lcom/kodluyoruz/hungryapp/data/entity/OrdersResponse;", "user_id", "getRestaurants", "district", "getString", "getUserWithId", "Lcom/kodluyoruz/hungryapp/data/entity/UsersResponse;", "login", "email", "password", "postAddress", "Lcom/kodluyoruz/hungryapp/data/entity/UsersItem;", "user", "postOrder", "order", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/OrderDto;", "postRestaurant", "restaurant", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/RestaurantDto;", "register", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/UserDto;", "saveBoolean", "", "data", "saveInt", "saveString", "updateUser", "usersItem", "app_debug"})
public final class ApiRepository {
    private com.kodluyoruz.hungryapp.data.remote.RemoteDataSource remoteDataSource;
    private com.kodluyoruz.hungryapp.data.local.LocalDataSource localDataSource;
    
    @javax.inject.Inject()
    public ApiRepository(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.local.LocalDataSource localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersResponse>> getUserWithId(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersResponse>> login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersItem>> register(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.dtos.UserDto user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersItem>> updateUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.UsersItem usersItem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.OrdersResponse>> getOrders(int user_id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> getRestaurants(@org.jetbrains.annotations.NotNull()
    java.lang.String district) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.OrdersResponse>> postOrder(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto order) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersItem>> postAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.UsersItem user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem>> addMeal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.RestaurantsItem restaurantsItem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> postRestaurant(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto restaurant) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> getAllRestaurants() {
        return null;
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