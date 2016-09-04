package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Point;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class FitBoundsOptions {

   
	private FitBoundsOptions() {

	}
	
	@JsProperty
	private Point paddingTopLeft;
	@JsProperty
	private Point paddingBottomRight;
	@JsProperty
	private Point padding;
	@JsProperty
	private Number maxZoom;
	
	
	
	@JsOverlay public final Number getMaxZoom() {
		return this.maxZoom;
	}


	@JsOverlay public final Point getPaddingTopLeft() {
		return this.paddingTopLeft;
	}



	@JsOverlay public final Point getPaddingBottomRight() {
		return this.paddingBottomRight;
	}



	@JsOverlay public final Point getPadding() {
		return this.padding;
	}



	public static class Builder {
		
		
		private Point paddingTopLeft = L.point(0, 0, true);
		
		private Point paddingBottomRight = L.point(0, 0, true);
		
		private Point padding = L.point(0, 0, true);
		
		private Number maxZoom = null;

		public Builder() {

		}
		
		public Builder paddingTopLeft(Point paddingTopLeft){this.paddingTopLeft = paddingTopLeft; return this;}
		
		public Builder paddingBottomRight(Point paddingBottomRight){this.paddingBottomRight = paddingBottomRight; return this;}
		
		public Builder padding(Point padding){this.padding = padding; return this;}
		
		public Builder maxZoom(Number maxZoom){this.maxZoom = maxZoom; return this;}
		
		public FitBoundsOptions build(){
			FitBoundsOptions options = new FitBoundsOptions();
			options.paddingTopLeft = this.paddingTopLeft;
			options.paddingBottomRight = this.paddingBottomRight;
			options.padding = this.padding;
			options.maxZoom = this.maxZoom;
			
			return options;
			
		}

	}

}