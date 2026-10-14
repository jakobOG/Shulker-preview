package dev.shulkerpreview.mixin;

import net.minecraft.block.entity.LockableContainerBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(LockableContainerBlockEntity.class)
public interface LootableContainerBlockEntityAccessor {
    @Invoker("getHeldStacks")
    DefaultedList<ItemStack> shulkerpreview$getHeldStacks();
}
