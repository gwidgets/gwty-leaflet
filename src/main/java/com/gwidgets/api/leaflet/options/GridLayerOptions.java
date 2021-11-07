package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.LatLngBounds;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

/**
 * <p>GridLayerOptions class.</p>
 *
 * @author zakaria
 * @version $Id: $Id
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class GridLayerOptions {
	
	
	private double tileSize;	

	private double opacity;	

	private boolean updateWhenIdle;	

	private boolean	updateWhenZooming;

	private double updateInterval;

	private String	attribution;	
	
	private double zIndex;	

	private LatLngBounds bounds;

	private double minZoom;	

	private double maxZoom;

	private boolean	noWrap;	

	private String pane;

	private String className;	

	private double keepBuffer;	
	
	private GridLayerOptions(){
		
	}
	
	/**
	 * <p>Getter for the field <code>tileSize</code>.</p>
	 *
	 * @return a double
	 */
	@JsOverlay
	public final double getTileSize() {
		return this.tileSize;
	}

	/**
	 * <p>Getter for the field <code>opacity</code>.</p>
	 *
	 * @return a double
	 */
	@JsOverlay
	public final double getOpacity() {
		return this.opacity;
	}

	/**
	 * <p>Getter for the field <code>updateWhenIdle</code>.</p>
	 *
	 * @return a boolean
	 */
	@JsOverlay
	public final boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}

	/**
	 * <p>Getter for the field <code>updateWhenZooming</code>.</p>
	 *
	 * @return a boolean
	 */
	@JsOverlay
	public final boolean getUpdateWhenZooming() {
		return this.updateWhenZooming;
	}

	
	/**
	 * <p>Getter for the field <code>updateInterval</code>.</p>
	 *
	 * @return a double
	 */
	@JsOverlay
	public final double getUpdateInterval() {
		return this.updateInterval;
	}

	/**
	 * <p>Getter for the field <code>attribution</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsOverlay
	public final String getAttribution() {
		return this.attribution;
	}

	/**
	 * <p>Getter for the field <code>zIndex</code>.</p>
	 *
	 * @return a double
	 */
	@JsOverlay
	public final double getzIndex() {
		return this.zIndex;
	}


	/**
	 * <p>Getter for the field <code>bounds</code>.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.LatLngBounds} object
	 */
	@JsOverlay
	public final LatLngBounds getBounds() {
		return this.bounds;
	}

	/**
	 * <p>Getter for the field <code>minZoom</code>.</p>
	 *
	 * @return a double
	 */
	@JsOverlay
	public final double getMinZoom() {
		return this.minZoom;
	}

	/**
	 * <p>Getter for the field <code>maxZoom</code>.</p>
	 *
	 * @return a double
	 */
	@JsOverlay
	public final double getMaxZoom() {
		return this.maxZoom;
	}

	/**
	 * <p>Getter for the field <code>noWrap</code>.</p>
	 *
	 * @return a boolean
	 */
	@JsOverlay
	public final boolean getNoWrap() {
		return this.noWrap;
	}

	/**
	 * <p>Getter for the field <code>pane</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsOverlay
	public final String getPane() {
		return this.pane;
	}

	/**
	 * <p>Getter for the field <code>className</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsOverlay
	public final String getClassName() {
		return this.className;
	}

	/**
	 * <p>Getter for the field <code>keepBuffer</code>.</p>
	 *
	 * @return a double
	 */
	@JsOverlay
	public final double getKeepBuffer() {
		return this.keepBuffer;
	}

	public static class Builder{
		
		private Double tileSize;	

		private Double opacity;	

		private Boolean updateWhenIdle;	

		private Boolean	updateWhenZooming;

		private Double updateInterval;

		private String	attribution;	
		
		private Double zIndex;	

		private LatLngBounds bounds;

		private Double minZoom;	

		private Double maxZoom;

		private Boolean	noWrap;	

		private String pane;

		private String className;	

		private Double keepBuffer;			
		
		public Builder(){
			
			
		}
		
		    public Builder tileSize(Double tileSize){this.tileSize = tileSize; return this;}	

			public Builder opacity(Double opacity){this.opacity = opacity; return this;}	

			public Builder updateWhenIdle(Boolean updateWhenIdle){this.updateWhenIdle = updateWhenIdle; return this;}

			public Builder updateWhenZooming(Boolean updateWhenZooming){this.updateWhenZooming = updateWhenZooming; return this;}

			public Builder updateInterval(Double updateInterval){this.updateInterval = updateInterval; return this;}

			public Builder attribution(String attribution){this.attribution = attribution; return this;}
			
			public Builder zIndex(Double zIndex){this.zIndex = zIndex; return this;}	

			public Builder bounds(LatLngBounds bounds){this.bounds = bounds; return this;}

			public Builder minZoom(Double minZoom){this.minZoom = minZoom; return this;}

			public Builder maxZoom(Double maxZoom){this.maxZoom = maxZoom; return this;}

			public Builder noWrap(Boolean noWrap){this.noWrap = noWrap; return this;}	

			public Builder pane(String pane){this.pane = pane; return this;}

			public Builder className(String className){this.className = className; return this;}

			public Builder keepBuffer(Double keepBuffer){this.keepBuffer = keepBuffer; return this;}
			
			public GridLayerOptions build(){
				GridLayerOptions options = new GridLayerOptions();
				if(this.tileSize != null)
				options.tileSize = this.tileSize;
				if(this.opacity != null)
				options.opacity = this.opacity;
				if(this.updateWhenIdle != null)
				options.updateWhenIdle = this.updateWhenIdle;
				if(this.updateWhenZooming != null)
				options.updateWhenZooming = this.updateWhenZooming;
				if(this.updateInterval != null)
				options.updateInterval = this.updateInterval;
				if(this.attribution != null)
				options.attribution = this.attribution;
				if(this.zIndex != null)
				options.zIndex = this.zIndex;
				if(this.bounds != null)
				options.bounds = this.bounds;
				if(this.minZoom != null)
				options.minZoom = this.minZoom;
				if(this.maxZoom != null)
				options.maxZoom = this.maxZoom;
				if(this.noWrap != null)
				options.noWrap = this.noWrap;
				if(this.pane != null)
				options.pane = this.pane;
				if(this.className != null)
				options.className = this.className;
				if(this.keepBuffer != null)
				options.keepBuffer = this.keepBuffer;
				
				return options;				
			}
	}
}
