/*
 * This file is part of Blue Power. Blue Power is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version. Blue Power is
 * distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License for more details. You should have received a copy of the GNU General Public License along
 * with Blue Power. If not, see <http://www.gnu.org/licenses/>
 */
package com.bluepowermod.helper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.bluepowermod.util.ItemStackUtils;

public class ItemStackHelper {

    /**
     * compares ItemStack argument to the instance ItemStack; returns true if both ItemStacks are equal
     */
    public static boolean areItemStacksEqual(ItemStack itemStack1, ItemStack itemStack2) {

        return itemStack1 == null && itemStack2 == null || !(itemStack1 == null || itemStack2 == null)
                && itemStack1.getItem() == itemStack2.getItem() && itemStack1.getItemDamage() == itemStack2.getItemDamage()
                && !(itemStack1.stackTagCompound == null && itemStack2.stackTagCompound != null)
                && (itemStack1.stackTagCompound == null || itemStack1.stackTagCompound.equals(itemStack2.stackTagCompound));
    }

    /**
     * Mode is a WidgetFuzzySetting mode.
     * 
     * @param stack1
     * @param stack2
     * @param mode
     * @return
     */
    public static boolean areStacksEqual(ItemStack stack1, ItemStack stack2, int mode) {
        if (stack1 == null && stack2 != null)
            return false;
        if (stack1 != null && stack2 == null)
            return false;
        if (stack1 == null && stack2 == null)
            return true;

        if (mode == 0) {
            return OreDictionary.itemMatches(stack1, stack2, false);
        } else if (mode == 1) {
            return ItemStackUtils.isItemFuzzyEqual(stack1, stack2);
        } else {
            return OreDictionary.itemMatches(stack1, stack2, false) && ItemStack.areItemStackTagsEqual(stack1, stack2);
        }
    }
}
