/**
 *  Copyright 2016 G-Widgets
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.ILayer;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.LatLngBounds;

/**
 *  The map options used when creating a Map
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
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
	
	@JsProperty
	private Boolean bounceAtZoomLimits;

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

	/**
	 * Gets the Initial geographical center of the map.
	 * </br>
	 * default null
	 * @return the center
	 */
	@JsOverlay
	public final LatLng getCenter() {
		return this.center;
	}

	/**
	 * Gets Initial map zoom.
	 * </br>
	 * default 0
	 * @return the zoom
	 */
	@JsOverlay
	public final Number getZoom() {
		return this.zoom;
	}

	
    /**
     * Gets the Layers that will be added to the map initially.
     * </br>
     * default null
     * @return the layers
     */
    @JsOverlay public final ILayer[] getLayers() {
		return this.layers;
	}

	/**
	 * Gets Minimum zoom level of the map. Overrides any minZoom set on map layers.
	 * </br>
	 * default 0
	 * @return the min zoom
	 */
	@JsOverlay public final Number getMinZoom() {
		return this.minZoom;
	}

	/**
	 * Gets Maximum zoom level of the map. This overrides any maxZoom set on map layers.
	 * </br>
	 * default 0
	 * @return the max zoom
	 */
	@JsOverlay public final Number getMaxZoom() {
		return this.maxZoom;
	}

	/**
	 * Gets the bounds that restricts the view if the option is set
	 * </br>
	 * 
	 * default null
	 * @return the max bounds
	 */
	@JsOverlay public final LatLngBounds getMaxBounds() {
		return this.maxBounds;
	}

	/**
	 * Gets Whether the map be draggable with mouse/touch or not.
	 * </br>
	 * 
	 * default true
	 * @return the dragging
	 */
	@JsOverlay public final Boolean getDragging() {
		return this.dragging;
	}

	/**
	 * Gets Whether the map can be zoomed by touch-dragging with two fingers.
	 * </br>
	 * 
	 * default true
	 *
	 * @return the touch zoom
	 */
	@JsOverlay public final Boolean getTouchZoom() {
		return this.touchZoom;
	}

	/**
	 * Gets Whether the map can be zoomed by using the mouse wheel. If passed 'center', it will zoom to the center of the view regardless of where the mouse was.
	 * </br>
	 *
	 * default true
	 * @return the scroll wheel zoom
	 */
	@JsOverlay public final Boolean getScrollWheelZoom() {
		return this.scrollWheelZoom;
	}

	/**
	 * Gets Whether the map can be zoomed in by double clicking on it and zoomed out by double clicking while holding shift. If passed 'center', double-click zoom will zoom to the center of the view regardless of where the mouse was.
	 * </br>
	 *
	 * default true
	 * @return the double click zoom
	 */
	@JsOverlay public final Boolean getDoubleClickZoom() {
		return this.doubleClickZoom;
	}

	/**
	 * Gets Whether the map can be zoomed to a rectangular area specified by dragging the mouse while pressing shift.
	 * </br>
	 * default true
	 * @return the box zoom
	 */
	@JsOverlay public final Boolean getBoxZoom() {
		return this.boxZoom;
	}

	/**
	 * Gets  mobile hacks for supporting instant taps (fixing 200ms click delay on iOS/Android) and touch holds (fired as contextmenu events).
	 * </br>
	 * default true
	 * @return the tap
	 */
	@JsOverlay public final Boolean getTap() {
		return this.tap;
	}

	/**
	 * Gets The max number of pixels a user can shift his finger during touch for it to be considered a valid tap.
	 * </br>
	 * default 15
	 *
	 * @return the tap tolerance
	 */
	@JsOverlay public final Number getTapTolerance() {
		return this.tapTolerance;
	}

	/**
	 * Gets Whether the map automatically handles browser window resize to update itself.
	 * </br>
	 * default true
	 * @return the track resize
	 */
	@JsOverlay public final Boolean getTrackResize() {
		return this.trackResize;
	}

	/**
	 * With this option enabled, the map tracks when you pan to another "copy" of the world and seamlessly jumps to the original one so that all overlays like markers and vector layers are still visible.
	 * </br>
	 * default false
	 * @return the world copy jump
	 */
	@JsOverlay public final Boolean getWorldCopyJump() {
		return this.worldCopyJump;
	}

	/**
	 * Gets whether the popups close when user clicks the map.
	 * </br>
	 * default true
	 * @return the close popup on click
	 */
	@JsOverlay public final Boolean getClosePopupOnClick() {
		return this.closePopupOnClick;
	}
	
	/**
	 * Gets whether the map zooms beyond min/max zoom and then bounce back when pinch-zooming.
	 * </br>
	 * default true
	 * @return the close popup on click
	 */
	@JsOverlay public final Boolean getBounceAtZoomLimits() {
		return this.bounceAtZoomLimits;
	}

	/**
	 * Gets whether the map id focusable and allows users to navigate the map with keyboard arrows and +/- keys.
	 *  </br>
	 *  default true
	 * @return the keyboard
	 */
	@JsOverlay public final Boolean getKeyboard() {
		return this.keyboard;
	}

	/**
	 * Gets Amount of pixels to pan when pressing an arrow key.
	 * </br>
	 * default 80
	 *
	 * @return the keyboard pan offset
	 */
	@JsOverlay public final Number getKeyboardPanOffset() {
		return this.keyboardPanOffset;
	}

	/**
	 * Gets the Number of zoom levels to change when pressing + or - key.
	 * </br>
	 * default 1
	 *
	 * @return the keyboard zoom offset
	 */
	@JsOverlay public final Number getKeyboardZoomOffset() {
		return this.keyboardZoomOffset;
	}

	/**
	 * Gets whether the panning of the map will have an inertia effect where the map builds momentum while dragging and continues moving in the same direction for some time. Feels especially nice on touch devices.
	 * </br>
	 * default true
	 * @return the inertia
	 */
	@JsOverlay public final Boolean getInertia() {
		return this.inertia;
	}

	/**
	 * Gets the rate with which the inertial movement slows down, in pixels/second2.
	 * </br>
	 * default 3000
	 * @return the inertia deceleration
	 */
	@JsOverlay public final Number getInertiaDeceleration() {
		return this.inertiaDeceleration;
	}

	/**
	 * Gets the Max speed of the inertial movement, in pixels/second.
	 * </br>
	 * default 1500
	 * @return the inertia max speed
	 */
	@JsOverlay public final Number getInertiaMaxSpeed() {
		return this.inertiaMaxSpeed;
	}

	/**
	 * Gets the Number of milliseconds that should pass between stopping the movement and releasing the mouse or touch to prevent inertial movement. 32 for touch devices and 14 for the rest by default.
	 *  </br>
	 * default 32
	 *
	 * @return the inertia threshold
	 */
	@JsOverlay public final Number getInertiaThreshold() {
		return this.inertiaThreshold;
	}

	/**
	 * Gets Whether the zoom control is added to the map by default.
	 *  </br>
	 *  default true
	 *
	 * @return the zoom control
	 */
	@JsOverlay public final Boolean getZoomControl() {
		return this.zoomControl;
	}

	/**
	 * Gets Whether the attribution control is added to the map by default.
	 * </br>
	 * default true
	 * @return the attribution control
	 */
	@JsOverlay public final Boolean getAttributionControl() {
		return this.attributionControl;
	}

	/**
	 * Gets Whether the tile fade animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
	 * </br>
	 * default true
	 * @return the fade animation
	 */
	@JsOverlay public final Boolean getFadeAnimation() {
		return this.fadeAnimation;
	}

	/**
	 * Gets Whether the tile zoom animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
	 * </br>
	 * 
	 * default true
	 * @return the zoom animation
	 */
	@JsOverlay public final Boolean getZoomAnimation() {
		return this.zoomAnimation;
	}

	/**
	 * Gets the value that will disable zoom animation if exceeded  
	 * </br>
	 * default 4
	 * @return the zoom animation threshold
	 */
	@JsOverlay public final Number getZoomAnimationThreshold() {
		return this.zoomAnimationThreshold;
	}

	/**
	 * Gets Whether markers animate their zoom with the zoom animation, if disabled they will disappear for the length of the animation. By default it's enabled in all browsers that support CSS3 Transitions except Android.
	 * </br>
	 * default true
	 * @return the marker zoom animation
	 */
	@JsOverlay public final Boolean getMarkerZoomAnimation() {
		return this.markerZoomAnimation;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {


		LatLng center = null;


		Number zoom = 0;


		Number minZoom = 0;

		/**
		 * Instantiates a new MapOtions builder.
		 *
		 * @param center Initial geographical center of the map. 
		 * @param zoom Initial map zoom.
		 * @param minZoom Minimum zoom level of the map. Overrides any minZoom set on map layers.
		 */
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
		
		Boolean bounceAtZoomLimits = true;

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

		/**
		 * Layers that will be added to the map initially.
		 *  default null
		 *
		 * @param layers the Layers that will be added to the map initially.
		 * @return the builder
		 */
		public Builder layers(ILayer[] layers) {
			this.layers = layers;
			return this;
		}

		/**
		 * Maximum zoom level of the map. This overrides any maxZoom set on map layers.
		 *
		 *default 0
		 * @param maxZoom the max zoom
		 * @return the builder
		 */
		public Builder maxZoom(Number maxZoom) {
			this.maxZoom = maxZoom;
			return this;
		}

		/**
		 * When this option is set, the map restricts the view to the given geographical bounds, bouncing the user back when he tries to pan outside the view. To set the restriction dynamically, use setMaxBounds method.
		 *
		 * @param maxBounds the max bounds
		 * @return the builder
		 */
		public Builder maxBounds(LatLngBounds maxBounds) {
			this.maxBounds = maxBounds;
			return this;
		}

		/**
		 * Whether the map is draggable with mouse/touch or not.
		 *
		 * default null
		 * @param dragging true or flase
		 * @return the builder
		 */
		public Builder dragging(Boolean dragging) {
			this.dragging = dragging;
			return this;
		}

		/**
		 * Whether the map can be zoomed by touch-dragging with two fingers.
		 *
		 *default true
		 * @param touchZoom true or false
		 * @return the builder
		 */
		public Builder touchZoom(Boolean touchZoom) {
			this.touchZoom = touchZoom;
			return this;
		}

		/**
		 * Whether the map can be zoomed by using the mouse wheel. If passed 'center', it will zoom to the center of the view regardless of where the mouse was.
		 *
		 * default true
		 * @param scrollWheelZoom true or false
		 * @return the builder
		 */
		public Builder scrollWheelZoom(Boolean scrollWheelZoom) {
			this.scrollWheelZoom = scrollWheelZoom;
			return this;
		}

		/**
		 * Whether the map can be zoomed in by double clicking on it and zoomed out by double clicking while holding shift. If passed 'center', double-click zoom will zoom to the center of the view regardless of where the mouse was.
		 *
		 * default true
		 * @param doubleClickZoom true or false
		 * @return the builder
		 */
		public Builder doubleClickZoom(Boolean doubleClickZoom) {
			this.doubleClickZoom = doubleClickZoom;
			return this;
		}

		/**
		 * Whether the map can be zoomed to a rectangular area specified by dragging the mouse while pressing shift.
		 *
		 * default true
		 * @param boxZoom true or false
		 * @return the builder
		 */
		public Builder boxZoom(Boolean boxZoom) {
			this.boxZoom = boxZoom;
			return this;
		}

		/**
		 * Enables mobile hacks for supporting instant taps (fixing 200ms click delay on iOS/Android) and touch holds (fired as contextmenu events).
		 *
		 * default true
		 * @param tap true or false
		 * @return the builder
		 */
		public Builder tap(Boolean tap) {
			this.tap = tap;
			return this;
		}

		/**
		 * The max number of pixels a user can shift his finger during touch for it to be considered a valid tap.
		 * default 15
		 * @param tapTolerance the tap tolerance number
		 * @return the builder
		 */
		public Builder tapTolerance(Number tapTolerance) {
			this.tapTolerance = tapTolerance;
			return this;
		}

		/**
		 * Whether the map automatically handles browser window resize to update itself.
		 *
		 * default true
		 * @param trackResize true or false
		 * @return the builder
		 */
		public Builder trackResize(Boolean trackResize) {
			this.trackResize = trackResize;
			return this;
		}

		/**
		 * With this option enabled, the map tracks when you pan to another "copy" of the world and seamlessly jumps to the original one so that all overlays like markers and vector layers are still visible.
		 *
		 * default false
		 * @param worldCopyJump true or false
		 * @return the builder
		 */
		public Builder worldCopyJump(Boolean worldCopyJump) {
			this.worldCopyJump = worldCopyJump;
			return this;
		}

		/**
		 * Set it to false if you don't want popups to close when user clicks the map.
		 *
		 * default true
		 * @param closePopupOnClick true or false
		 * @return the builder
		 */
		public Builder closePopupOnClick(Boolean closePopupOnClick) {
			this.closePopupOnClick = closePopupOnClick;
			return this;
		}
		
		/**
		 * Set it to false if you don't want the map to zoom beyond min/max zoom and then bounce back when pinch-zooming.
		 *
		 * default true
		 * @param closePopupOnClick true or false
		 * @return the builder
		 */
		public Builder bounceAtZoomLimits(Boolean bounceAtZoomLimits) {
			this.bounceAtZoomLimits = bounceAtZoomLimits;
			return this;
		}


		/**
		 * Makes the map focusable and allows users to navigate the map with keyboard arrows and +/- keys.
		 *
		 * default true
		 * @param keyboard true or false
		 * @return the builder
		 */
		public Builder keyboard(Boolean keyboard) {
			return this;
		}

		/**
		 * Amount of pixels to pan when pressing an arrow key.
		 *
		 * default 80
		 * @param keyboardPanOffset the keyboard pan offset
		 * @return the builder
		 */
		public Builder keyboardPanOffset(Number keyboardPanOffset) {
			this.keyboardPanOffset = keyboardPanOffset;
			return this;
		}

		/**
		 * Number of zoom levels to change when pressing + or - key.
		 *
		 * default 1
		 * @param keyboardZoomOffset the keyboard zoom offset
		 * @return the builder
		 */
		public Builder keyboardZoomOffset(Number keyboardZoomOffset) {
			this.keyboardZoomOffset = keyboardZoomOffset;
			return this;
		}

		/**
		 * If enabled, panning of the map will have an inertia effect where the map builds momentum while dragging and continues moving in the same direction for some time. Feels especially nice on touch devices.
		 *
		 * default true
		 * @param inertia true or false
		 * @return the builder
		 */
		public Builder inertia(Boolean inertia) {
			this.inertia = inertia;
			return this;
		}

		/**
		 * The rate with which the inertial movement slows down, in pixels/second2.
		 * default 3000
		 *
		 * @param inertiaDeceleration the inertia deceleration
		 * @return the builder
		 */
		public Builder inertiaDeceleration(Number inertiaDeceleration) {
			this.inertiaDeceleration = inertiaDeceleration;
			return this;
		}

		/**
		 * Max speed of the inertial movement, in pixels/second.
		 *
		 * default 1500
		 * @param inertiaMaxSpeed the inertia max speed
		 * @return the builder
		 */
		public Builder inertiaMaxSpeed(Number inertiaMaxSpeed) {
			this.inertiaMaxSpeed = inertiaMaxSpeed;
			return this;
		}

		/**
		 * Number of milliseconds that should pass between stopping the movement and releasing the mouse or touch to prevent inertial movement. 32 for touch devices and 14 for the rest by default.
		 *
		 * default 32
		 * @param inertiaThreshold the inertia threshold
		 * @return the builder
		 */
		public Builder inertiaThreshold(Number inertiaThreshold) {
			this.inertiaThreshold = inertiaThreshold;
			return this;
		}

		/**
		 * Whether the zoom control is added to the map by default.
		 *
		 * default true
		 * @param zoomControl true or false
		 * @return the builder
		 */
		public Builder zoomControl(Boolean zoomControl) {
			this.zoomControl = zoomControl;
			return this;
		}

		/**
		 * Whether the attribution control is added to the map by default.
		 *
		 * default true
		 * @param attributionControl true or false
		 * @return the builder
		 */
		public Builder attributionControl(Boolean attributionControl) {
			this.attributionControl = attributionControl;
			return this;
		}

		/**
		 * Whether the tile fade animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
		 *
		 * default true
		 * @param fadeAnimation true or false
		 * @return the builder
		 */
		public Builder fadeAnimation(Boolean fadeAnimation) {
			this.fadeAnimation = fadeAnimation;
			return this;
		}

		/**
		 * Whether the tile zoom animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
		 *
		 * default true
		 * @param zoomAnimation the zoom animation
		 * @return the builder
		 */
		public Builder zoomAnimation(Boolean zoomAnimation) {
			this.zoomAnimation = zoomAnimation;
			return this;
		}

		/**
		 * Won't animate zoom if the zoom difference exceeds this value.
		 *
		 * default 4
		 * @param zoomAnimationThreshold the zoom animation threshold
		 * @return the builder
		 */
		public Builder zoomAnimationThreshold(Number zoomAnimationThreshold) {
			this.zoomAnimationThreshold = zoomAnimationThreshold;
			return this;
		}

		/**
		 * Whether markers animate their zoom with the zoom animation, if disabled they will disappear for the length of the animation. By default it's enabled in all browsers that support CSS3 Transitions except Android.
		 *
		 * default true
		 * @param markerZoomAnimation true or false
		 * @return the builder
		 */
		public Builder markerZoomAnimation(Boolean markerZoomAnimation) {
			this.markerZoomAnimation = markerZoomAnimation;
			return this;
		}

		/**
		 * Builds the options
		 *
		 * @return the map options instance
		 */
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
			
			options.bounceAtZoomLimits = this.bounceAtZoomLimits;

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