/**
 *  Copyright 2016 G-Widgets
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.gwidgets.api.leaflet.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.Icon;
import com.gwidgets.api.leaflet.options.DivIconOptions.Builder;

/**
 * The Class MarkerOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
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
	private  String alt;

	@JsProperty
	private  Number zIndexOffset;

	@JsProperty
	private  Number opacity;

	@JsProperty
	private  Boolean riseOnHover;

	@JsProperty
	private  Number riseOffset;
	
	
	/*****************************************
	********************************************/
	@JsProperty
    private Boolean interactive;
	/**********************************************
	*********************************************/
	
    @JsProperty
	private String pane;
	/**********************************************
	 *********************************************/
    @JsProperty
    private String attribution;
    /**********************************************
   	*********************************************/
	
	
	/**
	 * Gets Icon class to use for rendering the marker. Set to new L.Icon.Default() by default.
	 * </br>
	 * 
	 * @return the icon
	 */
	@JsOverlay public final Icon getIcon() {
		return this.icon;
	}


	/**
	 * Gets whether the marker will not emit mouse events and will act as a part of the underlying map
	 * </br>
	 * default true
	 * @return the clickable
	 */
	@JsOverlay public final Boolean getClickable() {
		return this.clickable;
	}


	/**
	 * Gets Whether the marker is draggable with mouse/touch or not.
	 * </br>
	 * default false
	 * @return the draggable
	 */
	@JsOverlay public final Boolean getDraggable() {
		return this.draggable;
	}


	/**
	 * Gets Whether the marker can be tabbed to with a keyboard and clicked by pressing enter.
	 * </br>
	 * default true
	 * @return the keyboard
	 */
	@JsOverlay public final Boolean getKeyboard() {
		return this.keyboard;
	}


	/**
	 * Gets Text for the browser tooltip that appear on marker hover (no tooltip by default).
	 * </br>
	 * 
	 * @return the title
	 */
	@JsOverlay public final String getTitle() {
		return this.title;
	}
	
	/**
	 * Gets the text for the alt attribute of the icon image (useful for accessibility).
	 * </br>
	 * 
	 * @return the title
	 */
	@JsOverlay public final String getAlt() {
		return this.alt;
	}


	/**
	 * Gets z index offset
	 * </br>
	 * default 0
	 * @return the z index offset
	 */
	@JsOverlay public final Number getzIndexOffset() {
		return this.zIndexOffset;
	}


	/**
	 * Gets The opacity of the marker.
	 * </br>
	 * default 1.0
	 * @return the opacity
	 */
	@JsOverlay public final Number getOpacity() {
		return this.opacity;
	}


	/**
	 * Gets whether the marker will get on top of others when you hover the mouse over it.
	 * </br>
	 * default false
	 * @return the rise on hover
	 */
	@JsOverlay public final Boolean getRiseOnHover() {
		return this.riseOnHover;
	}


	/**
	 * Gets The z-index offset used for the riseOnHover feature.
	 * </br>
	 * default 250
	 * @return the rise offset
	 */
	@JsOverlay public final Number getRiseOffset() {
		return this.riseOffset;
	}
	
	
	
	@JsOverlay public final String getPane() {
		return this.pane;
	}
	
	@JsOverlay public final String getAttribution() {
		return this.attribution;
	}


	@JsOverlay public final Boolean getInteractive() {
		return this.interactive;
	}


	/**
	 * The Class Builder.
	 */
	public static class Builder{
		
        private Icon icon = null;
		
		private Boolean clickable = true;
		
		private Boolean draggable = false;
		
		private Boolean keyboard = true;
		
		private String title = "";
		
		private String alt = "";
		
		private Number zIndexOffset = 0;
		
		private Number opacity = 1.0;
		
		private Boolean riseOnHover = false;
		
		private Number riseOffset = 250;
		
		private Boolean interactive = true;
		
		private String pane = "markerPane";
		
		private String attribution;
		
		
		/**
		 * Instantiates a new builder.
		 */
		public Builder(){
			
			
		}
		

		/**
		 * Icon class to use for rendering the marker. See Icon documentation for details on how to customize the marker icon. Set to new L.Icon.Default() by default
		 * </br>
		 * 
		 * @param icon the icon
		 * @return the builder
		 */
		public Builder icon (Icon icon){ this.icon = icon; return this;}

		
		/**
		 * If false, the marker will not emit mouse events and will act as a part of the underlying map.
		 * </br>
		 * default true
		 * @param clickable the clickable
		 * @return the builder
		 */
		public Builder clickable(Boolean clickable){this.clickable = clickable; return this;}

		
		/**
		 * Whether the marker is draggable with mouse/touch or not.
		 * </br>
		 * default false
		 * @param draggable the draggable
		 * @return the builder
		 */
		public Builder draggable(Boolean draggable){this.draggable = draggable; return this;}

		
		/**
		 * Whether the marker can be tabbed to with a keyboard and clicked by pressing enter.
		 * </br>
		 * default true
		 * @param keyboard the keyboard
		 * @return the builder
		 */
		public Builder keyboard(Boolean keyboard){this.keyboard = keyboard; return this;}

		
		/**
		 * Text for the browser tooltip that appear on marker hover (no tooltip by default).
		 * </br>
		 * 
		 * @param title the title
		 * @return the builder
		 */
		public Builder title(String title){this.title = title; return this;}
		
		/**
		 * Text for the alt attribute of the icon image (useful for accessibility).
		 * </br>
		 * @param alt the alt
		 * @return the builder
		 */
		public Builder alt(String alt){this.alt = alt; return this;}

		
		/**
		 * By default, zIndex for the marker image is set automatically based on its latitude. Use this option if you want to put the marker on top of all others (or below), specifying a high value like 1000 (or high negative value, respectively).
		 * </br>
		 * default 0 
		 * @param zIndexOffset the z index offset
		 * @return the builder
		 */
		public Builder zIndexOffset(Number zIndexOffset){this.zIndexOffset = zIndexOffset; return this;}

		
		/**
		 * The opacity of the marker.
		 * </br>
		 * default 1.0
		 * @param opacity the opacity
		 * @return the builder
		 */
		public Builder opacity(Number opacity){this.opacity = opacity; return this;}

		
		/**
		 * If true, the marker will get on top of others when you hover the mouse over it.
		 * </br>
		 * default false
		 * @param riseOnHover the rise on hover
		 * @return the builder
		 */
		public Builder riseOnHover(Boolean riseOnHover){this.riseOnHover = riseOnHover; return this;}

		
		/**
		 * The z-index offset used for the riseOnHover feature.
		 * </br>
		 * default 250
		 * @param riseOffset the rise offset
		 * @return the builder
		 */
		public Builder riseOffset(Number riseOffset){this.riseOffset = riseOffset; return this;}
		
	   
		public Builder pane(String pane){this.pane = pane; return this;}

	    public Builder attribution(String attribution){this.attribution = attribution; return this;}
	    
	    public Builder interactive(Boolean interactive){this.interactive = interactive; return this;}
		
		
		/**
		 * Builds the MarkerOptions new instace
		 *
		 * @return the marker options
		 */
		public MarkerOptions build(){
			
			MarkerOptions options = new MarkerOptions();
			options.icon = this.icon;
			options.clickable = this.clickable;
			options.draggable = this.draggable;
			options.keyboard = this.keyboard;
			options.title = this.title;
			options.alt = this.alt;
			options.zIndexOffset = this.zIndexOffset;
			options.opacity = this.opacity;
			options.riseOnHover = this.riseOnHover;
			options.riseOffset = this.riseOffset;
			options.interactive = this.interactive;
			options.pane = this.pane;
			options.attribution = this.attribution;
			
			
			return options;
		}
		
		
		
	}

}