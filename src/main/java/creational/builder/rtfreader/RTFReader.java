package creational.builder.rtfreader;

public class RTFReader {

    TextConverter textConverter;

    RTFReader (TextConverter textConverter) {
        this.textConverter = textConverter;
    }

    // pattern
    Text parseRTF() {
        Text text = textConverter
                        .convertCharacter('a')
                        .convertFontChange(new Font())
                        .build();
        return text;
    }

    // pattern
    Text parseRTF1(Type type) {
        Text text;
            if(type == Type.CHAR) {
                text = textConverter.convertCharacter('a').build();
            } else if(type == Type.FONT) {
                text = textConverter.convertFontChange(new Font()).build();
            } else {
                text = textConverter.convertParagraph().build();
            }
        return text;
    }
}
