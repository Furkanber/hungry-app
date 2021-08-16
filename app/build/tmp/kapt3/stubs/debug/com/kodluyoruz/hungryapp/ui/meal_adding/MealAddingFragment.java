package com.kodluyoruz.hungryapp.ui.meal_adding;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import com.kodluyoruz.hungryapp.data.entity.Menu;
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem;
import com.kodluyoruz.hungryapp.databinding.FragmentFoodAddingBinding;
import com.kodluyoruz.hungryapp.ui.base.BaseFragment;
import com.kodluyoruz.hungryapp.utils.Resource;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J$\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J-\u0010/\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102012\u0006\u00103\u001a\u000204H\u0016\u00a2\u0006\u0002\u00105J\u001a\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00068"}, d2 = {"Lcom/kodluyoruz/hungryapp/ui/meal_adding/MealAddingFragment;", "Lcom/kodluyoruz/hungryapp/ui/base/BaseFragment;", "()V", "args", "Lcom/kodluyoruz/hungryapp/ui/meal_adding/MealAddingFragmentArgs;", "getArgs", "()Lcom/kodluyoruz/hungryapp/ui/meal_adding/MealAddingFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/kodluyoruz/hungryapp/databinding/FragmentFoodAddingBinding;", "image", "Landroid/widget/ImageView;", "imageData", "Landroid/net/Uri;", "getImageData", "()Landroid/net/Uri;", "setImageData", "(Landroid/net/Uri;)V", "selectedImage", "Landroid/graphics/Bitmap;", "getSelectedImage", "()Landroid/graphics/Bitmap;", "setSelectedImage", "(Landroid/graphics/Bitmap;)V", "viewModel", "Lcom/kodluyoruz/hungryapp/ui/meal_adding/MealAddingViewModel;", "getViewModel", "()Lcom/kodluyoruz/hungryapp/ui/meal_adding/MealAddingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initViews", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MealAddingFragment extends com.kodluyoruz.hungryapp.ui.base.BaseFragment {
    private android.widget.ImageView image;
    private com.kodluyoruz.hungryapp.databinding.FragmentFoodAddingBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap selectedImage;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri imageData;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public MealAddingFragment() {
        super();
    }
    
    private final com.kodluyoruz.hungryapp.ui.meal_adding.MealAddingViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getSelectedImage() {
        return null;
    }
    
    public final void setSelectedImage(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getImageData() {
        return null;
    }
    
    public final void setImageData(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    private final com.kodluyoruz.hungryapp.ui.meal_adding.MealAddingFragmentArgs getArgs() {
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
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.content.Intent data) {
    }
}