package com.gwidgets.leaflet.test;


import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import elemental2.dom.HTMLScriptElement;

public class InjectedLeafletResources {
public static void whenReady(Element.OnloadFn function){
		HTMLScriptElement leafletScript = (HTMLScriptElement) DomGlobal.document.createElement("script");
		leafletScript.src="https://cdnjs.cloudflare.com/ajax/libs/leaflet/1.0.0/leaflet.js";
		leafletScript.type="text/javascript";
		DomGlobal.document.head.appendChild(leafletScript);		
		leafletScript.onload = function;
	}
}