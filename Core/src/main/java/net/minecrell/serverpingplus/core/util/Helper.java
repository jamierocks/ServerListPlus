/*
 *       _____                     _____ _         _____ _
 *      |   __|___ ___ _ _ ___ ___|  _  |_|___ ___|  _  | |_ _ ___
 *      |__   | -_|  _| | | -_|  _|   __| |   | . |   __| | | |_ -|
 *      |_____|___|_|  \_/|___|_| |__|  |_|_|_|_  |__|  |_|___|___|
 *                                            |___|
 *  ServerPingPlus - Customize your server ping!
 *  Copyright (C) 2014, Minecrell <https://github.com/Minecrell>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.minecrell.serverpingplus.core.util;

import java.util.Collection;

public final class Helper {
    private Helper() {}

    public static boolean nullOrEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    public static String[] toStringArray(Collection<String> c) {
        return c != null ? c.toArray(new String[c.size()]) : null;
    }
}