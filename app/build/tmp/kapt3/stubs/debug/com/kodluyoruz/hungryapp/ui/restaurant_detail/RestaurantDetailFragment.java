package com.kodluyoruz.hungryapp.ui.restaurant_detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.kodluyoruz.hungryapp.data.entity.Menu;
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem;
import com.kodluyoruz.hungryapp.databinding.FragmentRestaurantDetailBinding;
import com.kodluyoruz.hungryapp.ui.base.BaseFragment;
import com.kodluyoruz.hungryapp.utils.IMealOnClick;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/RestaurantDetailFragment;", "Lcom/kodluyoruz/hungryapp/ui/base/BaseFragment;", "()V", "adapter", "Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/FoodAdapter;", "binding", "Lcom/kodluyoruz/hungryapp/databinding/FragmentRestaurantDetailBinding;", "restaurantClicked", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "viewModel", "Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/RestaurantDetailViewModel;", "getViewModel", "()Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/RestaurantDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initViews", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RestaurantDetailFragment extends com.kodluyoruz.hungryapp.ui.base.BaseFragment {
    private com.kodluyoruz.hungryapp.databinding.FragmentRestaurantDetailBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.kodluyoruz.hungryapp.ui.restaurant_detail.FoodAdapter adapter = null;
    private com.kodluyoruz.hungryapp.data.entity.RestaurantsItem restaurantClicked;
    
    public RestaurantDetailFragment() {
        super();
    }
    
    private final com.kodluyoruz.hungryapp.ui.restaurant_detail.RestaurantDetailViewModel getViewModel() {
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
    
    private final void setObservers() {
    }
}