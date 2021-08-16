package com.kodluyoruz.hungryapp.data.remote;

import com.kodluyoruz.hungryapp.data.entity.*;
import com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto;
import com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto;
import com.kodluyoruz.hungryapp.data.entity.dtos.UserDto;
import retrofit2.Response;
import retrofit2.http.*;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'J!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u001bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u001f\u001a\u00020 H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020#H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J!\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u001c\u001a\u00020&H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J+\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u001bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/kodluyoruz/hungryapp/data/remote/ApiService;", "", "addMeal", "Lretrofit2/Response;", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "id", "", "restaurant", "(Ljava/lang/String;Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRestaurants", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrders", "Lcom/kodluyoruz/hungryapp/data/entity/OrdersResponse;", "user_id", "", "getRestaurants", "district", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/kodluyoruz/hungryapp/data/entity/UsersResponse;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAddress", "Lcom/kodluyoruz/hungryapp/data/entity/UsersItem;", "user", "(Ljava/lang/String;Lcom/kodluyoruz/hungryapp/data/entity/UsersItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postOrder", "order", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/OrderDto;", "(Lcom/kodluyoruz/hungryapp/data/entity/dtos/OrderDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postRestaurant", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/RestaurantDto;", "(Lcom/kodluyoruz/hungryapp/data/entity/dtos/RestaurantDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/UserDto;", "(Lcom/kodluyoruz/hungryapp/data/entity/dtos/UserDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getUser(@retrofit2.http.Query(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.UsersResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.UsersResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "users")
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kodluyoruz.hungryapp.data.entity.dtos.UserDto user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.UsersItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "restaurants")
    public abstract java.lang.Object getRestaurants(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "address.district")
    java.lang.String district, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "orders")
    public abstract retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.OrdersResponse> getOrders(@retrofit2.http.Query(value = "user_id")
    int user_id);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "restaurants")
    public abstract java.lang.Object postRestaurant(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto restaurant, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "users/{id}")
    public abstract java.lang.Object postAddress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kodluyoruz.hungryapp.data.entity.UsersItem user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.UsersItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "orders")
    public abstract java.lang.Object postOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.OrdersResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "restaurants/{id}")
    public abstract java.lang.Object addMeal(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kodluyoruz.hungryapp.data.entity.RestaurantsItem restaurant, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "users/{id}")
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kodluyoruz.hungryapp.data.entity.UsersItem user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.UsersItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "restaurants")
    public abstract java.lang.Object getAllRestaurants(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> continuation);
}