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

import com.gwidgets.api.leaflet.Point;


/**
 * The Class DivIconOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
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
	 * The Class Builder.
	 */
	public static class Builder {
		
		private Point iconSize;

		
		private Point iconAnchor;
		
		
		private Point popUpAnchor;

		private String className = "leaflet-div-icon";

		private String html = "";

		
		public Builder() {

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
		
		/**
		 * Builds th DivIconOptions new instance
		 *
		 * @return the div icon options
		 */
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