package com.gwidgets.api.leaflet;

/**
 *  Copyright 2016 G-Widgets
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * Used internally for panning animations, utilizing CSS3 Transitions for modern browsers and a timer fallback for IE6-9.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class PosAnimation {



	/**
	 * Runs an animation of a given element to a new position, optionally setting duration in seconds (0.25 by default) and easing linearity factor (3rd argument of the cubic bezier curve, 0.5 by default).
	 *
	 * @param element the element
	 * @param newPos the new position
	 * @param duration the duration
	 * @param easeLinearity the easing linearity factor
	 * @return the L class
	 */
	@JsMethod
	public native L run(HTMLElement element, Point newPos, Number duration,
			Number easeLinearity);

	// Events

	/**
	 * Clear all event listeners.
	 *
	 * @return the L class
	 */
	@JsMethod
	public static native L clearAllEventListeners();

	/**
	 * Adds a set of type/listener pairs
	 *
	 * @param type the type
	 * @param fn the callback function
	 * @return the L class
	 */
	@JsMethod
	public static native L on(String type, Function fn);

	/**
	 * Once.
	 *
	 * @param type the type
	 * @param fn the callback function
	 * @return the L class
	 */
	@JsMethod
	public static native L once(String type, Function fn);

	/**
	 *  the listener will only get fired once and then removed.
	 *
	 * @param type the type
	 * @param fn the callback function
	 * @return the L class
	 */
	@JsMethod
	public static native L off(String type, Function fn);

	/**
	 * Fires an event of the specified type. You can optionally provide an data object — the first argument of the listener function will contain its properties.
	 *
	 * @param type the type
	 * @return the L class
	 */
	@JsMethod
	public static native L fire(String type);

}