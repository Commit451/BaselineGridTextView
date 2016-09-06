# BaselineGridTextView
An extension to `AppCompatTextView` which aligns text to a 4dp baseline grid.
Original code taken from [Plaid](https://github.com/nickbutcher/plaid). Thanks to @nickbutcher

[![Build Status](https://travis-ci.org/Commit451/BaselineGridTextView.svg?branch=master)](https://travis-ci.org/Commit451/BaselineGridTextView) [![](https://jitpack.io/v/Commit451/BaselineGridTextView.svg)](https://jitpack.io/#Commit451/BaselineGridTextView)

# Usage
Usage is controlled through XML or programatically. Within XML:

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

or programatically:
```java
int size = getResources().getDimensionPixelSize(R.dimen.textsize);
textView.setLineHeightHint(size);
```

# Testing
We highly recommend the app [Keyline Pushing](https://play.google.com/store/apps/details?id=com.faizmalkani.keylines) for testing.

License
--------

    Copyright 2016 Commit 451
    Copyright 2015 Google, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
