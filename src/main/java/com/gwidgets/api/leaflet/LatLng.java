package com.gwidgets.api.leaflet;

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
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Represents a geographical point with a certain latitude and longitude.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class LatLng {

	
	


	private LatLng() {
		
	}

	/** Latitude in degrees. */
	@JsProperty
	public Number lat;

	/** Longitude in degrees.The lng. */
	@JsProperty
	public Number lng;
	
	
	
    /**
     * Instantiates a new lat lng.
     *
     * @param lat the lat
     * @param lng the lng
     */
    @JsConstructor
	public LatLng(Number lat, Number lng) {
	
	}

	/**
	 * Returns the distance (in meters) to the given LatLng calculated using the Haversine formula. 
	 *
	 * @param otherLatlng the other latlng
	 * @return the distance (in meters)
	 */
	@JsMethod
	public native Number distanceTo(LatLng otherLatlng);

	/**
	 * Returns true if the given LatLng point is at the same position (within a small margin of error).
	 *
	 * @param otherLatlng the other latlng
	 * @return true/false
	 */
	@JsMethod
	public native Boolean equals(LatLng otherLatlng);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@JsMethod
	public native String toString();

	/**
	 * Returns a new LatLng object with the longitude wrapped around left and right boundaries (-180 to 180 by default).
	 *
	 * @param left the left
	 * @param right the right
	 * @return the lat lng
	 */
	@JsMethod
	public native LatLng wrap(Number left, Number right);

}