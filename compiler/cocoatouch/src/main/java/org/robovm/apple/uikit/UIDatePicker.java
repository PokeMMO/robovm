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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDatePicker/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UIDatePickerPtr extends Ptr<UIDatePicker, UIDatePickerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDatePicker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIDatePicker() {}
    protected UIDatePicker(Handle h, long handle) { super(h, handle); }
    protected UIDatePicker(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UIDatePicker(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UIDatePicker(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public UIDatePicker(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "datePickerMode")
    public native UIDatePickerMode getDatePickerMode();
    @Property(selector = "setDatePickerMode:")
    public native void setDatePickerMode(UIDatePickerMode v);
    @Property(selector = "locale")
    public native NSLocale getLocale();
    @Property(selector = "setLocale:")
    public native void setLocale(NSLocale v);
    @Property(selector = "calendar")
    public native NSCalendar getCalendar();
    @Property(selector = "setCalendar:")
    public native void setCalendar(NSCalendar v);
    @Property(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @Property(selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "setDate:")
    public native void setDate(NSDate v);
    @Property(selector = "minimumDate")
    public native NSDate getMinimumDate();
    @Property(selector = "setMinimumDate:")
    public native void setMinimumDate(NSDate v);
    @Property(selector = "maximumDate")
    public native NSDate getMaximumDate();
    @Property(selector = "setMaximumDate:")
    public native void setMaximumDate(NSDate v);
    @Property(selector = "countDownDuration")
    public native double getCountDownDuration();
    @Property(selector = "setCountDownDuration:")
    public native void setCountDownDuration(double v);
    @Property(selector = "minuteInterval")
    public native @MachineSizedSInt long getMinuteInterval();
    @Property(selector = "setMinuteInterval:")
    public native void setMinuteInterval(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "preferredDatePickerStyle")
    public native UIDatePickerStyle getPreferredDatePickerStyle();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "setPreferredDatePickerStyle:")
    public native void setPreferredDatePickerStyle(UIDatePickerStyle v);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "datePickerStyle")
    public native UIDatePickerStyle getDatePickerStyle();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "roundsToMinuteInterval")
    public native boolean isRoundsToMinuteInterval();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setRoundsToMinuteInterval:")
    public native void setRoundsToMinuteInterval(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDate:animated:")
    public native void setDate(NSDate date, boolean animated);
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
