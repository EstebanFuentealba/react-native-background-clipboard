
#if __has_include("RCTBridgeModule.h")
#import "RCTBridgeModule.h"
#else
#import <React/RCTBridgeModule.h>
#endif
#import "RCTEventEmitter.h"

@interface RNReactNativeBackgroundClipboard : RCTEventEmitter <RCTBridgeModule>

@end
  
