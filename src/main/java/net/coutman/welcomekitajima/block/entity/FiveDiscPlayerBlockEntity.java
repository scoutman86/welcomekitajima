import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class FiveDiscPlayerBlockEntity extends BlockEntity implements Container {
	private final NonNullList<ItemStack> items = NonNullList.withSize(5, ItemStack.EMPTY);

	public FiveDiscPlayerBlockEntity(BlockPos pos, BlockState state) {
		super(BlockEntity.FIVE_DISC_PLAYER, pos, state);
	}

	@Override
	public int getContainerSize() {
		return items.size();
	}

	@Override
	public boolean isEmpty() {
		for (ItemStack stack : items) {
			if (!stack.isEmpty()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public ItemStack getItem(int slot) {
		return items.get(slot);
	}

	@Override
	public ItemStack removeItem(int slot, int amount) {
		ItemStack result = ItemStackHelper.removeItem(items, slot, amount);
		if (!result.isEmpty()) {
			setChanged();
		}
		return result;
	}

	@Override
	public ItemStack removeItemNoUpdate(int slot) {
		ItemStack result = ItemStackHelper.takeItem(items, slot);
		setChanged();
		return result;
	}

	@Override
	public void setItem(int slot, ItemStack stack) {
		items.set(slot, stack);
		if (stack.getCount() > getMaxStackSize()) {
			stack.setCount(getMaxStackSize());
		}
		setChanged();
	}

	@Override
	public void clearContent() {
		items.clear();
	}

	@Override
	public void load(CompoundTag tag) {
		super.load(tag);
		ItemStackHelper.loadAllItems(tag, items);
	}

	@Override
	public void saveAdditional(CompoundTag tag) {
		super.saveAdditional(tag);
		ItemStackHelper.saveAllItems(tag, items);
	}

	@Override
	public boolean stillValid(net.minecraft.world.entity.player.Player player) {
		if (this.level.getBlockEntity(this.worldPosition) != this) return false;
		return player.distanceToSqr((double) this.worldPosition.getX() + 0.5D, (double) this.worldPosition.getY() + 0.5D, (double) this.worldPosition.getZ() + 0.5D) <= 64.0D;
	}

	@Override
	public int getMaxStackSize() {
		return 64;
	}
}