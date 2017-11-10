package com.example.screenlibrary;

/**
 * 多次快速点击处理
 * 
 * @author Administrator
 *
 */
public class FastClickUtils {

	private static long lastClickTime;

	public static boolean isFastDoubleClick() {
		long time = System.currentTimeMillis();
		long timeD = time - lastClickTime;
		if (0 < timeD && timeD < 1000) {
			return true;
		}
		lastClickTime = time;
		return false;
	}
}
