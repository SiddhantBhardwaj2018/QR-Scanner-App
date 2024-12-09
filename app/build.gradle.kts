plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.siddhantbhardwaj.qr_code_scanner"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.siddhantbhardwaj.qr_code_scanner"
        minSdk = 24
        targetSdk = 34
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation("com.google.mlkit:barcode-scanning:17.3.0") //Bundling straight away

    implementation("com.google.android.gms:play-services-mlkit-barcode-scanning:18.3.1") // Google Play Store

    val cameraxVersion = "1.2.2"

    implementation("androidx.camera:camera-core:$cameraxVersion")
    implementation("androidx.camera:camera-camera2:$cameraxVersion")
    implementation("androidx.camera:camera-lifecycle:$cameraxVersion")
    implementation("androidx.camera:camera-video:$cameraxVersion")
    implementation("androidx.camera:camera-view:$cameraxVersion")
    implementation("androidx.camera:camera-extensions:$cameraxVersion")

    implementation("androidx.concurrent:concurrent-futures:1.2.0")


}