package com.example;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ExamplePluginTest {
	@SafeVarargs
	private static void loadPlugins(Class<? extends net.runelite.client.plugins.Plugin>... pluginClasses) {
		ExternalPluginManager.loadBuiltin(pluginClasses);
	}

	public static void main(String[] args) throws Exception {
		loadPlugins(ExamplePlugin.class);
		RuneLite.main(args);
	}
}