package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.PopupOptions;

@JsType(isNative = true)
public class Marker {



	@JsMethod
	public native L addTo(Map map);

	@JsMethod
	public native LatLng getLatLng();

	@JsMethod
	public native L setLatLng(LatLng latlng);

	@JsMethod
	public native L setIcon(Icon icon);

	@JsMethod
	public native L setZIndexOffset(Number offset);

	@JsMethod
	public native L setOpacity(Number opacity);

	@JsMethod
	public native L update();

	@JsMethod
	public native L bindPopup(String html, PopupOptions options);

	@JsMethod
	public native L bindPopup(HTMLElement el, PopupOptions options);

	@JsMethod
	public native L bindPopup(Popup popup, PopupOptions options);

	@JsMethod
	public native L unbindPopup();

	@JsMethod
	public native L openPopup();

	@JsMethod
	public native L closePopup();

	@JsMethod
	public native L togglePopup();

	@JsMethod
	public native L setPopupContent(String html, PopupOptions options);

	@JsMethod
	public native L setPopupContent(HTMLElement el, PopupOptions options);


	@JsMethod
	public native Object toGeoJSON();

	// Events

	@JsMethod
	public static native L clearAllEventListeners();

	@JsMethod
	public static native L on(String type, Function fn);

	@JsMethod
	public static native L once(String type, Function fn);

	@JsMethod
	public static native L off(String type, Function fn);

	@JsMethod
	public static native L fire(String type);

}