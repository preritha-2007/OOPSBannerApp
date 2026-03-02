public class OOPSBannerApp {

    // Static Inner Class to store character and pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });

        CharacterPatternMap[] banner = {O, O, P, S};

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : banner) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}