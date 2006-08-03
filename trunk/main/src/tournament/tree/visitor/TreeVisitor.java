package tournament.tree.visitor;

import tournament.tree.Branch;
import tournament.tree.Leaf;

public interface TreeVisitor {
	public Boolean forLeaf(Leaf that);
	public Boolean forBranch(Branch that);
}
