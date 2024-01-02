# EDTS Klik Indomaret 2.0 Automation Test for IOS Apps

This project serves as a boilerplate for automating both Android and iOS mobile applications using a single codebase with TestNG and the Appium library.

## Prerequisites
1. Java
2. Maven
3. NodeJS

## How to install the dependencies
1. Install [XCode](https://apps.apple.com/us/app/xcode/id497799835?mt=12 "XCode")
2. Download and Install [Android Studio](https://developer.android.com/codelabs/basic-android-kotlin-compose-install-android-studio "Android Studio")
3. Create a new system variable for `ANDROID_HOME` pointed to the Android SDK location
4. Update the system path variable with `ANDROID_HOME\platform-tools`
5. Install Appium 2.0

   `npm i -g appium@next`

Note: Environment Variables

![image](https://user-images.githubusercontent.com/9147189/249979741-757ff724-a75e-4d3b-934f-e6af73d630e2.png)

## How to run tests
1. Using IntelliJ IDEA
   * Select the test classes on the `src/test/java` folder.
   * Right-click and click on `Run tests`
2. Using Command Line
   * For Android Tests

     `mvn clean test -Dplatform=android`
   * For iOS Tests

     `mvn clean test -Dplatform=ios`

## License
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/License_icon-mit-2.svg/2000px-License_icon-mit-2.svg.png" alt="MIT License" width="100" height="100"/> [MIT License](https://opensource.org/licenses/MIT)

## Copyright
Copyright 2023 [MaxSoft](https://maxsoftlk.github.io/).
# KlikAppiumIOS
