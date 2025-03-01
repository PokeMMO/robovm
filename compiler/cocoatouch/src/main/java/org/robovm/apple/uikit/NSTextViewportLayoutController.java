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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextViewportLayoutController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSTextViewportLayoutControllerPtr extends Ptr<NSTextViewportLayoutController, NSTextViewportLayoutControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextViewportLayoutController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSTextViewportLayoutController() {}
    protected NSTextViewportLayoutController(Handle h, long handle) { super(h, handle); }
    protected NSTextViewportLayoutController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTextLayoutManager:")
    public NSTextViewportLayoutController(NSTextLayoutManager textLayoutManager) { super((SkipInit) null); initObject(init(textLayoutManager)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native NSTextViewportLayoutControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSTextViewportLayoutControllerDelegate v);
    @Property(selector = "textLayoutManager")
    public native NSTextLayoutManager getTextLayoutManager();
    @Property(selector = "viewportBounds")
    public native @ByVal CGRect getViewportBounds();
    @Property(selector = "viewportRange")
    public native NSTextRange getViewportRange();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTextLayoutManager:")
    protected native @Pointer long init(NSTextLayoutManager textLayoutManager);
    @Method(selector = "layoutViewport")
    public native void layoutViewport();
    @Method(selector = "relocateViewportToTextLocation:")
    public native @MachineSizedFloat double relocateViewportToTextLocation(NSTextLocation textLocation);
    @Method(selector = "adjustViewportByVerticalOffset:")
    public native void adjustViewportByVerticalOffset(@MachineSizedFloat double verticalOffset);
    /*</methods>*/
}
