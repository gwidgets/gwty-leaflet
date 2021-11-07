package com.gwidgets.api.leaflet;



import elemental2.svg.SVGElement;
import jsinterop.annotations.JsType;

/**
 * <p>SVG class.</p>
 *
 * @author zakaria
 * @version $Id: $Id
 */
@JsType(isNative = true)
public class SVG extends Renderer{
	
	
	
	
	private SVG() {
		super();
		
	}


	/**
	 * Returns a instance of SVGElement, corresponding to the class name passed. For example, using 'line' will return an instance of SVGLineElement.
	 *
	 * @return SVGElement
	 * @param name a {@link java.lang.String} object
	 */
	public static native SVGElement create(String name);		


	/**
	 * Generates a SVG path string for multiple rings, with each ring turning into "M..L..L.." instructions
	 *
	 * @return String the path string
	 * @param rings an array of {@link com.gwidgets.api.leaflet.Point} objects
	 * @param closed a {@link java.lang.Boolean} object
	 */
	public static native String pointsToPath(Point[] rings, Boolean closed);

}
