# Android Image Slider [![Build Status](https://travis-ci.org/daimajia/AndroidImageSlider.svg)](https://travis-ci.org/daimajia/AndroidImageSlider)

Updated from 

---

This is an amazing image slider for the Android platform. I decided to open source this because there is really not an attractive, convenient slider widget in Android.
 
You can easily load images from an internet URL, drawable, or file. And there are many kinds of amazing animations you can choose. :-D
 
## Demo
 
![](http://ww3.sinaimg.cn/mw690/610dc034jw1egzor66ojdg20950fknpe.gif)

## Usage

### Step 1

#### Gradle

The 'demo' (app ui) project in this repo uses the 'library' project as a dependency. 
```groovy
dependencies {
    implementation project(':library')
    implementation 'com.android.support:appcompat-v7:28.0.0'
    implementation 'com.daimajia.androidanimations:library:2.3@aar'
}
```

In an external project which I updated to use androidx, I have used the following dependancies:
```groovy
dependencies {
    implementation 'androidx.exifinterface:exifinterface:1.0.0-beta01'
    implementation 'androidx.appcompat:appcompat:1.0.0-beta01'
    implementation 'androidx.legacy:legacy-support-v4:1.0.0-beta01'
    implementation 'com.github.simiansim:AndroidImageSlider:master-SNAPSHOT'
    implementation 'com.squareup.picasso:picasso:2.71828'
}
```

![Migrating to AndroidX](https://developer.android.com/jetpack/androidx/migrate)


### Step 2

The Library Manifest includes these permissions, in its own `AndroidManifest.xml`. You should not need to add these again to your own manifest, see note below.

```xml
<!-- if you want to load images from the internet -->
<uses-permission android:name="android.permission.INTERNET" /> 

<!-- if you want to load images from a file OR from the internet -->
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
```

**Note:** If you want to load images from the internet, you need both the `INTERNET` and `READ_EXTERNAL_STORAGE` permissions to allow files from the internet to be cached into local storage.

If you want to load images from drawable, then no additional permissions are necessary.

### Step 3

Add the Slider to your layout:
 
```java
<com.daimajia.slider.library.SliderLayout
        android:id="@+id/slider"
        android:layout_width="match_parent"
        android:layout_height="200dp"
/>
```

There are some default indicators. If you want to use a provided indicator:
 
```java
<com.daimajia.slider.library.Indicators.PagerIndicator
        android:id="@+id/custom_indicator"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center"
        />
```

[Code example](https://github.com/simiansim/AndroidImageSlider/blob/master/demo/src/main/java/com/daimajia/slider/demo/MainActivity.java)

[Layout example](https://github.com/simiansim/AndroidImageSlider/blob/master/demo/src/main/res/layout/activity_main.xml)
 
====
 
## Advanced usage

Please visit [Wiki](https://github.com/daimajia/AndroidImageSlider/wiki)
 
## Thanks

- [Picasso](https://github.com/square/picasso)
- [ViewPagerTransforms](https://github.com/ToxicBakery/ViewPagerTransforms)

##About me
 
I am a student in mainland China. I love Google, love Android, love everything that is interesting. If you get any problems when using this library or you have an internship opportunity, please feel free to [email me](mailto:daimajia@gmail.com). :smiley:
