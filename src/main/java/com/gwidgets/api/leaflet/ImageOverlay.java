package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class ImageOverlay implements ILayer {

	@JsMethod
	public static native L addTo(Map map);

	@JsMethod
	public static native L setOpacity(Number opacity);

	@JsMethod
	public static native L bringToFront();

	@JsMethod
	public static native L bringToBack();

	@Override
	@JsMethod
	public native void onAdd(Map map);

	@Override
	@JsMethod
	public native void onRemove(Map map);

}