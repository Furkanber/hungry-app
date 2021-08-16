package com.kodluyoruz.hungryapp.data.entity;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlinx.parcelize.Parcelize;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0013J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u00109\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\bH\u00c6\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\bH\u00c6\u0003J\t\u0010@\u001a\u00020\u000fH\u00c6\u0003J\t\u0010A\u001a\u00020\bH\u00c6\u0003J\u0088\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010CJ\t\u0010D\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u00d6\u0003J\t\u0010I\u001a\u00020\u0005H\u00d6\u0001J\t\u0010J\u001a\u00020\bH\u00d6\u0001J\u0019\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010\'R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010%\"\u0004\b6\u0010\'\u00a8\u0006P"}, d2 = {"Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "Landroid/os/Parcelable;", "address", "Lcom/kodluyoruz/hungryapp/data/entity/Address;", "average_delivery_time", "", "id", "photo_url", "", "menu", "", "Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "min_order", "name", "owner", "Lcom/kodluyoruz/hungryapp/data/entity/Owner;", "phone_number", "point", "review", "(Lcom/kodluyoruz/hungryapp/data/entity/Address;IILjava/lang/String;Ljava/util/List;ILjava/lang/String;Lcom/kodluyoruz/hungryapp/data/entity/Owner;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAddress", "()Lcom/kodluyoruz/hungryapp/data/entity/Address;", "setAddress", "(Lcom/kodluyoruz/hungryapp/data/entity/Address;)V", "getAverage_delivery_time", "()I", "setAverage_delivery_time", "(I)V", "getId", "setId", "getMenu", "()Ljava/util/List;", "setMenu", "(Ljava/util/List;)V", "getMin_order", "setMin_order", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getOwner", "()Lcom/kodluyoruz/hungryapp/data/entity/Owner;", "setOwner", "(Lcom/kodluyoruz/hungryapp/data/entity/Owner;)V", "getPhone_number", "setPhone_number", "getPhoto_url", "setPhoto_url", "getPoint", "()Ljava/lang/Integer;", "setPoint", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getReview", "setReview", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/kodluyoruz/hungryapp/data/entity/Address;IILjava/lang/String;Ljava/util/List;ILjava/lang/String;Lcom/kodluyoruz/hungryapp/data/entity/Owner;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class RestaurantsItem implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "address")
    private com.kodluyoruz.hungryapp.data.entity.Address address;
    @com.google.gson.annotations.SerializedName(value = "average_delivery_time")
    private int average_delivery_time;
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
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
    public static final android.os.Parcelable.Creator<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.entity.RestaurantsItem copy(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Address address, int average_delivery_time, int id, @org.jetbrains.annotations.NotNull()
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
    
    public RestaurantsItem(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Address address, int average_delivery_time, int id, @org.jetbrains.annotations.NotNull()
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
    
    public final int component3() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
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
    public final java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> getMenu() {
        return null;
    }
    
    public final void setMenu(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getMin_order() {
        return 0;
    }
    
    public final void setMin_order(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
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
    public final com.kodluyoruz.hungryapp.data.entity.Owner component8() {
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
    public final java.lang.String component9() {
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
    public final java.lang.Integer component10() {
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
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReview() {
        return null;
    }
    
    public final void setReview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.kodluyoruz.hungryapp.data.entity.RestaurantsItem createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.kodluyoruz.hungryapp.data.entity.RestaurantsItem[] newArray(int size) {
            return null;
        }
    }
}