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

import com.gwidgets.api.leaflet.elemental.HTMLCanvasElement;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;



/**
 * Used to create Canvas-based tile layers where tiles get drawn on the browser side.
 * 
 *  @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class Canvas extends TileLayer{

	/**
	 * You need to define this method after creating the instance to draw tiles; canvas is the actual canvas tile on which you can draw, tilePoint represents the tile numbers, and zoom is the current zoom.
	 *
	 * @param canvas the canvas element
	 * @param tilePoint the tile point
	 * @param zoom the zoom
	 * @return the L class
	 */
	@JsMethod
	public native L drawTile(HTMLCanvasElement canvas, Point tilePoint,
			Number zoom);

	/**
	 * If async option is defined, this function should be called for each tile after drawing completion. canvas is the same canvas element, that was passed to drawTile.
	 *
	 * @param canvas the canvas element
	 */
	@JsMethod
	public native void tileDrawn(HTMLCanvasElement canvas);

}