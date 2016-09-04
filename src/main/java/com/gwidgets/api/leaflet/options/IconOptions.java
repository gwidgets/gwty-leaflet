package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.Point;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class IconOptions {
	
	private IconOptions(){
		
		
	}


	   @JsProperty
		private String iconUrl;

		@JsProperty
		private String iconRetinaUrl;

		@JsProperty
		private Point iconSize;

		@JsProperty
		private Point iconAnchor;

		@JsProperty
		private String shadowUrl;

		@JsProperty
		private String shadowRetinaUrl;

		@JsProperty
		private Point shadowSize;

		@JsProperty
		private Point shadowAnchor;

		@JsProperty
		private Point popupAnchor;

		@JsProperty
		private String className;
	
	
		@JsOverlay public final String getIconUrl() {
			return this.iconUrl;
		}


		@JsOverlay public final String getIconRetinaUrl() {
			return this.iconRetinaUrl;
		}


		@JsOverlay public final Point getIconSize() {
			return this.iconSize;
		}


		@JsOverlay public final Point getIconAnchor() {
			return this.iconAnchor;
		}


		@JsOverlay public final String getShadowUrl() {
			return this.shadowUrl;
		}


		@JsOverlay public final String getShadowRetinaUrl() {
			return this.shadowRetinaUrl;
		}


		@JsOverlay public final Point getShadowSize() {
			return this.shadowSize;
		}


		@JsOverlay public final Point getShadowAnchor() {
			return this.shadowAnchor;
		}


		@JsOverlay public final Point getPopupAnchor() {
			return this.popupAnchor;
		}


		@JsOverlay public final String getClassName() {
			return this.className;
		}


	public static class Builder {
		

		private String iconUrl;

		
		private String iconRetinaUrl;

		
		private Point iconSize;

		
		private Point iconAnchor;

		
		private String shadowUrl;

		
		private String shadowRetinaUrl;

		
		private Point shadowSize;

		
		private Point shadowAnchor;

		
		private Point popupAnchor;

		
		private String className;

		public Builder(String iconUrl) {
			this.iconUrl = iconUrl;

		}
		
		public Builder iconRetinaUrl(String iconRetinaUrl){this.iconRetinaUrl = iconRetinaUrl; return this;}

		
		public Builder iconSize(Point iconSize){this.iconSize = iconSize; return this;}

		
		public Builder iconAnchor(Point iconAnchor){this.iconAnchor = iconAnchor; return this;}

		
		public Builder shadowUrl(String shadowUrl){this.shadowUrl = shadowUrl; return this;}

		
		public Builder shadowRetinaUrl(String shadowRetinaUrl){this.shadowRetinaUrl = shadowRetinaUrl; return this;}

		
		public Builder shadowSize(Point shadowSize){this.shadowSize = shadowSize; return this;}

		
		public Builder shadowAnchor(Point shadowAnchor){this.shadowAnchor = shadowAnchor; return this;}

		
		public Builder popupAnchor(Point popupAnchor){this.popupAnchor = popupAnchor; return this;}

		
		public Builder className(String className){this.className = className; return this;}
		
		public IconOptions build(){
			IconOptions options = new IconOptions();
			options.iconUrl = iconUrl;
			options.iconRetinaUrl = this.iconRetinaUrl;
			options.iconSize = this.iconSize;
			options.iconAnchor = this.iconAnchor;
			options.shadowUrl = this.shadowUrl;
			options.shadowRetinaUrl = this.shadowRetinaUrl;
			options.shadowSize = this.shadowSize;
			options.shadowAnchor = this.shadowAnchor;
			options.popupAnchor = this.popupAnchor;
			options.className = this.className;
			
			return options;
			
			
		}

	}

}