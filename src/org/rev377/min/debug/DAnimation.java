package org.rev377.min.debug;

import java.awt.Graphics;

import org.parabot.core.Context;
import org.parabot.core.paint.AbstractDebugger;
import org.rev377.min.api.methods.Players;

public class DAnimation extends AbstractDebugger {
	private boolean enabled;

	@Override
	public void paint(Graphics g) {
		Context.getInstance().getPaintDebugger().addLine("Animation: " + Players.getMyPlayer().getAnimation());
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
