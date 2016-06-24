package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Bounds {

	@JsMethod
	public native void extend(Point point);

	@JsMethod
	public native Point getCenter();

	@JsMethod
	public native Boolean contains(Bounds otherBounds);

	@JsMethod
	public native Boolean contains(Point point);

	@JsMethod
	public native Boolean intersects(Bounds otherBounds);

	@JsMethod
	public native Boolean isValid();

	@JsMethod
	public native Point getSize();

}