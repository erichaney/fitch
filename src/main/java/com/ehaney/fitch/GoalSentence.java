package com.ehaney.fitch;

/**
 * A sentence announcing what will be proved in the argument
 */
public class GoalSentence extends Sentence {

    GoalSentence() {
        super();
    }

    @Override
    public void setIsDerived(boolean isDerived) {
        return; // disabled
    }

    @Override
    public void setIndentLevel(int indentLevel) {
        return; // disabled
    }
}
