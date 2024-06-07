plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = (project.properties["ANDROID_BUILD_SDK_VERSION"] as String).toInt()

    defaultConfig {
        namespace = project.properties["APP_PACKAGE_NAME"] as String
        applicationId = project.properties["APP_PACKAGE_NAME"] as String
        versionName = project.properties["APP_VERSION_NAME"] as String
        versionCode = (project.properties["APP_VERSION_CODE"] as String).toInt()
        minSdk = (project.properties["ANDROID_BUILD_MIN_SDK_VERSION"] as String).toInt()
        targetSdk = (project.properties["ANDROID_BUILD_TARGET_SDK_VERSION"] as String).toInt()
    }

    flavorDimensions += "customer"
    productFlavors {
        create("base") {
            dimension = "customer"
            applicationId = "de.leonardo.base"
            applicationIdSuffix = ".base"
            versionNameSuffix = "-base"
        }
        create("customer") {
            dimension = "customer"
            applicationId = "de.leonardo.customer.appname"
            applicationIdSuffix = ".customer"
            versionNameSuffix = "-customer"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        debug {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.txt")
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
    implementation(project(":features:model_feature"))

    implementation(localLibs.material)
    implementation(localLibs.compose.activity)
    implementation(localLibs.bundles.material.compose)
}