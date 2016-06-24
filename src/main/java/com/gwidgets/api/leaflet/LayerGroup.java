package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.gwidgets.api.leaflet.elemental.Function;

@JsType(isNative = true)
public class LayerGroup implements ILayer {

	@JsMethod
	public native L addTo(Map map);

	@JsMethod
	public native L addLayer(ILayer layer);

	@JsMethod
	public native L removeLayer(ILayer layer);

	@JsMethod
	public native L removeLayer(String id);

	@JsMethod
	public native Boolean hasLayer(ILayer layer);

	@JsMethod
	public native Boolean getLayer(String id);

	@JsMethod
	public native JsArray<JavaScriptObject> getLayers();

	@JsMethod
	public native L clearLayers();

	@JsMethod
	public native L eachLayer(Function fn, Object context);

	@JsMethod
	public native Object toGeoJSON();

	@Override
	@JsMethod
	public native void onAdd(Map map);

	@Override
	@JsMethod
	public native void onRemove(Map map);

}