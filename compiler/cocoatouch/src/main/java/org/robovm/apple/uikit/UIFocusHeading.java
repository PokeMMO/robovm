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
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/UIFocusHeading/*</name>*/ extends Bits</*<name>*/UIFocusHeading/*</name>*/> {
    /*<values>*/
    public static final UIFocusHeading None = new UIFocusHeading(0L);
    public static final UIFocusHeading Up = new UIFocusHeading(1L);
    public static final UIFocusHeading Down = new UIFocusHeading(2L);
    public static final UIFocusHeading Left = new UIFocusHeading(4L);
    public static final UIFocusHeading Right = new UIFocusHeading(8L);
    public static final UIFocusHeading Next = new UIFocusHeading(16L);
    public static final UIFocusHeading Previous = new UIFocusHeading(32L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIFocusHeading First = new UIFocusHeading(256L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIFocusHeading Last = new UIFocusHeading(512L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/UIFocusHeading/*</name>*/[] values = _values(/*<name>*/UIFocusHeading/*</name>*/.class);

    public /*<name>*/UIFocusHeading/*</name>*/(long value) { super(value); }
    private /*<name>*/UIFocusHeading/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UIFocusHeading/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UIFocusHeading/*</name>*/(value, mask);
    }
    protected /*<name>*/UIFocusHeading/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UIFocusHeading/*</name>*/[] values() {
        return values.clone();
    }
}
