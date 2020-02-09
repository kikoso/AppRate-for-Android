[![Build Status](https://travis-ci.org/kikoso/AppRate-for-Android.svg?branch=develop)](https://travis-ci.org/kikoso/AppRate-for-Android)

AppRate for Android
=============

AppRate for Android is a library that allows your users to rate your application in a non intrusive way. A window with options to rate, remind later or reject is displayed according to your configuration

![Example Image][1]

Contributing
------------

If you want to contribute, or you have any special remark about the library, please feel free to drop me a line at eenriquelopez@gmail.com.


How to install/use
------------------

You can checkout the repository and add it to your project, or download it through Maven Central.

     compile 'com.github.kikoso:AppRate-Android:1.0-RELEASE'

After adding it, you will need to add it as a library project to your Android application. Once this has been done, use it as follows:

     super.onCreate(savedInstanceState);
        new AppRater(this)
                .setMinDays(0)
                .setMinLaunches(0)
                .setAppTitle("My Title")
                .init();


That's it :-)

Enjoy!

Developed By
--------------------

Enrique López Mañas - <eenriquelopez@gmail.com>

<a href="https://twitter.com/eenriquelopez">
  <img alt="Follow me on Twitter"
       src="https://raw.github.com/kikoso/android-stackblur/master/art/twitter.png" />
</a>
<a href="https://plus.google.com/103250453274111396206">
  <img alt="Follow me on Google+"
       src="https://raw.github.com/kikoso/android-stackblur/master/art/google-plus.png" />
</a>
<a href="http://de.linkedin.com/pub/enrique-l%C3%B3pez-ma%C3%B1as/15/4a9/876">
  <img alt="Follow me on LinkedIn"
       src="https://raw.github.com/kikoso/android-stackblur/master/art/linkedin.png" />
       
[1]: https://raw.github.com/kikoso/AppRate-for-Android/develop/art/screenshot.png
