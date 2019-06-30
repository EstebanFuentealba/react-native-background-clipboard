using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Background.Clipboard.RNReactNativeBackgroundClipboard
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeBackgroundClipboardModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeBackgroundClipboardModule"/>.
        /// </summary>
        internal RNReactNativeBackgroundClipboardModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeBackgroundClipboard";
            }
        }
    }
}
