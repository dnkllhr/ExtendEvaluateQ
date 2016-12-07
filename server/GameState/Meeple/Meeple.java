package GameState.Meeple;

import GameState.Player;

public abstract class Meeple {
	private final Player owner;

	public Meeple(Player owner) {
		this.owner = owner;
	}

	public Player getOwner() {
		return this.owner;
	}
}