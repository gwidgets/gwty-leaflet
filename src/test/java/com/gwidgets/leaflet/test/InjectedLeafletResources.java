package com.gwidgets.leaflet.test;


import elemental2.dom.DomGlobal;
import elemental2.dom.Element.OnloadCallbackFn;
import elemental2.dom.HTMLLinkElement;
import elemental2.dom.HTMLScriptElement;

public class InjectedLeafletResources {
public static void whenReady(OnloadCallbackFn function){		
		HTMLScriptElement leafletScript = (HTMLScriptElement) DomGlobal.document.createElement("script");
		leafletScript.src="https://cdnjs.cloudflare.com/ajax/libs/leaflet/1.0.0/leaflet.js";
		leafletScript.type="text/javascript";
		DomGlobal.document.head.appendChild(leafletScript);		
		leafletScript.onload = function;
	}
}