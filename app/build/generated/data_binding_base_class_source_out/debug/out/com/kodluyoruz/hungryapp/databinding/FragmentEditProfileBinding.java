// Generated by view binder compiler. Do not edit!
package com.kodluyoruz.hungryapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kodluyoruz.hungryapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEditProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView EditProfileImageView;

  @NonNull
  public final MaterialButton buttonChangePasswordNavigation;

  @NonNull
  public final Button buttonUpdateProfile;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final TextInputEditText textInputEditEmail;

  @NonNull
  public final TextInputEditText textInputEditName;

  @NonNull
  public final TextInputEditText textInputEditPPURL;

  @NonNull
  public final TextInputEditText textInputEditPhone;

  @NonNull
  public final TextInputEditText textInputEditSurname;

  @NonNull
  public final TextInputLayout textInputLayoutEmail;

  @NonNull
  public final TextInputLayout textInputLayoutName;

  @NonNull
  public final TextInputLayout textInputLayoutPPURL;

  @NonNull
  public final TextInputLayout textInputLayoutPhone;

  @NonNull
  public final TextInputLayout textInputLayoutSurname;

  @NonNull
  public final TextView textView3;

  private FragmentEditProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView EditProfileImageView,
      @NonNull MaterialButton buttonChangePasswordNavigation, @NonNull Button buttonUpdateProfile,
      @NonNull CardView cardView2, @NonNull TextInputEditText textInputEditEmail,
      @NonNull TextInputEditText textInputEditName, @NonNull TextInputEditText textInputEditPPURL,
      @NonNull TextInputEditText textInputEditPhone,
      @NonNull TextInputEditText textInputEditSurname,
      @NonNull TextInputLayout textInputLayoutEmail, @NonNull TextInputLayout textInputLayoutName,
      @NonNull TextInputLayout textInputLayoutPPURL, @NonNull TextInputLayout textInputLayoutPhone,
      @NonNull TextInputLayout textInputLayoutSurname, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.EditProfileImageView = EditProfileImageView;
    this.buttonChangePasswordNavigation = buttonChangePasswordNavigation;
    this.buttonUpdateProfile = buttonUpdateProfile;
    this.cardView2 = cardView2;
    this.textInputEditEmail = textInputEditEmail;
    this.textInputEditName = textInputEditName;
    this.textInputEditPPURL = textInputEditPPURL;
    this.textInputEditPhone = textInputEditPhone;
    this.textInputEditSurname = textInputEditSurname;
    this.textInputLayoutEmail = textInputLayoutEmail;
    this.textInputLayoutName = textInputLayoutName;
    this.textInputLayoutPPURL = textInputLayoutPPURL;
    this.textInputLayoutPhone = textInputLayoutPhone;
    this.textInputLayoutSurname = textInputLayoutSurname;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_edit_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEditProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.EditProfileImageView;
      ImageView EditProfileImageView = rootView.findViewById(id);
      if (EditProfileImageView == null) {
        break missingId;
      }

      id = R.id.buttonChangePasswordNavigation;
      MaterialButton buttonChangePasswordNavigation = rootView.findViewById(id);
      if (buttonChangePasswordNavigation == null) {
        break missingId;
      }

      id = R.id.buttonUpdateProfile;
      Button buttonUpdateProfile = rootView.findViewById(id);
      if (buttonUpdateProfile == null) {
        break missingId;
      }

      id = R.id.cardView2;
      CardView cardView2 = rootView.findViewById(id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.textInputEditEmail;
      TextInputEditText textInputEditEmail = rootView.findViewById(id);
      if (textInputEditEmail == null) {
        break missingId;
      }

      id = R.id.textInputEditName;
      TextInputEditText textInputEditName = rootView.findViewById(id);
      if (textInputEditName == null) {
        break missingId;
      }

      id = R.id.textInputEditPPURL;
      TextInputEditText textInputEditPPURL = rootView.findViewById(id);
      if (textInputEditPPURL == null) {
        break missingId;
      }

      id = R.id.textInputEditPhone;
      TextInputEditText textInputEditPhone = rootView.findViewById(id);
      if (textInputEditPhone == null) {
        break missingId;
      }

      id = R.id.textInputEditSurname;
      TextInputEditText textInputEditSurname = rootView.findViewById(id);
      if (textInputEditSurname == null) {
        break missingId;
      }

      id = R.id.textInputLayoutEmail;
      TextInputLayout textInputLayoutEmail = rootView.findViewById(id);
      if (textInputLayoutEmail == null) {
        break missingId;
      }

      id = R.id.textInputLayoutName;
      TextInputLayout textInputLayoutName = rootView.findViewById(id);
      if (textInputLayoutName == null) {
        break missingId;
      }

      id = R.id.textInputLayoutPPURL;
      TextInputLayout textInputLayoutPPURL = rootView.findViewById(id);
      if (textInputLayoutPPURL == null) {
        break missingId;
      }

      id = R.id.textInputLayoutPhone;
      TextInputLayout textInputLayoutPhone = rootView.findViewById(id);
      if (textInputLayoutPhone == null) {
        break missingId;
      }

      id = R.id.textInputLayoutSurname;
      TextInputLayout textInputLayoutSurname = rootView.findViewById(id);
      if (textInputLayoutSurname == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      return new FragmentEditProfileBinding((ConstraintLayout) rootView, EditProfileImageView,
          buttonChangePasswordNavigation, buttonUpdateProfile, cardView2, textInputEditEmail,
          textInputEditName, textInputEditPPURL, textInputEditPhone, textInputEditSurname,
          textInputLayoutEmail, textInputLayoutName, textInputLayoutPPURL, textInputLayoutPhone,
          textInputLayoutSurname, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
