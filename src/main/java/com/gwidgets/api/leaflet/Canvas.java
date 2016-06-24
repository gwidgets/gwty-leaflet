package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.HTMLCanvasElement;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;



@JsType(isNative = true)
public class Canvas extends TileLayer{

	@JsMethod
	public native L drawTile(HTMLCanvasElement canvas, Point tilePoint,
			Number zoom);

	@JsMethod
	public native void tileDrawn(HTMLCanvasElement canvas);

}