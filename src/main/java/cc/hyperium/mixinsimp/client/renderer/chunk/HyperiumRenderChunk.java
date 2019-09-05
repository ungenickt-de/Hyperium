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

package cc.hyperium.mixinsimp.client.renderer.chunk;

/*
 * Created by Cubxity on 12/1/2018
 */

import cc.hyperium.Hyperium;
import cc.hyperium.mods.chunkanimator.AnimationHandler;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.BlockPos;

public class HyperiumRenderChunk {

    private RenderChunk parent;
    private AnimationHandler handler;

    public HyperiumRenderChunk(RenderChunk parent) {
        this.parent = parent;
    }

    public void setPosition(BlockPos bp) {
        if (handler == null)
            handler = Hyperium.INSTANCE.getModIntegration().getChunkAnimator().getAnimationHandler();
        handler.setPosition(parent, bp);
    }
}
