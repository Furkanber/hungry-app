package com.kodluyoruz.hungryapp.ui.home;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem;
import com.kodluyoruz.hungryapp.databinding.RestaurantListItemBinding;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u001e\u0010\u001a\u001a\u00020\u00132\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006JQ\u0010\u001c\u001a\u0002H\u001d\"\b\b\u0000\u0010\u001d*\u00020\u001e*\u0002H\u001d26\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00130 \u00a2\u0006\u0002\u0010$R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/home/RestaurantRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kodluyoruz/hungryapp/ui/home/RestaurantRecyclerViewAdapter$RestaurantViewHolder;", "restaurantList", "Ljava/util/ArrayList;", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "onClick", "Lcom/kodluyoruz/hungryapp/ui/home/onDetail;", "(Ljava/util/ArrayList;Landroid/content/Context;Lcom/kodluyoruz/hungryapp/ui/home/onDetail;)V", "getContext", "()Landroid/content/Context;", "getOnClick", "()Lcom/kodluyoruz/hungryapp/ui/home/onDetail;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateRestaurantList", "itemList", "listen", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "event", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "type", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lkotlin/jvm/functions/Function2;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "RestaurantViewHolder", "app_debug"})
public final class RestaurantRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kodluyoruz.hungryapp.ui.home.RestaurantRecyclerViewAdapter.RestaurantViewHolder> {
    private final java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> restaurantList = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kodluyoruz.hungryapp.ui.home.onDetail onClick = null;
    
    public RestaurantRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> restaurantList, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.ui.home.onDetail onClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.ui.home.onDetail getOnClick() {
        return null;
    }
    
    public final void updateRestaurantList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> itemList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kodluyoruz.hungryapp.ui.home.RestaurantRecyclerViewAdapter.RestaurantViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.ui.home.RestaurantRecyclerViewAdapter.RestaurantViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends androidx.recyclerview.widget.RecyclerView.ViewHolder>T listen(@org.jetbrains.annotations.NotNull()
    T $this$listen, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> event) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/home/RestaurantRecyclerViewAdapter$RestaurantViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kodluyoruz/hungryapp/databinding/RestaurantListItemBinding;", "(Lcom/kodluyoruz/hungryapp/ui/home/RestaurantRecyclerViewAdapter;Lcom/kodluyoruz/hungryapp/databinding/RestaurantListItemBinding;)V", "bind", "", "item", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "app_debug"})
    public final class RestaurantViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.kodluyoruz.hungryapp.databinding.RestaurantListItemBinding binding = null;
        
        public RestaurantViewHolder(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.databinding.RestaurantListItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.data.entity.RestaurantsItem item) {
        }
    }
}