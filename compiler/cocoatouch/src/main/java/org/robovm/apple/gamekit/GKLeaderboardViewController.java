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
package org.robovm.apple.gamekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 7.0. Use GKGameCenterViewController instead
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKLeaderboardViewController/*</name>*/ 
    extends /*<extends>*/GKGameCenterViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKLeaderboardViewControllerPtr extends Ptr<GKLeaderboardViewController, GKLeaderboardViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKLeaderboardViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKLeaderboardViewController() {}
    protected GKLeaderboardViewController(Handle h, long handle) { super(h, handle); }
    protected GKLeaderboardViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNavigationBarClass:toolbarClass:")
    public GKLeaderboardViewController(Class<? extends UINavigationBar> navigationBarClass, Class<? extends UIToolbar> toolbarClass) { super(navigationBarClass, toolbarClass); }
    @Method(selector = "initWithRootViewController:")
    public GKLeaderboardViewController(UIViewController rootViewController) { super(rootViewController); }
    @Method(selector = "initWithNibName:bundle:")
    public GKLeaderboardViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public GKLeaderboardViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timeScope")
    public native GKLeaderboardTimeScope getTimeScope();
    @Property(selector = "setTimeScope:")
    public native void setTimeScope(GKLeaderboardTimeScope v);
    @Property(selector = "category")
    public native String getCategory();
    @Property(selector = "setCategory:")
    public native void setCategory(String v);
    @Property(selector = "leaderboardDelegate")
    public native GKLeaderboardViewControllerDelegate getLeaderboardDelegate();
    @Property(selector = "setLeaderboardDelegate:", strongRef = true)
    public native void setLeaderboardDelegate(GKLeaderboardViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
