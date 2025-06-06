// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.core.base.SerialNumberTextCell;
import dji.v5.ux.core.base.TextCell;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkSettingMenuAboutBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final LinearLayout commonMenuBatteryVersionLayout;

  @NonNull
  public final TextCell commonMenuCamera1Sn;

  @NonNull
  public final TextCell commonMenuCamera2Sn;

  @NonNull
  public final TextCell commonMenuCamera3Sn;

  @NonNull
  public final LinearLayout commonMenuCameraVersionLy;

  @NonNull
  public final TextCell commonMenuFcVersion;

  @NonNull
  public final SerialNumberTextCell commonMenuFlycSerial;

  @NonNull
  public final LinearLayout commonMenuGimbalVersionLy;

  @NonNull
  public final TextCell commonMenuRcSerial;

  @NonNull
  public final TextCell commonMenuRcVersion;

  @NonNull
  public final TextCell commonMenuRtkSerial;

  private UxsdkSettingMenuAboutBinding(@NonNull ScrollView rootView,
      @NonNull LinearLayout commonMenuBatteryVersionLayout, @NonNull TextCell commonMenuCamera1Sn,
      @NonNull TextCell commonMenuCamera2Sn, @NonNull TextCell commonMenuCamera3Sn,
      @NonNull LinearLayout commonMenuCameraVersionLy, @NonNull TextCell commonMenuFcVersion,
      @NonNull SerialNumberTextCell commonMenuFlycSerial,
      @NonNull LinearLayout commonMenuGimbalVersionLy, @NonNull TextCell commonMenuRcSerial,
      @NonNull TextCell commonMenuRcVersion, @NonNull TextCell commonMenuRtkSerial) {
    this.rootView = rootView;
    this.commonMenuBatteryVersionLayout = commonMenuBatteryVersionLayout;
    this.commonMenuCamera1Sn = commonMenuCamera1Sn;
    this.commonMenuCamera2Sn = commonMenuCamera2Sn;
    this.commonMenuCamera3Sn = commonMenuCamera3Sn;
    this.commonMenuCameraVersionLy = commonMenuCameraVersionLy;
    this.commonMenuFcVersion = commonMenuFcVersion;
    this.commonMenuFlycSerial = commonMenuFlycSerial;
    this.commonMenuGimbalVersionLy = commonMenuGimbalVersionLy;
    this.commonMenuRcSerial = commonMenuRcSerial;
    this.commonMenuRcVersion = commonMenuRcVersion;
    this.commonMenuRtkSerial = commonMenuRtkSerial;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkSettingMenuAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkSettingMenuAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_setting_menu_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkSettingMenuAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.common_menu_battery_version_layout;
      LinearLayout commonMenuBatteryVersionLayout = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuBatteryVersionLayout == null) {
        break missingId;
      }

      id = R.id.common_menu_camera1_sn;
      TextCell commonMenuCamera1Sn = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuCamera1Sn == null) {
        break missingId;
      }

      id = R.id.common_menu_camera2_sn;
      TextCell commonMenuCamera2Sn = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuCamera2Sn == null) {
        break missingId;
      }

      id = R.id.common_menu_camera3_sn;
      TextCell commonMenuCamera3Sn = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuCamera3Sn == null) {
        break missingId;
      }

      id = R.id.common_menu_camera_version_ly;
      LinearLayout commonMenuCameraVersionLy = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuCameraVersionLy == null) {
        break missingId;
      }

      id = R.id.common_menu_fc_version;
      TextCell commonMenuFcVersion = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuFcVersion == null) {
        break missingId;
      }

      id = R.id.common_menu_flyc_serial;
      SerialNumberTextCell commonMenuFlycSerial = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuFlycSerial == null) {
        break missingId;
      }

      id = R.id.common_menu_gimbal_version_ly;
      LinearLayout commonMenuGimbalVersionLy = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuGimbalVersionLy == null) {
        break missingId;
      }

      id = R.id.common_menu_rc_serial;
      TextCell commonMenuRcSerial = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuRcSerial == null) {
        break missingId;
      }

      id = R.id.common_menu_rc_version;
      TextCell commonMenuRcVersion = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuRcVersion == null) {
        break missingId;
      }

      id = R.id.common_menu_rtk_serial;
      TextCell commonMenuRtkSerial = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuRtkSerial == null) {
        break missingId;
      }

      return new UxsdkSettingMenuAboutBinding((ScrollView) rootView, commonMenuBatteryVersionLayout,
          commonMenuCamera1Sn, commonMenuCamera2Sn, commonMenuCamera3Sn, commonMenuCameraVersionLy,
          commonMenuFcVersion, commonMenuFlycSerial, commonMenuGimbalVersionLy, commonMenuRcSerial,
          commonMenuRcVersion, commonMenuRtkSerial);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
