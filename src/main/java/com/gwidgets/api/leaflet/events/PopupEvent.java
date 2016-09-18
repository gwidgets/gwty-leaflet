package com.gwidgets.api.leaflet.events;


import com.gwidgets.api.leaflet.Popup;


import jsinterop.annotations.JsType;

/**
 * The Class PopupEvent.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType
public class PopupEvent extends Event {
	
	protected PopupEvent() {}


	/**
	 * Gets the popup that was opened or closed.
	 *
	 * @return the popup
	 */
	public final native Popup getPopup() /*-{
		return this.popup;
	}-*/;

}