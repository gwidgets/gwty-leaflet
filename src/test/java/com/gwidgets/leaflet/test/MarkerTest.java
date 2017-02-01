package com.gwidgets.leaflet.test;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Map;
import com.gwidgets.api.leaflet.Marker;
import com.gwidgets.api.leaflet.elemental.Document;
import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.MarkerOptions;

public class MarkerTest extends GwtyLeafletTestCase{
	
	
	public void testMarkeradd(){
		InjectedLeafletResources.whenReady(new Function(){
			public JavaScriptObject call(JavaScriptObject event) {
				 HTMLElement div = Document.createElement("div");
				    div.id = "test6";
				    Document.getBody().appendChild(div);
				   
					Map map = L.map("test6", null);
					MarkerOptions mkOptions = new MarkerOptions.Builder().build();
                    Marker marker = L.marker(L.latLng(52.51, 13.40), mkOptions);
                    marker.addTo(map);
                    
					assertNotNull(map);
					assertNotNull(marker);
					
					assertEquals(marker.getLatLng().lat, 52.51);
					assertEquals(marker.getLatLng().lng, 13.40);
					
					return null;
			}
		});
	}

}
