/*
 *       Copyright (C) 2018-present Hyperium <https://hyperium.cc/>
 *
 *       This program is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published
 *       by the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       This program is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.hyperium.event;

import com.google.common.base.Preconditions;

import org.jetbrains.annotations.NotNull;

public final class ServerSwitchEvent extends Event {

    @NotNull
    private final String from;

    @NotNull
    private final String to;

    public ServerSwitchEvent(@NotNull String from, @NotNull String to) {
        Preconditions.checkNotNull(from, "from");
        Preconditions.checkNotNull(to, "to");

        this.from = from;
        this.to = to;
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public final String getTo() {
        return this.to;
    }
}
