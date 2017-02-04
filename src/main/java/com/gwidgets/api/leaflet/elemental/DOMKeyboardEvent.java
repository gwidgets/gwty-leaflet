package com.gwidgets.api.leaflet.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, name="KeyBoardEvent", namespace = GLOBAL)
public class DOMKeyboardEvent {
	
	
	@JsProperty
	private Boolean altKey;
	
	@JsProperty
	private int charCode;
	
	@JsProperty
	private String code;
	
	@JsProperty
	private Boolean ctrlKey;
	
	@JsProperty
	private Boolean isComposing;
	
	@JsProperty
	private String key;
	
	@JsProperty
	private int keyCode;
	
	@JsProperty
	private int location;
	
	@JsProperty
	private Boolean metaKey;
	
	@JsProperty
	private Boolean repeat;
	
	@JsProperty
	private Boolean shiftKey;
	
	@JsProperty
	private Boolean which;

	@JsOverlay
	public final Boolean getAltKey() {
		return this.altKey;
	}

	@JsOverlay
	public final int getCharCode() {
		return this.charCode;
	}

	@JsOverlay
	public final String getCode() {
		return this.code;
	}

	@JsOverlay
	public final Boolean getCtrlKey() {
		return this.ctrlKey;
	}

	@JsOverlay
	public final Boolean getIsComposing() {
		return this.isComposing;
	}

	@JsOverlay
	public final String getKey() {
		return this.key;
	}

	@JsOverlay
	public final int getKeyCode() {
		return this.keyCode;
	}

	@JsOverlay
	public final int getLocation() {
		return this.location;
	}

	@JsOverlay
	public final Boolean getMetaKey() {
		return this.metaKey;
	}

	@JsOverlay
	public final Boolean getRepeat() {
		return this.repeat;
	}

	@JsOverlay
	public final Boolean getShiftKey() {
		return this.shiftKey;
	}

	@JsOverlay
	public final Boolean getWhich() {
		return this.which;
	}
	
	@JsMethod
	public native Boolean getModifierState();
	

}
