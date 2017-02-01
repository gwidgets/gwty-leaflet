package com.gwidgets.leaflet.test;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.elemental.Function;

public class VersionTest extends GwtyLeafletTestCase {
	
	public void testLeafletVersion(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {

				   assertEquals(L.version, "1.0.0");
					
					return null;
			}
		});
	}

}
