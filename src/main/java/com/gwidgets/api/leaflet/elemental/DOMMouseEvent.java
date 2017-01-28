package com.gwidgets.api.leaflet.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative=true, name="MouseEvent", namespace = GLOBAL)
public class DOMMouseEvent {
	
	@JsProperty
	private int screenX;

	@JsProperty
	private int screenY;

	@JsProperty
	private int clientX;

	@JsProperty
	private int clientY;

	@JsProperty
	private Boolean ctrlKey;

	@JsProperty
	private Boolean shiftKey;

	@JsProperty
	private Boolean altKey;

	@JsProperty
	private Boolean metaKey;

	@JsProperty
	private short button;
	
	@JsOverlay
	public final int getScreenX() {
		return this.screenX;
	}


	@JsOverlay
	public final int getScreenY() {
		return this.screenY;
	}


	@JsOverlay
	public final int getClientX() {
		return this.clientX;
	}


	@JsOverlay
	public final int getClientY() {
		return this.clientY;
	}


	@JsOverlay
	public final Boolean getCtrlKey() {
		return this.ctrlKey;
	}


	@JsOverlay
	public final Boolean getShiftKey() {
		return this.shiftKey;
	}


	@JsOverlay
	public final Boolean getAltKey() {
		return this.altKey;
	}


	@JsOverlay
	public final Boolean getMetaKey() {
		return this.metaKey;
	}


	@JsOverlay
	public final short getButton() {
		return this.button;
	}


	@JsMethod
	public native Boolean getModifierState();

}
