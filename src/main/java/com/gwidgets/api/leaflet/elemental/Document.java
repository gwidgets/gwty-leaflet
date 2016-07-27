package com.gwidgets.api.leaflet.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsType;

@JsType(isNative=true, name = "document", namespace = GLOBAL)
public class Document extends Node {
	
	private Document(){}
	
	public static native HTMLElement getElementById(String id);

}
