package com.handpay.ibenefit.framework;

/**
 * Framework constants
 * @author pubx 2010-3-29 10:02:30
 */
public final class FrameworkConstants {
	private FrameworkConstants() {
	}

	/**
	 * Style file root folder
	 */
	public static final String STYLE_ROOT = "theme/";
	/**
	 * Style image file root folder
	 */
	public static final String IMAGE_ROOT = "images/";
	/**
	 * Flash file root folder
	 */
	public static final String FLASH_ROOT = "flash/";
	/**
	 * Javascript file root folder
	 */
	public static final String SCRIPT_ROOT = "js/";
	/**
	 * Skin
	 */
	public static final String SKIN = "skin";
	/**
	 * Default skin
	 */
	public static final String DEFAULT_SKIN = "d";
	/**
	 * Operation message
	 */
	public static final String MESSAGE = "message";

	public static final String VIEW = "view";
	
	public interface ModelDefine {
		int SHORT_LENGTH = 16;
		int SMALL_LENGTH = 32;
		int MEDIUM_LENGTH = 64;
		int LARGE_LENGTH = 128;
		int LARGER_LENGTH = 255;
		int BIG_LENGTH = 512;
	}

}
