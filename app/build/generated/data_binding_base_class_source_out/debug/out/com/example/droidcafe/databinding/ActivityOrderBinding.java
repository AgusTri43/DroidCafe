// Generated by view binder compiler. Do not edit!
package com.example.droidcafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.droidcafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOrderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView addressLabel;

  @NonNull
  public final EditText addressText;

  @NonNull
  public final Spinner citySpinner;

  @NonNull
  public final TextView deliveryLabel;

  @NonNull
  public final EditText inputNote;

  @NonNull
  public final TextView nameCity;

  @NonNull
  public final TextView nameLabel;

  @NonNull
  public final EditText nameText;

  @NonNull
  public final RadioButton nextday;

  @NonNull
  public final TextView orderTextview;

  @NonNull
  public final TextView phoneLabel;

  @NonNull
  public final EditText phoneText;

  @NonNull
  public final RadioButton pickup;

  @NonNull
  public final RadioButton sameday;

  private ActivityOrderBinding(@NonNull ConstraintLayout rootView, @NonNull TextView addressLabel,
      @NonNull EditText addressText, @NonNull Spinner citySpinner, @NonNull TextView deliveryLabel,
      @NonNull EditText inputNote, @NonNull TextView nameCity, @NonNull TextView nameLabel,
      @NonNull EditText nameText, @NonNull RadioButton nextday, @NonNull TextView orderTextview,
      @NonNull TextView phoneLabel, @NonNull EditText phoneText, @NonNull RadioButton pickup,
      @NonNull RadioButton sameday) {
    this.rootView = rootView;
    this.addressLabel = addressLabel;
    this.addressText = addressText;
    this.citySpinner = citySpinner;
    this.deliveryLabel = deliveryLabel;
    this.inputNote = inputNote;
    this.nameCity = nameCity;
    this.nameLabel = nameLabel;
    this.nameText = nameText;
    this.nextday = nextday;
    this.orderTextview = orderTextview;
    this.phoneLabel = phoneLabel;
    this.phoneText = phoneText;
    this.pickup = pickup;
    this.sameday = sameday;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address_label;
      TextView addressLabel = ViewBindings.findChildViewById(rootView, id);
      if (addressLabel == null) {
        break missingId;
      }

      id = R.id.address_text;
      EditText addressText = ViewBindings.findChildViewById(rootView, id);
      if (addressText == null) {
        break missingId;
      }

      id = R.id.city_spinner;
      Spinner citySpinner = ViewBindings.findChildViewById(rootView, id);
      if (citySpinner == null) {
        break missingId;
      }

      id = R.id.delivery_label;
      TextView deliveryLabel = ViewBindings.findChildViewById(rootView, id);
      if (deliveryLabel == null) {
        break missingId;
      }

      id = R.id.input_note;
      EditText inputNote = ViewBindings.findChildViewById(rootView, id);
      if (inputNote == null) {
        break missingId;
      }

      id = R.id.name_city;
      TextView nameCity = ViewBindings.findChildViewById(rootView, id);
      if (nameCity == null) {
        break missingId;
      }

      id = R.id.name_label;
      TextView nameLabel = ViewBindings.findChildViewById(rootView, id);
      if (nameLabel == null) {
        break missingId;
      }

      id = R.id.name_text;
      EditText nameText = ViewBindings.findChildViewById(rootView, id);
      if (nameText == null) {
        break missingId;
      }

      id = R.id.nextday;
      RadioButton nextday = ViewBindings.findChildViewById(rootView, id);
      if (nextday == null) {
        break missingId;
      }

      id = R.id.order_textview;
      TextView orderTextview = ViewBindings.findChildViewById(rootView, id);
      if (orderTextview == null) {
        break missingId;
      }

      id = R.id.phone_label;
      TextView phoneLabel = ViewBindings.findChildViewById(rootView, id);
      if (phoneLabel == null) {
        break missingId;
      }

      id = R.id.phone_text;
      EditText phoneText = ViewBindings.findChildViewById(rootView, id);
      if (phoneText == null) {
        break missingId;
      }

      id = R.id.pickup;
      RadioButton pickup = ViewBindings.findChildViewById(rootView, id);
      if (pickup == null) {
        break missingId;
      }

      id = R.id.sameday;
      RadioButton sameday = ViewBindings.findChildViewById(rootView, id);
      if (sameday == null) {
        break missingId;
      }

      return new ActivityOrderBinding((ConstraintLayout) rootView, addressLabel, addressText,
          citySpinner, deliveryLabel, inputNote, nameCity, nameLabel, nameText, nextday,
          orderTextview, phoneLabel, phoneText, pickup, sameday);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
