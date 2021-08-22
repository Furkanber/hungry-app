// Generated by view binder compiler. Do not edit!
package com.kodluyoruz.hungryapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class AddressListFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView addressListRV;

  @NonNull
  public final FloatingActionButton buttonAddAddress;

  private AddressListFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView addressListRV, @NonNull FloatingActionButton buttonAddAddress) {
    this.rootView = rootView;
    this.addressListRV = addressListRV;
    this.buttonAddAddress = buttonAddAddress;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddressListFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddressListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.address_list_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddressListFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addressListRV;
      RecyclerView addressListRV = rootView.findViewById(id);
      if (addressListRV == null) {
        break missingId;
      }

      id = R.id.buttonAddAddress;
      FloatingActionButton buttonAddAddress = rootView.findViewById(id);
      if (buttonAddAddress == null) {
        break missingId;
      }

      return new AddressListFragmentBinding((ConstraintLayout) rootView, addressListRV,
          buttonAddAddress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
