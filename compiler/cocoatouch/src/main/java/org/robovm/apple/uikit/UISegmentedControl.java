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
import org.robovm.apple.corefoundation.CFDictionary;
import org.robovm.apple.coremedia.CMTextMarkupAttributes;

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISegmentedControl/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*/implements NSCoding, UISpringLoadedInteractionSupporting/*</implements>*/ {

    /*<ptr>*/public static class UISegmentedControlPtr extends Ptr<UISegmentedControl, UISegmentedControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISegmentedControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISegmentedControl() {}
    protected UISegmentedControl(Handle h, long handle) { super(h, handle); }
    protected UISegmentedControl(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UISegmentedControl(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public UISegmentedControl(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithItems:")
    public UISegmentedControl(NSArray<?> items) { super((SkipInit) null); initObject(init(items)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:actions:")
    public UISegmentedControl(@ByVal CGRect frame, NSArray<UIAction> actions) { super((SkipInit) null); initObject(init(frame, actions)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public UISegmentedControl(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    public UISegmentedControl(String... items) {
        super((SkipInit) null);
        initObject(init(NSArray.fromStrings(items)));
    }
    public UISegmentedControl(UIImage... items) {
        super((SkipInit) null);
        initObject(init(new NSArray<UIImage>(items)));
    }
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 7.0. The segmentedControlStyle property no longer has any effect
     */
    @Deprecated
    @Property(selector = "segmentedControlStyle")
    public native UISegmentedControlStyle getControlStyle();
    /**
     * @deprecated Deprecated in iOS 7.0. The segmentedControlStyle property no longer has any effect
     */
    @Deprecated
    @Property(selector = "setSegmentedControlStyle:")
    public native void setControlStyle(UISegmentedControlStyle v);
    @Property(selector = "isMomentary")
    public native boolean isMomentary();
    @Property(selector = "setMomentary:")
    public native void setMomentary(boolean v);
    @Property(selector = "numberOfSegments")
    public native @MachineSizedUInt long getNumberOfSegments();
    @Property(selector = "apportionsSegmentWidthsByContent")
    public native boolean apportionsSegmentWidthsByContent();
    @Property(selector = "setApportionsSegmentWidthsByContent:")
    public native void setApportionsSegmentWidthsByContent(boolean v);
    @Property(selector = "selectedSegmentIndex")
    public native @MachineSizedSInt long getSelectedSegment();
    @Property(selector = "setSelectedSegmentIndex:")
    public native void setSelectedSegment(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "selectedSegmentTintColor")
    public native UIColor getSelectedSegmentTintColor();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setSelectedSegmentTintColor:")
    public native void setSelectedSegmentTintColor(UIColor v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isSpringLoaded")
    public native boolean isSpringLoaded();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSpringLoaded:")
    public native void setSpringLoaded(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    public void setTitleTextAttributes(NSAttributedStringAttributes attributes, UIControlState state) {
        if (attributes == null) {
            setTitleTextAttributesDictionary(null, state);
        } else {
            setTitleTextAttributesDictionary(attributes.getDictionary(), state);
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public void setTitleTextMarkupAttributes(CMTextMarkupAttributes attributes, UIControlState state) {
        if (attributes == null) {
            setTitleTextAttributesDictionary(null, state);
        } else {
            setTitleTextAttributesDictionary(attributes.getDictionary().as(NSDictionary.class), state);
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public void setTitleCoreTextAttributes(CTAttributedStringAttributes attributes, UIControlState state) {
        if (attributes == null) {
            setTitleTextAttributesDictionary(null, state);
        } else {
            setTitleTextAttributesDictionary(attributes.getDictionary().as(NSDictionary.class), state);
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public NSAttributedStringAttributes getTitleTextAttributes(UIControlState state) {
        NSDictionary<NSString, ?> dict = getTitleTextAttributesDictionary(state);
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public CMTextMarkupAttributes getTitleTextMarkupAttributes(UIControlState state) {
        NSDictionary<NSString, ?> dict = getTitleTextAttributesDictionary(state);
        if (dict == null) return null; 
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public CTAttributedStringAttributes getTitleCoreTextAttributes(UIControlState state) {
        NSDictionary<NSString, ?> dict = getTitleTextAttributesDictionary(state);
        if (dict == null) return null; 
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "initWithItems:")
    protected native @Pointer long init(NSArray<?> items);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:actions:")
    protected native @Pointer long init(@ByVal CGRect frame, NSArray<UIAction> actions);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "insertSegmentWithAction:atIndex:animated:")
    public native void insertSegment(UIAction action, @MachineSizedUInt long segment, boolean animated);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "setAction:forSegmentAtIndex:")
    public native void setAction(UIAction action, @MachineSizedUInt long segment);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "actionForSegmentAtIndex:")
    public native UIAction actionForSegmentAtIndex(@MachineSizedUInt long segment);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "segmentIndexForActionIdentifier:")
    public native @MachineSizedSInt long segmentIndexForActionIdentifier(UIActionIdentifier actionIdentifier);
    @Method(selector = "insertSegmentWithTitle:atIndex:animated:")
    public native void insertSegment(String title, @MachineSizedUInt long segment, boolean animated);
    @Method(selector = "insertSegmentWithImage:atIndex:animated:")
    public native void insertSegment(UIImage image, @MachineSizedUInt long segment, boolean animated);
    @Method(selector = "removeSegmentAtIndex:animated:")
    public native void removeSegment(@MachineSizedUInt long segment, boolean animated);
    @Method(selector = "removeAllSegments")
    public native void removeAllSegments();
    @Method(selector = "setTitle:forSegmentAtIndex:")
    public native void setTitle(String title, @MachineSizedUInt long segment);
    @Method(selector = "titleForSegmentAtIndex:")
    public native String getTitle(@MachineSizedUInt long segment);
    @Method(selector = "setImage:forSegmentAtIndex:")
    public native void setImage(UIImage image, @MachineSizedUInt long segment);
    @Method(selector = "imageForSegmentAtIndex:")
    public native UIImage getImage(@MachineSizedUInt long segment);
    @Method(selector = "setWidth:forSegmentAtIndex:")
    public native void setWidth(@MachineSizedFloat double width, @MachineSizedUInt long segment);
    @Method(selector = "widthForSegmentAtIndex:")
    public native @MachineSizedFloat double getWidth(@MachineSizedUInt long segment);
    @Method(selector = "setContentOffset:forSegmentAtIndex:")
    public native void setContentOffset(@ByVal CGSize offset, @MachineSizedUInt long segment);
    @Method(selector = "contentOffsetForSegmentAtIndex:")
    public native @ByVal CGSize getContentOffset(@MachineSizedUInt long segment);
    @Method(selector = "setEnabled:forSegmentAtIndex:")
    public native void setEnabled(boolean enabled, @MachineSizedUInt long segment);
    @Method(selector = "isEnabledForSegmentAtIndex:")
    public native boolean isEnabled(@MachineSizedUInt long segment);
    @Method(selector = "setBackgroundImage:forState:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, UIControlState state, UIBarMetrics barMetrics);
    @Method(selector = "backgroundImageForState:barMetrics:")
    public native UIImage getBackgroundImage(UIControlState state, UIBarMetrics barMetrics);
    @Method(selector = "setDividerImage:forLeftSegmentState:rightSegmentState:barMetrics:")
    public native void setDividerImage(UIImage dividerImage, UIControlState leftState, UIControlState rightState, UIBarMetrics barMetrics);
    @Method(selector = "dividerImageForLeftSegmentState:rightSegmentState:barMetrics:")
    public native UIImage getDividerImage(UIControlState leftState, UIControlState rightState, UIBarMetrics barMetrics);
    @Method(selector = "setTitleTextAttributes:forState:")
    public native void setTitleTextAttributesDictionary(NSDictionary<NSString, ?> attributes, UIControlState state);
    @Method(selector = "titleTextAttributesForState:")
    public native NSDictionary<NSString, ?> getTitleTextAttributesDictionary(UIControlState state);
    @Method(selector = "setContentPositionAdjustment:forSegmentType:barMetrics:")
    public native void setContentPositionAdjustment(@ByVal UIOffset adjustment, UISegmentedControlSegment leftCenterRightOrAlone, UIBarMetrics barMetrics);
    @Method(selector = "contentPositionAdjustmentForSegmentType:barMetrics:")
    public native @ByVal UIOffset getContentPositionAdjustment(UISegmentedControlSegment leftCenterRightOrAlone, UIBarMetrics barMetrics);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
