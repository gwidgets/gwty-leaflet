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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.TooltipOptions;

/**
 * Used to put markers on the map.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class Marker implements Layer, Evented {



	/**
	 * Returns the current geographical position of the marker.
	 *
	 * @return the lat lng
	 */
	@JsMethod
	public native LatLng getLatLng();

	/**
	 * Changes the marker position to the given point.
	 *
	 * @param latlng the latlng
	 * @return the L class
	 */
	@JsMethod
	public native L setLatLng(LatLng latlng);

	/**
	 * Changes the marker icon.
	 *
	 * @param icon the icon
	 * @return the L class
	 */
	@JsMethod
	public native L setIcon(Icon icon);

	/**
	 * Sets the Z index offset.
	 *
	 * @param offset the offset
	 * @return the l
	 */
	@JsMethod
	public native L setZIndexOffset(Number offset);

	/**
	 * Changes the zIndex offset of the marker.
	 *
	 * @param opacity the opacity
	 * @return the L class
	 */
	@JsMethod
	public native L setOpacity(Number opacity);

	/**
	 * Updates the marker position, useful if coordinates of its latLng object were changed directly.
	 *
	 * @return the l
	 */
	@JsMethod
	public native L update();


	

	/**
	 * Opens the popup previously bound by the bindPopup method.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L openPopup();
	


	/**
	 * Sets an HTML content of the popup of this marker.
	 *
	 * @param html the html
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L setPopupContent(String html, PopupOptions options);

	/**
	 * Sets an HTML content of the popup of this marker.
	 *
	 * @param el the element
	 * @param options the options
	 * @return the L class
	 */
	@JsMethod
	public native L setPopupContent(HTMLElement el, PopupOptions options);


	/**
	 * To geo JSON.
	 *
	 * @return the object
	 */
	@JsMethod
	public native JavaScriptObject toGeoJSON();
	
	
	// Events 
	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Evented#clearAllEventListeners()
	 */
	public native L clearAllEventListeners();


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Evented#on(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
	 */
	public native L on(String type, Function fn);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Evented#once(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
	 */
	public  native L once(String type, Function fn);

	
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
			public native L bindTooltip(String content, TooltipOptions options);	


			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(com.gwidgets.api.leaflet.elemental.HTMLElement, com.gwidgets.api.leaflet.options.TooltipOptions)
			 */
			public native L bindTooltip(HTMLElement content, TooltipOptions options);


			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(com.gwidgets.api.leaflet.Tooltip, com.gwidgets.api.leaflet.options.TooltipOptions)
			 */
			public native L bindTooltip(Tooltip content, TooltipOptions options);	


			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#unbindTooltip()
			 */
			public native L unbindTooltip();	


			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#openTooltip(com.gwidgets.api.leaflet.LatLng)
			 */
			public native L openTooltip(LatLng latlng);	


			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#closeTooltip()
			 */
			public native L closeTooltip();	

			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#toggleTooltip()
			 */
			public native L toggleTooltip();	

			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#isTooltipOpen()
			 */
			public native boolean isTooltipOpen();	

			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(java.lang.String)
			 */
			public native L setTooltipContent(String content);	

			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(com.gwidgets.api.leaflet.elemental.HTMLElement)
			 */
			public native L setTooltipContent(HTMLElement content);


			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(com.gwidgets.api.leaflet.Tooltip)
			 */
			public native L setTooltipContent(Tooltip content);	


			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#getTooltip()
			 */
			public native Tooltip getTooltip();	

			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#addTo(com.gwidgets.api.leaflet.Map)
			 */
			public native L addTo(Map map);


			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#remove()
			 */
			public native L remove();		

			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#removeFrom(com.gwidgets.api.leaflet.Map)
			 */
			public native L removeFrom(Map map);	


			/* (non-Javadoc)
			 * @see com.gwidgets.api.leaflet.Layer#getPane(java.lang.String)
			 */
			public native HTMLElement getPane(String name);
}