package com.ehaney.fitch;

import javafx.beans.property.*;

/**
 * A sentence within a proof using fitch bars
 */
public class Sentence {
    private StringProperty inputText;
    private StringProperty formatText;
    private IntegerProperty indentLevel;
    private BooleanProperty isDerived;

    public Sentence() {
        this("", "", 0, false);
    }
    private Sentence(String inputText, String formatText, int indentLevel, boolean isDerived) {
        this.inputText = new SimpleStringProperty(inputText);
        this.formatText = new SimpleStringProperty(formatText);
        this.indentLevel = new SimpleIntegerProperty(indentLevel);
        this.isDerived = new SimpleBooleanProperty(isDerived);
    }

    public String getInputText() {
        return inputText.get();
    }

    public void setInputText(String inputText) {
        this.inputText.set(inputText);
    }

    public StringProperty inputTextProperty() {
        return inputText;
    }

    public String getFormatText() {
        return formatText.get();
    }

    public void setFormatText(String formatText) {
        this.formatText.set(formatText);
    }

    public StringProperty formatTextProperty() {
        return formatText;
    }

    public int getIndentLevel() {
        return indentLevel.get();
    }

    public void setIndentLevel(int indentLevel) {
        this.indentLevel.set(indentLevel);
    }

    public IntegerProperty indentLevelProperty() {
        return indentLevel;
    }

    public boolean isIsDerived() {
        return isDerived.get();
    }

    public void setIsDerived(boolean isDerived) {
        this.isDerived.set(isDerived);
    }

    public BooleanProperty isDerivedProperty() {
        return isDerived;
    }

    private void formatInputText() {
        String input = getInputText();

        for (String alias : Aliases.getKeys()) {
            input.replace(alias, Aliases.convert(alias));
        }

        setFormatText(input);
    }
}
