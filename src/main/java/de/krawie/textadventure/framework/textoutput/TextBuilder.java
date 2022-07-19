package de.krawie.textadventure.framework.textoutput;

import static com.diogonunes.jcolor.Ansi.colorize;

import com.diogonunes.jcolor.AnsiFormat;
import com.diogonunes.jcolor.Attribute;

public class TextBuilder {
    
    private StringBuilder textBuilder = new StringBuilder();

    public TextBuilder append(String text) {
        textBuilder.append(text);

        return this;
    }

    public TextBuilder append(String text, Attribute ... attributes) {
        textBuilder.append(colorize(text, attributes));

        return this;
    }

    public TextBuilder append(String text, AnsiFormat textFormat) {
        textBuilder.append(colorize(text, textFormat));

        return this;
    }

    public TextBuilder appendNewLine() {
        textBuilder.append("\n");

        return this;
    }

    @Override
    public String toString() {
        return textBuilder.toString();
    }

    public void println() {
        System.out.println(toString());
    }

    public void print() {
        System.out.print(toString());
    }
}
