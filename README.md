# Javascript Libraries Lift Module

Collection of javascript libraries. Includes development and minified versions. 
Uses the minified version in Production run mode.


Current libraries:

	modernizr	version 2.5.3

	jquery		version 1.7.2


Usuage: 

<script class="lift:JsLibs.jquery"></script>



## Using this module

1. Add the following repository to your SBT project file:

    For SBT 0.11:

        resolvers += "liftmodules repository" at "http://repository-liftmodules.forge.cloudbees.com/release/"

    For SBT 0.7:

        lazy val liftModulesRelease = "liftmodules repository" at "http://repository-liftmodules.forge.cloudbees.com/release/"

2. Include this dependency:

         "net.liftmodules" %% "js-libs" % (liftVersion+"0.4")

3. In your application's Boot.boot code:

          bootstrap.liftmodules.JsLibs.init



