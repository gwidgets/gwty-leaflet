package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.ILayer;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.LatLngBounds;

@JsType
public class MapOptions {

	private MapOptions() {

	}

	// Map State Options
	@JsProperty
	private LatLng center = null;
	@JsProperty
	private Number zoom = 0;
	@JsProperty
	private ILayer[] layers = null;
	@JsProperty
	private Number minZoom = null;
	@JsProperty
	private Number maxZoom = null;
	@JsProperty
	private LatLngBounds maxBounds = null;
	// @JsProperty
	// CRS crs = L.CRS.EPSG3857;

	// Interaction Options
	@JsProperty
	private Boolean dragging = true;
	@JsProperty
	private Boolean touchZoom = true;
	@JsProperty
	private Boolean scrollWheelZoom = true;
	@JsProperty
	private Boolean doubleClickZoom = true;
	@JsProperty
	private Boolean boxZoom = true;
	@JsProperty
	private Boolean tap = true;
	@JsProperty
	private Number tapTolerance = 15;
	@JsProperty
	private Boolean trackResize = true;
	@JsProperty
	private Boolean worldCopyJump = false;
	@JsProperty
	private Boolean closePopupOnClick = true;

	// Keyboard Navigation Options
	@JsProperty
	private Boolean keyboard = true;
	@JsProperty
	private Number keyboardPanOffset = 80;
	@JsProperty
	private Number keyboardZoomOffset = 1;

	// Panning Inertia Options
	@JsProperty
	private Boolean inertia = true;
	@JsProperty
	private Number inertiaDeceleration = 3000;
	@JsProperty
	private Number inertiaMaxSpeed = 1500;
	@JsProperty
	private Number inertiaThreshold = 32;

	// Control options
	@JsProperty
	private Boolean zoomControl = true;
	@JsProperty
	private Boolean attributionControl = true;

	// Animation options
	@JsProperty
	private Boolean fadeAnimation = true;
	@JsProperty
	private Boolean zoomAnimation = true;
	@JsProperty
	private Number zoomAnimationThreshold = 4;
	@JsProperty
	private Boolean markerZoomAnimation = true;

	public LatLng getCenter() {
		return this.center;
	}

	public Number getZoom() {
		return this.zoom;
	}

	public ILayer[] getLayers() {
		return this.layers;
	}

	public Number getMinZoom() {
		return this.minZoom;
	}

	public Number getMaxZoom() {
		return this.maxZoom;
	}

	public LatLngBounds getMaxBounds() {
		return this.maxBounds;
	}

	public Boolean getDragging() {
		return this.dragging;
	}

	public Boolean getTouchZoom() {
		return this.touchZoom;
	}

	public Boolean getScrollWheelZoom() {
		return this.scrollWheelZoom;
	}

	public Boolean getDoubleClickZoom() {
		return this.doubleClickZoom;
	}

	public Boolean getBoxZoom() {
		return this.boxZoom;
	}

	public Boolean getTap() {
		return this.tap;
	}

	public Number getTapTolerance() {
		return this.tapTolerance;
	}

	public Boolean getTrackResize() {
		return this.trackResize;
	}

	public Boolean getWorldCopyJump() {
		return this.worldCopyJump;
	}

	public Boolean getClosePopupOnClick() {
		return this.closePopupOnClick;
	}

	public Boolean getKeyboard() {
		return this.keyboard;
	}

	public Number getKeyboardPanOffset() {
		return this.keyboardPanOffset;
	}

	public Number getKeyboardZoomOffset() {
		return this.keyboardZoomOffset;
	}

	public Boolean getInertia() {
		return this.inertia;
	}

	public Number getInertiaDeceleration() {
		return this.inertiaDeceleration;
	}

	public Number getInertiaMaxSpeed() {
		return this.inertiaMaxSpeed;
	}

	public Number getInertiaThreshold() {
		return this.inertiaThreshold;
	}

	public Boolean getZoomControl() {
		return this.zoomControl;
	}

	public Boolean getAttributionControl() {
		return this.attributionControl;
	}

	public Boolean getFadeAnimation() {
		return this.fadeAnimation;
	}

	public Boolean getZoomAnimation() {
		return this.zoomAnimation;
	}

	public Number getZoomAnimationThreshold() {
		return this.zoomAnimationThreshold;
	}

	public Boolean getMarkerZoomAnimation() {
		return this.markerZoomAnimation;
	}

	public static class Builder {

		LatLng center = null;

		Number zoom = 0;

		Number minZoom = 0;

		public Builder(LatLng center, Number zoom, Number minZoom) {
			this.center = center;
			this.zoom = zoom;
			this.minZoom = minZoom;

		}

		ILayer[] layers = null;

		Number maxZoom = 0;

		LatLngBounds maxBounds = null;

		Boolean dragging = true;

		Boolean touchZoom = true;

		Boolean scrollWheelZoom = true;

		Boolean doubleClickZoom = true;

		Boolean boxZoom = true;

		Boolean tap = true;

		Number tapTolerance = 15;

		Boolean trackResize = true;

		Boolean worldCopyJump = false;

		Boolean closePopupOnClick = true;

		Boolean keyboard = true;

		Number keyboardPanOffset = 80;

		Number keyboardZoomOffset = 1;

		Boolean inertia = true;

		Number inertiaDeceleration = 3000;

		Number inertiaMaxSpeed = 1500;

		Number inertiaThreshold = 32;

		Boolean zoomControl = true;

		Boolean attributionControl = true;

		Boolean fadeAnimation = true;

		Boolean zoomAnimation = true;

		Number zoomAnimationThreshold = 4;

		Boolean markerZoomAnimation = true;

		public Builder layers(ILayer[] layers) {
			this.layers = layers;
			return this;
		}

		public Builder maxZoom(Number maxZoom) {
			this.maxZoom = maxZoom;
			return this;
		}

		public Builder maxBounds(LatLngBounds maxBounds) {
			this.maxBounds = maxBounds;
			return this;
		}

		public Builder dragging(Boolean dragging) {
			this.dragging = dragging;
			return this;
		}

		public Builder touchZoom(Boolean touchZoom) {
			this.touchZoom = touchZoom;
			return this;
		}

		public Builder scrollWheelZoom(Boolean scrollWheelZoom) {
			this.scrollWheelZoom = scrollWheelZoom;
			return this;
		}

		public Builder doubleClickZoom(Boolean doubleClickZoom) {
			this.doubleClickZoom = doubleClickZoom;
			return this;
		}

		public Builder boxZoom(Boolean boxZoom) {
			this.boxZoom = boxZoom;
			return this;
		}

		public Builder tap(Boolean tap) {
			this.tap = tap;
			return this;
		}

		public Builder tapTolerance(Number tapTolerance) {
			this.tapTolerance = tapTolerance;
			return this;
		}

		public Builder trackResize(Boolean trackResize) {
			this.trackResize = trackResize;
			return this;
		}

		public Builder worldCopyJump(Boolean worldCopyJump) {
			this.worldCopyJump = worldCopyJump;
			return this;
		}

		public Builder closePopupOnClick(Boolean closePopupOnClick) {
			this.closePopupOnClick = closePopupOnClick;
			return this;
		}

		public Builder keyboard(Boolean keyboard) {
			return this;
		}

		public Builder keyboardPanOffset(Number keyboardPanOffset) {
			this.keyboardPanOffset = keyboardPanOffset;
			return this;
		}

		public Builder keyboardZoomOffset(Number keyboardZoomOffset) {
			this.keyboardZoomOffset = keyboardZoomOffset;
			return this;
		}

		public Builder inertia(Boolean inertia) {
			this.inertia = inertia;
			return this;
		}

		public Builder inertiaDeceleration(Number inertiaDeceleration) {
			this.inertiaDeceleration = inertiaDeceleration;
			return this;
		}

		public Builder inertiaMaxSpeed(Number inertiaMaxSpeed) {
			this.inertiaMaxSpeed = inertiaMaxSpeed;
			return this;
		}

		public Builder inertiaThreshold(Number inertiaThreshold) {
			this.inertiaThreshold = inertiaThreshold;
			return this;
		}

		public Builder zoomControl(Boolean zoomControl) {
			this.zoomControl = zoomControl;
			return this;
		}

		public Builder attributionControl(Boolean attributionControl) {
			this.attributionControl = attributionControl;
			return this;
		}

		public Builder fadeAnimation(Boolean fadeAnimation) {
			this.fadeAnimation = fadeAnimation;
			return this;
		}

		public Builder zoomAnimation(Boolean zoomAnimation) {
			this.zoomAnimation = zoomAnimation;
			return this;
		}

		public Builder zoomAnimationThreshold(Number zoomAnimationThreshold) {
			this.zoomAnimationThreshold = zoomAnimationThreshold;
			return this;
		}

		public Builder markerZoomAnimation(Boolean markerZoomAnimation) {
			this.markerZoomAnimation = markerZoomAnimation;
			return this;
		}

		public MapOptions build() {

			MapOptions options = new MapOptions();
			
			options.center = this.center;
			
			options.zoom = this.zoom;
			
			options.minZoom = this.minZoom;

			options.layers = this.layers;

			options.maxZoom = this.maxZoom;

			options.maxBounds = this.maxBounds;

			options.dragging = this.dragging;

			options.touchZoom = this.touchZoom;

			options.scrollWheelZoom = this.scrollWheelZoom;

			options.doubleClickZoom = this.doubleClickZoom;

			options.boxZoom = this.boxZoom;

			options.tap = this.tap;

			options.tapTolerance = this.tapTolerance;

			options.trackResize = this.trackResize;

			options.worldCopyJump = this.worldCopyJump;

			options.closePopupOnClick = this.closePopupOnClick;

			options.keyboard = this.keyboard;

			options.keyboardPanOffset = this.keyboardPanOffset;

			options.keyboardZoomOffset = this.keyboardPanOffset;

			options.inertia = this.inertia;

			options.inertiaDeceleration = this.inertiaDeceleration;

			options.inertiaMaxSpeed = this.inertiaMaxSpeed;

			options.inertiaThreshold = this.inertiaThreshold;

			options.zoomControl = this.zoomControl;

			options.attributionControl = this.attributionControl;

			options.fadeAnimation = this.fadeAnimation;

			options.zoomAnimation = this.zoomAnimation;

			options.zoomAnimationThreshold = this.zoomAnimationThreshold;

			options.markerZoomAnimation = this.markerZoomAnimation;

			return options;
		}

	}

}