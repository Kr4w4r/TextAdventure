package de.krawie.textadventure.framework.textoutput;

import static com.diogonunes.jcolor.Ansi.colorize;

import com.diogonunes.jcolor.AnsiFormat;
import com.diogonunes.jcolor.Attribute;

public class TextBuilder {
    
    private StringBuilder textStringBuilder = new StringBuilder();

    public TextBuilder append(String text) {
        textStringBuilder.append(text);

        return this;
    }

    public TextBuilder appendLine(String text) {
        append(text);
        return appendNewLine();
    }

    public TextBuilder append(String text, Attribute ... attributes) {
        textStringBuilder.append(colorize(text, attributes));

        return this;
    }

    public TextBuilder appendLine(String text, Attribute ... attributes) {
        append(text, attributes);
        return appendNewLine();
    }

    public TextBuilder append(String text, AnsiFormat textFormat) {
        textStringBuilder.append(colorize(text, textFormat));

        return this;
    }

    public TextBuilder appendLine(String text, AnsiFormat textFormat) {
        append(text, textFormat);
        return appendNewLine();
    }

    public TextBuilder appendNewLine() {
        textStringBuilder.append("\n");

        return this;
    }

    @Override
    public String toString() {
        return textStringBuilder.toString();
    }

    public void println() {
        System.out.println(toString());
    }

    public void print() {
        System.out.print(toString());
    }
}
