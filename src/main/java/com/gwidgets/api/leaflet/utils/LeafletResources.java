package com.gwidgets.api.leaflet.utils;

import com.google.gwt.core.client.GWT;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import elemental2.dom.HTMLLinkElement;
import elemental2.dom.HTMLScriptElement;


public class LeafletResources {
	public static void whenReady(boolean debug, Element.OnloadFn function){
		HTMLScriptElement leafletScript = (HTMLScriptElement) DomGlobal.document.createElement("script");
		if (debug) {
			leafletScript.src = GWT.getModuleName() + "/leaflet/leaflet-src.js";
		} else {
			leafletScript.src = GWT.getModuleName() + "/leaflet/leaflet.js";
		}
		leafletScript.type="text/javascript";
		
		HTMLLinkElement leafletStyle = (HTMLLinkElement) DomGlobal.document.createElement("link");
		leafletStyle.href=GWT.getModuleName()+"/leaflet/leaflet.css";
		leafletStyle.rel="stylesheet";
		
		
		DomGlobal.document.head.appendChild(leafletScript);
		DomGlobal.document.head.appendChild(leafletStyle);
		
		leafletScript.onload = function;
	}
}