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
package com.gwidgets.api.leaflet.events;


/**
 * The Class DragEndEvent.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
public class DragEndEvent extends Event {

	
	protected DragEndEvent() {

	}

	/**
	 * Gets the distance in pixels the draggable element was moved by.
	 *
	 * @return the distance
	 */
	public native double getDistance()/*-{
		return this.distance;
	}-*/;

}
