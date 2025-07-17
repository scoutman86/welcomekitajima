
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.coutman.welcomekitajima.init;

import net.coutman.welcomekitajima.procedures.TeleportToAndFromEmptySEKAIProcedure;
import net.coutman.welcomekitajima.procedures.DiscEnterNoiseProcedure;
import net.coutman.welcomekitajima.procedures.DiscEjectNoiseProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class WelcomekitajimaModProcedures {
	public static void load() {
		new DiscEjectNoiseProcedure();
		new DiscEnterNoiseProcedure();
		new TeleportToAndFromEmptySEKAIProcedure();
	}
}
