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

import static jsinterop.annotations.JsPackage.GLOBAL;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Point;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Class TooltipOptions.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class TooltipOptions {
	
    @JsProperty
	private String pane;
	
    @JsProperty
	private  Point  offset;	

    @JsProperty
	private Boolean permanent;	

    @JsProperty
	private String direction;	

    @JsProperty
	private Boolean sticky;	

    @JsProperty
	private Boolean interactive;	

    @JsProperty
	private double opacity;	
    
    /*****************************************
	********************************************/
    @JsProperty
    private String className;
	/**********************************************
	*********************************************/
    
    /*****************************************
	********************************************/
    @JsProperty
    private String attribution;
	/**********************************************
	*********************************************/
	
	
	private TooltipOptions(){
		
		
	}
	
	
	
	/** Returns the popup bound to this layer.
	* 
		 */
	@JsOverlay
	public final String getPane() {
		return this.pane;
	}



	/** Optional offset of the tooltip position.
		 */
	@JsOverlay
	public final Point getOffset() {
		return this.offset;
	}

	/** Whether to open the tooltip permanently or only on mouseover.
		 */
	@JsOverlay
	public final Boolean getPermanent() {
		return this.permanent;
	}


	/** Direction where to open the tooltip. Possible values are: right, left, top, bottom, center, auto. auto will dynamicaly switch between right and left according to the tooltip position on the map.
		 */
	@JsOverlay
	public final String getDirection() {
		return this.direction;
	}




	/** If true, the tooltip will follow the mouse instead of being fixed at the feature center.
		 */
	@JsOverlay
	public final Boolean getSticky() {
		return this.sticky;
	}



	/** If true, the tooltip will listen to the feature events.
		 */
	@JsOverlay
	public final Boolean getInteractive() {
		return this.interactive;
	}



	/** Tooltip container opacity.
		 */
	@JsOverlay
	public final double getOpacity() {
		return this.opacity;
	}





	@JsOverlay
	public final String getClassName() {
		return this.className;
	}


	@JsOverlay
	public final String getAttribution() {
		return this.attribution;
	}





	public static class Builder{
		
		private String pane	= "tooltipPane";
	
		private  Point  offset = L.point(0, 0, false);

		private  Boolean permanent = false;	

		private  String direction = "auto";	

		private  Boolean sticky = false;	

		private  Boolean interactive = false;	

		private  double opacity	= 0.9;	
		
		private String className;

	    private String attribution;
		
		
		public Builder(){
			
			
		}
		
		/** Returns the popup bound to this layer.
		* @return Builder
			 */
		public Builder pane(String pane){this.pane = pane; return this;}

		/** Optional offset of the tooltip position.
		* @return Builder
			 */
		public Builder offset(Point offset){this.offset = offset; return this;}	


		/** Whether to open the tooltip permanently or only on mouseover.
		* @return Builder
			 */
		public Builder permanent(Boolean permanent){this.permanent = permanent; return this;}	


		/** Direction where to open the tooltip. Possible values are: right, left, top, bottom, center, auto. auto will dynamicaly switch between right and left according to the tooltip position on the map.
		* @return Builder
			 */
		public Builder direction(String direction){this.direction = direction; return this;}


		/** If true, the tooltip will follow the mouse instead of being fixed at the feature center.
		* @return Builder
			 */
		public  Builder sticky(Boolean sticky){this.sticky = sticky; return this;}


		/** If true, the tooltip will listen to the feature events.
		* @return Builder
			 */
		public Builder interactive(Boolean interactive){this.interactive = interactive; return this;}	


		/** Tooltip container opacity.
		* @return Builder
			 */
		public Builder opacity(double opacity){this.opacity = opacity; return this;}
		
		public Builder className(String className){this.className = className; return this;}
		
		public Builder attribution(String attribution){this.attribution = attribution; return this;}
		
		
		public TooltipOptions build(){
			TooltipOptions toolTipOptions = new TooltipOptions();
			toolTipOptions.pane = this.pane; 
			toolTipOptions.offset = this.offset;
			toolTipOptions.direction = this.direction;
			toolTipOptions.permanent = this.permanent;
			toolTipOptions.sticky = this.sticky;
			toolTipOptions.interactive = this.interactive;
			toolTipOptions.opacity = this.opacity;
			toolTipOptions.attribution = this.attribution;
			toolTipOptions.className = this.className;
			
			return toolTipOptions;
		}
		
		
		
	}

}
