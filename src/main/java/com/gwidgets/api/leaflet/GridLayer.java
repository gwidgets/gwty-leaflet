package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.events.EventCallback;
import com.gwidgets.api.leaflet.options.PopupOptions;
import com.gwidgets.api.leaflet.options.TooltipOptions;
import com.gwidgets.api.leaflet.utils.JsFn;

import elemental2.core.JsObject;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import jsinterop.base.JsForEachCallbackFn;

@JsType(isNative=true)
public class GridLayer implements Layer, Evented{
	

	protected GridLayer() {
		
	}


	/** Brings the tile layer to the top of all tile layers.
	* @return the L class
		 */
	@JsMethod
	public native L bringToFront(); 


	/** Brings the tile layer to the bottom of all tile layers.
	* @return the L cass
		 */
	@JsMethod
	public native L bringToBack(); 


	/** Used by the attribution control, returns the attribution option.
	* @return String the attribution option value
		 */
	@JsMethod
	public native String getAttribution(); 


	/** Returns the HTML element that contains the tiles for this layer.
	* @return HTMLElement
		 */
	@JsMethod
	public native HTMLElement getContainer();


	/** Changes the opacity of the grid layer.
	* @return the L class
		 */
	@JsMethod
	public native L setOpacity(double opacity);


	/** Changes the zIndex of the grid layer.
	* @return the L class
		 */
	@JsMethod
	public native L setZIndex(double zIndex);


	/** Returns true if any tile in the grid layer has not finished loading.
	* @return true if not finished loading, false otherwise
		 */
	@JsMethod
	public native Boolean isLoading();


	/** Causes the layer to clear all the tiles and request them again.
	* @return the L class
		 */
	@JsMethod
	public native L redraw();


	/** Normalizes the tileSize option into a point. Used by the createTile() method.
	* @return point
		 */
	@JsMethod
	public native Point getTileSize();

	@JsMethod
	public native HTMLElement createTile(JsObject coords, JsFn doneCallback);
	
	
	/**
	 * Adds the layer to the map.
	 *
	 * @param map the map
	 * @return the L class
	 */
	@JsMethod
	public native L addTo(Map map);
	
	
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
	
	
}
