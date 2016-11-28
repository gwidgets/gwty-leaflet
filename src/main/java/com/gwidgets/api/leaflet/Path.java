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

import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.PathOptions;
import com.gwidgets.api.leaflet.options.PopupOptions;

/**
 * An abstract class that contains options and constants shared between vector overlays (Polygon, Polyline, Circle). Do not use it directly.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public abstract class Path {



	/**
	 * Adds the layer to the map.
	 *
	 * @param map the map
	 * @return the L class
	 */
	@JsMethod
	public  native L addTo(Map map);

	/**
	 * Bind popup.
	 *
	 * @param html the html
	 * @param options the options
	 * @return the l
	 */
	@JsMethod
	public  native L bindPopup(String html, PopupOptions options);

	/**
	 * Binds a popup with a particular HTML content to a click on this path.
	 *
	 * @param el the element
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public  native L bindPopup(HTMLElement el, PopupOptions options);

	/**
	 * Binds a popup with a particular HTML content to a click on this path.
	 *
	 * @param popup the popup
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public  native L bindPopup(Popup popup, PopupOptions options);

	/**
	 * Unbind popup.
	 *
	 * @return the L class
	 */
	@JsMethod
	public  native L unbindPopup();

	/**
	 * Opens the popup previously bound by the bindPopup method in the given point, or in one of the path's points if not specified.
	 *
	 * @param latlng the latlng
	 * @return the L class
	 */
	@JsMethod
	public  native L openPopup(LatLng latlng);

	/**
	 * Closes the path's bound popup if it is opened.
	 *
	 * @return the L class
	 */
	@JsMethod
	public  native L closePopup();

	/**
	 * Changes the appearance of a Path based on the options in the Path options object.
	 *
	 * @param object the object
	 * @return the L class
	 */
	@JsMethod
	public  native L setStyle(PathOptions object);

	/**
	 * Returns the LatLngBounds of the path.
	 *
	 * @return the bounds
	 */
	@JsMethod
	public  native LatLngBounds getBounds();

	/**
	 * Brings the layer to the top of all path layers.
	 *
	 * @return the L class
	 */
	@JsMethod
	public  native L bringToFront();

	/**
	 * Brings the layer to the bottom of all path layers.
	 *
	 * @return the L class 
	 */
	@JsMethod
	public  native L bringToBack();

	/**
	 * Redraws the layer. Sometimes useful after you changed the coordinates that the path uses.
	 *
	 * @return the L class
	 */
	@JsMethod
	public  native L redraw();


}