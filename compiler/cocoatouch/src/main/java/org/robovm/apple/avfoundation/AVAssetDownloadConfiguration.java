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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetDownloadConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetDownloadConfigurationPtr extends Ptr<AVAssetDownloadConfiguration, AVAssetDownloadConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetDownloadConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetDownloadConfiguration() {}
    protected AVAssetDownloadConfiguration(Handle h, long handle) { super(h, handle); }
    protected AVAssetDownloadConfiguration(SkipInit skipInit) { super(skipInit); }
    public AVAssetDownloadConfiguration(AVURLAsset asset, String title) { super((Handle) null, create(asset, title)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "artworkData")
    public native NSData getArtworkData();
    @Property(selector = "setArtworkData:")
    public native void setArtworkData(NSData v);
    @Property(selector = "primaryContentConfiguration")
    public native AVAssetDownloadContentConfiguration getPrimaryContentConfiguration();
    @Property(selector = "auxiliaryContentConfigurations")
    public native NSArray<AVAssetDownloadContentConfiguration> getAuxiliaryContentConfigurations();
    @Property(selector = "setAuxiliaryContentConfigurations:")
    public native void setAuxiliaryContentConfigurations(NSArray<AVAssetDownloadContentConfiguration> v);
    @Property(selector = "optimizesAuxiliaryContentConfigurations")
    public native boolean isOptimizesAuxiliaryContentConfigurations();
    @Property(selector = "setOptimizesAuxiliaryContentConfigurations:")
    public native void setOptimizesAuxiliaryContentConfigurations(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "downloadConfigurationWithAsset:title:")
    protected static native @Pointer long create(AVURLAsset asset, String title);
    /*</methods>*/
}
