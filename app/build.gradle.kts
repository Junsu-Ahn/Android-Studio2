plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.dji.myapplication"

    compileSdk = 35

    defaultConfig {
//        applicationId = "com.dji.myapplication"
        applicationId = "com.dji.myapplication"
        minSdk = 32
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }

    packagingOptions {
        doNotStrip.add("**/libconstants.so")
        doNotStrip.add("**/libdji_innertools.so")
        doNotStrip.add("**/libdjibase.so")
        doNotStrip.add("**/libDJICSDKCommon.so")
        doNotStrip.add("**/libDJIFlySafeCore-CSDK.so")
        doNotStrip.add("**/libdjifs_jni-CSDK.so")
        doNotStrip.add("**/libDJIRegister.so")
        doNotStrip.add("**/libdjisdk_jni.so")
        doNotStrip.add("**/libDJIUpgradeCore.so")
        doNotStrip.add("**/libDJIUpgradeJNI.so")
        doNotStrip.add("**/libDJIWaypointV2Core-CSDK.so")
        doNotStrip.add("**/libdjiwpv2-CSDK.so")
        doNotStrip.add("**/libffmpeg.so")
        doNotStrip.add("**/libFlightRecordEngine.so")
        doNotStrip.add("**/libvideo-framing.so")
        doNotStrip.add("**/libwaes.so")
        doNotStrip.add("**/libagora-rtsa-sdk.so")
        doNotStrip.add("**/libc++.so")
        doNotStrip.add("**/libc++_shared.so")
        doNotStrip.add("**/libmrtc_28181.so")
        doNotStrip.add("**/libmrtc_agora.so")
        doNotStrip.add("**/libmrtc_core.so")
        doNotStrip.add("**/libmrtc_core_jni.so")
        doNotStrip.add("**/libmrtc_data.so")
        doNotStrip.add("**/libmrtc_log.so")
        doNotStrip.add("**/libmrtc_onvif.so")
        doNotStrip.add("**/libmrtc_rtmp.so")
        doNotStrip.add("**/libmrtc_rtsp.so")
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation("com.dji:dji-sdk-v5-aircraft:5.2.0")
    implementation("com.dji:dji-sdk-v5-networkImp:5.2.0")
    compileOnly("com.dji:dji-sdk-v5-aircraft-provided:5.2.0")

    implementation("com.squareup.okio:okio:1.15.0")
    implementation("com.squareup.wire:wire-runtime:2.2.0")
    implementation("com.airbnb.android:lottie:3.3.1")
}