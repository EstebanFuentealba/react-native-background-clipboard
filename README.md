# react-native-background-clipboard

## Getting started

`$ npm install react-native-background-clipboard --save`

### Mostly automatic installation

`$ react-native link react-native-background-clipboard`

### Manual installation

#### iOS (WIP)

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-background-clipboard` and add `RNReactNativeBackgroundClipboard.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeBackgroundClipboard.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`

- Add `import com.reactlibrary.RNReactNativeBackgroundClipboardPackage;` to the imports at the top of the file
- Add `new RNReactNativeBackgroundClipboardPackage()` to the list returned by the `getPackages()` method

2. Append the following lines to `android/settings.gradle`:
   ```
   include ':react-native-background-clipboard'
   project(':react-native-background-clipboard').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-background-clipboard/android')
   ```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
   ```
     compile project(':react-native-background-clipboard')
   ```

#### Windows (Not yet implemented)

[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativeBackgroundClipboard.sln` in `node_modules/react-native-background-clipboard/windows/RNReactNativeBackgroundClipboard.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app

- Add `using React.Native.Background.Clipboard.RNReactNativeBackgroundClipboard;` to the usings at the top of the file
- Add `new RNReactNativeBackgroundClipboardPackage()` to the `List<IReactPackage>` returned by the `Packages` method

## Usage

```javascript
import RNReactNativeBackgroundClipboard from "react-native-background-clipboard";

RNReactNativeBackgroundClipboard.runBackgroundClipboard(event => {
  console.log("on clipboard", event);
});
```
