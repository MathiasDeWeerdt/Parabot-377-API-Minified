package org.rev377.min.api.methods;

import org.rev377.min.Loader;

/**
 * 
 * @author Everel
 *
 */
public class Game {
	
	/**
	 * Gets BaseX
	 * @return baseX
	 */
	public static int getBaseX() {
		return Loader.getClient().getBaseX();
	}
	
	/**
	 * Gets BaseY
	 * @return baseY
	 */
	public static int getBaseY() {
		return Loader.getClient().getBaseY();
	}
	
	/**
	 * Gets open interface id
	 * @return interface id
	 */
	public static int getOpenInterfaceId() {
		return Loader.getClient().getOpenInterfaceId();
	}
	
	/**
	 * Get open back dialog id
	 * @return back dialog id
	 */
	public static int getOpenBackDialogId() {
		return Loader.getClient().getBackDialogId();
	}
	
	/**
	 * Gets loop cycle
	 * @return loop cycle
	 */
	public static int getLoopCycle() {
		return Loader.getClient().getLoopCycle();
	}
	
	/**
	 * Get collision flags
	 * @return collision flags
	 */
	public static int[][] getCollisionFlags() {
		return Loader.getClient().getCollisionMap()[Game.getPlane()].getFlags();
	}
	
	/**
	 * Gets current plane
	 * @return current plane
	 */
	public static int getPlane() {
		return Loader.getClient().getPlane();
	}

}
