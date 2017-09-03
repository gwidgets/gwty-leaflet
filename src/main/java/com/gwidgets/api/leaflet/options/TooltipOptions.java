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
	private boolean permanent;	

    @JsProperty
	private String direction;	

    @JsProperty
	private boolean sticky;	

    @JsProperty
	private boolean interactive;	

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
	public final boolean getPermanent() {
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
	public final boolean getSticky() {
		return this.sticky;
	}



	/** If true, the tooltip will listen to the feature events.
		 */
	@JsOverlay
	public final boolean getInteractive() {
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
		
		private String pane;
	
		private  Point  offset;

		private  Boolean permanent;	

		private  String direction;	

		private  Boolean sticky;	

		private  Boolean interactive;	

		private  Double opacity;	
		
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
		public Builder opacity(Double opacity){this.opacity = opacity; return this;}
		
		public Builder className(String className){this.className = className; return this;}
		
		public Builder attribution(String attribution){this.attribution = attribution; return this;}
		
		
		public TooltipOptions build(){
			TooltipOptions toolTipOptions = new TooltipOptions();
			if(this.pane != null)
			toolTipOptions.pane = this.pane;
			if(this.offset != null)
			toolTipOptions.offset = this.offset;
			if(this.direction != null)
			toolTipOptions.direction = this.direction;
			if(this.permanent != null)
			toolTipOptions.permanent = this.permanent;
			if(this.sticky != null)
			toolTipOptions.sticky = this.sticky;
			if(this.interactive != null)
			toolTipOptions.interactive = this.interactive;
			if(this.opacity != null)
			toolTipOptions.opacity = this.opacity;
			if(this.attribution != null)
			toolTipOptions.attribution = this.attribution;
			if(this.className != null)
			toolTipOptions.className = this.className;
			
			return toolTipOptions;
		}
	}
}