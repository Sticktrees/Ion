package net.horizonsend.ion.common.configuration

object ConfigurationProvider {
	lateinit var sharedConfiguration: SharedConfiguration
		private set

	lateinit var serverConfiguration: ServerConfiguration
		private set

	fun loadConfiguration() {
		sharedConfiguration = HoconConfigurationLoader.builder()
			.path(source)
			.defaultOptions { options ->
				options.serializers { builder ->
					builder.registerAnnotatedObjects(objectMapperFactory())
				}
			}
			.build().load().get()!!

		serverConfiguration = HoconConfigurationLoader.builder()
			.path(source)
			.defaultOptions { options ->
				options.serializers { builder ->
					builder.registerAnnotatedObjects(objectMapperFactory())
				}
			}
			.build().load().get()!!
	}
}