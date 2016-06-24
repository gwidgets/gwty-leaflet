package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.ILayer;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.LatLngBounds;

@JsType
public class MapOptions {

	// Map State Options
	@JsProperty
	LatLng center = null;
	@JsProperty
	Number zoom = null;
	@JsProperty
	ILayer[] layers = null;
	@JsProperty
	Number minZoom = null;
	@JsProperty
	Number maxZoom = null;
	@JsProperty
	LatLngBounds maxBounds = null;
	// @JsProperty
	// CRS crs = L.CRS.EPSG3857;

	// Interaction Options
	@JsProperty
	Boolean dragging = true;
	@JsProperty
	Boolean touchZoom = true;
	@JsProperty
	Boolean scrollWheelZoom = true;
	@JsProperty
	Boolean doubleClickZoom = true;
	@JsProperty
	Boolean boxZoom = true;
	@JsProperty
	Boolean tap = true;
	@JsProperty
	Number tapTolerance = 15;
	@JsProperty
	Boolean trackResize = true;
	@JsProperty
	Boolean worldCopyJump = false;
	@JsProperty
	Boolean closePopupOnClick = true;

	// Keyboard Navigation Options
	@JsProperty
	Boolean keyboard = true;
	@JsProperty
	Number keyboardPanOffset = 80;
	@JsProperty
	Number keyboardZoomOffset = 1;

	// Panning Inertia Options
	@JsProperty
	Boolean inertia = true;
	@JsProperty
	Number inertiaDeceleration = 3000;
	@JsProperty
	Number inertiaMaxSpeed = 1500;
	@JsProperty
	Number inertiaThreshold = 32;

	// Control options
	@JsProperty
	Boolean zoomControl = true;
	@JsProperty
	Boolean attributionControl = true;

	// Animation options
	@JsProperty
	Boolean fadeAnimation = true;
	@JsProperty
	Boolean zoomAnimation = true;
	@JsProperty
	Number zoomAnimationThreshold = 4;
	@JsProperty
	Boolean markerZoomAnimation = true;

	// Locate options
	

}