package com.kodluyoruz.hungryapp.ui.order_history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kodluyoruz.hungryapp.data.ApiRepository;
import com.kodluyoruz.hungryapp.data.entity.OrdersResponse;
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem;
import com.kodluyoruz.hungryapp.data.entity.UsersResponse;
import com.kodluyoruz.hungryapp.data.local.SharedPrefManager;
import com.kodluyoruz.hungryapp.utils.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\fJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u0006\u0010\u0013\u001a\u00020\fJ\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/order_history/OrderHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "apiRepository", "Lcom/kodluyoruz/hungryapp/data/ApiRepository;", "(Lcom/kodluyoruz/hungryapp/data/ApiRepository;)V", "getApiRepository", "()Lcom/kodluyoruz/hungryapp/data/ApiRepository;", "setApiRepository", "restaurant", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kodluyoruz/hungryapp/data/entity/RestaurantsItem;", "token", "", "getOrders", "Landroidx/lifecycle/LiveData;", "Lcom/kodluyoruz/hungryapp/utils/Resource;", "Lcom/kodluyoruz/hungryapp/data/entity/OrdersResponse;", "user_id", "getRestaurant", "getToken", "getUser", "Lcom/kodluyoruz/hungryapp/data/entity/UsersResponse;", "app_debug"})
public final class OrderHistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.kodluyoruz.hungryapp.data.ApiRepository apiRepository;
    private int token;
    private androidx.lifecycle.MutableLiveData<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> restaurant;
    
    @javax.inject.Inject()
    public OrderHistoryViewModel(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.ApiRepository apiRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodluyoruz.hungryapp.data.ApiRepository getApiRepository() {
        return null;
    }
    
    public final void setApiRepository(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.ApiRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.UsersResponse>> getUser(int user_id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.OrdersResponse>> getOrders(int user_id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.data.entity.RestaurantsItem> getRestaurant() {
        return null;
    }
    
    public final int getToken() {
        return 0;
    }
}