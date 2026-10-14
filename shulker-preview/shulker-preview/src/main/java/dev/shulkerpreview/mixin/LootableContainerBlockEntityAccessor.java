package dev.shulkerpreview.mixin;

import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(LootableContainerBlockEntity.class)
public interface LootableContainerBlockEntityAccessor {
    @Invoker("XYZ_FALSCHER_NAME_XYZ") // Dies ist absichtlich falsch
    DefaultedList<ItemStack> shulkerpreview$getInvStackList();
}
