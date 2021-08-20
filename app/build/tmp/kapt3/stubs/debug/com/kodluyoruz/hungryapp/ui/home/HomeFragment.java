package com.kodluyoruz.hungryapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem;
import com.kodluyoruz.hungryapp.databinding.FragmentHomeBinding;
import com.kodluyoruz.hungryapp.ui.base.BaseFragment;
import com.kodluyoruz.hungryapp.utils.Resource;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\b\u0010\u001e\u001a\u00020\u0019H\u0002J$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/home/HomeFragment;", "Lcom/kodluyoruz/hungryapp/ui/base/BaseFragment;", "()V", "binding", "Lcom/kodluyoruz/hungryapp/databinding/FragmentHomeBinding;", "dataset", "Ljava/util/ArrayList;", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "Lkotlin/collections/ArrayList;", "homeFragmentViewModel", "Lcom/kodluyoruz/hungryapp/ui/home/HomeFragmentViewModel;", "getHomeFragmentViewModel", "()Lcom/kodluyoruz/hungryapp/ui/home/HomeFragmentViewModel;", "homeFragmentViewModel$delegate", "Lkotlin/Lazy;", "restaurantRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "restaurantRecyclerViewAdapter", "Lcom/kodluyoruz/hungryapp/ui/home/RestaurantRecyclerViewAdapter;", "resultTextView", "Landroid/widget/TextView;", "saveRestaurantButton", "token", "", "alphaAnim", "", "view", "Landroid/view/View;", "fetchData", "fetchPushRestaurantData", "initViews", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends com.kodluyoruz.hungryapp.ui.base.BaseFragment {
    private int token = -1;
    private com.kodluyoruz.hungryapp.databinding.FragmentHomeBinding binding;
    private androidx.recyclerview.widget.RecyclerView restaurantRecyclerView;
    private com.kodluyoruz.hungryapp.ui.home.RestaurantRecyclerViewAdapter restaurantRecyclerViewAdapter;
    private java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> dataset;
    private android.widget.TextView saveRestaurantButton;
    private final kotlin.Lazy homeFragmentViewModel$delegate = null;
    private android.widget.TextView resultTextView;
    
    public HomeFragment() {
        super();
    }
    
    private final com.kodluyoruz.hungryapp.ui.home.HomeFragmentViewModel getHomeFragmentViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void fetchData() {
    }
    
    public final void alphaAnim(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void fetchPushRestaurantData() {
    }
}