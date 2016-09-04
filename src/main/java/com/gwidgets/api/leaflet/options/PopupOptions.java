package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Point;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class PopupOptions {
	
	private PopupOptions() {
		
	}

    @JsProperty
	private Number maxWidth;

	@JsProperty
	private Number minWidth;

	@JsProperty
	private Number maxHeight;

	@JsProperty
	private Boolean autoPan;

	@JsProperty
	private Boolean keepInView;

	@JsProperty
	private Boolean closeButton;

	@JsProperty
	private Point offset;
	
	@JsProperty
	private Point autoPanPaddingTopLeft;
	
	@JsProperty
	private Point autoPanPaddingBottomRight;

	@JsProperty
	private Point autoPanPadding;

	@JsProperty
	private Boolean zoomAnimation;

	@JsProperty
	private Boolean closeOnClick;
	
	@JsProperty
	private String className;
	
	
	
	@JsOverlay public final Number getMaxWidth() {
		return this.maxWidth;
	}



	@JsOverlay public final Number getMinWidth() {
		return this.minWidth;
	}



	@JsOverlay public final Number getMaxHeight() {
		return this.maxHeight;
	}



	@JsOverlay public final Boolean getAutoPan() {
		return this.autoPan;
	}



	@JsOverlay public final Boolean getKeepInView() {
		return this.keepInView;
	}



	@JsOverlay public final Boolean getCloseButton() {
		return this.closeButton;
	}



	@JsOverlay public final Point getOffset() {
		return this.offset;
	}



	@JsOverlay public final Point getAutoPanPaddingTopLeft() {
		return this.autoPanPaddingTopLeft;
	}



	@JsOverlay public final Point getAutoPanPaddingBottomRight() {
		return this.autoPanPaddingBottomRight;
	}



	@JsOverlay public final Point getAutoPanPadding() {
		return this.autoPanPadding;
	}



	@JsOverlay public final Boolean getZoomAnimation() {
		return this.zoomAnimation;
	}



	@JsOverlay public final Boolean getCloseOnClick() {
		return this.closeOnClick;
	}



	@JsOverlay public final String getClassName() {
		return this.className;
	}



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