package org.rev377.min.debug;

import java.awt.Graphics;

import org.parabot.core.paint.AbstractDebugger;
import org.rev377.min.api.methods.SceneObjects;
import org.rev377.min.api.wrappers.SceneObject;

public class DSceneObjects extends AbstractDebugger {

	@Override
	public void paint(Graphics g) {
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	@Override
	public void toggle() {
		SceneObject[] objects = SceneObjects.getNearest();
		if(objects == null || objects.length == 0) 
			return;

		for (int i = objects.length - 1; i >= 0; i--) {
			System.out.println(
					" ID: " + objects[i].getId() + 
					" UID: " + objects[i].getHash() + 
					" Location: "+ objects[i].getLocation() + 
					" Distance: "+ objects[i].distanceTo());
		}
	}

}