/**
 * OOPSBannerApp
 * UC4 - Print OOPS banner using Array and Loop
 *
 * @author Preritha
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join("   ", " OOO ", " OOO ", "PPPP ", "SSSS "),
                String.join("   ", "O   O", "O   O", "P   P", "S     "),
                String.join("   ", "O   O", "O   O", "PPPP ", " SSS  "),
                String.join("   ", "O   O", "O   O", "P     ", "    S "),
                String.join("   ", " OOO ", " OOO ", "P     ", "SSSS ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}