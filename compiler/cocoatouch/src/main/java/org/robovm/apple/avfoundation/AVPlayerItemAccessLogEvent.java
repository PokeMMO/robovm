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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayerItemAccessLogEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPlayerItemAccessLogEventPtr extends Ptr<AVPlayerItemAccessLogEvent, AVPlayerItemAccessLogEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayerItemAccessLogEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPlayerItemAccessLogEvent() {}
    protected AVPlayerItemAccessLogEvent(Handle h, long handle) { super(h, handle); }
    protected AVPlayerItemAccessLogEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 7.0. Use numberOfMediaRequests
     */
    @Deprecated
    @Property(selector = "numberOfSegmentsDownloaded")
    public native @MachineSizedSInt long getNumberOfSegmentsDownloaded();
    @Property(selector = "numberOfMediaRequests")
    public native @MachineSizedSInt long getNumberOfMediaRequests();
    @Property(selector = "playbackStartDate")
    public native NSDate getPlaybackStartDate();
    @Property(selector = "URI")
    public native String getURI();
    @Property(selector = "serverAddress")
    public native String getServerAddress();
    @Property(selector = "numberOfServerAddressChanges")
    public native @MachineSizedSInt long getNumberOfServerAddressChanges();
    @Property(selector = "playbackSessionID")
    public native String getPlaybackSessionID();
    @Property(selector = "playbackStartOffset")
    public native double getPlaybackStartOffset();
    @Property(selector = "segmentsDownloadedDuration")
    public native double getSegmentsDownloadedDuration();
    @Property(selector = "durationWatched")
    public native double getDurationWatched();
    @Property(selector = "numberOfStalls")
    public native @MachineSizedSInt long getNumberOfStalls();
    @Property(selector = "numberOfBytesTransferred")
    public native long getNumberOfBytesTransferred();
    @Property(selector = "transferDuration")
    public native double getTransferDuration();
    @Property(selector = "observedBitrate")
    public native double getObservedBitrate();
    @Property(selector = "indicatedBitrate")
    public native double getIndicatedBitrate();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "indicatedAverageBitrate")
    public native double getIndicatedAverageBitrate();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "averageVideoBitrate")
    public native double getAverageVideoBitrate();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "averageAudioBitrate")
    public native double getAverageAudioBitrate();
    @Property(selector = "numberOfDroppedVideoFrames")
    public native @MachineSizedSInt long getNumberOfDroppedVideoFrames();
    @Property(selector = "startupTime")
    public native double getStartupTime();
    @Property(selector = "downloadOverdue")
    public native @MachineSizedSInt long getDownloadOverdue();
    /**
     * @deprecated Deprecated in iOS 15.0. Use observedBitrateStandardDeviation to monitor variance in network bitrate.
     */
    @Deprecated
    @Property(selector = "observedMaxBitrate")
    public native double getObservedMaxBitrate();
    /**
     * @deprecated Deprecated in iOS 15.0. Use observedBitrateStandardDeviation to monitor variance in network bitrate.
     */
    @Deprecated
    @Property(selector = "observedMinBitrate")
    public native double getObservedMinBitrate();
    @Property(selector = "observedBitrateStandardDeviation")
    public native double getObservedBitrateStandardDeviation();
    @Property(selector = "playbackType")
    public native String getPlaybackType();
    @Property(selector = "mediaRequestsWWAN")
    public native @MachineSizedSInt long getMediaRequestsWWAN();
    @Property(selector = "switchBitrate")
    public native double getSwitchBitrate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
