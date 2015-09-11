package synoptic.invariants;

import java.util.List;

import synoptic.model.event.EventType;
import synoptic.model.interfaces.INode;

public class CntAlwaysEqualsGreaterInvariant extends BinaryInvariant {

	int diffMinimum = 0;

	public CntAlwaysEqualsGreaterInvariant(EventType typeFirst,
			EventType typeSecond, String relation, final int diffMinimum) {
		super(typeFirst, typeSecond, relation);
		this.diffMinimum = diffMinimum;
	}

	@Override
	public String getLTLString() {
		// TODO Auto-generated method stub
		return "((<>(did(" + second.toString() + ")))->((!did("
				+ second.toString() + ")) U did(" + first.toString() + ")))";
	}

	@Override
	public <T extends INode<T>> List<T> shorten(List<T> path) {
		// TODO Auto-generated method stub
		return path;
	}

	@Override
	public String getShortName() {
		// TODO Auto-generated method stub
		return "CntAlEqGre";
	}

	@Override
	public String getLongName() {
		// TODO Auto-generated method stub
		return "CntAlwaysEqualsGreater";
	}

	@Override
	public String getRegex(char firstC, char secondC) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return first.toString() + " CntAlwaysEqualsGreater("
				+ relation.toString() + ") " + second.toString();
	}

	/**
	 * @return the diffMinimum
	 */
	public final int getDiffMinimum() {
		return diffMinimum;
	}

	/**
	 * @param diffMinimum
	 *            the diffMinimum to set
	 */
	public final void setDiffMinimum(int diffMinimum) {
		this.diffMinimum = diffMinimum;
	}

}
