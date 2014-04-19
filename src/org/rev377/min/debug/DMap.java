package org.rev377.min.debug;

import java.awt.Graphics;

import org.parabot.core.Context;
import org.parabot.core.paint.AbstractDebugger;
import org.parabot.core.paint.PaintDebugger;
import org.rev377.min.api.methods.Game;
import org.rev377.min.api.methods.Players;

public class DMap extends AbstractDebugger {
	private boolean enabled;

	@Override
	public void paint(Graphics g) {
		PaintDebugger p = Context.getInstance().getPaintDebugger();
		p.addLine("Location: " + Players.getMyPlayer().getLocation());
		p.addLine("Plane: " + Game.getPlane());
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public void toggle() {
		enabled = !enabled;
	}

}
