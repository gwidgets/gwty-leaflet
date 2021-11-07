package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.events.EventCallback;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.TooltipOptions;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * Used to open popups in certain places of the map. Use openPopup of the Map class to open popups while making sure that only one popup is open at one time (recommended for usability), or use of addLayer method of the Map class to open as many as you want.
 *
 * @author zakaria
 * @version $Id: $Id
 */
@JsType(isNative = true)
public class Popup extends DivOverlay implements Layer, Evented{
	
	


	/**
	 * <p>Constructor for Popup.</p>
	 */
	protected Popup() {
		super();
	}

	/**
	 * Adds the popup to the map and closes the previous one. The same as map.openPopup(popup).
	 *
	 * @param map the map
	 * @return the L class
	 */
	@JsMethod
	public native L openOn(Map map);

	/**
	 * Sets the geographical point where the popup will open.
	 *
	 * @param latlng the latlng
	 * @return the L class
	 */
	@JsMethod
	public native L setLatLng(LatLng latlng);

	/**
	 * Sets the HTML content of the popup.
	 *
	 * @param htmlContent the html content
	 * @return the L class
	 */
	@JsMethod
	public native L setContent(String htmlContent);

	/**
	 * gets the HTML content of the popup.
	 *
	 * @return the content
	 */
	@JsMethod(name="getContent")
	public native HTMLElement getContentAsHTMLElement();
	
	
	/**
	 * gets content of the popup.
	 *
	 * @return the content
	 */
	@JsMethod(name="getContent")
	public native String getContentAsString();

	/**
	 * Sets the HTML content of the popup.
	 *
	 * @param htmlContent the html content
	 * @return the l
	 */
	@JsMethod
	public native L setContent(HTMLElement htmlContent);
	
	
	/**
	 * Returns true when the popup is visible on the map.
	 *
	 * @return true if popup is open, false otherwise
	 */
	@JsMethod
	public native L bringToFront();
	
	/**
	 * Returns true when the popup is visible on the map.
	 *
	 * @return true if popup is open, false otherwise
	 */
	@JsMethod
	public native L bringToBack();
	
	/**
	 * Returns true when the popup is visible on the map.
	 *
	 * @return true if popup is open, false otherwise
	 */
	@JsMethod
	public native Boolean isOpen();
	
	
	/**
	 * Updates the popup content, layout and position. Useful for updating the popup after something inside changed, e.g. image loaded.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L update();
	
	
	/**
	 * Returns the geographical point of popup.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L getLatLng();
	
	
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
	public native L bindTooltip(String content, TooltipOptions options);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(com.gwidgets.api.leaflet.elemental.HTMLElement, com.gwidgets.api.leaflet.options.TooltipOptions)
	 */
	/** {@inheritDoc} */
	public native L bindTooltip(HTMLElement content, TooltipOptions options);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#bindTooltip(com.gwidgets.api.leaflet.Tooltip, com.gwidgets.api.leaflet.options.TooltipOptions)
	 */
	/** {@inheritDoc} */
	public native L bindTooltip(Tooltip content, TooltipOptions options);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#unbindTooltip()
	 */
	/**
	 * <p>unbindTooltip.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	public native L unbindTooltip();	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#openTooltip(com.gwidgets.api.leaflet.LatLng)
	 */
	/** {@inheritDoc} */
	public native L openTooltip(LatLng latlng);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#closeTooltip()
	 */
	/**
	 * <p>closeTooltip.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	public native L closeTooltip();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#toggleTooltip()
	 */
	/**
	 * <p>toggleTooltip.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	public native L toggleTooltip();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#isTooltipOpen()
	 */
	/**
	 * <p>isTooltipOpen.</p>
	 *
	 * @return a boolean
	 */
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
	public native L setTooltipContent(String content);	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#setTooltipContent(com.gwidgets.api.leaflet.elemental.HTMLElement)
	 */
	/** {@inheritDoc} */
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
	public native L setTooltipContent(Tooltip content);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#getTooltip()
	 */
	/**
	 * <p>getTooltip.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.Tooltip} object
	 */
	public native Tooltip getTooltip();	

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#addTo(com.gwidgets.api.leaflet.Map)
	 */
	/** {@inheritDoc} */
	public native L addTo(Map map);


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#remove()
	 */
	/**
	 * <p>remove.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.L} object
	 */
	public native L remove();		

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#removeFrom(com.gwidgets.api.leaflet.Map)
	 */
	/** {@inheritDoc} */
	public native L removeFrom(Map map);	


	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.Layer#getPane(java.lang.String)
	 */
	/** {@inheritDoc} */
	public native HTMLElement getPane(String name);


	// events

	//Events 
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#clearAllEventListeners()
		 */
		/**
		 * <p>clearAllEventListeners.</p>
		 *
		 * @return a {@link com.gwidgets.api.leaflet.L} object
		 */
		public native L clearAllEventListeners();


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#on(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
		 */
		/** {@inheritDoc} */
		public native L on(String type, EventCallback fn);


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#once(java.lang.String, com.gwidgets.api.leaflet.elemental.Function)
		 */
		/** {@inheritDoc} */
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
		public native L off(String[] type);
		
		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#off()
		 */
		/**
		 * <p>off.</p>
		 *
		 * @return a {@link com.gwidgets.api.leaflet.L} object
		 */
		public native L off();


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#fire(java.lang.String)
		 */
		/** {@inheritDoc} */
		public native L fire(String type);
		
		
		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#listens(java.lang.String)
		 */
		/** {@inheritDoc} */
		public native Boolean listens(String type);


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#addEventParent(com.gwidgets.api.leaflet.Evented)
		 */
		/** {@inheritDoc} */
		public native L addEventParent(Evented obj); 


		/* (non-Javadoc)
		 * @see com.gwidgets.api.leaflet.Evented#removeEventParent(com.gwidgets.api.leaflet.Evented)
		 */
		/** {@inheritDoc} */
		public native L removeEventParent(Evented obj);
	
	

}
