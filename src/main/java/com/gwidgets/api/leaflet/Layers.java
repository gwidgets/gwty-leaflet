package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * The layers control gives users the ability to switch between different base layers and switch overlays on/off
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
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
	public native L addBaseLayer(Layer layer, String name);

	/**
	 * Adds an overlay (checkbox entry) with the given name to the control.
	 *
	 * @param layer the layer
	 * @param name the name
	 * @return the l
	 */
	@JsMethod
	public native L addOverlay(Layer layer, String name);

	/**
	 * Remove the given layer from the control.
	 *
	 * @param layer the layer
	 * @return the l
	 */
	@JsMethod
	public native L removeLayer(Layer layer);
	
	/**
	 * Expand the control container if collapsed.
	 *
	 * @return the l
	 */
	@JsMethod
	public native L expand();
	
	/**
	 * Collapse the control container if expanded.
	 *
	 * @return the l
	 */
	@JsMethod
	public native L collapse();



}
