package com.gwidgets.api.leaflet.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative=true, name="MouseEvent", namespace = GLOBAL)
public class DOMMouseEvent {
	
	@JsProperty
	public int screenX;

	@JsProperty
	public int screenY;

	@JsProperty
	public int clientX;

	@JsProperty
	public int clientY;

	@JsProperty
	public Boolean ctrlKey;

	@JsProperty
	public Boolean shiftKey;

	@JsProperty
	public Boolean altKey;

	@JsProperty
	public Boolean metaKey;

	@JsProperty
	public short button;
	
	
   @JsMethod
	public native void initMouseEvent();

}
