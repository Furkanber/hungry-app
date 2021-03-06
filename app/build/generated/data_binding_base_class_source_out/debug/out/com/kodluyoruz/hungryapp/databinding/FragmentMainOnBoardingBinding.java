// Generated by view binder compiler. Do not edit!
package com.kodluyoruz.hungryapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.kodluyoruz.hungryapp.R;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainOnBoardingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final SpringDotsIndicator springDotsIndicator;

  @NonNull
  public final ViewPager2 viewPager;

  private FragmentMainOnBoardingBinding(@NonNull ConstraintLayout rootView,
      @NonNull SpringDotsIndicator springDotsIndicator, @NonNull ViewPager2 viewPager) {
    this.rootView = rootView;
    this.springDotsIndicator = springDotsIndicator;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainOnBoardingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainOnBoardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main_on_boarding, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainOnBoardingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.spring_dots_indicator;
      SpringDotsIndicator springDotsIndicator = rootView.findViewById(id);
      if (springDotsIndicator == null) {
        break missingId;
      }

      id = R.id.viewPager;
      ViewPager2 viewPager = rootView.findViewById(id);
      if (viewPager == null) {
        break missingId;
      }

      return new FragmentMainOnBoardingBinding((ConstraintLayout) rootView, springDotsIndicator,
          viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
