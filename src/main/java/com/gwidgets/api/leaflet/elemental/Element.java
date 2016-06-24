package com.gwidgets.api.leaflet.elemental;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true)
public class Element {
	
	@JsMethod
    public native String getInnerHTML();
    @JsMethod
    public native void setInnerHTML(String s);


 
}
