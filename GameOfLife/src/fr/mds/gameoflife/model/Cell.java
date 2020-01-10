package fr.mds.gameoflife.model;

public interface Cell {
	public Cell newGeneration(int nbNeighbours);
	public String getAsString();
	public boolean isAlive();
}
