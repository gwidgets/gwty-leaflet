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

/**
 *Used to load and display a single image over specific bounds of the map, implements ILayer interface.
 *@author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class ImageOverlay implements ILayer {

	/**
	 * Adds the overlay to the map.
	 *
	 * @param map the map
	 * @return the L class
	 */
	@JsMethod
	public static native L addTo(Map map);

	/**
	 * Sets the opacity of the overlay.
	 *
	 * @param opacity the opacity
	 * @return the L class
	 */
	@JsMethod
	public static native L setOpacity(Number opacity);

	/**
	 * Brings the layer to the top of all overlays.
	 *
	 * @return the L class
	 */
	@JsMethod
	public static native L bringToFront();

	/**
	 * Brings the layer to the bottom of all overlays.
	 *
	 * @return the L class
	 */
	@JsMethod
	public static native L bringToBack();

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.ILayer#onAdd(com.gwidgets.api.leaflet.Map)
	 */
	@Override
	@JsMethod
	public native void onAdd(Map map);

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.ILayer#onRemove(com.gwidgets.api.leaflet.Map)
	 */
	@Override
	@JsMethod
	public native void onRemove(Map map);

}