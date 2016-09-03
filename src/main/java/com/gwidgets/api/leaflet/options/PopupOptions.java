package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Point;

@JsType
public class PopupOptions {
	
	private PopupOptions() {
		
	}

    @JsProperty
	private Number maxWidth = 300;

	@JsProperty
	private Number minWidth = 50;

	@JsProperty
	private Number maxHeight = null;

	@JsProperty
	private Boolean autoPan = true;

	@JsProperty
	private Boolean keepInView = false;

	@JsProperty
	private Boolean closeButton = true;

	@JsProperty
	private Point offset = L.point(0, 6, true);
	
	@JsProperty
	private Point autoPanPaddingTopLeft = null;
	
	@JsProperty
	private Point autoPanPaddingBottomRight = null;

	@JsProperty
	private Point autoPanPadding = L.point(5, 5, true);

	@JsProperty
	private Boolean zoomAnimation = true;

	@JsProperty
	private Boolean closeOnClick = null;
	
	@JsProperty
	private String className = "";
	
	public static class Builder {
		
		private Number maxWidth = 300;

		
		private Number minWidth = 50;

		
		private Number maxHeight = null;

		
		private Boolean autoPan = true;

		
		private Boolean keepInView = false;

		
		private Boolean closeButton = true;

		
		private Point offset = L.point(0, 6, true);
		
		
		private Point autoPanPaddingTopLeft = null;
		

		private Point autoPanPaddingBottomRight = null;

		
		private Point autoPanPadding = L.point(5, 5, true);

		
		private Boolean zoomAnimation = true;

		
		private Boolean closeOnClick = null;
		
		
		private String className = "";

		public Builder() {

		}
		
	    
		public Builder maxWidth(Number maxWidth){this.maxHeight = maxWidth;return this;}

		
		public Builder minWidth(Number minWidth){this.minWidth = minWidth; return this;}

		
		public Builder maxHeight(Number maxHeight){this.maxHeight = maxHeight; return this;}

		
		public Builder autoPan(Boolean autoPan){this.autoPan = autoPan; return this;}

		
		public Builder keepInView(Boolean keepInView){this.keepInView = keepInView; return this;}

		
		public Builder closeButton(Boolean closeButton){this.closeButton = closeButton; return this;}

		
		public Builder offset(Point offset){this.offset = offset; return this;}
		
	    
		public Builder autoPanPaddingTopLeft(Point autoPanPaddingTopLeft){this.autoPanPaddingTopLeft = autoPanPaddingTopLeft; return this;}
		

		public Builder autoPanPaddingBottomRight(Point autoPanPaddingBottomRight){this.autoPanPaddingBottomRight = autoPanPaddingBottomRight; return this;}

		
		public Builder autoPanPadding(Point autoPanPadding){this.autoPanPadding = autoPanPadding; return this;}

		
		public Builder zoomAnimation(Boolean zoomAnimation){this.zoomAnimation = zoomAnimation; return this;}

		
		public Builder closeOnClick(Boolean closeOnClick){this.closeOnClick = closeOnClick; return this;}
		
		private Builder className(String className){this.className = className; return this;};
		
		
		public PopupOptions build(){
			PopupOptions options = new PopupOptions();
			options.maxWidth = this.maxWidth;
			options.minWidth = this.minWidth;
			options.maxHeight = this.maxHeight;
			options.autoPan = this.autoPan;
			options.keepInView = this.keepInView;
			options.closeButton = this.closeButton;
			options.offset = this.offset;
			options.autoPanPaddingTopLeft = this.autoPanPaddingTopLeft;
			options.autoPanPaddingBottomRight = this.autoPanPaddingBottomRight;
			options.autoPanPadding = this.autoPanPadding;
			options.zoomAnimation = this.zoomAnimation;
			options.closeOnClick = this.closeOnClick;
			options.className = this.className;
			
			
			return options;
			
		}

	}

}