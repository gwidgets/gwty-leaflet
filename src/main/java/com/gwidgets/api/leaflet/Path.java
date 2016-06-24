package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.PathOptions;
import com.gwidgets.api.leaflet.options.PopupOptions;

@JsType(isNative = true)
public abstract class Path {



	@JsMethod
	public  native L addTo(Map map);

	@JsMethod
	public  native L bindPopup(String html, PopupOptions options);

	@JsMethod
	public  native L bindPopup(HTMLElement el, PopupOptions options);

	@JsMethod
	public  native L bindPopup(Popup popup, PopupOptions options);

	@JsMethod
	public  native L unbindPopup();

	@JsMethod
	public  native L openPopup(LatLng latlng);

	@JsMethod
	public  native L closePopup();

	@JsMethod
	public  native L setStyle(PathOptions object);

	@JsMethod
	public  native LatLngBounds getBounds();

	@JsMethod
	public  native L bringToFront();

	@JsMethod
	public  native L bringToBack();

	@JsMethod
	public  native L redraw();

	// Events

	@JsMethod
	public  native L clearAllEventListeners();

	@JsMethod
	public  native L on(String type, Function fn);

	@JsMethod
	public  native L once(String type, Function fn);

	@JsMethod
	public  native L off(String type, Function fn);

	@JsMethod
	public  native L fire(String type);

}