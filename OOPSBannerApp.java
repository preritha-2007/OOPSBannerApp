import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Method to build and return the character pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patternMap.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        patternMap.put('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });

        return patternMap;
    }

    // Method to render banner word
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 5; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }
}