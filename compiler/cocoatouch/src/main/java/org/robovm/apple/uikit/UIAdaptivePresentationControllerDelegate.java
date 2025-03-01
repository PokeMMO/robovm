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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIAdaptivePresentationControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "adaptivePresentationStyleForPresentationController:")
    UIModalPresentationStyle getAdaptivePresentationStyle(UIPresentationController controller);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Method(selector = "adaptivePresentationStyleForPresentationController:traitCollection:")
    UIModalPresentationStyle getAdaptivePresentationStyle(UIPresentationController controller, UITraitCollection traitCollection);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "presentationController:prepareAdaptivePresentationController:")
    void prepareAdaptivePresentationController(UIPresentationController presentationController, UIPresentationController adaptivePresentationController);
    @Method(selector = "presentationController:viewControllerForAdaptivePresentationStyle:")
    UIViewController getViewController(UIPresentationController controller, UIModalPresentationStyle style);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Method(selector = "presentationController:willPresentWithAdaptiveStyle:transitionCoordinator:")
    void willPresent(UIPresentationController presentationController, UIModalPresentationStyle style, UIViewControllerTransitionCoordinator transitionCoordinator);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "presentationControllerShouldDismiss:")
    boolean presentationControllerShouldDismiss(UIPresentationController presentationController);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "presentationControllerWillDismiss:")
    void presentationControllerWillDismiss(UIPresentationController presentationController);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "presentationControllerDidDismiss:")
    void presentationControllerDidDismiss(UIPresentationController presentationController);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "presentationControllerDidAttemptToDismiss:")
    void presentationControllerDidAttemptToDismiss(UIPresentationController presentationController);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
