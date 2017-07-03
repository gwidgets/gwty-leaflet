package com.gwidgets.leaflet.test;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.Map;
import com.gwidgets.api.leaflet.Marker;
import com.gwidgets.api.leaflet.options.MarkerOptions;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;

public class MarkerTest extends GwtyLeafletTestCase{
	
	
	public void testMarkeradd(){
		InjectedLeafletResources.whenReady((e) -> {
				 HTMLElement div = (HTMLElement) DomGlobal.document.createElement("div");
				    div.id = "test6";
				    DomGlobal.document.body.appendChild(div);
				   
					Map map = L.map("test6", null);
					MarkerOptions mkOptions = new MarkerOptions.Builder().build();
                    Marker marker = L.marker(L.latLng(52.51, 13.40), mkOptions);
                    marker.addTo(map);
                    
					assertNotNull(map);
					assertNotNull(marker);
					
					assertEquals(marker.getLatLng().lat, 52.51);
					assertEquals(marker.getLatLng().lng, 13.40);
					
					return null;
		});
	}

}
