
@import UIKit;

#import "RNReactNativeBackgroundClipboard.h"

@implementation RNReactNativeBackgroundClipboard

UIBackgroundTaskIdentifier bgTask;


- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
    [[NSNotificationCenter defaultCenter]
     addObserver:self
     selector:@selector(pasteboardChangedNotification:)
     name:UIPasteboardChangedNotification
     object:nil];
    
    return YES;
}

- (void)pasteboardChangedNotification:(NSNotification*)notification {
    
    NSLog(@"clipboard ");
    NSLog(notification);
    dispatch_async(dispatch_get_main_queue(), ^{
        if ([self bridge] != nil) {
            [self sendEventWithName:@"backgroundClipboard" body: notification];
        }
    });
}

@end
  
