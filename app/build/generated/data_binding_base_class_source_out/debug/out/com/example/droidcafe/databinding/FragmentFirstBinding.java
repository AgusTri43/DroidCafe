// Generated by view binder compiler. Do not edit!
package com.example.droidcafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class FragmentFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView donut;

  @NonNull
  public final TextView donutDescription;

  @NonNull
  public final ImageView froyo;

  @NonNull
  public final TextView froyoDescription;

  @NonNull
  public final ImageView iceCream;

  @NonNull
  public final TextView iceCreamDescription;

  @NonNull
  public final TextView textviewFirst;

  private FragmentFirstBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView donut,
      @NonNull TextView donutDescription, @NonNull ImageView froyo,
      @NonNull TextView froyoDescription, @NonNull ImageView iceCream,
      @NonNull TextView iceCreamDescription, @NonNull TextView textviewFirst) {
    this.rootView = rootView;
    this.donut = donut;
    this.donutDescription = donutDescription;
    this.froyo = froyo;
    this.froyoDescription = froyoDescription;
    this.iceCream = iceCream;
    this.iceCreamDescription = iceCreamDescription;
    this.textviewFirst = textviewFirst;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.donut;
      ImageView donut = ViewBindings.findChildViewById(rootView, id);
      if (donut == null) {
        break missingId;
      }

      id = R.id.donut_description;
      TextView donutDescription = ViewBindings.findChildViewById(rootView, id);
      if (donutDescription == null) {
        break missingId;
      }

      id = R.id.froyo;
      ImageView froyo = ViewBindings.findChildViewById(rootView, id);
      if (froyo == null) {
        break missingId;
      }

      id = R.id.froyo_description;
      TextView froyoDescription = ViewBindings.findChildViewById(rootView, id);
      if (froyoDescription == null) {
        break missingId;
      }

      id = R.id.ice_cream;
      ImageView iceCream = ViewBindings.findChildViewById(rootView, id);
      if (iceCream == null) {
        break missingId;
      }

      id = R.id.ice_cream_description;
      TextView iceCreamDescription = ViewBindings.findChildViewById(rootView, id);
      if (iceCreamDescription == null) {
        break missingId;
      }

      id = R.id.textview_first;
      TextView textviewFirst = ViewBindings.findChildViewById(rootView, id);
      if (textviewFirst == null) {
        break missingId;
      }

      return new FragmentFirstBinding((ConstraintLayout) rootView, donut, donutDescription, froyo,
          froyoDescription, iceCream, iceCreamDescription, textviewFirst);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
