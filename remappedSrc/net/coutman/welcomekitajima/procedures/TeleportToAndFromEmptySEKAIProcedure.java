package net.coutman.welcomekitajima.procedures;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket;
import net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldEventS2CPacket;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TeleportToAndFromEmptySEKAIProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.method_48926().getRegistryKey()) == World.OVERWORLD) {
			if (entity instanceof ServerPlayerEntity _player && !_player.method_48926().isClient()) {
				RegistryKey<World> destinationType = RegistryKey.of(RegistryKeys.WORLD, new Identifier("welcomekitajima:sekai_empty"));
				if (_player.method_48926().getRegistryKey() == destinationType)
					return;
				ServerWorld nextLevel = _player.server.getWorld(destinationType);
				if (nextLevel != null) {
					_player.networkHandler.sendPacket(new GameStateChangeS2CPacket(GameStateChangeS2CPacket.GAME_WON, 0));
					_player.teleport(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYaw(), _player.getPitch());
					_player.networkHandler.sendPacket(new PlayerAbilitiesS2CPacket(_player.getAbilities()));
					for (StatusEffectInstance _effectinstance : _player.getStatusEffects())
						_player.networkHandler.sendPacket(new EntityStatusEffectS2CPacket(_player.getId(), _effectinstance));
					_player.networkHandler.sendPacket(new WorldEventS2CPacket(1032, BlockPos.ORIGIN, 0, false));
				}
			}
		} else {
			if (entity instanceof ServerPlayerEntity _player && !_player.method_48926().isClient()) {
				RegistryKey<World> destinationType = World.OVERWORLD;
				if (_player.method_48926().getRegistryKey() == destinationType)
					return;
				ServerWorld nextLevel = _player.server.getWorld(destinationType);
				if (nextLevel != null) {
					_player.networkHandler.sendPacket(new GameStateChangeS2CPacket(GameStateChangeS2CPacket.GAME_WON, 0));
					_player.teleport(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYaw(), _player.getPitch());
					_player.networkHandler.sendPacket(new PlayerAbilitiesS2CPacket(_player.getAbilities()));
					for (StatusEffectInstance _effectinstance : _player.getStatusEffects())
						_player.networkHandler.sendPacket(new EntityStatusEffectS2CPacket(_player.getId(), _effectinstance));
					_player.networkHandler.sendPacket(new WorldEventS2CPacket(1032, BlockPos.ORIGIN, 0, false));
				}
			}
		}
		if (entity instanceof PlayerEntity _player)
			_player.getItemCooldownManager().set(itemstack.getItem(), 40);
	}
}
