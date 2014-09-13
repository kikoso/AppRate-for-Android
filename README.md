AppRate for Android
=============

AppRate for Android is a library that allows your users to rate your application in a non intrusive way. A window with options to rate, remind later or reject is displayed according to your configuration


Contributing
------------

If you want to contribute, or you have any special remark about the library, please feel free to drop me a line at eenriquelopez@gmail.com.
If you're interested in my projects, you can follow me on Twitter (https://twitter.com/eenriquelopez)


How to install/use
------------------

Once you have clone the project, you will need to add it as a library project to your Android application. Once this has been done, use it as follows:

    AppRater.init(yourContext)

That's it :-)

However, you need to change a few things at the configuration to make the application work (in the class AppRater) :

* You need to include the title of your app in the variable APP_TITLE
* You need to include the package of your application (the one that is shown at the market) in APP_PNAME
* DAYS_UNTIL_PROMPT and LAUNCHES_UNTIL_PROMPT are optional: they represent the number of days and launches neccesary to display the alert


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
