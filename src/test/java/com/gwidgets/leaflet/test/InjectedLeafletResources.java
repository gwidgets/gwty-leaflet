package com.gwidgets.leaflet.test;


import elemental2.dom.DomGlobal;
import elemental2.dom.Element.OnloadCallbackFn;
import elemental2.dom.HTMLLinkElement;
import elemental2.dom.HTMLScriptElement;

public class InjectedLeafletResources {
	

public static void whenReady(OnloadCallbackFn function){
		
		HTMLScriptElement leafletScript = (HTMLScriptElement) DomGlobal.document.createElement("script");
		leafletScript.src="http://unpkg.com/leaflet@1.0.0/dist/leaflet.js";
		leafletScript.type="text/javascript";
		
		HTMLLinkElement leafletStyle = (HTMLLinkElement) DomGlobal.document.createElement("link");
		leafletStyle.href="http://unpkg.com/leaflet@1.0.0/dist/leaflet.css";
		leafletStyle.rel="stylesheet";
		
		
		DomGlobal.document.head.appendChild(leafletScript);
		DomGlobal.document.head.appendChild(leafletStyle);
		
		leafletScript.onload = function;

	}

}
