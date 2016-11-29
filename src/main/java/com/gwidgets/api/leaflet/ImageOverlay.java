package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.TooltipOptions;

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

/**
 *Used to load and display a single image over specific bounds of the map, implements ILayer interface.
 *@author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class ImageOverlay implements Layer, Evented{

    
	private ImageOverlay() {
		
	}

	/**
	 * Sets the opacity of the overlay.
	 *
	 * @param opacity the opacity
	 * @return the L class
	 */
	@JsMethod
	public static native L setOpacity(Number opacity);

	/**
	 * Brings the layer to the top of all overlays.
	 *
	 * @return the L class
	 */
	@JsMethod
	public static native L bringToFront();

	/**
	 * Brings the layer to the bottom of all overlays.
	 *
	 * @return the L class
	 */
	@JsMethod
	public static native L bringToBack();
	
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



}