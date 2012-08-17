AppRate for Android
=============

AppRate for Android is a library that allows your users to rate your application in a non intrusive way. A window with options to rate, remind later or reject is displayed according to your configuration


Contributing
------------

If you want to contribute, or you have any special remark about the library, please feel free to drop me a line at eenriquelopez@gmail.com


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
