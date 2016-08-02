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

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.PopupOptions;

/**
 * Used to put markers on the map.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class Marker {



	/**
	 * Adds the marker to the map.
	 *
	 * @param map the map
	 * @return the L class
	 */
	@JsMethod
	public native L addTo(Map map);

	/**
	 * Returns the current geographical position of the marker.
	 *
	 * @return the lat lng
	 */
	@JsMethod
	public native LatLng getLatLng();

	/**
	 * Changes the marker position to the given point.
	 *
	 * @param latlng the latlng
	 * @return the L class
	 */
	@JsMethod
	public native L setLatLng(LatLng latlng);

	/**
	 * Changes the marker icon.
	 *
	 * @param icon the icon
	 * @return the L class
	 */
	@JsMethod
	public native L setIcon(Icon icon);

	/**
	 * Sets the Z index offset.
	 *
	 * @param offset the offset
	 * @return the l
	 */
	@JsMethod
	public native L setZIndexOffset(Number offset);

	/**
	 * Changes the zIndex offset of the marker.
	 *
	 * @param opacity the opacity
	 * @return the L class
	 */
	@JsMethod
	public native L setOpacity(Number opacity);

	/**
	 * Updates the marker position, useful if coordinates of its latLng object were changed directly.
	 *
	 * @return the l
	 */
	@JsMethod
	public native L update();

	/**
	 * Binds a popup with a particular HTML content to a click on this marker. You can also open the bound popup with the Marker openPopup method.
	 *
	 * @param html the html
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L bindPopup(String html, PopupOptions options);

	/**
	 * Binds a popup with a particular HTML content to a click on this marker. You can also open the bound popup with the Marker openPopup method.
	 *
	 * @param el the el
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L bindPopup(HTMLElement el, PopupOptions options);

	/**
	 * Binds a popup with a particular HTML content to a click on this marker. You can also open the bound popup with the Marker openPopup method.
	 *
	 * @param popup the popup
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L bindPopup(Popup popup, PopupOptions options);

	/**
	 * Unbinds the popup previously bound to the marker with bindPopup.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L unbindPopup();

	/**
	 * Opens the popup previously bound by the bindPopup method.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L openPopup();
	
	/**
	 * Returns the popup previously bound by the bindPopup method.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native Popup getPopup();

	/**
	 * Closes the bound popup of the marker if it's opened.
	 *
	 * @return the l
	 */
	@JsMethod
	public native L closePopup();

	/**
	 * Toggles the popup previously bound by the bindPopup method.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L togglePopup();

	/**
	 * Sets an HTML content of the popup of this marker.
	 *
	 * @param html the html
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L setPopupContent(String html, PopupOptions options);

	/**
	 * Sets an HTML content of the popup of this marker.
	 *
	 * @param el the element
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L setPopupContent(HTMLElement el, PopupOptions options);


	/**
	 * To geo JSON.
	 *
	 * @return the object
	 */
	@JsMethod
	public native JavaScriptObject toGeoJSON();

	// events

			/**
			 * Clear all event listeners.
			 *
			 * @return the L class
			 */
			@JsMethod
			public static native L clearAllEventListeners();

			/**
			 * Adds a set of type/listener pairs.
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