/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.externalaccessory;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("ExternalAccessory") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EAAccessoryManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {
    
    public static class Notifications {
        /**
         * @since Available in iOS 3.0 and later.
         */
        public static NSObjectProtocol observeAccessoryDidConnect(EAAccessoryManager object, final VoidBlock3<EAAccessoryManager, EAAccessory, EAAccessory> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(AccessoryDidConnectNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> data = a.getUserInfo();
                    EAAccessory accessory = null;
                    EAAccessory selectedAccessory = null;
                    if (data.containsKey(AccessoryKey())) {
                        accessory = (EAAccessory) data.get(AccessoryKey());
                    }
                    if (data.containsKey(AccessorySelectedKey())) {
                        selectedAccessory = (EAAccessory) data.get(AccessorySelectedKey());
                    }
                    block.invoke((EAAccessoryManager)a.getObject(), accessory, selectedAccessory);
                }
            });
        }
        /**
         * @since Available in iOS 3.0 and later.
         */
        public static NSObjectProtocol observeAccessoryDidDisconnect(EAAccessoryManager object, final VoidBlock2<EAAccessoryManager, EAAccessory> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(AccessoryDidDisconnectNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> data = a.getUserInfo();
                    EAAccessory accessory = null;
                    if (data.containsKey(AccessoryKey())) {
                        accessory = (EAAccessory) data.get(AccessoryKey());
                    }
                    block.invoke((EAAccessoryManager)a.getObject(), accessory);
                }
            });
        }
    }

    /*<ptr>*/public static class EAAccessoryManagerPtr extends Ptr<EAAccessoryManager, EAAccessoryManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(EAAccessoryManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EAAccessoryManager() {}
    protected EAAccessoryManager(Handle h, long handle) { super(h, handle); }
    protected EAAccessoryManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "connectedAccessories")
    public native NSArray<EAAccessory> getConnectedAccessories();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="EAAccessoryDidConnectNotification", optional=true)
    public static native NSString AccessoryDidConnectNotification();
    @GlobalValue(symbol="EAAccessoryDidDisconnectNotification", optional=true)
    public static native NSString AccessoryDidDisconnectNotification();
    @GlobalValue(symbol="EAAccessoryKey", optional=true)
    protected static native NSString AccessoryKey();
    @GlobalValue(symbol="EAAccessorySelectedKey", optional=true)
    protected static native NSString AccessorySelectedKey();
    
    @Method(selector = "showBluetoothAccessoryPickerWithNameFilter:completion:")
    public native void showBluetoothAccessoryPicker(NSPredicate predicate, @Block VoidBlock1<NSError> completion);
    @Method(selector = "registerForLocalNotifications")
    public native void registerForLocalNotifications();
    @Method(selector = "unregisterForLocalNotifications")
    public native void unregisterForLocalNotifications();
    @Method(selector = "sharedAccessoryManager")
    public static native EAAccessoryManager getSharedAccessoryManager();
    /*</methods>*/
}
