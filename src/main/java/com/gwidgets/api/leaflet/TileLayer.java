package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.TileLayerOptions;
import com.gwidgets.api.leaflet.options.TileLayerWMSOptions;

@JsType(isNative = true)
public class TileLayer implements ILayer{


	@JsMethod
	public native L addTo(Map map);

	@JsMethod
	public native L bringToFront();

	@JsMethod
	public native L bringToBack();

	@JsMethod
	public native L setOpacity(Number opacity);

	@JsMethod
	public native L setZIndex(Number zIndex);

	@JsMethod
	public native L redraw();

	@JsMethod
	public native L setUrl(String urlTemplate);

	@JsMethod
	public native HTMLElement getContainer();

	//

	@JsMethod
	public static native L clearAllEventListeners();

	@JsMethod
	public static native L on(String type, Function fn);

	@JsMethod
	public static native L once(String type, Function fn);

	@JsMethod
	public static native L off(String type, Function fn);

	@JsMethod
	public static native L fire(String type);

	@Override
	@JsMethod
	public native void onAdd(Map map);

	@Override
	@JsMethod
	public native void onRemove(Map map);

}

