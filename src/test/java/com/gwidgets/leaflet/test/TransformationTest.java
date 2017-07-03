package com.gwidgets.leaflet.test;

import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.L.Transformation;
import com.gwidgets.api.leaflet.Point;

public class TransformationTest extends GwtyLeafletTestCase {
	
	
	/******* test fails for equal method *********/
	
	public void testTransformation(){
		InjectedLeafletResources.whenReady((e) -> {
				
				  Transformation trans = new L.Transformation(1, 3, 5, 7);
				   assertNotNull(trans);
				   Point testpoint = L.point(15, 7, false);
				   Point transformed = trans.transform(testpoint, 1);
				   Point untransformed = trans.untransform(transformed, 1);
				   
				   assertEquals(testpoint.toString(), untransformed.toString());
				   assertEquals(String.valueOf(testpoint.x), String.valueOf(untransformed.x));
				   assertEquals(String.valueOf(testpoint.y), String.valueOf(untransformed.y));
				 //  assertTrue(untransformed.equals(testpoint));
				   

					return null;
		});
	}

}
