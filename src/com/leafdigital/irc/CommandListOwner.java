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
package com.leafdigital.irc;

import com.leafdigital.irc.api.UserCommandListMsg;

import leafchat.core.api.*;

/** Message owner for UserCommandListMsg. */
public class CommandListOwner extends BasicMsgOwner
{
	/**
	 * @param context Context
	 */
	public CommandListOwner(PluginContext context)
	{
		context.registerMessageOwner(this);
	}

	@Override
	public String getFriendlyName()
	{
		return "User command list query";
	}

	@Override
	public Class<? extends Msg> getMessageClass()
	{
		return UserCommandListMsg.class;
	}

	@Override
	public boolean allowExternalDispatch(Msg m)
	{
		return true;
	}
}