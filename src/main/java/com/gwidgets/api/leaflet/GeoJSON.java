package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.gwidgets.api.leaflet.elemental.Function;

@JsType(isNative = true)
public class GeoJSON extends FeatureGroup {

	@JsMethod
	public native Boolean addData(JavaScriptObject data);

	@JsMethod
	public native L setStyle(Function style);

	@JsMethod
	public native L resetStyle(Path layer);

	@JsMethod
	public native static ILayer geometryToLayer(JavaScriptObject featureData,
			Function pointToLayer);

	@JsMethod
	public native static LatLng coordsToLatlng(JsArray<JavaScriptObject> coords, Boolean reverse);

	@JsMethod
	public native static JsArray<JavaScriptObject> coordsToLatlngs(JsArray<JavaScriptObject> coords, Number levelsDeep,
			Boolean reverse);

}