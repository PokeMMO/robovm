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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNFaceLandmarkRegion2D/*</name>*/ 
    extends /*<extends>*/VNFaceLandmarkRegion/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNFaceLandmarkRegion2DPtr extends Ptr<VNFaceLandmarkRegion2D, VNFaceLandmarkRegion2DPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNFaceLandmarkRegion2D.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNFaceLandmarkRegion2D() {}
    protected VNFaceLandmarkRegion2D(Handle h, long handle) { super(h, handle); }
    protected VNFaceLandmarkRegion2D(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "normalizedPoints")
    public native CGPoint getNormalizedPoints();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "precisionEstimatesPerPoint")
    public native NSArray<NSNumber> getPrecisionEstimatesPerPoint();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "pointsInImageOfSize:")
    public native CGPoint pointsInImageOfSize(@ByVal CGSize imageSize);
    /*</methods>*/
}
