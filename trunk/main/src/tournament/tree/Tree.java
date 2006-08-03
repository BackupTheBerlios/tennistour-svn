/**
 * 
 */
package tournament.tree;

import tournament.match.Matche;
import tournament.tree.visitor.TreeVisitor;

/**
 * @author bobbix
 * 
 */
public interface Tree {
	public Boolean accept (TreeVisitor that);
	public void setValue(Matche value);
	public Matche getValue();
}
