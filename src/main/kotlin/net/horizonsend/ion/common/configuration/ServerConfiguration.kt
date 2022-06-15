package net.horizonsend.ion.common.configuration

import org.spongepowered.configurate.objectmapping.ConfigSerializable

@ConfigSerializable
data class ServerConfiguration(
	val serverType: ServerType = ServerType.SURVIVAL
)

enum class ServerType { SURVIVAL, CREATIVE, PROXY }