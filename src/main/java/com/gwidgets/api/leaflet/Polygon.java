package com.gwidgets.api.leaflet;

import com.google.gwt.core.client.JavaScriptObject;

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
 * A class for drawing polygon overlays on a map. Extends Polyline. Use addLayer method of map to add it to the map.
 * Note that points you pass when creating a polygon shouldn't have an additional last point equal to the first one — it's better to filter out such points.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class Polygon extends Polyline{

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Polyline#toGeoJSON()
	 */
	@JsMethod
	public native JavaScriptObject toGeoJSON();

}