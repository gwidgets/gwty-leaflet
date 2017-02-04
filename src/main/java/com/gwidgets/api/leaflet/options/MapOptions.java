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

import com.gwidgets.api.leaflet.Layer;
import com.gwidgets.api.leaflet.Renderer;
import com.gwidgets.api.leaflet.CRS;
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
	
	
	/*****************************************
	********************************************/
	
	@JsProperty
	private Boolean preferCanvas;
	
	/**********************************************
	*********************************************/


	// Map State Options
	@JsProperty
	private LatLng center;
	
	@JsProperty
	private double zoom;
	
	@JsProperty
	private Layer[] layers;
	
	@JsProperty
	private double minZoom;
	
	@JsProperty
	private double maxZoom;
	
	@JsProperty
	private LatLngBounds maxBounds;
	
	/*****************************************
	********************************************/
	@JsProperty
     private Renderer renderer;
	/**********************************************
	*********************************************/
	@JsProperty
	private CRS crs;

	// Interaction Options
	@JsProperty
	private Boolean dragging;
	
	@JsProperty
	private Boolean touchZoom;
	
	@JsProperty
	private Boolean scrollWheelZoom;
	
	/*****************************************
	********************************************/
	@JsProperty
     private double wheelDebounceTime;
	/**********************************************
	*********************************************/
	
	/*****************************************
	********************************************/
	@JsProperty
     private double wheelPxPerZoomLevel;
	/**********************************************
	*********************************************/
	
	@JsProperty
	private Boolean doubleClickZoom;
	
	@JsProperty
	private Boolean boxZoom;
	
	@JsProperty
	private Boolean tap;
	
	@JsProperty
	private double tapTolerance;
	
	@JsProperty
	private Boolean trackResize;
	
	
	
	@JsProperty
	private Boolean closePopupOnClick;
	
	@JsProperty
	private Boolean bounceAtZoomLimits;
	
	/*****************************************
	********************************************/
	 @JsProperty
     private double zoomSnap;
	/**********************************************
	*********************************************/
	
	/*****************************************
	********************************************/
	  @JsProperty
      private double zoomDelta; 
	/**********************************************
	*********************************************/
	

	// Keyboard Navigation Options
	@JsProperty
	private Boolean keyboard;
	
	@JsProperty
	private double keyboardPanDelta;
	

	// Panning Inertia Options
	@JsProperty
	private Boolean inertia;
	
	@JsProperty
	private double inertiaDeceleration;
	
	@JsProperty
	private double inertiaMaxSpeed;
	
	
	@JsProperty
	private Boolean worldCopyJump;
	
	/*****************************************
	********************************************/
	   @JsProperty
       private double maxBoundsViscosity;
	/**********************************************
	*********************************************/

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
	private double zoomAnimationThreshold;
	
	@JsProperty
	private Boolean markerZoomAnimation;
	
	/*****************************************
	********************************************/
	@JsProperty
    private double transform3DLimit;
	/**********************************************
	*********************************************/
	


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
	public final double getZoom() {
		return this.zoom;
	}

	
    /**
     * Gets the Layers that will be added to the map initially.
     * </br>
     * default null
     * @return the layers
     */
    @JsOverlay public final Layer[] getLayers() {
		return this.layers;
	}

	/**
	 * Gets Minimum zoom level of the map. Overrides any minZoom set on map layers.
	 * </br>
	 * default 0
	 * @return the min zoom
	 */
	@JsOverlay public final double getMinZoom() {
		return this.minZoom;
	}

	/**
	 * Gets Maximum zoom level of the map. This overrides any maxZoom set on map layers.
	 * </br>
	 * default 0
	 * @return the max zoom
	 */
	@JsOverlay public final double getMaxZoom() {
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
	@JsOverlay public final double getTapTolerance() {
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
	@JsOverlay public final double getKeyboardPanOffset() {
		return this.keyboardPanDelta;
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
	@JsOverlay public final double getInertiaDeceleration() {
		return this.inertiaDeceleration;
	}

	/**
	 * Gets the Max speed of the inertial movement, in pixels/second.
	 * </br>
	 * default 1500
	 * @return the inertia max speed
	 */
	@JsOverlay public final double getInertiaMaxSpeed() {
		return this.inertiaMaxSpeed;
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
	@JsOverlay public final double getZoomAnimationThreshold() {
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

	@JsOverlay public final Boolean getPreferCanvas() {
		return this.preferCanvas;
	}

	@JsOverlay public final Renderer getRenderer() {
		return this.renderer;
	}

	@JsOverlay public final double getKeyboardPanDelta() {
		return this.keyboardPanDelta;
	}

	@JsOverlay public final double getWheelDebounceTime() {
		return this.wheelDebounceTime;
	}

	@JsOverlay public final double getWheelPxPerZoomLevel() {
		return this.wheelPxPerZoomLevel;
	}

	@JsOverlay public final double getZoomSnap() {
		return this.zoomSnap;
	}

	@JsOverlay public final double getZoomDelta() {
		return this.zoomDelta;
	}

	@JsOverlay public final double getMaxBoundsViscosity() {
		return this.maxBoundsViscosity;
	}

	@JsOverlay public final double getTransform3DLimit() {
		return this.transform3DLimit;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {


		LatLng center = null;


		double zoom = 0;


		double minZoom = 0;

		/**
		 * Instantiates a new MapOtions builder.
		 *
		 * @param center Initial geographical center of the map. 
		 * @param zoom Initial map zoom.
		 * @param minZoom Minimum zoom level of the map. Overrides any minZoom set on map layers.
		 */
		public Builder(LatLng center, double zoom, double minZoom) {
			this.center = center;
			this.zoom = zoom;
			this.minZoom = minZoom;

		}

		
		Layer[] layers = null;

		double maxZoom = 0;

		LatLngBounds maxBounds = null;

		Boolean dragging = true;

		Boolean touchZoom = true;

		Boolean scrollWheelZoom = true;

		Boolean doubleClickZoom = true;

		Boolean boxZoom = true;

		Boolean tap = true;

		double tapTolerance = 15;

		Boolean trackResize = true;

		Boolean worldCopyJump = false;

		Boolean closePopupOnClick = true;
		
		Boolean bounceAtZoomLimits = true;

		Boolean keyboard = true;

		double keyboardPanDelta = 80;


		Boolean inertia = true;

		double inertiaDeceleration = 3000;

		double inertiaMaxSpeed = 1500;

		double inertiaThreshold = 32;

		Boolean zoomControl = true;

		Boolean attributionControl = true;

		Boolean fadeAnimation = true;

		Boolean zoomAnimation = true;

		double zoomAnimationThreshold = 4;

		Boolean markerZoomAnimation = true;
		
		Boolean preferCanvas = false;
		
	    Renderer renderer;

	    double wheelDebounceTime = 40;

	    double wheelPxPerZoomLevel = 60;

	    double zoomSnap = 1;

	    double zoomDelta = 1; 

	    double maxBoundsViscosity = 0.0;

	    double transform3DLimit = Math.pow(2, 23);

		/**
		 * Layers that will be added to the map initially.
		 *  default null
		 *
		 * @param layers the Layers that will be added to the map initially.
		 * @return the builder
		 */
		public Builder layers(Layer[] layers) {
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
		public Builder maxZoom(double maxZoom) {
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
		public Builder tapTolerance(double tapTolerance) {
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
		public Builder keyboardPanDelta(double keyboardPanDelta) {
			this.keyboardPanDelta = keyboardPanDelta;
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
		public Builder inertiaDeceleration(double inertiaDeceleration) {
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
		public Builder inertiaMaxSpeed(double inertiaMaxSpeed) {
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
		public Builder inertiaThreshold(double inertiaThreshold) {
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
		public Builder zoomAnimationThreshold(double zoomAnimationThreshold) {
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
		 * Whether Paths should be rendered on a Canvas renderer. By default, all Paths are rendered in a  SVG renderer.
		 *
		 * @param preferCanvas
		 * @return the builder
		 */
		public Builder preferCanvas(Boolean preferCanvas) {
			this.preferCanvas = preferCanvas;
			return this;
		}

		/**
		 * The default method for drawing vector layers on the map. L.SVG or L.Canvas by default depending on browser support.
		 *
		 * @param renderer
		 * @return the builder
		 */
		public Builder renderer(Renderer renderer) {
			this.renderer = renderer;
			return this;
		}

		/**
		 * Limits the rate at which a wheel can fire (in milliseconds). By default user can't zoom via wheel more often than once per 40 ms.
		 *
		 * @param wheelDebounceTime
		 * @return the builder
		 */
		public Builder wheelDebounceTime(double wheelDebounceTime) {
			this.wheelDebounceTime = wheelDebounceTime;
			return this;
		}

		/**
		 * How many scroll pixels (as reported by L.DomEvent.getWheelDelta) mean a change of one full zoom level. Smaller values will make wheel-zooming faster (and vice versa).
		 *
		 * @param wheelPxPerZoomLevel
		 * @return the builder
		 */
		public Builder wheelPxPerZoomLevel(double wheelPxPerZoomLevel) {
			this.wheelPxPerZoomLevel = wheelPxPerZoomLevel;
			return this;
		}

		/**
		 * Forces the map's zoom level to always be a multiple of this, particularly right after a fitBounds() or a pinch-zoom. By default, the zoom level snaps to the nearest integer; lower values (e.g. 0.5 or 0.1) allow for greater granularity. A value of 0 means the zoom level will not be snapped after fitBounds or a pinch-zoom.
		 *
		 * @param zoomSnap
		 * @return the builder
		 */
		public Builder zoomSnap(double zoomSnap) {
			this.zoomSnap = zoomSnap;
			return this;
		}

		/**
		 * Controls how much the map's zoom level will change after a zoomIn(), zoomOut(), pressing + or - on the keyboard, or using the zoom controls. Values smaller than 1 (e.g. 0.5) allow for greater granularity.
		 *
		 * @param zoomDelta 
		 * @return the builder
		 */
		public Builder zoomDelta(double zoomDelta) {
			this.zoomDelta = zoomDelta;
			return this;
		}

		/**
		 * If maxBounds is set, this option will control how solid the bounds are when dragging the map around. The default value of 0.0 allows the user to drag outside the bounds at normal speed, higher values will slow down map dragging outside bounds, and 1.0 makes the bounds fully solid, preventing the user from dragging outside the bounds.
		 *
		 * @param maxBoundsViscosity 
		 * @return the builder
		 */
		public Builder maxBoundsViscosity(double maxBoundsViscosity) {
			this.maxBoundsViscosity = maxBoundsViscosity;
			return this;
		}

		/**
		 * Defines the maximum size of a CSS translation transform. The default value should not be changed unless a web browser positions layers in the wrong place after doing a large panBy.
		 *
		 * @param transform3DLimit 
		 * @return the builder
		 */
		public Builder transform3DLimit(double transform3DLimit) {
			this.transform3DLimit = transform3DLimit;
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

			options.keyboardPanDelta = this.keyboardPanDelta;

			options.inertia = this.inertia;

			options.inertiaDeceleration = this.inertiaDeceleration;

			options.inertiaMaxSpeed = this.inertiaMaxSpeed;

			options.zoomControl = this.zoomControl;

			options.attributionControl = this.attributionControl;

			options.fadeAnimation = this.fadeAnimation;

			options.zoomAnimation = this.zoomAnimation;

			options.zoomAnimationThreshold = this.zoomAnimationThreshold;

			options.markerZoomAnimation = this.markerZoomAnimation;
			
			 options.preferCanvas = this.preferCanvas;
				
		     options.renderer = this.renderer;

		     options.wheelDebounceTime = this.wheelDebounceTime;

		     options.wheelPxPerZoomLevel = this.wheelPxPerZoomLevel;

		     options.zoomSnap = this.zoomSnap;

		     options.zoomDelta = this.zoomDelta; 

		    options.maxBoundsViscosity = this.maxBoundsViscosity;

		    options.transform3DLimit = this.transform3DLimit;

			return options;
		}
		
		

	}

}