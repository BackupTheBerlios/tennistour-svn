package tournament.match;

import candidate.*;

public class Matche {
	protected Candidate _first;
	protected Candidate _second;
	
	protected int _step;
	
	protected Boolean _played = false;
	protected Boolean _set = false;
	protected int _score = 0;
	
	public Matche(int step){
		_first = new NullCandidate();
		_second = new NullCandidate();
		_step = step;
	}
	
	public int getStep(){
		return _step;
	}
	
	public Boolean isSet(){
		return _set;
	}
	
	public Boolean isPlayed(){
		return _played;
	}
	
	public Candidate getWinner(){
		return new NullCandidate();
	}
	
	public Candidate getLoser(){
		return new NullCandidate();
	}
	
	public Candidate getFirstCandidate(){
		return _first;
	}
	
	public Candidate getSecondCandidate(){
		return _second;
	}
	
	public void setCandidate(Candidate first, Candidate second){
		_first = first;
		_second = second;
		this.checkSet();
	}
	
	public void setFirstCandidate(Candidate first){
		_first = first;
		this.checkSet();
	}
	
	public void setSecondCandidate(Candidate second){
		_second = second;
		this.checkSet();
	}
	
	private void checkSet(){
		if ( (_first instanceof NullCandidate) || (_second instanceof NullCandidate) ){
			_set = false;
		}
		else
			_set = true;
	}
	
}
