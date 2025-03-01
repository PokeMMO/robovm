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
package org.robovm.apple.nearbyinteraction;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NISessionDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "session:didUpdateNearbyObjects:")
    void didUpdateNearbyObjects(NISession session, NSArray<NINearbyObject> nearbyObjects);
    @Method(selector = "session:didRemoveNearbyObjects:withReason:")
    void didRemoveNearbyObjects(NISession session, NSArray<NINearbyObject> nearbyObjects, NINearbyObjectRemovalReason reason);
    @Method(selector = "sessionWasSuspended:")
    void sessionWasSuspended(NISession session);
    @Method(selector = "sessionSuspensionEnded:")
    void sessionSuspensionEnded(NISession session);
    @Method(selector = "session:didInvalidateWithError:")
    void didInvalidate(NISession session, NSError error);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "session:didGenerateShareableConfigurationData:forObject:")
    void didGenerateShareableConfigurationData(NISession session, NSData shareableConfigurationData, NINearbyObject object);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
