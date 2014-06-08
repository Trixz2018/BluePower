/*
 * This file is part of Blue Power.
 *
 *     Blue Power is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Blue Power is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Blue Power.  If not, see <http://www.gnu.org/licenses/>
 */

package net.quetzi.bluepower.items;

import net.minecraft.item.Item;
import net.quetzi.bluepower.init.CustomTabs;
import net.quetzi.bluepower.references.Refs;

public class ItemNikolite extends Item {
    
    public ItemNikolite() {
    
        super();
        this.setUnlocalizedName(Refs.ITEMNIKOLITE_NAME);
        this.setCreativeTab(CustomTabs.tabBluePowerItems);
        this.setTextureName(Refs.MODID + ":" + Refs.ITEMNIKOLITE_NAME);
    }
}
