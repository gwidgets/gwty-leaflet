package com.gwidgets.api.leaflet.utils;

import com.google.gwt.core.client.GWT;
import com.gwidgets.api.leaflet.elemental.Document;
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLLinkElement;
import com.gwidgets.api.leaflet.elemental.HTMLScriptElement;


public class LeafletResources {
	
	
	
	public static void whenReady(Function function){
		
		HTMLScriptElement leafletScript = (HTMLScriptElement) Document.createElement("script");
		leafletScript.src=GWT.getModuleName()+"/leaflet/leaflet.js";
		leafletScript.type="text/javascript";
		
		HTMLLinkElement leafletStyle = (HTMLLinkElement) Document.createElement("link");
		leafletStyle.href=GWT.getModuleName()+"/leaflet/leaflet.css";
		leafletStyle.rel="stylesheet";
		
		
		Document.getHead().appendChild(leafletScript);
		Document.getHead().appendChild(leafletStyle);
		
		leafletScript.onload = function;

	}

}
