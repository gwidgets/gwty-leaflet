package com.gwidgets.api.leaflet.elemental;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true)
public class Node {
	
	@JsMethod
	public native void appendChild(Object child);
	
	@JsMethod
	public native void removeChild(Object child);

}
