package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.events.EventCallback;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.TooltipOptions;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsMethod;
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
import jsinterop.annotations.JsType;

/**
 * Represents an icon to provide when creating a marker.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative = true)
public class Icon implements Layer, Evented{

	/**
	 * <p>Constructor for Icon.</p>
	 */
	protected Icon() {
	
	}
	
	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindPopup(com.gwidgets.api.leaflet.elemental.HTMLElement, com.gwidgets.api.leaflet.options.PopupOptions)
	 */
	/** {@inheritDoc} */
	@JsMethod
	public native L bindPopup(HTMLElement content, PopupOptions options);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindPopup(java.lang.String, com.gwidgets.api.leaflet.options.PopupOptions)
	 */
	/** {@inheritDoc} */
	@JsMethod
	public native L bindPopup(String id, PopupOptions options);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#unbindPopup()
	 */
	/**
	 * <p>unbindPopup.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	@JsMethod
	public native L unbindPopup();



	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#openPopup(com.gwidgets.api.leaflet.LatLng)
	 */
	/** {@inheritDoc} */
	@JsMethod
	public native L openPopup(LatLng latlng);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#closePopup()
	 */
	/**
	 * <p>closePopup.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	@JsMethod
	public native L closePopup();


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#togglePopup()
	 */
	/**
	 * <p>togglePopup.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	@JsMethod
	public native L togglePopup();


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#isPopupOpen()
	 */
	/**
	 * <p>isPopupOpen.</p>
	 *
	 * @return a boolean
	 */
	@JsMethod
	public native boolean isPopupOpen();


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setPopupContent(java.lang.String)
	 */
	/** {@inheritDoc} */
	@JsMethod
	public native L setPopupContent(String content);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setPopupContent(com.gwidgets.api.leaflet.elemental.HTMLElement)
	 */
	/**
	 * <p>setPopupContent.</p>
	 *
	 * @param content a {@link elemental2.dom.HTMLElement} object
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	@JsMethod
	public native L setPopupContent(HTMLElement content);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setPopupContent(com.gwidgets.api.leaflet.Popup)
	 */
	/**
	 * <p>setPopupContent.</p>
	 *
	 * @param content a {@link com.gwidgets.api.leaflet.Popup} object
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	@JsMethod
	public native L setPopupContent(Popup content);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#getPopup()
	 */
	/**
	 * <p>getPopup.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.Popup} object
	 */
	@JsMethod
	public native Popup getPopup();	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(java.lang.String, com.gwidgets.api.leaflet.options.TooltipOptions)
	 */
	/** {@inheritDoc} */
	@JsMethod
	public native L bindTooltip(String content, TooltipOptions options);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(com.gwidgets.api.leaflet.elemental.HTMLElement, com.gwidgets.api.leaflet.options.TooltipOptions)
	 */
	/** {@inheritDoc} */
	@JsMethod
	public native L bindTooltip(HTMLElement content, TooltipOptions options);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(com.gwidgets.api.leaflet.Tooltip, com.gwidgets.api.leaflet.options.TooltipOptions)
	 */
	/** {@inheritDoc} */
	@JsMethod
	public native L bindTooltip(Tooltip content, TooltipOptions options);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#unbindTooltip()
	 */
	/**
	 * <p>unbindTooltip.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	@JsMethod
	public native L unbindTooltip();	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#openTooltip(com.gwidgets.api.leaflet.LatLng)
	 */
	/** {@inheritDoc} */
	@JsMethod
	public native L openTooltip(LatLng latlng);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#closeTooltip()
	 */
	/**
	 * <p>closeTooltip.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	@JsMethod
	public native L closeTooltip();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#toggleTooltip()
	 */
	/**
	 * <p>toggleTooltip.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	@JsMethod
	public native L toggleTooltip();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#isTooltipOpen()
	 */
	/**
	 * <p>isTooltipOpen.</p>
	 *
	 * @return a boolean
	 */
	@JsMethod
	public native boolean isTooltipOpen();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(java.lang.String)
	 */
	 /**
	  * <p>setTooltipContent.</p>
	  *
	  * @param content a {@link java.lang.String} object
	  * @return a {@link com.gwidgets.api.leaflet.L} object
	  */
	 @JsMethod
	public native L setTooltipContent(String content);	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(com.gwidgets.api.leaflet.elemental.HTMLElement)
	 */
	 /** {@inheritDoc} */
	 @JsMethod
	public native L setTooltipContent(HTMLElement content);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(com.gwidgets.api.leaflet.Tooltip)
	 */
	 /**
	  * <p>setTooltipContent.</p>
	  *
	  * @param content a {@link com.gwidgets.api.leaflet.Tooltip} object
	  * @return a {@link com.gwidgets.api.leaflet.L} object
	  */
	 @JsMethod
	public native L setTooltipContent(Tooltip content);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#getTooltip()
	 */
	 /**
	  * <p>getTooltip.</p>
	  *
	  * @return a {@link com.gwidgets.api.leaflet.Tooltip} object
	  */
	 @JsMethod
	public native Tooltip getTooltip();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#addTo(com.gwidgets.api.leaflet.Map)
	 */
	 /** {@inheritDoc} */
	 @JsMethod
	public native L addTo(Map map);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#remove()
	 */
	 /**
	  * <p>remove.</p>
	  *
	  * @return a {@link com.gwidgets.api.leaflet.L} object
	  */
	 @JsMethod
	public native L remove();		

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#removeFrom(com.gwidgets.api.leaflet.Map)
	 */
	 /** {@inheritDoc} */
	 @JsMethod
	public native L removeFrom(Map map);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#getPane(java.lang.String)
	 */
	 /** {@inheritDoc} */
	 @JsMethod
	public native HTMLElement getPane(String name);
	
	// Events 
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#clearAllEventListeners()
		 */
	 /**
	  * <p>clearAllEventListeners.</p>
	  *
	  * @return a {@link com.gwidgets.api.leaflet.L} object
	  */
	 @JsMethod
		public native L clearAllEventListeners();


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#on(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
		 */
	 /** {@inheritDoc} */
	 @JsMethod
		public native L on(String type, EventCallback fn);


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#once(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
		 */
	 /** {@inheritDoc} */
	 @JsMethod
		public  native L once(String type, EventCallback fn);

		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off(java.lang.String)
		 */
	 /**
	  * <p>off.</p>
	  *
	  * @param type a {@link java.lang.String} object
	  * @return a {@link com.gwidgets.api.leaflet.L} object
	  */
	 @JsMethod
		public native L off(String type);
		

		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off(java.lang.String[])
		 */
	 /**
	  * <p>off.</p>
	  *
	  * @param type an array of {@link java.lang.String} objects
	  * @return a {@link com.gwidgets.api.leaflet.L} object
	  */
	 @JsMethod
		public native L off(String[] type);
		
		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off()
		 */
	    /**
	     * <p>off.</p>
	     *
	     * @return a {@link com.gwidgets.api.leaflet.L} object
	     */
	    @JsMethod
		public native L off();


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#fire(java.lang.String)
		 */
	    /** {@inheritDoc} */
	    @JsMethod
		public native L fire(String type);
		
		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#listens(java.lang.String)
		 */
	    /** {@inheritDoc} */
	    @JsMethod
		public native Boolean listens(String type);


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#addEventParent(com.gwidgets.api.leaflet.Evented)
		 */
	    /** {@inheritDoc} */
	    @JsMethod
		public native L addEventParent(Evented obj); 


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#removeEventParent(com.gwidgets.api.leaflet.Evented)
		 */
	    /** {@inheritDoc} */
	    @JsMethod
		public native L removeEventParent(Evented obj);
	
	

}
