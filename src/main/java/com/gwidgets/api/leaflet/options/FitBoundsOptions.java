package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Point;

@JsType
public class FitBoundsOptions {

   
	private FitBoundsOptions() {

	}
	
	@JsProperty
	private Point paddingTopLeft = L.point(0, 0, true);
	@JsProperty
	private Point paddingBottomRight = L.point(0, 0, true);
	@JsProperty
	private Point padding = L.point(0, 0, true);
	@JsProperty
	private Number maxZoom = null;
	
	
	
	public Number getMaxZoom() {
		return this.maxZoom;
	}


	public Point getPaddingTopLeft() {
		return this.paddingTopLeft;
	}



	public Point getPaddingBottomRight() {
		return this.paddingBottomRight;
	}



	public Point getPadding() {
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