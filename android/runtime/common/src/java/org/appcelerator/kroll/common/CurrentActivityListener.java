/**
 * TiDev Titanium Mobile
 * Copyright TiDev, Inc. 04/07/2022-Present
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package org.appcelerator.kroll.common;

import android.app.Activity;

/**
 * The APIs that accept this interface invoke a callback function when the current activity becomes visible.
 */
public interface CurrentActivityListener {
	/**
	 * Implementing classes should override this method to run code after the current activity has become visible.
	 * Refer to {@link org.appcelerator.titanium.util.TiUIHelper#waitForCurrentActivity(CurrentActivityListener)} for an example use case.
	 * @param activity the associated activity.
	 */
	void onCurrentActivityReady(Activity activity);
}
