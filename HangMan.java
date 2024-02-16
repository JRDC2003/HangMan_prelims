import java.util.Scanner;
public class HangMan {

    private static Scanner scanner = new Scanner(System.in);

    private static String[] words = {"apple","banana","grape"};

    

    public static void title_Art(String[] args) {
        System.out.println("______________________________________________");
        System.out.println("    __  __                  __  ___          ");
        System.out.println("   / / / /___ _____  ____ _/  |/  /___ _____ ");
        System.out.println("  / /_/ / __ `/ __ \\/ __ `/ /|_/ / __ `/ __ \\");
        System.out.println(" / __  / /_/ / / / / /_/ / /  / / /_/ / / / /");
        System.out.println("/_/ /_/\\__,_/_/ /_/\\__, /_/  /_/\\__,_/_/ /_/ ");
        System.out.println("                  /____/                     ");
        System.out.println("______________________________________________");
    }

    public static void options(String[] args) {
        // Initialization
        int picked_Choice = 0;
        while (picked_Choice != 4) {
            System.out.println("(1)  Random words\n(2)  Custom word\n(3)  Remove word\n(4)  Exit game");
            System.out.print("input:");
            int user_choice = scanner.nextInt();
            switch (user_choice) {
                case 1:
                    play_Random_word(args);
                    break;
                case 2:
                    play_own_word(args);
                    break;
                case 3:
                    remove_words(args);
                    break;
                case 4:
                    picked_Choice = user_choice; // Update picked_Choice
                    break;
                default:
                    System.out.println("No input found for " + user_choice + " input: ");
                    break;
            }
        }
        System.out.println("Game exit");
    }
    public static void play_Random_word(String[] args) {
        System.out.println("playing in with random word");
    }

    public static void play_own_word(String[] args) {
        System.out.println("play with user input words");
        //import words to a arrey for the random words
    }

    public static void remove_words(String[] args) {
        System.out.println("Words Available:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.print("____________________________________________\nDelete: ");
        String word_to_remove = scanner.nextLine(); //
        
        String[] newArrey = new String[words.length - 1];

        int newIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(word_to_remove)) {

                newArrey[newIndex++] = words[i];
            }
        }
        
    }

    //Main runner
    public static void main(String[] args) {
        //Initialization
        


        //graphics
        title_Art(args);
        options(args);
    }
}
