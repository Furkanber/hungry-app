package com.kodluyoruz.hungryapp.data.entity.dtos;

import com.google.gson.annotations.SerializedName;
import com.kodluyoruz.hungryapp.data.entity.Address;
import com.kodluyoruz.hungryapp.data.entity.Menu;
import com.kodluyoruz.hungryapp.data.entity.Owner;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0012J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u000eH\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010.J~\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001J\t\u0010D\u001a\u00020\u0007H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR&\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$\u00a8\u0006E"}, d2 = {"Lcom/kodluyoruz/hungryapp/data/entity/dtos/RestaurantDto;", "", "address", "Lcom/kodluyoruz/hungryapp/data/entity/Address;", "average_delivery_time", "", "photo_url", "", "menu", "", "Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "min_order", "name", "owner", "Lcom/kodluyoruz/hungryapp/data/entity/Owner;", "phone_number", "point", "review", "(Lcom/kodluyoruz/hungryapp/data/entity/Address;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;Lcom/kodluyoruz/hungryapp/data/entity/Owner;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAddress", "()Lcom/kodluyoruz/hungryapp/data/entity/Address;", "setAddress", "(Lcom/kodluyoruz/hungryapp/data/entity/Address;)V", "getAverage_delivery_time", "()I", "setAverage_delivery_time", "(I)V", "getMenu", "()Ljava/util/List;", "setMenu", "(Ljava/util/List;)V", "getMin_order", "setMin_order", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getOwner", "()Lcom/kodluyoruz/hungryapp/data/entity/Owner;", "setOwner", "(Lcom/kodluyoruz/hungryapp/data/entity/Owner;)V", "getPhone_number", "setPhone_number", "getPhoto_url", "setPhoto_url", "getPoint", "()Ljava/lang/Integer;", "setPoint", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getReview", "setReview", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/kodluyoruz/hungryapp/data/entity/Address;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;Lcom/kodluyoruz/hungryapp/data/entity/Owner;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kodluyoruz/hungryapp/data/entity/dtos/RestaurantDto;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class RestaurantDto {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "address")
    private com.kodluyoruz.hungryapp.data.entity.Address address;
    @com.google.gson.annotations.SerializedName(value = "average_delivery_time")
    private int average_delivery_time;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "photo_url")
    private java.lang.String photo_url;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "menu")
    private java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> menu;
    @com.google.gson.annotations.SerializedName(value = "min_order")
    private int min_order;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "owner")
    private com.kodluyoruz.hungryapp.data.entity.Owner owner;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "phone_number")
    private java.lang.String phone_number;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "point")
    private java.lang.Integer point;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "review")
    private java.lang.String review;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto copy(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Address address, int average_delivery_time, @org.jetbrains.annotations.NotNull()
    java.lang.String photo_url, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> menu, int min_order, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Owner owner, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, @org.jetbrains.annotations.Nullable()
    java.lang.Integer point, @org.jetbrains.annotations.Nullable()
    java.lang.String review) {
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
    
    public RestaurantDto(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Address address, int average_delivery_time, @org.jetbrains.annotations.NotNull()
    java.lang.String photo_url, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> menu, int min_order, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Owner owner, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, @org.jetbrains.annotations.Nullable()
    java.lang.Integer point, @org.jetbrains.annotations.Nullable()
    java.lang.String review) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.entity.Address component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.entity.Address getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Address p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAverage_delivery_time() {
        return 0;
    }
    
    public final void setAverage_delivery_time(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoto_url() {
        return null;
    }
    
    public final void setPhoto_url(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> getMenu() {
        return null;
    }
    
    public final void setMenu(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getMin_order() {
        return 0;
    }
    
    public final void setMin_order(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.entity.Owner component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.entity.Owner getOwner() {
        return null;
    }
    
    public final void setOwner(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Owner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone_number() {
        return null;
    }
    
    public final void setPhone_number(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPoint() {
        return null;
    }
    
    public final void setPoint(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReview() {
        return null;
    }
    
    public final void setReview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}