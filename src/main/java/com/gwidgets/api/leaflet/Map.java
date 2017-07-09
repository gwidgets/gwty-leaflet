package com.gwidgets.api.leaflet;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.events.EventCallback;
import com.gwidgets.api.leaflet.events.MouseEvent;
import com.gwidgets.api.leaflet.options.FitBoundsOptions;
import com.gwidgets.api.leaflet.options.LocateOptions;
import com.gwidgets.api.leaflet.options.PanOptions;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.ZoomOptions;
import com.gwidgets.api.leaflet.options.ZoomPanOptions;

import elemental2.core.Function;
import elemental2.dom.HTMLElement;
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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


// TODO: Auto-generated Javadoc
/**
 * The central class of the API. it is used to create a map on a page and manipulate it.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class Map implements Evented {
	
	
	
		private Map() {
		
	   }


		/** Box (shift-drag with mouse) zoom handler.
		 */
		@JsProperty
		public Handler boxZoom; 		
		
		/** Double click zoom handler.
			 */
		@JsProperty
		public Handler doubleClickZoom;	
		
		/** Map dragging handler (by both mouse and touch).
			 */
		@JsProperty
		public Handler dragging;	
		
		/** Keyboard navigation handler.
			 */
		@JsProperty
		public Handler keyboard;		
		
		/** Scroll wheel zoom handler.
			 */
		@JsProperty
		public Handler scrollWheelZoom;		
		
		/** Mobile touch hacks (quick tap and touch hold) handler.
			 */
		@JsProperty
		public Handler tap;		
		
		/** Touch zoom handler.
			 */
		@JsProperty
		public Handler touchZoom; 

	// Methods for Modifying Map State

	/**
	 * Sets the view of the map (geographical center and zoom) with the given animation options.
	 *
	 * @param center the center
	 * @param zoom the zoom
	 * @param options the map options
	 * @return the L class
	 */
	
	@JsMethod
	public native L setView(LatLng center, double zoom, ZoomPanOptions options);
	

	/**
	 * Sets the zoom of the map.
	 *
	 * @param zoom the zoom
	 * @param options the zoom options
	 * @return the L class
	 */
	@JsMethod
	public native L setZoom(double zoom, ZoomOptions options);

	/**
	 * Increases the zoom of the map by delta (1 by default).
	 *
	 * @param delta the delta
	 * @param options the zoom options
	 * @return the L class
	 */
	@JsMethod
	public native L zoomIn(Double delta, ZoomOptions options);
	

	/**
	 * Decreases the zoom of the map by delta (1 by default).
	 *
	 * @param delta the delta
	 * @param options the zoom options
	 * @return the L class
	 */
	@JsMethod
	public native L zoomOut(Double delta, ZoomOptions options);

	/**
	 * Zooms the map while keeping a specified point on the map stationary (e.g. used internally for scroll zoom and double-click zoom).
	 *
	 * @param latlng the latlng
	 * @param zoom the zoom
	 * @param options the zoom options
	 * @return the L class
	 */
	@JsMethod
	public native L setZoomAround(LatLng latlng, double zoom,
			ZoomOptions options);

	/**
	 * Sets a map view that contains the given geographical bounds with the maximum zoom level possible.
	 *
	 * @param bounds the bounds
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L fitBounds(LatLngBounds bounds, FitBoundsOptions options);

	/**
	 * Sets a map view that mostly contains the whole world with the maximum zoom level possible.
	 *
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L fitWorld(FitBoundsOptions options);

	/**
	 * Pans the map to a given center. Makes an animated pan if new center is not more than one screen away from the current one.
	 *
	 * @param latlng the latlng
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L panTo(LatLng latlng, PanOptions options);

	/**
	 * Pans the map to the closest view that would lie inside the given bounds (if it's not already), controlling the animation using the options specific, if any.
	 *
	 * @param bounds the bounds
	 * @return the L class
	 */
	@JsMethod
	public native L panInsideBounds(LatLngBounds bounds);

	/**
	 * Pans the map by a given number of pixels (animated).
	 *
	 * @param point the point
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L panBy(Point point, PanOptions options);

	/**
	 * Checks if the map container size changed and updates the map if so — call it after you've changed the map size dynamically, also animating pan by default.
	 *
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L invalidateSize(Boolean options);
	
	/**
	 * Checks if the map container size changed and updates the map if so — call it after you've changed the map size dynamically, also animating pan by default. If options.pan is false, panning will not occur. If options.debounceMoveend is true, it will delay moveend event so that it doesn't happen often even if the method is called many times in a row.
	 *
	 * @param options2 the options 2
	 * @return the L class
	 */
	@JsMethod
	public native L invalidateSize(ZoomPanOptions options2);

	/**
	 * Restricts the map view to the given bounds .
	 *
	 * @param bounds the bounds
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L setMaxBounds(LatLngBounds bounds, ZoomPanOptions options);

	/**
	 * Tries to locate the user using the Geolocation API, firing a locationfound event with location data on success or a locationerror event on failure, and optionally sets the map view to the user's location with respect to detection accuracy (or to the world view if geolocation failed). 
	 *
	 * @param options the locateOptions
	 * @return the l
	 */
	@JsMethod
	public native L locate(LocateOptions options);

	/**
	 *Stops watching location previously initiated by map.locate({watch: true}) and aborts resetting the map view if map.locate was called with {setView: true}.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L stopLocate();

	/**
	 * Destroys the map and clears all related event listeners.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L remove();

	
	// Methods for Getting Map State
	/**
	 * Returns the geographical center of the map view.
	 *
	 * @return the center
	 */
	
	@JsMethod
	public native LatLng getCenter();

	/**
	 * Returns the current zoom of the map view.
	 *
	 * @return the zoom
	 */
	@JsMethod
	public native Double getZoom();

	/**
	 * Returns the minimum zoom level of the map.
	 *
	 * @return the min zoom
	 */
	@JsMethod
	public native Double getMinZoom();

	/**
	 * Returns the maximum zoom level of the map.
	 *
	 * @return the max zoom
	 */
	@JsMethod
	public native Double getMaxZoom();

	/**
	 * Returns the LatLngBounds of the current map view.
	 *
	 * @return the bounds
	 */
	@JsMethod
	public native LatLngBounds getBounds();

	/**
	 * Returns the maximum zoom level on which the given bounds fit to the map view in its entirety. If inside (optional) is set to true, the method instead returns the minimum zoom level on which the map view fits into the given bounds in its entirety.
	 *
	 * @param bounds the bounds
	 * @param inside the inside
	 * @return the bounds zoom
	 */
	@JsMethod
	public native double getBoundsZoom(LatLngBounds bounds, Boolean inside);

	/**
	 * Returns the current size of the map container.
	 *
	 * @return the size
	 */
	@JsMethod
	public native Point getSize();

	/**
	 * Returns the bounds of the current map view in projected pixel coordinates (sometimes useful in layer and overlay implementations).
	 *
	 * @return the pixel bounds
	 */
	@JsMethod
	public native Bounds getPixelBounds();

	/**
	 * Returns the projected pixel coordinates of the top left point of the map layer (useful in custom layer and overlay implementations).
	 *
	 * @return the pixel origin
	 */
	@JsMethod
	public native Point getPixelOrigin();

	// Methods for Layers and Controls
	/**
	 * Adds the given layer to the map.
	 *
	 * @param layer the layer
	 * @param insertAtTheBottom the insert at the bottom flag
	 * @return the L class
	 */
	
	@JsMethod
	public native L addLayer(Layer layer, Boolean insertAtTheBottom);

	/**
	 * Removes the given layer from the map.
	 *
	 * @param layer the layer
	 * @return the L class
	 */
	@JsMethod
	public native L removeLayer(Layer layer);

	/**
	 * Returns true if the given layer is currently added to the map.
	 *
	 * @param layer the layer
	 * @return true/false
	 */
	@JsMethod
	public native Boolean hasLayer(Layer layer);
	
	
	
	/**
	 * Iterates over the layers of the map, optionally specifying context of the iterator function.
	 *
	 * @param action the action function
	 * @param context the context
	 * @return true/false
	 */
	@JsMethod
	public native Boolean eachLayer(Function action, JavaScriptObject context);

	/**
	 * Opens the specified popup while closing the previously opened (to make sure only one is opened at one time for usability).
	 *
	 * @param popup the popup
	 * @return the L class
	 */
	@JsMethod
	public native L openPopup(Popup popup);

	/**
	 * Creates a popup with the specified options and opens it in the given point on a map.
	 *
	 * @param html the html
	 * @param latlng the latlng
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L openPopup(String html, LatLng latlng, PopupOptions options);

	/**
	 * Creates a popup with the specified options and opens it in the given point on a map.
	 *
	 * @param el the el
	 * @param latlng the latlng
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L openPopup(HTMLElement el, LatLng latlng,
			PopupOptions options);

	/**
	 * Closes the popup previously opened with openPopup 
	 *
	 * @param popup the popup
	 * @return the L class
	 */
	@JsMethod
	public native L closePopup(Popup popup);

	/**
	 * Adds the given control to the map.
	 *
	 * @param control the control
	 * @return the L class
	 */
	@JsMethod
	public native L addControl(Control control);

	/**
	 * Removes the given control from the map.
	 *
	 * @param control the control
	 * @return the L class
	 */
	@JsMethod
	public native L removeControl(Control control);

	
	// Conversion Methods
	/**
	 * Returns the map layer point that corresponds to the given geographical coordinates (useful for placing overlays on the map).
	 *
	 * @param latlng the latlng
	 * @return the point
	 */
	
	@JsMethod
	public native Point latLngToLayerPoint(LatLng latlng);

	/**
	 * Returns the geographical coordinates of a given map layer point.
	 *
	 * @param point the point
	 * @return the lat lng
	 */
	@JsMethod
	public native LatLng layerPointToLatLng(Point point);

	/**
	 * Converts the point relative to the map container to a point relative to the map layer.
	 *
	 * @param point the point
	 * @return the point
	 */
	@JsMethod
	public native Point containerPointToLayerPoint(Point point);

	/**
	 * Converts the point relative to the map layer to a point relative to the map container.
	 *
	 * @param point the point
	 * @return the point
	 */
	@JsMethod
	public native Point layerPointToContainerPoint(Point point);

	/**
	 * Returns the map container point that corresponds to the given geographical coordinates.
	 *
	 * @param latlng the latlng
	 * @return the point
	 */
	@JsMethod
	public native Point latLngToContainerPoint(LatLng latlng);

	/**
	 * Returns the geographical coordinates of a given map container point.
	 *
	 * @param point the point
	 * @return the lat lng
	 */
	@JsMethod
	public native LatLng containerPointToLatLng(Point point);

	/**
	 * Projects the given geographical coordinates to absolute pixel coordinates for the given zoom level (current zoom level by default).
	 *
	 * @param latlng the latlng
	 * @param zoom the zoom
	 * @return the point
	 */
	@JsMethod
	public native Point project(LatLng latlng, double zoom);

	/**
	 * Projects the given absolute pixel coordinates to geographical coordinates for the given zoom level (current zoom level by default).
	 *
	 * @param point the point
	 * @param zoom the zoom
	 * @return the lat lng
	 */
	@JsMethod
	public native LatLng unproject(Point point, double zoom);

	/**
	 * Returns the pixel coordinates of a mouse click (relative to the top left corner of the map) given its event object.
	 *
	 * @param event the event
	 * @return the point
	 */
	@JsMethod
	public native Point mouseEventToContainerPoint(MouseEvent event);

	/**
	 * Returns the pixel coordinates of a mouse click relative to the map layer given its event object.
	 *
	 * @param event the event
	 * @return the point
	 */
	@JsMethod
	public native Point mouseEventToLayerPoint(MouseEvent event);

	/**
	 * Returns the geographical coordinates of the point the mouse clicked on given the click's event object.
	 *
	 * @param event the event
	 * @return the lat lng
	 */
	@JsMethod
	public native LatLng mouseEventToLatLng(MouseEvent event);

	
	// Other Methods
	/**
	 * Returns the container element of the map.
	 *
	 * @return the container
	 */
	@JsMethod
	public native HTMLElement getContainer();

	/**
	 * Returns an object with different map panes (to render overlays in).
	 *
	 * @return the panes
	 */
	@JsMethod
	public native MapPanes getPanes();

	/**
	 * Runs the given callback when the map gets initialized with a place and zoom, or immediately if it happened already, optionally passing a function context.
	 *
	 * @param fn the callback
	 * @param context the context
	 * @return the L class
	 */
	@JsMethod
	public native L whenReady(Function fn, Object context);

	// Events 
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#clearAllEventListeners()
		 */
		public native L clearAllEventListeners();


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#on(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
		 */
		public native L on(String type, EventCallback fn);


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#once(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
		 */
		public  native L once(String type, EventCallback fn);

		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off(java.lang.String)
		 */
		public native L off(String type);
		

		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off(java.lang.String[])
		 */
		public native L off(String[] type);
		
		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off()
		 */
		public native L off();


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#fire(java.lang.String)
		 */
		public native L fire(String type);
		
		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#listens(java.lang.String)
		 */
		public native Boolean listens(String type);


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#addEventParent(com.gwidgets.api.leaflet.Evented)
		 */
		public native L addEventParent(Evented obj); 


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#removeEventParent(com.gwidgets.api.leaflet.Evented)
		 */
		public native L removeEventParent(Evented obj);


}