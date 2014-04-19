package org.rev377.min.callback;

import org.rev377.min.Loader;
import org.rev377.min.accessors.Client;
import org.rev377.min.debug.DActions;

/**
 * 
 * @author Everel
 *
 */
public class MenuAction {
	
	public static void intercept(int index, int arg) {
		if(DActions.debugActions()) {
			Client client = Loader.getClient();
			int action1 = client.getMenuAction1()[index];
			int action2 = client.getMenuAction2()[index];
			int action3 = client.getMenuAction3()[index];
			int actionId = client.getMenuActionId()[index];
			System.out.println(String.format("[index: %d, action1: %d, action2: %d, action3: %d, id: %d]", index, action1, action2, action3, actionId));
		}
	}

}
