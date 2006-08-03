package tournament.tree.visitor;

import tournament.tree.Branch;
import tournament.tree.Leaf;

public class SampleVisitorDepth extends DepthFirstTreeVisitor {

	public Boolean forLeafOnly(Leaf that) {
		return false;
	}

	public Boolean forBranchOnly(Branch that, Boolean left_result,
			Boolean right_result) {
		System.out.println(new Integer(that.getValue().getStep()));
		return null;
	}

}
