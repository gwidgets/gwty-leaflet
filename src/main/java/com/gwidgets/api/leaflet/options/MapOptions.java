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
	public LatLng center = null;
	@JsProperty
	public Number zoom = null;
	@JsProperty
	public ILayer[] layers = null;
	@JsProperty
	public Number minZoom = null;
	@JsProperty
	public Number maxZoom = null;
	@JsProperty
	public LatLngBounds maxBounds = null;
	// @JsProperty
	// CRS crs = L.CRS.EPSG3857;

	// Interaction Options
	@JsProperty
	public Boolean dragging = true;
	@JsProperty
	public Boolean touchZoom = true;
	@JsProperty
	public Boolean scrollWheelZoom = true;
	@JsProperty
	public Boolean doubleClickZoom = true;
	@JsProperty
	public Boolean boxZoom = true;
	@JsProperty
	public Boolean tap = true;
	@JsProperty
	public Number tapTolerance = 15;
	@JsProperty
	public Boolean trackResize = true;
	@JsProperty
	public Boolean worldCopyJump = false;
	@JsProperty
	public Boolean closePopupOnClick = true;

	// Keyboard Navigation Options
	@JsProperty
	public Boolean keyboard = true;
	@JsProperty
	public Number keyboardPanOffset = 80;
	@JsProperty
	public Number keyboardZoomOffset = 1;

	// Panning Inertia Options
	@JsProperty
	public Boolean inertia = true;
	@JsProperty
	public Number inertiaDeceleration = 3000;
	@JsProperty
	public Number inertiaMaxSpeed = 1500;
	@JsProperty
	public Number inertiaThreshold = 32;

	// Control options
	@JsProperty
	public Boolean zoomControl = true;
	@JsProperty
	public Boolean attributionControl = true;

	// Animation options
	@JsProperty
	public Boolean fadeAnimation = true;
	@JsProperty
	public Boolean zoomAnimation = true;
	@JsProperty
	public Number zoomAnimationThreshold = 4;
	@JsProperty
	public Boolean markerZoomAnimation = true;

	// Locate options
	

}