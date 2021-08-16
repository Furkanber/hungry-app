package com.kodluyoruz.hungryapp.data.remote;

import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem;
import com.kodluyoruz.hungryapp.data.entity.UsersItem;
import com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto;
import com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto;
import com.kodluyoruz.hungryapp.data.entity.dtos.UserDto;
import com.kodluyoruz.hungryapp.utils.BaseDataSource;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\b\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0014\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\b\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u001a\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u001f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010(\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\'\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/kodluyoruz/hungryapp/data/remote/RemoteDataSource;", "Lcom/kodluyoruz/hungryapp/utils/BaseDataSource;", "apiService", "Lcom/kodluyoruz/hungryapp/data/remote/ApiService;", "(Lcom/kodluyoruz/hungryapp/data/remote/ApiService;)V", "addMeal", "Lcom/kodluyoruz/hungryapp/utils/Resource;", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "id", "", "restaurantsItem", "(Ljava/lang/String;Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRestaurants", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderList", "Lcom/kodluyoruz/hungryapp/data/entity/OrdersResponse;", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRestaurantList", "district", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/kodluyoruz/hungryapp/data/entity/UsersResponse;", "postAddress", "Lcom/kodluyoruz/hungryapp/data/entity/UsersItem;", "user", "(Ljava/lang/String;Lcom/kodluyoruz/hungryapp/data/entity/UsersItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLogin", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postOrder", "order", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/OrderDto;", "(Lcom/kodluyoruz/hungryapp/data/entity/dtos/OrderDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postRegister", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/UserDto;", "(Lcom/kodluyoruz/hungryapp/data/entity/dtos/UserDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postRestaurant", "restaurant", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/RestaurantDto;", "(Lcom/kodluyoruz/hungryapp/data/entity/dtos/RestaurantDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "app_debug"})
public final class RemoteDataSource extends com.kodluyoruz.hungryapp.utils.BaseDataSource {
    private final com.kodluyoruz.hungryapp.data.remote.ApiService apiService = null;
    
    @javax.inject.Inject()
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.remote.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderList(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.OrdersResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRestaurantList(@org.jetbrains.annotations.NotNull()
    java.lang.String district, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUser(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postRegister(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.dtos.UserDto user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.UsersItem user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postOrder(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.OrdersResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.UsersItem user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addMeal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.RestaurantsItem restaurantsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postRestaurant(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto restaurant, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllRestaurants(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> continuation) {
        return null;
    }
}