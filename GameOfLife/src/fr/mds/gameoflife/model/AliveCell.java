package fr.mds.gameoflife.model;

public class AliveCell implements Cell{

	@Override
	public Cell newGeneration(int nbNeighbours) {		
		// TODO Auto-generated method stub
		if(nbNeighbours < 2 || nbNeighbours > 3) {
			return new DeadCell();
		}else {
			return this;
		}			
	}

	@Override
	public String getAsString() {
		// TODO Auto-generated method stub
		return "0";
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return true;
	}	
}
