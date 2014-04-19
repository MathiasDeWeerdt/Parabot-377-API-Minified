package org.rev377.min.api.wrappers;

/**
 * 
 * @author Everel
 *
 */
public final class Npc extends Character {
	private org.rev377.min.accessors.Npc accessor;

	public Npc(org.rev377.min.accessors.Npc accessor, int index) {
		super(accessor, index);
		this.accessor = accessor;
	}
	
	
	/**
	 * Gets the definition of this npc
	 * @return npc definitions
	 */
	public final NpcDef getDef() {
		return new NpcDef(this.accessor.getDef());
	}

}
