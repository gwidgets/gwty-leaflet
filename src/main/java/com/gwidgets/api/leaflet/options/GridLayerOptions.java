package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.LatLngBounds;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class GridLayerOptions {
	
	
	private Number tileSize;	

	private Number opacity;	

	private Boolean updateWhenIdle;	

	private Boolean	updateWhenZooming;

	private Number updateInterval;

	private String	attribution;	
	
	private Number zIndex;	

	private LatLngBounds bounds;

	private Number minZoom;	

	private Number maxZoom;

	private Boolean	noWrap;	

	private String pane;

	private String className;	

	private Number keepBuffer;	
	
	private GridLayerOptions(){
		
		
		
	}
	
	
	
	
	@JsOverlay
	public final Number getTileSize() {
		return this.tileSize;
	}




	@JsOverlay
	public final Number getOpacity() {
		return this.opacity;
	}




	@JsOverlay
	public final Boolean getUpdateWhenIdle() {
		return this.updateWhenIdle;
	}




	@JsOverlay
	public final Boolean getUpdateWhenZooming() {
		return this.updateWhenZooming;
	}

	
	@JsOverlay
	public final Number getUpdateInterval() {
		return this.updateInterval;
	}

	@JsOverlay
	public final String getAttribution() {
		return this.attribution;
	}

	@JsOverlay
	public final Number getzIndex() {
		return this.zIndex;
	}


	@JsOverlay
	public final LatLngBounds getBounds() {
		return this.bounds;
	}

	@JsOverlay
	public final Number getMinZoom() {
		return this.minZoom;
	}

	@JsOverlay
	public final Number getMaxZoom() {
		return this.maxZoom;
	}

	@JsOverlay
	public final Boolean getNoWrap() {
		return this.noWrap;
	}

	@JsOverlay
	public final String getPane() {
		return this.pane;
	}

	@JsOverlay
	public final String getClassName() {
		return this.className;
	}

	@JsOverlay
	public final Number getKeepBuffer() {
		return this.keepBuffer;
	}





	public static class Builder{
		
		private Number tileSize = 256;	

		private Number opacity	= 1.0;	

		private Boolean updateWhenIdle = false;	

		private Boolean	updateWhenZooming =	true;

		private Number updateInterval = 200;

		private String	attribution	= null;	
		
		private Number zIndex = 1;	

		private LatLngBounds bounds = null;

		private Number minZoom = 0;	

		private Number maxZoom = null;

		private Boolean	noWrap = false;	

		private String pane = "tilePane";

		private String className  = "";	

		private Number keepBuffer =  2;	
		
		
		public Builder(){
			
			
		}
		
		
		    public Builder tileSize(Number tileSize){this.tileSize = tileSize; return this;}	

			public Builder opacity(Number opacity){this.opacity = opacity; return this;}	

			public Builder updateWhenIdle(Boolean updateWhenIdle){this.updateWhenIdle = updateWhenIdle; return this;}

			public Builder updateWhenZooming(Boolean updateWhenZooming){this.updateWhenZooming = updateWhenZooming; return this;}

			public Builder updateInterval(Number updateInterval){this.updateInterval = updateInterval; return this;}

			public Builder attribution(String attribution){this.attribution = attribution; return this;}
			
			public Builder zIndex(Number zIndex){this.zIndex = zIndex; return this;}	

			public Builder bounds(LatLngBounds bounds){this.bounds = bounds; return this;}

			public Builder minZoom(Number minZoom){this.minZoom = minZoom; return this;}

			public Builder maxZoom(Number maxZoom){this.maxZoom = maxZoom; return this;}

			public Builder noWrap(Boolean noWrap){this.noWrap = noWrap; return this;}	

			public Builder pane(String pane){this.pane = pane; return this;}

			public Builder className(String className){this.className = className; return this;}

			public Builder keepBuffer(Number keepBuffer){this.keepBuffer = keepBuffer; return this;}
			
			
			
			public GridLayerOptions build(){
				GridLayerOptions options = new GridLayerOptions();
				options.tileSize = this.tileSize;
				options.opacity = this.opacity;
				options.updateWhenIdle = this.updateWhenIdle;
				options.updateWhenZooming = this.updateWhenZooming;
				options.updateInterval = this.updateInterval;
				options.attribution = this.attribution;
				options.zIndex = this.zIndex;
				options.bounds = this.bounds;
				options.minZoom = this.minZoom;
				options.maxZoom = this.maxZoom;
				options.noWrap = this.noWrap;
				options.pane = this.pane;
				options.className = this.className;
				options.keepBuffer = this.keepBuffer;
				
				
				return options;
				
				
				
			}
		
	}
	

}
