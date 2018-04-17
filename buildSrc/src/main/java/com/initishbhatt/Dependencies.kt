object Version {
    const val kotlinVersion = "1.2.30"
    const val androidGradleVersion = "3.1.1"

    // Compile dependencies
    const val supportVersion = "27.1.1"
    const val daggerVersion = "2.14.1"
    const val retrofitVersion = "2.3.0"
    const val okhttpVersion = "3.10.0"
    const val picassoVersion = "2.5.2"

    // Unit tests
    const val mockitoVersion = "2.13.0"
}


object Dependencies {

    val androidGradle = "com.android.tools.build:gradle:${Version.androidGradleVersion}"
    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlinVersion}"

    val buildToolsVersion = "27.0.3"
    val minSdkVersion = 23
    val targetSdkVersion = 27
    val compileSdkVersion = 27
    val applicationId = "com.initishbhatt.marvelsuperheros"
    val versionCode = 1
    val versionName = "1.0"

}

object Libs {
    val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Version.kotlinVersion}"
    val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Version.kotlinVersion}"
    val appcompat = "com.android.support:appcompat-v7:${Version.supportVersion}"
    val support = "com.android.support:support-v4:${Version.supportVersion}"
    val constraint_layout = "com.android.support.constraint:constraint-layout:1.0.2"
    val design = "com.android.support:design:${Version.supportVersion}"
    val multidex = "com.android.support:multidex:1.0.3"
    val cardview = "com.android.support:cardview-v7:${Version.supportVersion}"
}

object Square {
    val picasso = "com.squareup.picasso:picasso:${Version.picassoVersion}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofitVersion}"
    val moshi_retrofit = "com.squareup.retrofit2:converter-moshi:2.3.0"
    val rxadapter = "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:1.0.0"
    val moshi = "com.squareup.moshi:moshi:1.5.0"
    val moshi_kotlin = "com.squareup.moshi:moshi-kotlin:1.5.0"
    val okhttp = "com.squareup.okhttp3:okhttp:${Version.okhttpVersion}"
    val okhttp_intercepter = "com.squareup.okhttp3:logging-interceptor:${Version.okhttpVersion}"
    val timber = "com.jakewharton.timber:timber:4.6.0"
}

object Reactive {
    val rxJava2 = "io.reactivex.rxjava2:rxjava:2.1.9"
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.0.1"
    val rxKotlin = "io.reactivex.rxjava2:rxkotlin:2.1.0"
}

object Di {
    val dagger = "com.google.dagger:dagger:${Version.daggerVersion}"
    val dagger_android = "com.google.dagger:dagger-android:${Version.daggerVersion}"
    val dagger_android_support = "com.google.dagger:dagger-android-support:${Version.daggerVersion}"
    val dagger_android_processor = "com.google.dagger:dagger-android-processor:${Version.daggerVersion}"
    val dagger_compiler = "com.google.dagger:dagger-compiler:${Version.daggerVersion}"
    val databinding_complier = "com.android.databinding:compiler:3.1.1"
}

object Aac {
    val lifecycle_extension = "android.arch.lifecycle:extensions:1.1.1"
    val lifecycle_runtime = "android.arch.lifecycle:runtime:1.1.1"
    val lifecycle_streams = "android.arch.lifecycle:reactivestreams:1.1.1"
    val lifecyclePaging = "android.arch.paging:runtime:1.0.0-beta1"
    val lifecycle_compiler = "android.arch.lifecycle:compiler:1.1.1"
}

object TestLibs {
    val junit = "junit:junit:4.12"
    val runner = "com.android.support.test:runner:1.0.1"
    val mockito = "org.mockito:mockito-core:${Version.mockitoVersion}"
    val mockito_kotlin = "com.nhaarman:mockito-kotlin:1.5.0"
    val dexmaker = "com.google.dexmaker:dexmaker:1.2"
    val dexmaker_mockito = "com.google.dexmaker:dexmaker-mockito:1.2"
    val espresso = "com.android.support.test.espresso:espresso-core:3.0.1"
}
