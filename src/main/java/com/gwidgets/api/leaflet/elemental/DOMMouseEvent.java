package com.gwidgets.api.leaflet.elemental;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative=true, name="MouseEvent")
public class DOMMouseEvent {
	
	@JsProperty
	public long screenX;

	@JsProperty
	public long screenY;

	@JsProperty
	public long clientX;

	@JsProperty
	public long clientY;

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
