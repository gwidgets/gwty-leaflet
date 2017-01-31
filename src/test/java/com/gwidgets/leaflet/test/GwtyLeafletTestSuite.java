package com.gwidgets.leaflet.test;

import com.google.gwt.junit.tools.GWTTestSuite;

import junit.framework.TestSuite;


public class GwtyLeafletTestSuite extends GWTTestSuite {
	
	 public static TestSuite suite() {
	        TestSuite suite = new TestSuite("gwty-leaflet tests");
//	        suite.addTestSuite(MapTest.class); 
//	        suite.addTestSuite(MarkerTest.class);
	        suite.addTestSuite(PathTest.class);
//	        suite.addTestSuite(VersionTest.class);
	        
	        return suite;
	 }
	 
}
