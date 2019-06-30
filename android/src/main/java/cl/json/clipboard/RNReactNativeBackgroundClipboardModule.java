
package cl.json.clipboard;

import android.content.ClipboardManager;
import android.content.ClipboardManager.OnPrimaryClipChangedListener;
import android.util.Log;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class RNReactNativeBackgroundClipboardModule extends ReactContextBaseJavaModule {

    private static final String TAG = "OnClipboard";


    private ReactContext reactContext;
    private ClipboardManager clipboardManager;
    private final ClipboardManager.OnPrimaryClipChangedListener listener = new ClipboardManager.OnPrimaryClipChangedListener(){

        @Override
        public void onPrimaryClipChanged() {
            String contents = clipboardManager.getPrimaryClip().toString();
            Log.i(TAG, contents);
            sendEvent(reactContext, "backgroundClipboard", contents);
        }
    };

    public BackgroundClipboardModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;

        this.clipboardManager = (ClipboardManager) getReactApplicationContext().getSystemService(reactContext.CLIPBOARD_SERVICE);
        this.clipboardManager.addPrimaryClipChangedListener(listener);
    }

    private void sendEvent(ReactContext reactContext, String eventName, Object eventValue) {
        reactContext
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit(eventName, eventValue);
    }

    @Override
    public String getName() {
        return "RNReactNativeBackgroundClipboard";
    }
}