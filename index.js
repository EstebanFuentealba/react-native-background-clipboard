import {
  DeviceEventEmitter,
  NativeAppEventEmitter,
  NativeEventEmitter,
  NativeModules,
  Platform
} from "react-native";

const { RNReactNativeBackgroundClipboard } = NativeModules;
const Emitter = new NativeEventEmitter(RNReactNativeBackgroundClipboard);

class BackgroundClipboard {
  constructor() {}
  runBackgroundClipboard(callback) {
    const EventEmitter = Platform.select({
      ios: () => NativeAppEventEmitter,
      android: () => DeviceEventEmitter
    })();
    this.backgroundListener = EventEmitter.addListener(
      "backgroundClipboard",
      event => {
        callback(event);
      }
    );
  }
}

export default new BackgroundClipboard();
