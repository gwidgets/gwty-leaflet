package com.gwidgets.api.leaflet.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = GLOBAL)
public class HTMLLinkElement extends HTMLElement {
	
	   @JsProperty
	   public String href;
	   
	   
	   @JsProperty
	   public String rel;
	   
	   

}
