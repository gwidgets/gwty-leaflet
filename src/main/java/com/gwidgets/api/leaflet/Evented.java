package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.elemental.Function;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface Evented {

	/**
	 * Clear all event listeners.
	 *
	 * @return the L class
	 */
	public L clearAllEventListeners();

	/**
	 * Adds a set of type/listener pairs.
	 *
	 * @param type the type
	 * @param fn the callback function
	 * @return the L class
	 */
	public L on(String type, Function fn);

	/**
	 * the listener will only get fired once and then removed.
	 *
	 * @param type the type
	 * @param fn the callback function
	 * @return the L class
	 */
	public  L once(String type, Function fn);

	/**
	 *  Removes a listener
	 *
	 * @param type the type
	 * @return the L class
	 */
	public L off(String type);
	
	/**
	 *  Removes a set of listener
	 *
	 * @param type the type
	 * @return the L class
	 */
	public L off(String[] type);
	
	/**
	 *  Removes all listener
	 *
	 * @param type the type
	 * @return the L class
	 */
	public L off();

	/**
	 * Fires an event of the specified type. You can optionally provide an data object — the first argument of the listener function will contain its properties.
	 *
	 * @param type the type
	 * @return the L class
	 */
	public L fire(String type);
	
	
	/** Returns true if a particular event type has any listeners attached to it.
	* @return true if there is listener, false otherwise
		 */
	public Boolean listens(String type);


	/** Adds an event parent - an Evented that will receive propagated events
	* @param the parent object that will receive the propagated events
	* @return the L class
		 */
	public L addEventParent(Evented obj); 


	/** Removes an event parent, so it will stop receiving propagated events
	* @param the parent object that be removed
	* @return the L class
		 */
	public L removeEventParent(Evented obj);
	
	
	

}
