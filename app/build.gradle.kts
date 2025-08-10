plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = (project.properties["ANDROID_BUILD_SDK_VERSION"] as String).toInt()

    defaultConfig {
        namespace = project.properties["APP_PACKAGE_NAME"].toString()
        applicationId = namespace
        versionName = project.properties["APP_VERSION_NAME"].toString()
        versionCode = project.properties["APP_VERSION_CODE"].toString().toInt()
        minSdk = project.properties["ANDROID_BUILD_MIN_SDK_VERSION"].toString().toInt()
        targetSdk = project.properties["ANDROID_BUILD_TARGET_SDK_VERSION"].toString().toInt()
    }

    flavorDimensions += "client"
    productFlavors {
        create("whitelabel") {
            isDefault = true
            dimension = "client"
            applicationIdSuffix = ".whitelabel"
            versionNameSuffix = "-whitelabel"
        }
        create("example") {
            dimension = "client"
            applicationIdSuffix = ".example"
            versionNameSuffix = "-example"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        debug {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
            applicationIdSuffix = ".debug"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }
}

dependencies {
    implementation(project(":theme"))
    implementation(project(":navigation:core"))
    implementation(project(":navigation:tab_bar"))

    implementation(project(":features:model_feature"))

    implementation(libs.material)
    implementation(libs.compose.activity)
    implementation(libs.bundles.material.compose)
    implementation(libs.compose.navigation)
}