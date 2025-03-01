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
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITabBar/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements UISpringLoadedInteractionSupporting/*</implements>*/ {

    /*<ptr>*/public static class UITabBarPtr extends Ptr<UITabBar, UITabBarPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITabBar.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITabBar() {}
    protected UITabBar(Handle h, long handle) { super(h, handle); }
    protected UITabBar(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UITabBar(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UITabBar(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UITabBarDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITabBarDelegate v);
    @Property(selector = "items")
    public native NSArray<UITabBarItem> getItems();
    @Property(selector = "setItems:")
    public native void setItems(NSArray<UITabBarItem> v);
    @Property(selector = "selectedItem")
    public native UITabBarItem getSelectedItem();
    @Property(selector = "setSelectedItem:", strongRef = true)
    public native void setSelectedItem(UITabBarItem v);
    @Property(selector = "isCustomizing")
    public native boolean isCustomizing();
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @Property(selector = "barTintColor")
    public native UIColor getBarTintColor();
    @Property(selector = "setBarTintColor:")
    public native void setBarTintColor(UIColor v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "unselectedItemTintColor")
    public native UIColor getUnselectedItemTintColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setUnselectedItemTintColor:")
    public native void setUnselectedItemTintColor(UIColor v);
    /**
     * @deprecated Deprecated in iOS 8.0. Use tintColor
     */
    @Deprecated
    @Property(selector = "selectedImageTintColor")
    public native UIColor getSelectedImageTintColor();
    /**
     * @deprecated Deprecated in iOS 8.0. Use tintColor
     */
    @Deprecated
    @Property(selector = "setSelectedImageTintColor:")
    public native void setSelectedImageTintColor(UIColor v);
    @Property(selector = "backgroundImage")
    public native UIImage getBackgroundImage();
    @Property(selector = "setBackgroundImage:")
    public native void setBackgroundImage(UIImage v);
    @Property(selector = "selectionIndicatorImage")
    public native UIImage getSelectionIndicatorImage();
    @Property(selector = "setSelectionIndicatorImage:")
    public native void setSelectionIndicatorImage(UIImage v);
    @Property(selector = "shadowImage")
    public native UIImage getShadowImage();
    @Property(selector = "setShadowImage:")
    public native void setShadowImage(UIImage v);
    @Property(selector = "itemPositioning")
    public native UITabBarItemPositioning getItemPositioning();
    @Property(selector = "setItemPositioning:")
    public native void setItemPositioning(UITabBarItemPositioning v);
    @Property(selector = "itemWidth")
    public native @MachineSizedFloat double getItemWidth();
    @Property(selector = "setItemWidth:")
    public native void setItemWidth(@MachineSizedFloat double v);
    @Property(selector = "itemSpacing")
    public native @MachineSizedFloat double getItemSpacing();
    @Property(selector = "setItemSpacing:")
    public native void setItemSpacing(@MachineSizedFloat double v);
    @Property(selector = "barStyle")
    public native UIBarStyle getBarStyle();
    @Property(selector = "setBarStyle:")
    public native void setBarStyle(UIBarStyle v);
    @Property(selector = "isTranslucent")
    public native boolean isTranslucent();
    @Property(selector = "setTranslucent:")
    public native void setTranslucent(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "standardAppearance")
    public native UITabBarAppearance getStandardAppearance();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setStandardAppearance:")
    public native void setStandardAppearance(UITabBarAppearance v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "scrollEdgeAppearance")
    public native UITabBarAppearance getScrollEdgeAppearance();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setScrollEdgeAppearance:")
    public native void setScrollEdgeAppearance(UITabBarAppearance v);
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
    /*<methods>*/
    @Method(selector = "setItems:animated:")
    public native void setItems(NSArray<UITabBarItem> items, boolean animated);
    @Method(selector = "beginCustomizingItems:")
    public native void beginCustomizing(NSArray<UITabBarItem> items);
    @Method(selector = "endCustomizingAnimated:")
    public native boolean endCustomizing(boolean animated);
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
