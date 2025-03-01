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
package org.robovm.apple.healthkit;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKObserverQuery/*</name>*/ 
    extends /*<extends>*/HKQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKObserverQueryPtr extends Ptr<HKObserverQuery, HKObserverQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKObserverQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKObserverQuery() {}
    protected HKObserverQuery(Handle h, long handle) { super(h, handle); }
    protected HKObserverQuery(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSampleType:predicate:updateHandler:")
    public HKObserverQuery(HKSampleType sampleType, NSPredicate predicate, @Block("(,@Block,)") VoidBlock3<HKObserverQuery, Runnable, NSError> updateHandler) { super((SkipInit) null); initObject(init(sampleType, predicate, updateHandler)); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithQueryDescriptors:updateHandler:")
    public HKObserverQuery(NSArray<HKQueryDescriptor> queryDescriptors, @Block("(,,@Block,)") VoidBlock4<HKObserverQuery, NSSet<HKSampleType>, Runnable, NSError> updateHandler) { super((SkipInit) null); initObject(init(queryDescriptors, updateHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSampleType:predicate:updateHandler:")
    protected native @Pointer long init(HKSampleType sampleType, NSPredicate predicate, @Block("(,@Block,)") VoidBlock3<HKObserverQuery, Runnable, NSError> updateHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithQueryDescriptors:updateHandler:")
    protected native @Pointer long init(NSArray<HKQueryDescriptor> queryDescriptors, @Block("(,,@Block,)") VoidBlock4<HKObserverQuery, NSSet<HKSampleType>, Runnable, NSError> updateHandler);
    /*</methods>*/
}
