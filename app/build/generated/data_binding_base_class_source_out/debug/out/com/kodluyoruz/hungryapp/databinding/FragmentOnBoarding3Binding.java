// Generated by view binder compiler. Do not edit!
package com.kodluyoruz.hungryapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.kodluyoruz.hungryapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOnBoarding3Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textViewDescription;

  @NonNull
  public final TextView textViewTitle;

  @NonNull
  public final TextView textViewTitle2;

  private FragmentOnBoarding3Binding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView, @NonNull TextView textViewDescription,
      @NonNull TextView textViewTitle, @NonNull TextView textViewTitle2) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.textViewDescription = textViewDescription;
    this.textViewTitle = textViewTitle;
    this.textViewTitle2 = textViewTitle2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOnBoarding3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOnBoarding3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_on_boarding3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOnBoarding3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textViewDescription;
      TextView textViewDescription = rootView.findViewById(id);
      if (textViewDescription == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = rootView.findViewById(id);
      if (textViewTitle == null) {
        break missingId;
      }

      id = R.id.textViewTitle2;
      TextView textViewTitle2 = rootView.findViewById(id);
      if (textViewTitle2 == null) {
        break missingId;
      }

      return new FragmentOnBoarding3Binding((ConstraintLayout) rootView, imageView,
          textViewDescription, textViewTitle, textViewTitle2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
