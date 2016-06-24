package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.options.PathOptions;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.elemental.Function;

@JsType(isNative = true)
public class FeatureGroup implements ILayer {


	@JsMethod
	public native L bindPopup(String htmlContent, PopupOptions options);

	@JsMethod
	public native LatLngBounds getBounds();

	@JsMethod
	public native L setStyle(PathOptions style);

	@JsMethod
	public native L bringToFront();

	@JsMethod
	public native L bringToBack();

	// events

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
	public native void onAdd(Map map);

	@Override
	public native void onRemove(Map map);

}