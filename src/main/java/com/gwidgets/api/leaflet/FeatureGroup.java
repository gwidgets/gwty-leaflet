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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.options.PathOptions;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.elemental.Function;


/**
 * Extended layerGroup that also has mouse events (propagated from members of the group) and a shared bindPopup method.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class FeatureGroup implements ILayer {


	/**
	 * Binds a popup with a particular HTML content to a click on any layer from the group that has a bindPopup method.
	 *
	 * @param htmlContent the html content
	 * @param options the Popup options
	 * @return the L class
	 */
	@JsMethod
	public native L bindPopup(String htmlContent, PopupOptions options);

	/**
	 * Returns the LatLngBounds of the Feature Group (created from bounds and coordinates of its children).
	 *
	 * @return the bounds
	 */
	@JsMethod
	public native LatLngBounds getBounds();

	/**
	 * Sets the given path options to each layer of the group that has a setStyle method.
	 *
	 * @param style the style
	 * @return the L class
	 */
	@JsMethod
	public native L setStyle(PathOptions style);

	/**
	 * Brings the layer group to the top of all other layers.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L bringToFront();

	/**
	 * Brings the layer group to the bottom of all other layers.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L bringToBack();

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

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.ILayer#onAdd(com.gwidgets.api.leaflet.Map)
	 */
	@Override
	public native void onAdd(Map map);

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.ILayer#onRemove(com.gwidgets.api.leaflet.Map)
	 */
	@Override
	public native void onRemove(Map map);

}