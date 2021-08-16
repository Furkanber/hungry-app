package com.kodluyoruz.hungryapp.ui.add_restaurant;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.kodluyoruz.hungryapp.data.ApiRepository;
import com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse;
import com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto;
import com.kodluyoruz.hungryapp.utils.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/add_restaurant/AddRestaurantViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/kodluyoruz/hungryapp/data/ApiRepository;", "(Lcom/kodluyoruz/hungryapp/data/ApiRepository;)V", "addRestaurant", "Landroidx/lifecycle/LiveData;", "Lcom/kodluyoruz/hungryapp/utils/Resource;", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsResponse;", "restaurant", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/RestaurantDto;", "app_debug"})
public final class AddRestaurantViewModel extends androidx.lifecycle.ViewModel {
    private final com.kodluyoruz.hungryapp.data.ApiRepository repository = null;
    
    @javax.inject.Inject()
    public AddRestaurantViewModel(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.ApiRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse>> addRestaurant(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto restaurant) {
        return null;
    }
}