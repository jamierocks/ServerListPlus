/*
 *        _____                     __    _     _   _____ _
 *       |   __|___ ___ _ _ ___ ___|  |  |_|___| |_|  _  | |_ _ ___
 *       |__   | -_|  _| | | -_|  _|  |__| |_ -|  _|   __| | | |_ -|
 *       |_____|___|_|  \_/|___|_| |_____|_|___|_| |__|  |_|___|___|
 *
 *  ServerListPlus - Customize your complete server status ping!
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

package net.minecrell.serverlistplus.core.config;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import net.minecrell.serverlistplus.core.config.help.Description;
import net.minecrell.serverlistplus.core.util.IntegerRange;

import java.util.List;

@Description({
        "Customize your server status ping here. Currently changeable:",
        " - Description (MotD)",
        " - Message when a player hovers the player count",
        " - Displayed outdated version, can be also used for colored slots: http://git.io/M66qiw",
        " - Favicon: http://git.io/oMhJlg",
        "Usage:",
        " - Add multiple entries for random messages.",
        " - Save the file with valid UTF-8 encoding for special characters.",
        " - Color codes are possible using the usual color codes: &c &4 and so on.",
        " - The default status is used when the player name is unknown, the personalized is used",
        "   when the player has already joined the server.",
        " - Use placeholders to make your status more dynamic: '%player%', '%online%' or '%max%'."
})
@EqualsAndHashCode @ToString
public class PersonalizedStatusConf {
    public StatusConf Default;
    public StatusConf Personalized;

    @EqualsAndHashCode @ToString
    public static class StatusConf {
        public List<String> Description;
        public PlayersConf Players;
        public VersionConf Version;
        public FaviconConf Favicon;

        @EqualsAndHashCode @ToString
        public static class PlayersConf {
            public List<IntegerRange> Online, Max;
            public Boolean Hidden;
            public List<String> Hover;
            public List<String> Slots;
        }

        @EqualsAndHashCode @ToString
        public static class VersionConf {
            public List<String> Name;
            public Integer Protocol;
        }

        @EqualsAndHashCode @ToString
        public static class FaviconConf {
            public List<String> Files, Folders;
            public List<String> URLs;
            public List<String> Heads, Helms;
            public List<String> Encoded;
        }
    }
}
