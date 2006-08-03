package tournament.tree;

import tournament.match.Matche;
import tournament.tree.visitor.TreeVisitor;

/**
 * @author bobbix
 *
 */
public class Branch implements Tree {
	protected Matche _value;
	public Tree _left;
	public Tree _right;
	
	/**
	 * @param value
	 * @param left
	 * @param right
	 */
	public Branch (Matche value, Tree left, Tree right){
		this._value = value;
		this._left = left;
		this._right = right;
	}
	
	public Boolean accept(TreeVisitor that) {
		return that.forBranch(this);
	}

	public void setValue(Matche value) {
		_value = value;		
	}

	public Matche getValue() {
		return _value;
	}
}
