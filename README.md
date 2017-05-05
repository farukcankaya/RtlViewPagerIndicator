# RtlViewPagerIndicator
Paging indicator widgets compatible with the RtlViewPager. It is inspired from the JakeWharton's <a href="https://github.com/JakeWharton/ViewPagerIndicator">ViewPagerIndicator</a> but it supports RTL layout.

[ ![Download](https://api.bintray.com/packages/farukcankaya/maven/RtlViewPagerIndicator/images/download.svg) ](https://bintray.com/farukcankaya/maven/RtlViewPagerIndicator/_latestVersion)

# Showcase

| LTR        | RTL           |
| ------------- |:-------------:|
| <img src="https://github.com/farukcankaya/RtlViewPagerIndicator/blob/master/art/ltr.gif" />      | <img src="https://github.com/farukcankaya/RtlViewPagerIndicator/blob/master/art/rtl.gif" /> |

# Usage
It will be available in jCenter soon but now you need to add my maven repository.

### First step
Put code below to your build.gradle file that is under /app directory:
```java
repositories {
    ...
    maven {
        url  "http://dl.bintray.com/farukcankaya/maven"
    }
}

dependencies {
    ...
    compile 'com.farukcankaya.rtlviewpagerindicator:1.0.0'
}
```

### Second step
Add `CircleIndicator` to your <a href="https://github.com/farukcankaya/RtlViewPagerIndicator/blob/master/app/src/main/res/layout/activity_circle_indicator.xml">xml file</a>:
```xml
<com.farukcankaya.rtlviewpagerindicator.CircleIndicator
        android:id="@+id/rtl_view_pager_indicator"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom"
        android:padding="10dp"
        app:centered="true"
        app:fillColor="#FFFFFFFF"
        app:pageColor="#00000000"
        app:snap="false"
        app:strokeColor="#FF000000" />
```

### Final step
Setup viewpager in your <a href="https://github.com/farukcankaya/RtlViewPagerIndicator/blob/master/app/src/main/java/com/farukcankaya/rtlviewpagerindicatorsample/CircleIndicatorActivity.java">Activity or Fragment</a>:
```java
CircleIndicator rtlCircleIndicator = (CircleIndicator) findViewById(R.id.rtl_view_pager_indicator);
rtlCircleIndicator.setViewPager(rtlViewPager);
```
You can find working example in **app** module.

# Available Indicators

- [x] Circle 
- [ ] Icon
- [ ] Ics
- [ ] Line
- [ ] Title
- [ ] Tab
- [ ] Underline

# License
````
Copyright (c) 2017  Faruk Cankaya

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
````
