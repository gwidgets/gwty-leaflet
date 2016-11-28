package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.SVGElement;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class SVG extends Renderer{
	
	
	/** Returns a instance of SVGElement, corresponding to the class name passed. For example, using 'line' will return an instance of SVGLineElement.
	* @return SVGElement
		 */
	public static native SVGElement create(String name);		


	/** Generates a SVG path string for multiple rings, with each ring turning into "M..L..L.." instructions
	* @return String the path string
		 */
	public static native String pointsToPath(Point[] rings, Boolean closed);

}
