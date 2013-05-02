package paintswing;

import java.awt.Color;
import java.util.Observable;

public class Settings extends Observable {
	private  int wightAera = 700;
	private  int heightAera = 700;
	private  Color backgraundCollor = Color.RED;

	public int getWightAera() {
		return wightAera;
	}

	public void setWightAera(int wightAera) {
		this.wightAera = wightAera;
	}

	public int getHeightAera() {
		return heightAera;
	}
	public void setHeightAera(int heightAera) {
		this.heightAera = heightAera;
	}

	public Color getBackgraundCollor() {
		// TODO Auto-generated method stub
		return backgraundCollor;
	}

	public void setBackgraundCollor(Color backgraundCollor) {
		this.backgraundCollor = backgraundCollor;
		stateChanged();
	}
	private void stateChanged(){
		setChanged();
		notifyObservers();
	}

}
