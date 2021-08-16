package com.kodluyoruz.hungryapp.ui.meal_detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kodluyoruz.hungryapp.data.ApiRepository;
import com.kodluyoruz.hungryapp.data.entity.OrdersResponse;
import com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto;
import com.kodluyoruz.hungryapp.data.local.SharedPrefManager;
import com.kodluyoruz.hungryapp.utils.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0007J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\t2\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/meal_detail/MealDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "apiRepository", "Lcom/kodluyoruz/hungryapp/data/ApiRepository;", "(Lcom/kodluyoruz/hungryapp/data/ApiRepository;)V", "_amount", "Landroidx/lifecycle/MutableLiveData;", "", "amount", "Landroidx/lifecycle/LiveData;", "getAmount", "()Landroidx/lifecycle/LiveData;", "token", "addAmount", "", "decreaseAmount", "getToken", "postOrder", "Lcom/kodluyoruz/hungryapp/utils/Resource;", "Lcom/kodluyoruz/hungryapp/data/entity/OrdersResponse;", "order", "Lcom/kodluyoruz/hungryapp/data/entity/dtos/OrderDto;", "app_debug"})
public final class MealDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.kodluyoruz.hungryapp.data.ApiRepository apiRepository = null;
    private int token;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _amount = null;
    
    @javax.inject.Inject()
    public MealDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.ApiRepository apiRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getAmount() {
        return null;
    }
    
    public final void addAmount() {
    }
    
    public final void decreaseAmount() {
    }
    
    public final int getToken() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kodluyoruz.hungryapp.utils.Resource<com.kodluyoruz.hungryapp.data.entity.OrdersResponse>> postOrder(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto order) {
        return null;
    }
}