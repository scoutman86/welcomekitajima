package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.procedures.*;

@SuppressWarnings("InstantiationOfUtilityClass")
public class WelcomekitajimaModProcedures {
	public static void load() {
		new DiscEjectNoiseProcedure();
		new DiscEnterNoiseProcedure();
		new TeleportToAndFromEmptySEKAIProcedure();
		new TeleportToAndFromSchoolSEKAIProcedure();
		new TeleportToAndFromWonderlandSEKAIProcedure();
		new TeleportToAndFromStreetSEKAIProcedure();
	}
}
