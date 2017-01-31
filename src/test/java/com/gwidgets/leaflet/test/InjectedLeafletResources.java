package com.gwidgets.leaflet.test;

import com.gwidgets.api.leaflet.elemental.Document;
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLLinkElement;
import com.gwidgets.api.leaflet.elemental.HTMLScriptElement;


public class InjectedLeafletResources {
	
	
	
	public static void whenReady(Function function){
		
		HTMLScriptElement leafletScript = (HTMLScriptElement) Document.createElement("script");
		leafletScript.src="https://unpkg.com/leaflet@1.0.3/dist/leaflet.js";
		leafletScript.type="text/javascript";
		
		HTMLLinkElement leafletStyle = (HTMLLinkElement) Document.createElement("link");
		leafletStyle.href="https://unpkg.com/leaflet@1.0.3/dist/leaflet.css";
		leafletStyle.rel="stylesheet";
		
		
		Document.getHead().appendChild(leafletScript);
		Document.getHead().appendChild(leafletStyle);
		
		leafletScript.onload = function;

	}

}
