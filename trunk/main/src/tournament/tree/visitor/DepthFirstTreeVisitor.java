package tournament.tree.visitor;

import tournament.tree.Branch;
import tournament.tree.Leaf;

public abstract class DepthFirstTreeVisitor implements TreeVisitor {
	public abstract Boolean forLeafOnly(Leaf that);
	public abstract Boolean forBranchOnly(Branch that, Boolean left_result, Boolean right_result);

	public Boolean forLeaf(Leaf that) {
		return forLeafOnly(that);
	}

	public Boolean forBranch(Branch that) {
		Boolean left_result = that._left.accept(this);
		Boolean right_result = that._right.accept(this);
		return forBranchOnly(that, left_result,right_result);
	}

}
