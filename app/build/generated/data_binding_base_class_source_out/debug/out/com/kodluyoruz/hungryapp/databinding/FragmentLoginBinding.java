// Generated by view binder compiler. Do not edit!
package com.kodluyoruz.hungryapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton buttonLogin;

  @NonNull
  public final MaterialButton buttonToRegister;

  @NonNull
  public final CardView cardView5;

  @NonNull
  public final LinearLayout linearLayoutRegister;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextInputEditText textInputEditTextEmail;

  @NonNull
  public final TextInputEditText textInputEditTextPassword;

  @NonNull
  public final TextInputLayout textInputLayoutEmail;

  @NonNull
  public final TextInputLayout textInputLayoutPassword;

  private FragmentLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton buttonLogin, @NonNull MaterialButton buttonToRegister,
      @NonNull CardView cardView5, @NonNull LinearLayout linearLayoutRegister,
      @NonNull ProgressBar progressBar, @NonNull TextInputEditText textInputEditTextEmail,
      @NonNull TextInputEditText textInputEditTextPassword,
      @NonNull TextInputLayout textInputLayoutEmail,
      @NonNull TextInputLayout textInputLayoutPassword) {
    this.rootView = rootView;
    this.buttonLogin = buttonLogin;
    this.buttonToRegister = buttonToRegister;
    this.cardView5 = cardView5;
    this.linearLayoutRegister = linearLayoutRegister;
    this.progressBar = progressBar;
    this.textInputEditTextEmail = textInputEditTextEmail;
    this.textInputEditTextPassword = textInputEditTextPassword;
    this.textInputLayoutEmail = textInputLayoutEmail;
    this.textInputLayoutPassword = textInputLayoutPassword;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonLogin;
      MaterialButton buttonLogin = rootView.findViewById(id);
      if (buttonLogin == null) {
        break missingId;
      }

      id = R.id.buttonToRegister;
      MaterialButton buttonToRegister = rootView.findViewById(id);
      if (buttonToRegister == null) {
        break missingId;
      }

      id = R.id.cardView5;
      CardView cardView5 = rootView.findViewById(id);
      if (cardView5 == null) {
        break missingId;
      }

      id = R.id.linearLayoutRegister;
      LinearLayout linearLayoutRegister = rootView.findViewById(id);
      if (linearLayoutRegister == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textInputEditTextEmail;
      TextInputEditText textInputEditTextEmail = rootView.findViewById(id);
      if (textInputEditTextEmail == null) {
        break missingId;
      }

      id = R.id.textInputEditTextPassword;
      TextInputEditText textInputEditTextPassword = rootView.findViewById(id);
      if (textInputEditTextPassword == null) {
        break missingId;
      }

      id = R.id.textInputLayoutEmail;
      TextInputLayout textInputLayoutEmail = rootView.findViewById(id);
      if (textInputLayoutEmail == null) {
        break missingId;
      }

      id = R.id.textInputLayoutPassword;
      TextInputLayout textInputLayoutPassword = rootView.findViewById(id);
      if (textInputLayoutPassword == null) {
        break missingId;
      }

      return new FragmentLoginBinding((ConstraintLayout) rootView, buttonLogin, buttonToRegister,
          cardView5, linearLayoutRegister, progressBar, textInputEditTextEmail,
          textInputEditTextPassword, textInputLayoutEmail, textInputLayoutPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
