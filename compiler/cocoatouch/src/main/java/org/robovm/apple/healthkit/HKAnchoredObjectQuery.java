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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKAnchoredObjectQuery/*</name>*/ 
    extends /*<extends>*/HKQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKAnchoredObjectQueryPtr extends Ptr<HKAnchoredObjectQuery, HKAnchoredObjectQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKAnchoredObjectQuery.class); }/*</bind>*/
    /*<constants>*/
    public static final int NoAnchor = 0;
    /*</constants>*/
    /*<constructors>*/
    protected HKAnchoredObjectQuery() {}
    protected HKAnchoredObjectQuery(Handle h, long handle) { super(h, handle); }
    protected HKAnchoredObjectQuery(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithType:predicate:anchor:limit:resultsHandler:")
    public HKAnchoredObjectQuery(HKSampleType type, NSPredicate predicate, HKQueryAnchor anchor, @MachineSizedUInt long limit, @Block VoidBlock5<HKAnchoredObjectQuery, NSArray<HKSample>, NSArray<HKDeletedObject>, HKQueryAnchor, NSError> handler) { super((SkipInit) null); initObject(init(type, predicate, anchor, limit, handler)); }
    /**
     * @deprecated Deprecated in iOS 9.0. Use initWithType:predicate:anchor:limit:resultsHandler:
     */
    @Deprecated
    @Method(selector = "initWithType:predicate:anchor:limit:completionHandler:")
    public HKAnchoredObjectQuery(HKSampleType type, NSPredicate predicate, @MachineSizedUInt long anchor, @MachineSizedUInt long limit, @Block("(,,@MachineSizedUInt,)") VoidBlock4<HKAnchoredObjectQuery, NSArray<HKSample>, Long, NSError> handler) { super((SkipInit) null); initObject(init(type, predicate, anchor, limit, handler)); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithQueryDescriptors:anchor:limit:resultsHandler:")
    public HKAnchoredObjectQuery(NSArray<HKQueryDescriptor> queryDescriptors, HKQueryAnchor anchor, @MachineSizedSInt long limit, @Block VoidBlock5<HKAnchoredObjectQuery, NSArray<HKSample>, NSArray<HKDeletedObject>, HKQueryAnchor, NSError> handler) { super((SkipInit) null); initObject(init(queryDescriptors, anchor, limit, handler)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "updateHandler")
    public native @Block VoidBlock5<HKAnchoredObjectQuery, NSArray<HKSample>, NSArray<HKDeletedObject>, HKQueryAnchor, NSError> getUpdateHandler();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setUpdateHandler:")
    public native void setUpdateHandler(@Block VoidBlock5<HKAnchoredObjectQuery, NSArray<HKSample>, NSArray<HKDeletedObject>, HKQueryAnchor, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithType:predicate:anchor:limit:resultsHandler:")
    protected native @Pointer long init(HKSampleType type, NSPredicate predicate, HKQueryAnchor anchor, @MachineSizedUInt long limit, @Block VoidBlock5<HKAnchoredObjectQuery, NSArray<HKSample>, NSArray<HKDeletedObject>, HKQueryAnchor, NSError> handler);
    /**
     * @deprecated Deprecated in iOS 9.0. Use initWithType:predicate:anchor:limit:resultsHandler:
     */
    @Deprecated
    @Method(selector = "initWithType:predicate:anchor:limit:completionHandler:")
    protected native @Pointer long init(HKSampleType type, NSPredicate predicate, @MachineSizedUInt long anchor, @MachineSizedUInt long limit, @Block("(,,@MachineSizedUInt,)") VoidBlock4<HKAnchoredObjectQuery, NSArray<HKSample>, Long, NSError> handler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithQueryDescriptors:anchor:limit:resultsHandler:")
    protected native @Pointer long init(NSArray<HKQueryDescriptor> queryDescriptors, HKQueryAnchor anchor, @MachineSizedSInt long limit, @Block VoidBlock5<HKAnchoredObjectQuery, NSArray<HKSample>, NSArray<HKDeletedObject>, HKQueryAnchor, NSError> handler);
    /*</methods>*/
}
