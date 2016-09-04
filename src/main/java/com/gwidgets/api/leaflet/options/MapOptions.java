package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.ILayer;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.LatLngBounds;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class MapOptions {

	private MapOptions() {

	}

	// Map State Options
	@JsProperty
	private LatLng center;
	@JsProperty
	private Number zoom;
	@JsProperty
	private ILayer[] layers;
	@JsProperty
	private Number minZoom;
	@JsProperty
	private Number maxZoom;
	@JsProperty
	private LatLngBounds maxBounds;
	// @JsProperty
	// CRS crs = L.CRS.EPSG3857;

	// Interaction Options
	@JsProperty
	private Boolean dragging;
	@JsProperty
	private Boolean touchZoom;
	@JsProperty
	private Boolean scrollWheelZoom;
	@JsProperty
	private Boolean doubleClickZoom;
	@JsProperty
	private Boolean boxZoom;
	@JsProperty
	private Boolean tap;
	@JsProperty
	private Number tapTolerance;
	@JsProperty
	private Boolean trackResize;
	@JsProperty
	private Boolean worldCopyJump;
	@JsProperty
	private Boolean closePopupOnClick;

	// Keyboard Navigation Options
	@JsProperty
	private Boolean keyboard;
	@JsProperty
	private Number keyboardPanOffset;
	@JsProperty
	private Number keyboardZoomOffset;

	// Panning Inertia Options
	@JsProperty
	private Boolean inertia;
	@JsProperty
	private Number inertiaDeceleration;
	@JsProperty
	private Number inertiaMaxSpeed;
	@JsProperty
	private Number inertiaThreshold;

	// Control options
	@JsProperty
	private Boolean zoomControl;
	@JsProperty
	private Boolean attributionControl;

	// Animation options
	@JsProperty
	private Boolean fadeAnimation;
	@JsProperty
	private Boolean zoomAnimation;
	@JsProperty
	private Number zoomAnimationThreshold;
	@JsProperty
	private Boolean markerZoomAnimation;

	@JsOverlay
	public final LatLng getCenter() {
		return this.center;
	}

	@JsOverlay
	public final Number getZoom() {
		return this.zoom;
	}

	
    @JsOverlay public final ILayer[] getLayers() {
		return this.layers;
	}

	@JsOverlay public final Number getMinZoom() {
		return this.minZoom;
	}

	@JsOverlay public final Number getMaxZoom() {
		return this.maxZoom;
	}

	@JsOverlay public final LatLngBounds getMaxBounds() {
		return this.maxBounds;
	}

	@JsOverlay public final Boolean getDragging() {
		return this.dragging;
	}

	@JsOverlay public final Boolean getTouchZoom() {
		return this.touchZoom;
	}

	@JsOverlay public final Boolean getScrollWheelZoom() {
		return this.scrollWheelZoom;
	}

	@JsOverlay public final Boolean getDoubleClickZoom() {
		return this.doubleClickZoom;
	}

	@JsOverlay public final Boolean getBoxZoom() {
		return this.boxZoom;
	}

	@JsOverlay public final Boolean getTap() {
		return this.tap;
	}

	@JsOverlay public final Number getTapTolerance() {
		return this.tapTolerance;
	}

	@JsOverlay public final Boolean getTrackResize() {
		return this.trackResize;
	}

	@JsOverlay public final Boolean getWorldCopyJump() {
		return this.worldCopyJump;
	}

	@JsOverlay public final Boolean getClosePopupOnClick() {
		return this.closePopupOnClick;
	}

	@JsOverlay public final Boolean getKeyboard() {
		return this.keyboard;
	}

	@JsOverlay public final Number getKeyboardPanOffset() {
		return this.keyboardPanOffset;
	}

	@JsOverlay public final Number getKeyboardZoomOffset() {
		return this.keyboardZoomOffset;
	}

	@JsOverlay public final Boolean getInertia() {
		return this.inertia;
	}

	@JsOverlay public final Number getInertiaDeceleration() {
		return this.inertiaDeceleration;
	}

	@JsOverlay public final Number getInertiaMaxSpeed() {
		return this.inertiaMaxSpeed;
	}

	@JsOverlay public final Number getInertiaThreshold() {
		return this.inertiaThreshold;
	}

	@JsOverlay public final Boolean getZoomControl() {
		return this.zoomControl;
	}

	@JsOverlay public final Boolean getAttributionControl() {
		return this.attributionControl;
	}

	@JsOverlay public final Boolean getFadeAnimation() {
		return this.fadeAnimation;
	}

	@JsOverlay public final Boolean getZoomAnimation() {
		return this.zoomAnimation;
	}

	@JsOverlay public final Number getZoomAnimationThreshold() {
		return this.zoomAnimationThreshold;
	}

	@JsOverlay public final Boolean getMarkerZoomAnimation() {
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
		
		public static class Properties{
			
			
		}

	}

}