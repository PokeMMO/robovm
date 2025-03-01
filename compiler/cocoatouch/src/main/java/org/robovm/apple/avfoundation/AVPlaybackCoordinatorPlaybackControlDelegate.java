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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AVPlaybackCoordinatorPlaybackControlDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "playbackCoordinator:didIssuePlayCommand:completionHandler:")
    void didIssuePlayCommand(AVDelegatingPlaybackCoordinator coordinator, AVDelegatingPlaybackCoordinatorPlayCommand playCommand, @Block Runnable completionHandler);
    @Method(selector = "playbackCoordinator:didIssuePauseCommand:completionHandler:")
    void didIssuePauseCommand(AVDelegatingPlaybackCoordinator coordinator, AVDelegatingPlaybackCoordinatorPauseCommand pauseCommand, @Block Runnable completionHandler);
    @Method(selector = "playbackCoordinator:didIssueSeekCommand:completionHandler:")
    void didIssueSeekCommand(AVDelegatingPlaybackCoordinator coordinator, AVDelegatingPlaybackCoordinatorSeekCommand seekCommand, @Block Runnable completionHandler);
    @Method(selector = "playbackCoordinator:didIssueBufferingCommand:completionHandler:")
    void didIssueBufferingCommand(AVDelegatingPlaybackCoordinator coordinator, AVDelegatingPlaybackCoordinatorBufferingCommand bufferingCommand, @Block Runnable completionHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
