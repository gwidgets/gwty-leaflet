package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Point {

	@JsProperty
	Number x;

	@JsProperty
	Number y;

	@JsConstructor
	public Point(Number newX, Number newY) {

	}

	@JsMethod
	public native Point add(Point otherPoint);

	@JsMethod
	public native Point subtract(Point otherPoint);

	@JsMethod
	public native Point multiplyBy(Number number);

	@JsMethod
	public native Point divideBy(Number number, Boolean round);

	@JsMethod
	public native Number distanceTo(Point otherPoint);

	@JsMethod
	public native Point clone();

	@JsMethod
	public native Point round();

	@JsMethod
	public native Boolean equals(Point otherPoint);

	@JsMethod
	public native String toString();

}