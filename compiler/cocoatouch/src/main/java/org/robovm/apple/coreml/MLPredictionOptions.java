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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLPredictionOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLPredictionOptionsPtr extends Ptr<MLPredictionOptions, MLPredictionOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLPredictionOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLPredictionOptions() {}
    protected MLPredictionOptions(Handle h, long handle) { super(h, handle); }
    protected MLPredictionOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use -[MLModelConfiguration computeUnits] instead.
     */
    @Deprecated
    @Property(selector = "usesCPUOnly")
    public native boolean usesCPUOnly();
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use -[MLModelConfiguration computeUnits] instead.
     */
    @Deprecated
    @Property(selector = "setUsesCPUOnly:")
    public native void setUsesCPUOnly(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
