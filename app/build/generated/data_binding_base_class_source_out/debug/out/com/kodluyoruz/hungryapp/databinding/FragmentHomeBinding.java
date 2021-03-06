// Generated by view binder compiler. Do not edit!
package com.kodluyoruz.hungryapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kodluyoruz.hungryapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout addRestaurantLayout;

  @NonNull
  public final FloatingActionButton buttonGoToProfile;

  @NonNull
  public final RecyclerView restaurantRecyclerView;

  @NonNull
  public final TextView resultTextView;

  @NonNull
  public final TextView saveRestaurantButton;

  @NonNull
  public final TextView welcomeText;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout addRestaurantLayout, @NonNull FloatingActionButton buttonGoToProfile,
      @NonNull RecyclerView restaurantRecyclerView, @NonNull TextView resultTextView,
      @NonNull TextView saveRestaurantButton, @NonNull TextView welcomeText) {
    this.rootView = rootView;
    this.addRestaurantLayout = addRestaurantLayout;
    this.buttonGoToProfile = buttonGoToProfile;
    this.restaurantRecyclerView = restaurantRecyclerView;
    this.resultTextView = resultTextView;
    this.saveRestaurantButton = saveRestaurantButton;
    this.welcomeText = welcomeText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addRestaurantLayout;
      LinearLayout addRestaurantLayout = rootView.findViewById(id);
      if (addRestaurantLayout == null) {
        break missingId;
      }

      id = R.id.buttonGoToProfile;
      FloatingActionButton buttonGoToProfile = rootView.findViewById(id);
      if (buttonGoToProfile == null) {
        break missingId;
      }

      id = R.id.restaurantRecyclerView;
      RecyclerView restaurantRecyclerView = rootView.findViewById(id);
      if (restaurantRecyclerView == null) {
        break missingId;
      }

      id = R.id.result_text_view;
      TextView resultTextView = rootView.findViewById(id);
      if (resultTextView == null) {
        break missingId;
      }

      id = R.id.save_restaurant_button;
      TextView saveRestaurantButton = rootView.findViewById(id);
      if (saveRestaurantButton == null) {
        break missingId;
      }

      id = R.id.welcome_text;
      TextView welcomeText = rootView.findViewById(id);
      if (welcomeText == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, addRestaurantLayout,
          buttonGoToProfile, restaurantRecyclerView, resultTextView, saveRestaurantButton,
          welcomeText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
