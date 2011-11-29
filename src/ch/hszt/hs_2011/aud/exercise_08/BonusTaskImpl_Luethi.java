package ch.hszt.hs_2011.aud.exercise_08;

public class BonusTaskImpl_Luethi implements BonusTask {

	@Override
	public boolean deal() throws IllegalStateException {
		return true;
	}

	@Override
	public boolean deal(boolean otherHasCooperated)
			throws IllegalStateException {
		return otherHasCooperated;
	}

}
