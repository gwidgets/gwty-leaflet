package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

// TODO: Auto-generated Javadoc
/**
 * Used to open popups in certain places of the map. Use openPopup of the Map class to open popups while making sure that only one popup is open at one time (recommended for usability), or use of addLayer method of the Map class to open as many as you want.
 */
@JsType(isNative = true)
public class Popup {

	/**
	 * Adds the popup to the map.
	 *
	 * @param map the map
	 * @return the L class
	 */
	@JsMethod
	public native L addTo(Map map);

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
	 * Sets the HTML content of the popup.
	 *
	 * @param htmlContent the html content
	 * @return the l
	 */
	@JsMethod
	public native L setContent(HTMLElement htmlContent);
	
	
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

}