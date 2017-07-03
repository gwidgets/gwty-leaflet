package com.gwidgets.leaflet.test;

import com.gwidgets.api.leaflet.L;

public class VersionTest extends GwtyLeafletTestCase {
	
	public void testLeafletVersion(){
		InjectedLeafletResources.whenReady((e) -> {

				   assertEquals(L.version, "1.0.0");
					
					return null;
		});
	}

}
