package tournament.tree.visitor;

import tournament.tree.Branch;
import tournament.tree.Leaf;

public class SampleVisitorClassic implements TreeVisitor {

	public Boolean forLeaf(Leaf that) {
		return false;
	}

	public Boolean forBranch(Branch that) {
		System.out.println(new Integer(that.getValue().getStep()).toString());
		that._left.accept(this);
		that._right.accept(this);
		return true;
	}

}
