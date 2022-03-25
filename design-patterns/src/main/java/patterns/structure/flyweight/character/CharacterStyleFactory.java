package patterns.structure.flyweight.character;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterStyleFactory {
    private static final List<CharacterStyle> styles = new ArrayList<CharacterStyle>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }
}
