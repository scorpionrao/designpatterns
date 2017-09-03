package creational.builder.rtfreader;

public class ASCIIConverter implements TextConverter {

    private Text text;

    ASCIIConverter(Text text) {
        this.text = new Text();
    }
    public Text build() {
        return text;
    }

    public TextConverter convertCharacter(char c) {
        return null;
    }

    public TextConverter convertFontChange(Font font) {
        throw new UnsupportedOperationException();
    }

    public TextConverter convertParagraph() {
        throw new UnsupportedOperationException();
    }
}
