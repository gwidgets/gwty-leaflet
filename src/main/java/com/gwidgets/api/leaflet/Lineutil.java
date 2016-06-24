package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Lineutil {

	@JsMethod
	public native Point[] simplify(Point[] points, Number tolerance);

	@JsMethod
	public native Number pointToSegmentDistance(Point p, Point p1, Point p2);

	@JsMethod
	public native Point closestPointOnSegment(Point p, Point p1, Point p2);

	@JsMethod
	public native void clipSegment(Point a, Point b, Bounds bounds);

}