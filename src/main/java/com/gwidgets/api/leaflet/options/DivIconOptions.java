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
 * The Class DivIconOptions.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class DivIconOptions {
	
	/**
	 * Instantiates a new div icon options.
	 */
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
	
	/*****************************************
	********************************************/
    @JsProperty
    private Point bgPos;
	/**********************************************
	*********************************************/
    
    /*****************************************
	********************************************/
    @JsProperty
     private String iconUrl;
	/**********************************************
	*********************************************/
    @JsProperty
    private String iconRetinaUrl;
    /*****************************************
	********************************************/
    @JsProperty
    private String shadowUrl;
	/**********************************************
	*********************************************/
    @JsProperty
    private String shadowRetinaUrl;
	/**********************************************
	*********************************************/
    @JsProperty
    private Point shadowSize;
    /**********************************************
	*********************************************/
    @JsProperty
    private Point shadowAnchor;
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
	 * Gets the size of the icon in pixels. Can be also set through CSS.
	 *
	 * @return the icon size
	 */
	@JsOverlay public final Point getIconSize() {
		return this.iconSize;
	}


	/**
	 * Gets The coordinates of the "tip" of the icon (relative to its top left corner). The icon will be aligned so that this point is at the marker's geographical location. Centered by default if size is specified, also can be set in CSS with negative margins.
	 *
	 * @return the icon anchor
	 */
	@JsOverlay public final Point getIconAnchor() {
		return this.iconAnchor;
	}
	
	/**
	 * Gets The coordinates of the point from which popups will "open", relative to the icon anchor.
	 *
	 * @return the pop up anchor
	 */
	@JsOverlay public final Point getPopUpAnchor() {
		return this.popUpAnchor;
	}



	/**
	 * Gets the custom class name assigned to the icon. 'leaflet-div-icon' by default.
	 *
	 * @return the class name
	 */
	@JsOverlay public final String getClassName() {
		return this.className;
	}


	/**
	 * Gets the custom HTML code put inside the div element, empty by default.
	 *
	 * @return the html
	 */
	@JsOverlay public final String getHtml() {
		return this.html;
	}


	/**
	 * <p>Getter for the field <code>bgPos</code>.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.Point} object
	 */
	@JsOverlay public final Point getBgPos() {
		return this.bgPos;
	}


	/**
	 * <p>Getter for the field <code>iconUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsOverlay public final String getIconUrl() {
		return this.iconUrl;
	}


	/**
	 * <p>Getter for the field <code>iconRetinaUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsOverlay public final String getIconRetinaUrl() {
		return this.iconRetinaUrl;
	}


	/**
	 * <p>Getter for the field <code>shadowUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsOverlay public final String getShadowUrl() {
		return this.shadowUrl;
	}


	/**
	 * <p>Getter for the field <code>shadowRetinaUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsOverlay public final String getShadowRetinaUrl() {
		return this.shadowRetinaUrl;
	}


	/**
	 * <p>Getter for the field <code>shadowSize</code>.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.Point} object
	 */
	@JsOverlay public final Point getShadowSize() {
		return this.shadowSize;
	}


	/**
	 * <p>Getter for the field <code>shadowAnchor</code>.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.Point} object
	 */
	@JsOverlay public final Point getShadowAnchor() {
		return this.shadowAnchor;
	}


	/**
	 * <p>Getter for the field <code>pane</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsOverlay public final String getPane() {
		return this.pane;
	}


	/**
	 * <p>Getter for the field <code>attribution</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsOverlay public final String getAttribution() {
		return this.attribution;
	}


	/**
	 * The Class Builder.
	 */
	public static class Builder {
		
		private Point iconSize;

		
		private Point iconAnchor;
		
		
		private Point popUpAnchor;

		private String className;

		private String html;
		
		 private Point bgPos;
		    
		    
	     private String iconUrl;

	    
	    private String iconRetinaUrl;

	    
	    private String shadowUrl;

	    
	    private String shadowRetinaUrl;

	    
	    private Point shadowSize;

	    
	    private Point shadowAnchor;

	    
	    private String pane;

	    
	    private String attribution;

		
		/**
		 * Instantiates a new builder. Takes the icon url as a required paramater.
		 *
		 * @param iconUrl the icon url 
		 */
		public Builder(String iconUrl) {
            this.iconUrl = iconUrl;
		}
		
		/**
		 * Size of the icon in pixels. Can be also set through CSS.
		 *
		 * @param iconSize the icon size
		 * @return the builder
		 */
		public Builder iconSize(Point iconSize){this.iconSize = iconSize; return this;}

		/**
		 * The coordinates of the "tip" of the icon (relative to its top left corner). The icon will be aligned so that this point is at the marker's geographical location. Centered by default if size is specified, also can be set in CSS with negative margins.
		 *
		 * @param iconAnchor the icon anchor
		 * @return the builder
		 */
		public Builder iconAnchor(Point iconAnchor){this.iconAnchor = iconAnchor; return this;}
		
		/**
		 * The coordinates of the point from which popups will "open", relative to the icon anchor.
		 *
		 * @param popUpAnchor the pop up anchor
		 * @return the builder
		 */
		public Builder popUpAnchor(Point popUpAnchor){this.popUpAnchor = popUpAnchor; return this;}

		/**
		 * A custom class name to assign to the icon. 'leaflet-div-icon' by default.
		 *
		 * @param className the class name
		 * @return the builder
		 */
		public Builder className(String className){this.className = className; return this;}

		/**
		 * A custom HTML code to put inside the div element, empty by default.
		 *
		 * @param html the html
		 * @return the builder
		 */
		public Builder html(String html){this.html = html; return this;}
		
		public Builder bgPos(Point bgPos){this.bgPos = bgPos; return this;}

	    public Builder iconRetinaUrl(String iconRetinaUrl){this.iconRetinaUrl = iconRetinaUrl; return this;}

	    public Builder shadowUrl(String shadowUrl){this.shadowUrl = shadowUrl; return this;}

	    public Builder shadowRetinaUrl(String shadowRetinaUrl){this.shadowRetinaUrl = shadowRetinaUrl; return this;}

	    public Builder shadowSize(Point shadowSize){this.shadowSize = shadowSize; return this;}

	    public Builder shadowAnchor(Point shadowAnchor){this.shadowAnchor = shadowAnchor; return this;}

	    public Builder pane(String pane){this.pane = pane; return this;}

	    public Builder attribution(String attribution){this.attribution = attribution; return this;}
		
		
		
		/**
		 * Builds th DivIconOptions new instance
		 *
		 * @return the div icon options
		 */
		public DivIconOptions build(){
			
			DivIconOptions options = new DivIconOptions();
			if(this.iconSize != null)
			options.iconSize = this.iconSize;
			if(this.iconAnchor != null)
			options.iconAnchor = this.iconAnchor;
			if(this.popUpAnchor != null)
			options.popUpAnchor = this.popUpAnchor;
			if(this.className != null)
			options.className = this.className;
			if(this.html != null)
			options.html = this.html;
			if(this.iconUrl != null)
			options.iconUrl = this.iconUrl;
			if(this.bgPos != null)
		    options.bgPos = this.bgPos;
			if(this.iconRetinaUrl != null)
		    options.iconRetinaUrl = this.iconRetinaUrl;
			if(this.shadowUrl != null)
		    options.shadowUrl = this.shadowUrl;
			if(this.shadowRetinaUrl != null)
		    options.shadowRetinaUrl = this.shadowRetinaUrl;
			if(this.shadowSize != null)
		    options.shadowSize = this.shadowSize;
			if(this.shadowAnchor != null)
		    options.shadowAnchor = this.shadowAnchor;
			if(this.pane != null)
		    options.pane = this.pane;
			if(this.attribution != null)
		    options.attribution = this.attribution;
					
			return options;
		}
	}
}
