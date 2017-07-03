package com.gwidgets.api.leaflet;

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
import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.elemental.EventCallback;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.TooltipOptions;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;



/**
 * A circle of a fixed size with radius specified in pixels. Extends Circle. Use Map#addLayer to add it to the map.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class CircleMarker extends Path implements Layer, Evented{
	
	

	
	protected CircleMarker() {
		
	}


	/**
	 * Sets the position of a circle to a new location.
	 *
	 * @param latlng the latlng
	 * @return the L class
	 */
	@JsMethod
	public native L setLatLng(LatLng latlng);
	
	/**
	 * Returns the current geographical position of the circle.
	 *
	 * @return the lat lng 
	 */
	@JsMethod
	public native LatLng getLatLng();

	
	/**
	 * Sets the radius of a circle. Units are in meters.
	 *
	 * @param radius the radius
	 * @return the L class
	 */
	@JsMethod
	public native L setRadius(double radius);
	
	/**
	 * Returns the current radius of a circle. Units are in meters.
	 *
	 * @return the radius
	 */
	@JsMethod
	public native double getRadius();

	
	/**
	 * Returns a GeoJSON representation of the circle (GeoJSON Point Feature).
	 *
	 * @return the object
	 */
	@JsMethod
	public native JavaScriptObject toGeoJSON();
	
	
	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindPopup(com.gwidgets.api.leaflet.elemental.HTMLElement, com.gwidgets.api.leaflet.options.PopupOptions)
	 */
	@JsMethod
	public native L bindPopup(HTMLElement content, PopupOptions options);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindPopup(java.lang.String, com.gwidgets.api.leaflet.options.PopupOptions)
	 */
	@JsMethod
	public native L bindPopup(String id, PopupOptions options);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#unbindPopup()
	 */
	@JsMethod
	public native L unbindPopup();



	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#openPopup(com.gwidgets.api.leaflet.LatLng)
	 */
	@JsMethod
	public native L openPopup(LatLng latlng);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#closePopup()
	 */
	@JsMethod
	public native L closePopup();


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#togglePopup()
	 */
	@JsMethod
	public native L togglePopup();


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#isPopupOpen()
	 */
	@JsMethod
	public native boolean isPopupOpen();


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setPopupContent(java.lang.String)
	 */
	@JsMethod
	public native L setPopupContent(String content);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setPopupContent(com.gwidgets.api.leaflet.elemental.HTMLElement)
	 */
	@JsMethod
	public native L setPopupContent(HTMLElement content);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setPopupContent(com.gwidgets.api.leaflet.Popup)
	 */
	@JsMethod
	public native L setPopupContent(Popup content);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#getPopup()
	 */
	@JsMethod
	public native Popup getPopup();	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(java.lang.String, com.gwidgets.api.leaflet.options.TooltipOptions)
	 */
	@JsMethod
	public native L bindTooltip(String content, TooltipOptions options);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(com.gwidgets.api.leaflet.elemental.HTMLElement, com.gwidgets.api.leaflet.options.TooltipOptions)
	 */
	@JsMethod
	public native L bindTooltip(HTMLElement content, TooltipOptions options);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(com.gwidgets.api.leaflet.Tooltip, com.gwidgets.api.leaflet.options.TooltipOptions)
	 */
	@JsMethod
	public native L bindTooltip(Tooltip content, TooltipOptions options);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#unbindTooltip()
	 */
	@JsMethod
	public native L unbindTooltip();	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#openTooltip(com.gwidgets.api.leaflet.LatLng)
	 */
	@JsMethod
	public native L openTooltip(LatLng latlng);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#closeTooltip()
	 */
	@JsMethod
	public native L closeTooltip();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#toggleTooltip()
	 */
	@JsMethod
	public native L toggleTooltip();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#isTooltipOpen()
	 */
	@JsMethod
	public native boolean isTooltipOpen();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(java.lang.String)
	 */
	 @JsMethod
	public native L setTooltipContent(String content);	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(com.gwidgets.api.leaflet.elemental.HTMLElement)
	 */
	 @JsMethod
	public native L setTooltipContent(HTMLElement content);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(com.gwidgets.api.leaflet.Tooltip)
	 */
	 @JsMethod
	public native L setTooltipContent(Tooltip content);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#getTooltip()
	 */
	 @JsMethod
	public native Tooltip getTooltip();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#addTo(com.gwidgets.api.leaflet.Map)
	 */
	 @JsMethod
	public native L addTo(Map map);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#remove()
	 */
	 @JsMethod
	public native L remove();		

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#removeFrom(com.gwidgets.api.leaflet.Map)
	 */
	 @JsMethod
	public native L removeFrom(Map map);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#getPane(java.lang.String)
	 */
	 @JsMethod
	public native HTMLElement getPane(String name);
	
	// Events 
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#clearAllEventListeners()
		 */
	 @JsMethod
		public native L clearAllEventListeners();


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#on(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
		 */
	 @JsMethod
		public native L on(String type, EventCallback fn);


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#once(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
		 */
	 @JsMethod
		public  native L once(String type, EventCallback fn);

		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off(java.lang.String)
		 */
	 @JsMethod
		public native L off(String type);
		

		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off(java.lang.String[])
		 */
	 @JsMethod
		public native L off(String[] type);
		
		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off()
		 */
	    @JsMethod
		public native L off();


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#fire(java.lang.String)
		 */
	    @JsMethod
		public native L fire(String type);
		
		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#listens(java.lang.String)
		 */
	    @JsMethod
		public native Boolean listens(String type);


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#addEventParent(com.gwidgets.api.leaflet.Evented)
		 */
	    @JsMethod
		public native L addEventParent(Evented obj); 


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#removeEventParent(com.gwidgets.api.leaflet.Evented)
		 */
	    @JsMethod
		public native L removeEventParent(Evented obj);

}