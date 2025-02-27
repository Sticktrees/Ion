package net.horizonsend.ion.server.listeners

import org.bukkit.enchantments.Enchantment
import org.bukkit.enchantments.EnchantmentOffer
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.enchantment.PrepareItemEnchantEvent

class PrepareItemEnchantListener : Listener {
	@EventHandler(priority = EventPriority.NORMAL)
	@Suppress("Unused")
	fun onPrepareItemEnchantEvent(event: PrepareItemEnchantEvent) {
		event.offers[0] = EnchantmentOffer(Enchantment.SILK_TOUCH, 1, 120)
		event.offers[1] = null
		event.offers[2] = null
	}
}