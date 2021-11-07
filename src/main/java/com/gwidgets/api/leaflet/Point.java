package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

// TODO: Auto-generated Javadoc
/**
 *Represents a point with x and y coordinates in pixels.
 *
 *@author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 * @version $Id: $Id
 */
@JsType(isNative = true)
public class Point {
	
	

	/** The x coordinate. */
	@JsProperty
	public double x;

	/** The The y coordinate. */
	@JsProperty
	public double y;



	/**
	 * Returns the result of addition of the current and the given points.
	 *
	 * @param otherPoint the other point
	 * @return the point
	 */
	@JsMethod
	public native Point add(Point otherPoint);

	/**
	 * Returns the result of subtraction of the given point from the current.
	 *
	 * @param otherPoint the other point
	 * @return the point
	 */
	@JsMethod
	public native Point subtract(Point otherPoint);

	/**
	 * Returns the result of multiplication of the current point by the given number.
	 *
	 * @param number the number
	 * @return the point
	 */
	@JsMethod
	public native Point multiplyBy(double number);

	/**
	 * Returns the result of division of the current point by the given number. If optional round is set to true, returns a rounded result.
	 *
	 * @param number the number
	 * @param round the round
	 * @return the point
	 */
	@JsMethod
	public native Point divideBy(double number, Boolean round);

	/**
	 * Returns the distance between the current and the given points.
	 *
	 * @param otherPoint the other point
	 * @return the number
	 */
	@JsMethod
	public native double distanceTo(Point otherPoint);

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	/**
	 * <p>clone.</p>
	 *
	 * @return a {@link com.gwidgets.api.leaflet.Point} object
	 */
	@JsMethod
	public native Point clone();

	/**
	 * Returns a copy of the current point with rounded coordinates.
	 *
	 * @return the point
	 */
	@JsMethod
	public native Point round();
	
	
	/**
	 * Returns a copy of the current point with floored coordinates (rounded down).
	 *
	 * @return the point
	 */
	@JsMethod
	public native Point floor();
	
	
	
	/**
	 * Returns true if the both coordinates of the given point are less than the corresponding current point coordinates (in absolute values).
	 *
	 * @param point the point
	 * @return true/false
	 */
	@JsMethod
	public native Boolean contains(Point point);

	/**
	 * Returns true if the given point has the same coordinates.
	 *
	 * @param otherPoint the other point
	 * @return true/false
	 */
	@JsMethod
	public native Boolean equals(Point otherPoint);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * <p>toString.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@JsMethod
	public native String toString();

}
