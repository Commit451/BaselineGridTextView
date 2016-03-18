# BaselineGridTextView
An extension to {@link AppCompatTextView} which aligns text to a 4dp baseline grid.

[![Build Status](https://travis-ci.org/Commit451/ForegroundViews.svg?branch=master)](https://travis-ci.org/Commit451/ForegroundViews)

# Gradle Dependency
Easily reference the library in your Android projects using this dependency in your module's `build.gradle` file:

```Gradle
dependencies {
    compile 'com.commit451:baselinegridtextview:1.0.0'
}
```

# Usage
Usage is very similar for each of the foreground views. Within XML:

```xml
<com.commit451.baselinegridtextview.BaselineGridTextView
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:text="hello world"
  app:lineHeightHint="24dp">
```
`lineHeightHint` is the desired line height, and should be a multiple of 4 to insure a 4dp rhythm. Alternately, you can use the attribute:
```xml
app:lineHeightMultiplierHint="1.2"
```
which will take your set text size and multiply it by the value specified.

# Testing
We highly recommend the app [Keyline Pushing](https://play.google.com/store/apps/details?id=com.faizmalkani.keylines) for testing.

License
--------

    Copyright 2015 Google, Inc.
    Copyright 2016 Commit 451

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
