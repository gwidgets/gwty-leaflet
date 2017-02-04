package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.LatLngBounds;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class GridLayerOptions {
	
	
	private double tileSize;	

	private double opacity;	

	private Boolean updateWhenIdle;	

	private Boolean	updateWhenZooming;

	private double updateInterval;

	private String	attribution;	
	
	private double zIndex;	

	private LatLngBounds bounds;

	private double minZoom;	

	private double maxZoom;

	private Boolean	noWrap;	

	private String pane;

	private String className;	

	private double keepBuffer;	
	
	private GridLayerOptions(){
		
		
		
	}
	
	
	
	
	@JsOverlay
	public final double getTileSize() {
		return this.tileSize;
	}




	@JsOverlay
	public final double getOpacity() {
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
	public final double getUpdateInterval() {
		return this.updateInterval;
	}

	@JsOverlay
	public final String getAttribution() {
		return this.attribution;
	}

	@JsOverlay
	public final double getzIndex() {
		return this.zIndex;
	}


	@JsOverlay
	public final LatLngBounds getBounds() {
		return this.bounds;
	}

	@JsOverlay
	public final double getMinZoom() {
		return this.minZoom;
	}

	@JsOverlay
	public final double getMaxZoom() {
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
	public final double getKeepBuffer() {
		return this.keepBuffer;
	}





	public static class Builder{
		
		private double tileSize = 256;	

		private double opacity	= 1.0;	

		private Boolean updateWhenIdle = false;	

		private Boolean	updateWhenZooming =	true;

		private double updateInterval = 200;

		private String	attribution	= null;	
		
		private double zIndex = 1;	

		private LatLngBounds bounds = null;

		private double minZoom = 0;	

		private double maxZoom;

		private Boolean	noWrap = false;	

		private String pane = "tilePane";

		private String className  = "";	

		private double keepBuffer =  2;	
		
		
		public Builder(){
			
			
		}
		
		
		    public Builder tileSize(double tileSize){this.tileSize = tileSize; return this;}	

			public Builder opacity(double opacity){this.opacity = opacity; return this;}	

			public Builder updateWhenIdle(Boolean updateWhenIdle){this.updateWhenIdle = updateWhenIdle; return this;}

			public Builder updateWhenZooming(Boolean updateWhenZooming){this.updateWhenZooming = updateWhenZooming; return this;}

			public Builder updateInterval(double updateInterval){this.updateInterval = updateInterval; return this;}

			public Builder attribution(String attribution){this.attribution = attribution; return this;}
			
			public Builder zIndex(double zIndex){this.zIndex = zIndex; return this;}	

			public Builder bounds(LatLngBounds bounds){this.bounds = bounds; return this;}

			public Builder minZoom(double minZoom){this.minZoom = minZoom; return this;}

			public Builder maxZoom(double maxZoom){this.maxZoom = maxZoom; return this;}

			public Builder noWrap(Boolean noWrap){this.noWrap = noWrap; return this;}	

			public Builder pane(String pane){this.pane = pane; return this;}

			public Builder className(String className){this.className = className; return this;}

			public Builder keepBuffer(double keepBuffer){this.keepBuffer = keepBuffer; return this;}
			
			
			
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
