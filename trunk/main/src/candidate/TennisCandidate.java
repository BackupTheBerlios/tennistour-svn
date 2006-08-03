/**
 * 
 */
package candidate;

/**
 * @author bobbix
 *
 */
public class TennisCandidate implements Candidate{
	protected String _name;
	protected String _firstname;
	
	public TennisCandidate (){
		_name = new String("Vanbelle");
		_firstname = new String("Alexandre");
	}
	
	final public String getName(){
		return _name;
	}
	
	final public String getFirstName(){
		return _firstname;
	}
}
