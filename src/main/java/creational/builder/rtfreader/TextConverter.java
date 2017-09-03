package creational.builder.rtfreader;

public interface TextConverter {

    Text build();

    TextConverter convertCharacter(final char c);

    TextConverter convertFontChange(final Font font);

    TextConverter convertParagraph();
}
