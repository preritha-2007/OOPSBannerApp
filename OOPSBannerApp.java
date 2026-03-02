public class OOPSBannerApp {

    // Static method for O
    public static String[] getO() {
        return new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };
    }

    // Static method for P
    public static String[] getP() {
        return new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        };
    }

    // Static method for S
    public static String[] getS() {
        return new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}