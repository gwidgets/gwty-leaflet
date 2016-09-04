package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.Point;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class DivIconOptions {
	
	private DivIconOptions() {

	}

	@JsProperty
	private Point iconSize;

	@JsProperty
	private Point iconAnchor;
	
	@JsProperty
	private Point popUpAnchor;

	@JsProperty
	private String className;

	@JsProperty
	private String html;
	
	
	@JsOverlay public final Point getIconSize() {
		return this.iconSize;
	}


	@JsOverlay public final Point getIconAnchor() {
		return this.iconAnchor;
	}
	
	@JsOverlay public final Point getPopUpAnchor() {
		return this.popUpAnchor;
	}



	@JsOverlay public final String getClassName() {
		return this.className;
	}


	@JsOverlay public final String getHtml() {
		return this.html;
	}


	public static class Builder {
		
		private Point iconSize;

		
		private Point iconAnchor;
		
		
		private Point popUpAnchor;

		private String className = "";

		
		private String html = "";

		public Builder() {

		}
		
		public Builder iconSize(Point iconSize){this.iconSize = iconSize; return this;}

		public Builder iconAnchor(Point iconAnchor){this.iconAnchor = iconAnchor; return this;}
		
		public Builder popUpAnchor(Point popUpAnchor){this.popUpAnchor = popUpAnchor; return this;}

		public Builder className(String className){this.className = className; return this;}

		public Builder html(String html){this.html = html; return this;}
		
		public DivIconOptions build(){
			
			DivIconOptions options = new DivIconOptions();
			options.iconSize = this.iconSize;
			options.iconAnchor = this.iconAnchor;
			options.popUpAnchor = this.popUpAnchor;
			options.className = this.className;
			options.html = this.html;
			
			
			return options;
			
			
		}

	}
}