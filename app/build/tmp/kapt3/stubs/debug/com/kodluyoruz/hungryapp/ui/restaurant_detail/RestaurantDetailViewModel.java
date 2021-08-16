package com.kodluyoruz.hungryapp.ui.restaurant_detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kodluyoruz.hungryapp.data.ApiRepository;
import com.kodluyoruz.hungryapp.data.entity.Menu;
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bJ\u0014\u0010\u0015\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0016J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/RestaurantDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "apiRepository", "Lcom/kodluyoruz/hungryapp/data/ApiRepository;", "(Lcom/kodluyoruz/hungryapp/data/ApiRepository;)V", "foodList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "Lkotlin/collections/ArrayList;", "navigateToMealDetail", "restaurant", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "getFoodList", "Landroidx/lifecycle/LiveData;", "getNavigateToMealDetail", "getRestaurant", "navigationToMealDetailDone", "", "onMealClicked", "menu", "setFoodList", "", "setRestaurant", "restaurantsItem", "app_debug"})
public final class RestaurantDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.kodluyoruz.hungryapp.data.ApiRepository apiRepository = null;
    private androidx.lifecycle.MutableLiveData<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> restaurant;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.Menu>> foodList;
    private androidx.lifecycle.MutableLiveData<com.kodluyoruz.hungryapp.data.entity.Menu> navigateToMealDetail;
    
    @javax.inject.Inject()
    public RestaurantDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.ApiRepository apiRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> getRestaurant() {
        return null;
    }
    
    public final void setRestaurant(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.RestaurantsItem restaurantsItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.Menu>> getFoodList() {
        return null;
    }
    
    public final void setFoodList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kodluyoruz.hungryapp.data.entity.Menu> menu) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.data.entity.Menu> getNavigateToMealDetail() {
        return null;
    }
    
    public final void onMealClicked(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.Menu menu) {
    }
    
    public final void navigationToMealDetailDone() {
    }
}