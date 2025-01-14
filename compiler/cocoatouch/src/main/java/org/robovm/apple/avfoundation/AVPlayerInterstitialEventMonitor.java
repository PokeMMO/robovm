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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayerInterstitialEventMonitor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPlayerInterstitialEventMonitorPtr extends Ptr<AVPlayerInterstitialEventMonitor, AVPlayerInterstitialEventMonitorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayerInterstitialEventMonitor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVPlayerInterstitialEventMonitor() {}
    protected AVPlayerInterstitialEventMonitor(Handle h, long handle) { super(h, handle); }
    protected AVPlayerInterstitialEventMonitor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPrimaryPlayer:")
    public AVPlayerInterstitialEventMonitor(AVPlayer primaryPlayer) { super((SkipInit) null); initObject(init(primaryPlayer)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primaryPlayer")
    public native AVPlayer getPrimaryPlayer();
    @Property(selector = "interstitialPlayer")
    public native AVQueuePlayer getInterstitialPlayer();
    @Property(selector = "events")
    public native NSArray<AVPlayerInterstitialEvent> getEvents();
    @Property(selector = "currentEvent")
    public native AVPlayerInterstitialEvent getCurrentEvent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPrimaryPlayer:")
    protected native @Pointer long init(AVPlayer primaryPlayer);
    /*</methods>*/
}
