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

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVComposition/*</name>*/
    extends /*<extends>*/AVAsset/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCompositionPtr extends Ptr<AVComposition, AVCompositionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVComposition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVComposition() {}
    @Deprecated protected AVComposition(long handle) { super(handle); }
    protected AVComposition(Handle h, long handle) { super(h, handle); }
    protected AVComposition(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tracks")
    public native NSArray<AVAssetTrack> getTracks();
    @Property(selector = "naturalSize")
    public native @ByVal CGSize getNaturalSize();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "URLAssetInitializationOptions")
    public native AVURLAssetOptions getURLAssetInitializationOptions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "trackWithTrackID:")
    public native AVCompositionTrack getTrack(int trackID);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTrackWithTrackID:completionHandler:")
    public native void loadTrack(int trackID, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "tracksWithMediaType:")
    public native NSArray<AVCompositionTrack> getTracksForMediaType(AVMediaType mediaType);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTracksWithMediaType:completionHandler:")
    public native void loadTracksWithMediaType(String mediaType, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "tracksWithMediaCharacteristic:")
    public native NSArray<AVCompositionTrack> getTracksForMediaCharacteristic(AVMediaCharacteristic mediaCharacteristic);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTracksWithMediaCharacteristic:completionHandler:")
    public native void loadTracksWithMediaCharacteristic(String mediaCharacteristic, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    /*</methods>*/
}
