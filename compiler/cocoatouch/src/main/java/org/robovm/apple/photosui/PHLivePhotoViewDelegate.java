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
package org.robovm.apple.photosui;

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
import org.robovm.apple.photos.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.1 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/PHLivePhotoViewDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "livePhotoView:canBeginPlaybackWithStyle:")
    boolean canBeginPlayback(PHLivePhotoView livePhotoView, PHLivePhotoViewPlaybackStyle playbackStyle);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "livePhotoView:willBeginPlaybackWithStyle:")
    void willBeginPlayback(PHLivePhotoView livePhotoView, PHLivePhotoViewPlaybackStyle playbackStyle);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "livePhotoView:didEndPlaybackWithStyle:")
    void didEndPlayback(PHLivePhotoView livePhotoView, PHLivePhotoViewPlaybackStyle playbackStyle);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
