package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.Icon;

@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class MarkerOptions {
	
	private MarkerOptions(){
		
		
	}

	@JsProperty
	private  Icon icon;

	@JsProperty
	private  Boolean clickable;

	@JsProperty
	private  Boolean draggable;

	@JsProperty
	private  Boolean keyboard;

	@JsProperty
	private  String title;

	@JsProperty
	private  Number zIndexOffset;

	@JsProperty
	private  Number opacity;

	@JsProperty
	private  Boolean riseOnHover;

	@JsProperty
	private  Number riseOffset;
	
	
	@JsOverlay public final Icon getIcon() {
		return this.icon;
	}


	@JsOverlay public final Boolean getClickable() {
		return this.clickable;
	}


	@JsOverlay public final Boolean getDraggable() {
		return this.draggable;
	}


	@JsOverlay public final Boolean getKeyboard() {
		return this.keyboard;
	}


	@JsOverlay public final String getTitle() {
		return this.title;
	}


	@JsOverlay public final Number getzIndexOffset() {
		return this.zIndexOffset;
	}


	@JsOverlay public final Number getOpacity() {
		return this.opacity;
	}


	@JsOverlay public final Boolean getRiseOnHover() {
		return this.riseOnHover;
	}


	@JsOverlay public final Number getRiseOffset() {
		return this.riseOffset;
	}


	public static class Builder{
		
         private Icon icon = null;
		
		
		private Boolean clickable = true;

		
		private Boolean draggable = false;

		
		private Boolean keyboard = true;

		
		private String title = "";

		
		private Number zIndexOffset = 0;

		
		private Number opacity = 1.0;

		
		private Boolean riseOnHover = false;

		
		private Number riseOffset = 250;
		
		
		public Builder(){
			
			
		}
		

		public Builder icon (Icon icon){ this.icon = icon; return this;}

		
		public Builder clickable(Boolean clickable){this.clickable = clickable; return this;}

		
		public Builder draggable(Boolean draggable){this.draggable = draggable; return this;}

		
		public Builder keyboard(Boolean keyboard){this.keyboard = keyboard; return this;}

		
		public Builder title(String title){this.title = title; return this;}

		
		public Builder zIndexOffset(Number zIndexOffset){this.zIndexOffset = zIndexOffset; return this;}

		
		public Builder opacity(Number opacity){this.opacity = opacity; return this;}

		
		public Builder riseOnHover(Boolean riseOnHover){this.riseOnHover = riseOnHover; return this;}

		
		public Builder riseOffset(Number riseOffset){this.riseOffset = riseOffset; return this;}
		
		
		public MarkerOptions build(){
			
			MarkerOptions options = new MarkerOptions();
			options.icon = this.icon;
			options.clickable = this.clickable;
			options.draggable = this.draggable;
			options.keyboard = this.keyboard;
			options.title = this.title;
			options.zIndexOffset = this.zIndexOffset;
			options.opacity = this.opacity;
			options.riseOnHover = this.riseOnHover;
			options.riseOffset = this.riseOffset;
			
			
			return options;
		}
		
		
		
	}

}