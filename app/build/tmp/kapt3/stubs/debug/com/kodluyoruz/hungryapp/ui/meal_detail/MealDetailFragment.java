package com.kodluyoruz.hungryapp.ui.meal_detail;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.os.StrictMode.VmPolicy;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.kodluyoruz.hungryapp.R;
import com.kodluyoruz.hungryapp.data.entity.Menu;
import com.kodluyoruz.hungryapp.data.entity.OrderFood;
import com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto;
import com.kodluyoruz.hungryapp.databinding.FragmentFoodDetailBinding;
import com.kodluyoruz.hungryapp.ui.base.BaseFragment;
import com.skydoves.expandablelayout.ExpandableLayout;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import kotlin.collections.ArrayList;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0006\u0010*\u001a\u00020\u001eJ\u0006\u0010+\u001a\u00020\u001eR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006,"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/meal_detail/MealDetailFragment;", "Lcom/kodluyoruz/hungryapp/ui/base/BaseFragment;", "()V", "args", "Lcom/kodluyoruz/hungryapp/ui/meal_detail/MealDetailFragmentArgs;", "getArgs", "()Lcom/kodluyoruz/hungryapp/ui/meal_detail/MealDetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/kodluyoruz/hungryapp/databinding/FragmentFoodDetailBinding;", "expandableLayout", "Lcom/skydoves/expandablelayout/ExpandableLayout;", "listView", "Landroid/widget/ListView;", "menu", "Lcom/kodluyoruz/hungryapp/data/entity/Menu;", "orderFood", "Lcom/kodluyoruz/hungryapp/data/entity/OrderFood;", "viewModel", "Lcom/kodluyoruz/hungryapp/ui/meal_detail/MealDetailViewModel;", "getViewModel", "()Lcom/kodluyoruz/hungryapp/ui/meal_detail/MealDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getLocalBitmapUri", "Landroid/net/Uri;", "bmp", "Landroid/graphics/Bitmap;", "initListView", "", "initViews", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "quantityListener", "share", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MealDetailFragment extends com.kodluyoruz.hungryapp.ui.base.BaseFragment {
    private com.kodluyoruz.hungryapp.databinding.FragmentFoodDetailBinding binding;
    private com.skydoves.expandablelayout.ExpandableLayout expandableLayout;
    private android.widget.ListView listView;
    private com.kodluyoruz.hungryapp.data.entity.Menu menu;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.kodluyoruz.hungryapp.data.entity.OrderFood orderFood;
    
    public MealDetailFragment() {
        super();
    }
    
    private final com.kodluyoruz.hungryapp.ui.meal_detail.MealDetailFragmentArgs getArgs() {
        return null;
    }
    
    private final com.kodluyoruz.hungryapp.ui.meal_detail.MealDetailViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    public final void initViews() {
    }
    
    public final void quantityListener() {
    }
    
    public final void initListView() {
    }
    
    public final void share() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getLocalBitmapUri(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bmp) {
        return null;
    }
}