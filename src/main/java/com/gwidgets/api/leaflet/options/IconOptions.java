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
 * The Class IconOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
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
	
	
		/**
		 * Gets  the URL to the icon image 
		 *
		 * @return the icon url
		 */
		@JsOverlay public final String getIconUrl() {
			return this.iconUrl;
		}


		/**
		 * Gets The URL to a retina sized version of the icon image (absolute or relative to your script path). Used for Retina screen devices.
		 *
		 * @return the icon retina url
		 */
		@JsOverlay public final String getIconRetinaUrl() {
			return this.iconRetinaUrl;
		}


		/**
		 * Gets the size of the icon image in pixels.
		 *
		 * @return the icon size
		 */
		@JsOverlay public final Point getIconSize() {
			return this.iconSize;
		}


		/**
		 * Gets the coordinates of the "tip" of the icon (relative to its top left corner). The icon will be aligned so that this point is at the marker's geographical location. Centered by default if size is specified, also can be set in CSS with negative margins.
		 *
		 * @return the icon anchor
		 */
		@JsOverlay public final Point getIconAnchor() {
			return this.iconAnchor;
		}


		/**
		 * Gets the URL to the icon shadow image. If not specified, no shadow image will be created.
		 *
		 * @return the shadow url
		 */
		@JsOverlay public final String getShadowUrl() {
			return this.shadowUrl;
		}


		/**
		 * Gets the URL to the retina sized version of the icon shadow image. If not specified, no shadow image will be created. Used for Retina screen devices.
		 *
		 * @return the shadow retina url
		 */
		@JsOverlay public final String getShadowRetinaUrl() {
			return this.shadowRetinaUrl;
		}


		/**
		 * Gets the size of the shadow image in pixels.
		 *
		 * @return the shadow size
		 */
		@JsOverlay public final Point getShadowSize() {
			return this.shadowSize;
		}


		/**
		 * Gets the coordinates of the "tip" of the shadow (relative to its top left corner) (the same as iconAnchor if not specified).
		 *
		 * @return the shadow anchor
		 */
		@JsOverlay public final Point getShadowAnchor() {
			return this.shadowAnchor;
		}


		/**
		 * Gets the coordinates of the point from which popups will "open", relative to the icon anchor.
		 *
		 * @return the popup anchor
		 */
		@JsOverlay public final Point getPopupAnchor() {
			return this.popupAnchor;
		}


		/**
		 * Gets the class name assigned to both icon and shadow images. Empty by default.
		 *
		 * @return the class name
		 */
		@JsOverlay public final String getClassName() {
			return this.className;
		}


	/**
	 * The Class Builder.
	 */
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

		private String className = "";

		/**
		 * Instantiates a new builder. takes the icon url (absolute or relative to your script path) as a required parameter
		 *
		 * @param iconUrl the icon url
		 */
		public Builder(String iconUrl) {
			this.iconUrl = iconUrl;

		}
		
		/**
		 * The URL to a retina sized version of the icon image (absolute or relative to your script path). Used for Retina screen devices.
		 *
		 * @param iconRetinaUrl the icon retina url
		 * @return the builder
		 */
		public Builder iconRetinaUrl(String iconRetinaUrl){this.iconRetinaUrl = iconRetinaUrl; return this;}

		
		/**
		 * Size of the icon image in pixels.
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
		 * The URL to the icon shadow image. If not specified, no shadow image will be created.
		 *
		 * @param shadowUrl the shadow url
		 * @return the builder
		 */
		public Builder shadowUrl(String shadowUrl){this.shadowUrl = shadowUrl; return this;}

		
		/**
		 * The URL to the retina sized version of the icon shadow image. If not specified, no shadow image will be created. Used for Retina screen devices.
		 *
		 * @param shadowRetinaUrl the shadow retina url
		 * @return the builder
		 */
		public Builder shadowRetinaUrl(String shadowRetinaUrl){this.shadowRetinaUrl = shadowRetinaUrl; return this;}

		
		/**
		 * Size of the shadow image in pixels.
		 *
		 * @param shadowSize the shadow size
		 * @return the builder
		 */
		public Builder shadowSize(Point shadowSize){this.shadowSize = shadowSize; return this;}

		
		/**
		 * The coordinates of the "tip" of the shadow (relative to its top left corner) (the same as iconAnchor if not specified).
		 *
		 * @param shadowAnchor the shadow anchor
		 * @return the builder
		 */
		public Builder shadowAnchor(Point shadowAnchor){this.shadowAnchor = shadowAnchor; return this;}

		
		/**
		 * The coordinates of the point from which popups will "open", relative to the icon anchor.
		 *
		 * @param popupAnchor the popup anchor
		 * @return the builder
		 */
		public Builder popupAnchor(Point popupAnchor){this.popupAnchor = popupAnchor; return this;}

		
		/**
		 * A custom class name to assign to both icon and shadow images. Empty by default.
		 *
		 * @param className the class name
		 * @return the builder
		 */
		public Builder className(String className){this.className = className; return this;}
		
		/**
		 * Builds the.
		 *
		 * @return the icon options
		 */
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