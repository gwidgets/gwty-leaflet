package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


import com.gwidgets.api.leaflet.elemental.HTMLElement;


@JsType(isNative = true)
public class Control implements IControl {


	@JsMethod
	public native L setPosition(String position);

	@JsMethod
	public native String getPosition();

	@JsMethod
	public native L addTo(Map map);

	@JsMethod
	public native L removeFrom(Map map);

	@JsMethod
	public native HTMLElement getContainer();

	@Override
	@JsMethod
	public native HTMLElement onAdd(Map map);

	@Override
	@JsMethod
	public native void onRemove(Map map);

}
