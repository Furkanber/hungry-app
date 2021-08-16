package com.kodluyoruz.hungryapp.ui.restaurant_detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.kodluyoruz.hungryapp.data.entity.Menu;
import com.kodluyoruz.hungryapp.databinding.FoodListRecyclerItemBinding;
import com.kodluyoruz.hungryapp.utils.IMealOnClick;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u001e\u0010\u0014\u001a\u00020\n2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/FoodAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/FoodAdapter$FoodViewHolder;", "()V", "foodList", "Ljava/util/ArrayList;", "Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "listener", "Lcom/kodluyoruz/hungryapp/utils/IMealOnClick;", "addListener", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataset", "list", "Lkotlin/collections/ArrayList;", "FoodViewHolder", "app_debug"})
public final class FoodAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kodluyoruz.hungryapp.ui.restaurant_detail.FoodAdapter.FoodViewHolder> {
    private java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.Menu> foodList;
    private com.kodluyoruz.hungryapp.utils.IMealOnClick listener;
    
    public FoodAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kodluyoruz.hungryapp.ui.restaurant_detail.FoodAdapter.FoodViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.ui.restaurant_detail.FoodAdapter.FoodViewHolder holder, int position) {
    }
    
    public final void setDataset(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kodluyoruz.hungryapp.data.entity.Menu> list) {
    }
    
    public final void addListener(@org.jetbrains.annotations.NotNull()
    com.kodluyoruz.hungryapp.utils.IMealOnClick listener) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/FoodAdapter$FoodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kodluyoruz/hungryapp/databinding/FoodListRecyclerItemBinding;", "(Lcom/kodluyoruz/hungryapp/databinding/FoodListRecyclerItemBinding;)V", "bind", "", "food", "Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "listener", "Lcom/kodluyoruz/hungryapp/utils/IMealOnClick;", "Companion", "app_debug"})
    public static final class FoodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.kodluyoruz.hungryapp.databinding.FoodListRecyclerItemBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.kodluyoruz.hungryapp.ui.restaurant_detail.FoodAdapter.FoodViewHolder.Companion Companion = null;
        
        public FoodViewHolder(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.databinding.FoodListRecyclerItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.kodluyoruz.hungryapp.data.entity.Menu food, @org.jetbrains.annotations.Nullable()
        com.kodluyoruz.hungryapp.utils.IMealOnClick listener) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/FoodAdapter$FoodViewHolder$Companion;", "", "()V", "from", "Lcom/kodluyoruz/hungryapp/ui/restaurant_detail/FoodAdapter$FoodViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.kodluyoruz.hungryapp.ui.restaurant_detail.FoodAdapter.FoodViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}