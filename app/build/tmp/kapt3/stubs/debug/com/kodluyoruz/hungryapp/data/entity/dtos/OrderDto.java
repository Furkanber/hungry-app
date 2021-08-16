package com.kodluyoruz.hungryapp.data.entity.dtos;

import com.google.gson.annotations.SerializedName;
import com.kodluyoruz.hungryapp.data.entity.OrderFood;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003JK\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\tH\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a\u00a8\u0006+"}, d2 = {"Lcom/kodluyoruz/hungryapp/data/entity/dtos/OrderDto;", "", "date", "", "note", "order_food_list", "", "Lcom/kodluyoruz/hungryapp/data/entity/OrderFood;", "restaurant_id", "", "status", "user_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;III)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getNote", "setNote", "getOrder_food_list", "()Ljava/util/List;", "setOrder_food_list", "(Ljava/util/List;)V", "getRestaurant_id", "()I", "setRestaurant_id", "(I)V", "getStatus", "setStatus", "getUser_id", "setUser_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class OrderDto {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "date")
    private java.lang.String date;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "note")
    private java.lang.String note;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "order_food_list")
    private java.util.List<com.kodluyoruz.hungryapp.data.entity.OrderFood> order_food_list;
    @com.google.gson.annotations.SerializedName(value = "restaurant_id")
    private int restaurant_id;
    @com.google.gson.annotations.SerializedName(value = "status")
    private int status;
    @com.google.gson.annotations.SerializedName(value = "user_id")
    private int user_id;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kodluyoruz.hungryapp.data.entity.OrderFood> order_food_list, int restaurant_id, int status, int user_id) {
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
    
    public OrderDto(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kodluyoruz.hungryapp.data.entity.OrderFood> order_food_list, int restaurant_id, int status, int user_id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kodluyoruz.hungryapp.data.entity.OrderFood> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kodluyoruz.hungryapp.data.entity.OrderFood> getOrder_food_list() {
        return null;
    }
    
    public final void setOrder_food_list(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kodluyoruz.hungryapp.data.entity.OrderFood> p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getRestaurant_id() {
        return 0;
    }
    
    public final void setRestaurant_id(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getUser_id() {
        return 0;
    }
    
    public final void setUser_id(int p0) {
    }
}