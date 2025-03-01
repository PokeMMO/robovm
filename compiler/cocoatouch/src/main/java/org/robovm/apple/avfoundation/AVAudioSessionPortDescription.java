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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioSessionPortDescription/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioSessionPortDescriptionPtr extends Ptr<AVAudioSessionPortDescription, AVAudioSessionPortDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioSessionPortDescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioSessionPortDescription() {}
    protected AVAudioSessionPortDescription(Handle h, long handle) { super(h, handle); }
    protected AVAudioSessionPortDescription(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "portType")
    public native AVAudioSessionPort getPortType();
    @Property(selector = "portName")
    public native String getPortName();
    @Property(selector = "UID")
    public native String getUID();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "hasHardwareVoiceCallProcessing")
    public native boolean hasHardwareVoiceCallProcessing();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isSpatialAudioEnabled")
    public native boolean isSpatialAudioEnabled();
    @Property(selector = "channels")
    public native NSArray<AVAudioSessionChannelDescription> getChannels();
    @Property(selector = "dataSources")
    public native NSArray<AVAudioSessionDataSourceDescription> getDataSources();
    @Property(selector = "selectedDataSource")
    public native AVAudioSessionDataSourceDescription getSelectedDataSource();
    @Property(selector = "preferredDataSource")
    public native AVAudioSessionDataSourceDescription getPreferredDataSource();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean setPreferredDataSource(AVAudioSessionDataSourceDescription dataSource) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPreferredDataSource(dataSource, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setPreferredDataSource:error:")
    private native boolean setPreferredDataSource(AVAudioSessionDataSourceDescription dataSource, NSError.NSErrorPtr outError);
    /*</methods>*/
}
