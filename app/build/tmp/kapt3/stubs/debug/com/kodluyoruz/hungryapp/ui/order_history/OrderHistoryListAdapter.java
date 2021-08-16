package com.kodluyoruz.hungryapp.ui.order_history;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kodluyoruz.hungryapp.data.entity.OrdersItem;
import com.kodluyoruz.hungryapp.databinding.OrderHistoryItemBinding;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u001e\u0010\u0011\u001a\u00020\n2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/order_history/OrderHistoryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kodluyoruz/hungryapp/ui/order_history/OrderHistoryListAdapter$OrderViewHolder;", "()V", "orderList", "Ljava/util/ArrayList;", "Lcom/kodluyoruz/hungryapp/data/entity/OrdersItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataset", "list", "Lkotlin/collections/ArrayList;", "OrderViewHolder", "app_debug"})
public final class OrderHistoryListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kodluyoruz.hungryapp.ui.order_history.OrderHistoryListAdapter.OrderViewHolder> {
    private java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.OrdersItem> orderList;
    
    public OrderHistoryListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kodluyoruz.hungryapp.ui.order_history.OrderHistoryListAdapter.OrderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.ui.order_history.OrderHistoryListAdapter.OrderViewHolder holder, int position) {
    }
    
    public final void setDataset(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.OrdersItem> list) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/order_history/OrderHistoryListAdapter$OrderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kodluyoruz/hungryapp/databinding/OrderHistoryItemBinding;", "(Lcom/kodluyoruz/hungryapp/databinding/OrderHistoryItemBinding;)V", "bind", "", "order", "Lcom/kodluyoruz/hungryapp/data/entity/OrdersItem;", "Companion", "app_debug"})
    public static final class OrderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.kodluyoruz.hungryapp.databinding.OrderHistoryItemBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.kodluyoruz.hungryapp.ui.order_history.OrderHistoryListAdapter.OrderViewHolder.Companion Companion = null;
        
        public OrderViewHolder(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.databinding.OrderHistoryItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.data.entity.OrdersItem order) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/order_history/OrderHistoryListAdapter$OrderViewHolder$Companion;", "", "()V", "from", "Lcom/kodluyoruz/hungryapp/ui/order_history/OrderHistoryListAdapter$OrderViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.kodluyoruz.hungryapp.ui.order_history.OrderHistoryListAdapter.OrderViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}