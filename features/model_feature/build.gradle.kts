plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "de.leonardo.features.model_feature"
    compileSdk = (project.properties["ANDROID_BUILD_SDK_VERSION"] as String).toInt()

    defaultConfig {
        minSdk = (project.properties["ANDROID_BUILD_MIN_SDK_VERSION"] as String).toInt()
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }
}

dependencies {
    implementation(project(":theme"))

    implementation(localLibs.bundles.material.compose)
    implementation(localLibs.bundles.compose.ui)
}