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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * The layers control gives users the ability to switch between different base layers and switch overlays on/off
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class Layers extends Control{



	/**
	 * Adds a base layer (radio button entry) with the given name to the control.
	 *
	 * @param layer the layer
	 * @param name the name
	 * @return the l
	 */
	@JsMethod
	public native L addBaseLayer(ILayer layer, String name);

	/**
	 * Adds an overlay (checkbox entry) with the given name to the control.
	 *
	 * @param layer the layer
	 * @param name the name
	 * @return the l
	 */
	@JsMethod
	public native L addOverlay(ILayer layer, String name);

	/**
	 * Remove the given layer from the control.
	 *
	 * @param layer the layer
	 * @return the l
	 */
	@JsMethod
	public native L removeLayer(ILayer layer);

	// Events

	// events

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