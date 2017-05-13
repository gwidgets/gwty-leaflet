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

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.elemental.HTMLElement;



/**
 * The base event object. All other event objects contain these properties too.
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
public class Event  extends JavaScriptObject {
	
	
	protected Event(){
		
		
	}
	
	/**
	 * Gets the event type (e.g. 'click').
	 *
	 * @return the type
	 */
	public final native  String getType() /*-{
	return this.target;
    }-*/;

	/**
	 * Gets the object that fired the event..
	 *
	 * @return the target
	 */
	public final native HTMLElement getTarget()  /*-{
		return this.target;
	}-*/;

	
	

}