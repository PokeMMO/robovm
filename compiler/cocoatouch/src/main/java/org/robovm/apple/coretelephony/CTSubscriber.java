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
package org.robovm.apple.coretelephony;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreTelephony") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTSubscriber/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObjectProtocol observeTokenRefreshed(CTSubscriber object, final VoidBlock1<CTSubscriber> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(TokenRefreshedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((CTSubscriber) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class CTSubscriberPtr extends Ptr<CTSubscriber, CTSubscriberPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CTSubscriber.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CTSubscriber() {}
    protected CTSubscriber(Handle h, long handle) { super(h, handle); }
    protected CTSubscriber(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 11.0. Deprecated; returns nil starting in iOS 11.3.
     */
    @Deprecated
    @Property(selector = "carrierToken")
    public native NSData getCarrierToken();
    /**
     * @since Available in iOS 12.1 and later.
     */
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 12.1 and later.
     */
    @Property(selector = "delegate")
    public native CTSubscriberDelegate getDelegate();
    /**
     * @since Available in iOS 12.1 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CTSubscriberDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 12.1. Use -[CTSubscriberDelegate subscriberTokenRefreshed:]
     */
    @Deprecated
    @GlobalValue(symbol="CTSubscriberTokenRefreshed", optional=true)
    public static native NSString TokenRefreshedNotification();
    
    
    /*</methods>*/
}
