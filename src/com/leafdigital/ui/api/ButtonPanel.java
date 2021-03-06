/*
This file is part of leafdigital leafChat.

leafChat is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

leafChat is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with leafChat. If not, see <http://www.gnu.org/licenses/>.

Copyright 2011 Samuel Marshall.
*/
package com.leafdigital.ui.api;

/**
 * A Panel that lays out buttons horizontally in the appropriate platform order.
 * May contain the following slots: 'yes', 'no', and 'cancel'.
 */
public interface ButtonPanel extends Panel
{
	/**
	 * Button panel slot: Yes.
	 */
	public final static int YES=0;
	/**
	 * Button panel slot: No.
	 */
	public final static int NO=1;
	/**
	 * Button panel slot: Cancel.
	 */
	public final static int CANCEL=2;

	/**
	 * Sets the button in a slot (null for none)
	 * @param slot YES/NO/CANCEL constant
	 * @param w New widget
	 */
	public void set(int slot, Widget w);

	/**
	 * Sets the gap between components. The default is 4.
	 * @param spacing Spacing in pixels
	 */
	public void setSpacing(int spacing);
}
