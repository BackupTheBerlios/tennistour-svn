package tournament.tree;

import tournament.match.Matche;
import tournament.tree.visitor.TreeVisitor;

public class Leaf implements Tree {
	public static final Leaf ONLY = new Leaf();
	
	public Boolean accept(TreeVisitor that) {
		return that.forLeaf(this);
	}

	public void setValue(Matche value) {
		;
	}

	public Matche getValue() {
		return null;
	}

}
