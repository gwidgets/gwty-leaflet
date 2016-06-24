package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Transformation {

	@JsMethod
	public native Point transform(Point point, Number scale);

	@JsMethod
	public native Point untransform(Point point, Number scale);

}