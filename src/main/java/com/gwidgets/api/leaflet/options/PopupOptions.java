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
 * The Class PopupOptions.
 *
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class PopupOptions {

	private PopupOptions() {
		
	}

    @JsProperty
	private double maxWidth;

	@JsProperty
	private double minWidth;

	@JsProperty
	private double maxHeight;

	@JsProperty
	private boolean autoPan;

	@JsProperty
	private boolean keepInView;

	@JsProperty
	private boolean closeButton;

	@JsProperty
	private Point offset;
	
	@JsProperty
	private Point autoPanPaddingTopLeft;
	
	@JsProperty
	private Point autoPanPaddingBottomRight;

	@JsProperty
	private Point autoPanPadding;


	@JsProperty
	private boolean autoClose;
	
	@JsProperty
	private String className;
	
	
    @JsProperty
    private String pane;
    /**********************************************
   	*********************************************/
    @JsProperty
    private String attribution;
    /**********************************************
   	*********************************************/

	
	/**
	 * Gets the max width of the popup
	 *
	 * @return the max width
	 */
	@JsOverlay public final double getMaxWidth() {
		return this.maxWidth;
	}



	/**
	 * Gets the min width of the popup.
	 *
	 * @return the min width
	 */
	@JsOverlay public final double getMinWidth() {
		return this.minWidth;
	}



	/**
	 * Gets the max height of the popup
	 *
	 * @return the max height
	 */
	@JsOverlay public final double getMaxHeight() {
		return this.maxHeight;
	}



	/**
	 * Gets the auto pan of the popup
	 *
	 * @return the auto pan
	 */
	@JsOverlay public final boolean getAutoPan() {
		return this.autoPan;
	}



	/**
	 * Gets whether to prevent users from panning the popup off of the screen while it is open.
	 *
	 * @return the keep in view
	 */
	@JsOverlay public final boolean getKeepInView() {
		return this.keepInView;
	}



	/**
	 * Gets whether to display a close button on the popup
	 *
	 * @return the close button
	 */
	@JsOverlay public final boolean getCloseButton() {
		return this.closeButton;
	}



	/**
	 * Gets The offset of the popup position. Useful to control the anchor of the popup when opening it on some overlays.
	 *
	 * @return the offset
	 */
	@JsOverlay public final Point getOffset() {
		return this.offset;
	}



	/**
	 * Gets The margin between the popup and the top left corner of the map view after autopanning was performed.
	 *
	 * @return the auto pan padding top left
	 */
	@JsOverlay public final Point getAutoPanPaddingTopLeft() {
		return this.autoPanPaddingTopLeft;
	}



	/**
	 * Gets The margin between the popup and the bottom right corner of the map view after autopanning was performed.
	 *
	 * @return the auto pan padding bottom right
	 */
	@JsOverlay public final Point getAutoPanPaddingBottomRight() {
		return this.autoPanPaddingBottomRight;
	}



	/**
	 * Gets whether top left and bottom right autopan padding are set to the same value.
	 *
	 * @return the auto pan padding
	 */
	@JsOverlay public final Point getAutoPanPadding() {
		return this.autoPanPadding;
	}



	/**
	 * Gets whether to override the default behavior of the popup closing when user clicks the map (set globally by the Map closePopupOnClick option).
	 *
	 * @return the close on click
	 */
	@JsOverlay public final boolean getAutoClose() {
		return this.autoClose;
	}



	/**
	 * Gets the custom class name to assign to the popup.
	 *
	 * @return the class name
	 */
	@JsOverlay public final String getClassName() {
		return this.className;
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
		
		private Double maxWidth;

		
		private Double minWidth;

		
		private Double maxHeight;

		
		private Boolean autoPan;

		
		private Boolean keepInView;

		
		private Boolean closeButton;

		
		private Point offset;
		

		private Point autoPanPaddingTopLeft;
		

		private Point autoPanPaddingBottomRight;

		private Point autoPanPadding;

		private Boolean autoClose;
		
		private String className;
		
		   
	    private String pane;

	    
	    private String attribution;

		
		public Builder() {

		}
		
	    
		/**
		 * Max width of the popup.
		 *
		 * @param maxWidth the max width
		 * @return the builder
		 */
		public Builder maxWidth(Double maxWidth){this.maxHeight = maxWidth;return this;}

		
		/**
		 * Min width of the popup.
		 *
		 * @param minWidth the min width
		 * @return the builder
		 */
		public Builder minWidth(Double minWidth){this.minWidth = minWidth; return this;}

		
		/**
		 * If set, creates a scrollable container of the given height inside a popup if its content exceeds it.
		 *
		 * @param maxHeight the max height
		 * @return the builder
		 */
		public Builder maxHeight(Double maxHeight){this.maxHeight = maxHeight; return this;}

		
		/**
		 * Set it to false if you don't want the map to do panning animation to fit the opened popup.
		 *
		 * @param autoPan the auto pan
		 * @return the builder
		 */
		public Builder autoPan(Boolean autoPan){this.autoPan = autoPan; return this;}

		
		/**
		 * Set it to true if you want to prevent users from panning the popup off of the screen while it is open.
		 *
		 * @param keepInView the keep in view
		 * @return the builder
		 */
		public Builder keepInView(Boolean keepInView){this.keepInView = keepInView; return this;}

		
		/**
		 * Controls the presence of a close button in the popup.
		 *
		 * @param closeButton the close button
		 * @return the builder
		 */
		public Builder closeButton(Boolean closeButton){this.closeButton = closeButton; return this;}

		
		/**
		 * The offset of the popup position. Useful to control the anchor of the popup when opening it on some overlays.
		 *
		 * @param offset the offset
		 * @return the builder
		 */
		public Builder offset(Point offset){this.offset = offset; return this;}
		
	    
		/**
		 * The margin between the popup and the top left corner of the map view after autopanning was performed.
		 *
		 * @param autoPanPaddingTopLeft the auto pan padding top left
		 * @return the builder
		 */
		public Builder autoPanPaddingTopLeft(Point autoPanPaddingTopLeft){this.autoPanPaddingTopLeft = autoPanPaddingTopLeft; return this;}
		

		/**
		 * The margin between the popup and the bottom right corner of the map view after autopanning was performed.
		 *
		 * @param autoPanPaddingBottomRight the auto pan padding bottom right
		 * @return the builder
		 */
		public Builder autoPanPaddingBottomRight(Point autoPanPaddingBottomRight){this.autoPanPaddingBottomRight = autoPanPaddingBottomRight; return this;}

		
		/**
		 * Equivalent of setting both top left and bottom right autopan padding to the same value.
		 *
		 * @param autoPanPadding the auto pan padding
		 * @return the builder
		 */
		public Builder autoPanPadding(Point autoPanPadding){this.autoPanPadding = autoPanPadding; return this;}

		
		/**
		 * Set it to false if you want to override the default behavior of the popup closing when user clicks the map (set globally by the Map closePopupOnClick option).
		 *
		 * @param autoClose the close on click
		 * @return the builder
		 */
		public Builder autoClose(Boolean autoClose){this.autoClose = autoClose; return this;}
		
		/**
		 * A custom class name to assign to the popup.
		 *
		 * @param className
		 *            the class name
		 * @return the builder
		 */
		public Builder className(String className){this.className = className; return this;};
		
	    public Builder pane(String pane){this.pane = pane; return this;}

	    public Builder attribution(String attribution){this.attribution = attribution; return this;}
		
		
		/**
		 * Builds the PopupOptions
		 *
		 * @return the popup options
		 */
		public PopupOptions build(){
			PopupOptions options = new PopupOptions();
			if(this.maxWidth != null)
			options.maxWidth = this.maxWidth;
			if(this.minWidth != null)
			options.minWidth = this.minWidth;
			if(this.maxHeight != null)
			options.maxHeight = this.maxHeight;
			if(this.autoPan != null)
			options.autoPan = this.autoPan;
			if(this.keepInView != null)
			options.keepInView = this.keepInView;
			if(this.closeButton != null)
			options.closeButton = this.closeButton;
			if(this.offset != null)
			options.offset = this.offset;
			if(this.autoPanPaddingTopLeft != null)
			options.autoPanPaddingTopLeft = this.autoPanPaddingTopLeft;
			if(this.autoPanPaddingBottomRight != null)
			options.autoPanPaddingBottomRight = this.autoPanPaddingBottomRight;
			if(this.autoPanPadding != null)
			options.autoPanPadding = this.autoPanPadding;
			if(this.autoClose != null)
			options.autoClose = this.autoClose;
			if(this.className != null)
			options.className = this.className;
			if(this.pane != null)
			options.pane = this.pane;
			if(this.attribution != null)
			options.attribution = this.attribution;
			
			return options;	
		}
	}
}
