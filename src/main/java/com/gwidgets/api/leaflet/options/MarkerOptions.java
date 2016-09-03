package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.Icon;

@JsType
public class MarkerOptions {
	
	private MarkerOptions(){
		
		
	}

	@JsProperty
	private  Icon icon = null;

	@JsProperty
	private  Boolean clickable = true;

	@JsProperty
	private  Boolean draggable = false;

	@JsProperty
	private  Boolean keyboard = true;

	@JsProperty
	private  String title = "";

	@JsProperty
	private  Number zIndexOffset = 0;

	@JsProperty
	private  Number opacity = 1.0;

	@JsProperty
	private  Boolean riseOnHover = false;

	@JsProperty
	private  Number riseOffset = 250;
	
	
	public Icon getIcon() {
		return this.icon;
	}


	public Boolean getClickable() {
		return this.clickable;
	}


	public Boolean getDraggable() {
		return this.draggable;
	}


	public Boolean getKeyboard() {
		return this.keyboard;
	}


	public String getTitle() {
		return this.title;
	}


	public Number getzIndexOffset() {
		return this.zIndexOffset;
	}


	public Number getOpacity() {
		return this.opacity;
	}


	public Boolean getRiseOnHover() {
		return this.riseOnHover;
	}


	public Number getRiseOffset() {
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