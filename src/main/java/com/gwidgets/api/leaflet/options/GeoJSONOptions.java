package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.gwidgets.api.leaflet.GeoJSON;
import com.gwidgets.api.leaflet.ILayer;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.elemental.Function;

@JsType
public interface GeoJSONOptions {

	Function pointToLayer(JavaScriptObject featureData, LatLng latlng);

	Function style(JavaScriptObject featureData);

	Function onEachFeature(JavaScriptObject featureData, ILayer layer);

	Function filter(JavaScriptObject featureData, ILayer layer);

	Function coordsToLatLng(JsArray<JavaScriptObject> coords);

}