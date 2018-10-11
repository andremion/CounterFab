[![License Apache 2.0](https://img.shields.io/badge/License-Apache%202.0-blue.svg?style=true)](http://www.apache.org/licenses/LICENSE-2.0)
![minSdkVersion 16](https://img.shields.io/badge/minSdkVersion-16-red.svg?style=true)
![compileSdkVersion 24](https://img.shields.io/badge/compileSdkVersion-24-yellow.svg?style=true)
[![Download](https://api.bintray.com/packages/andremion/github/CounterFab/images/download.svg)](https://bintray.com/andremion/github/CounterFab/_latestVersion)

[![Android Arsenal CounterFab](https://img.shields.io/badge/Android%20Arsenal-CounterFab-green.svg?style=true)](https://android-arsenal.com/details/1/5052)
[![MaterialUp CounterFab](https://img.shields.io/badge/MaterialUp-CounterFab-blue.svg?style=true)](https://material.uplabs.com/posts/counterfab-library)

![Icon](https://raw.githubusercontent.com/andremion/CounterFab/master/sample/src/main/res/mipmap-hdpi/ic_launcher.png)
# CounterFab
A FloatingActionButton subclass that shows a counter badge on right top corner

![Sample](https://raw.githubusercontent.com/andremion/CounterFab/master/art/sample.gif)

[![Get it on Google Play](https://developer.android.com/images/brand/en_generic_rgb_wo_60.png)](https://play.google.com/store/apps/details?id=com.andremion.counterfab.sample)

It's also used by [Louvre](https://github.com/andremion/Louvre) library.

![Louvre](https://raw.githubusercontent.com/andremion/Louvre/master/art/sample.gif)

## Installation

Include the library in your `build.gradle` _(check badge at top for latest version)_

```groovy
dependencies{
    compile 'com.github.andremion:counterfab:x.y.z'
}
```

or in your `pom.xml` if you are using Maven

```xml
<dependency>
  <groupId>com.github.andremion</groupId>
  <artifactId>counterfab</artifactId>
  <version>x.y.z</version>
  <type>pom</type>
</dependency>
```

## Usage

Add it as a regular FloatingActionButton on layout…

```xml
<com.andremion.counterfab.CounterFab
        android:id="@+id/counter_fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/ic_add_white_24dp" />
```

and programmatically you can use one of these methods:

```java
CounterFab counterFab = (CounterFab) findViewById(R.id.counter_fab);
counterFab.setCount(10); // Set the count value to show on badge
counterFab.increase(); // Increase the current count value by 1
counterFab.decrease(); // Decrease the current count value by 1
```

## Customization

The recommended way to customize the background color is by using the `app:backgroundTint` attribute

```xml
<com.andremion.counterfab.CounterFab
        android:id="@+id/counter_fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:backgroundTint="#009688"
        android:src="@drawable/ic_add_white_24dp" />
```

To change the badge background color you can use the `app:badgeBackgroundColor` attribute

```xml
<com.andremion.counterfab.CounterFab
        android:id="@+id/counter_fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:badgeBackgroundColor="#009688"
        android:src="@drawable/ic_add_white_24dp" />
```

To change the badge position you can use the `app:badgePosition` attribute as: RightTop, LeftBottom, LeftTop and RightBottom.

```xml
<com.andremion.counterfab.CounterFab
        android:id="@+id/counter_fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:badgePosition="RightTop"
        android:src="@drawable/ic_add_white_24dp" />
```

See more at the [sample](https://github.com/andremion/CounterFab/tree/master/sample)

## Libraries and tools used in the project

* [Design Support Library](http://developer.android.com/intl/pt-br/tools/support-library/features.html#design)
The Design package provides APIs to support adding material design components and patterns to your apps.

## License

    Copyright 2016 André Mion

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
