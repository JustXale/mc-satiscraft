package net.justxale.cyber;

import net.fabricmc.api.ModInitializer;
import net.justxale.cyber.registries.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cyber implements ModInitializer {
	public static final String MOD_ID = "cyber";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		//ModSoundEvents.registerModSounds();
	}
}
