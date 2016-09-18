package com.gwidgets.api.leaflet.events;


import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsType;


/**
 * The Class TileEvent.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType
public class TileEvent extends Event {
	

	protected TileEvent() {}


	/**
	 * Gets the tile element (image).
	 *
	 * @return the tile
	 */
	public final native HTMLElement getTile() /*-{
		return this.tile;
	}-*/;

	/**
	 * Gets the source URL of the tile.
	 *
	 * @return the url
	 */
	public final native String getUrl() /*-{
		return this.url;
	}-*/;

}