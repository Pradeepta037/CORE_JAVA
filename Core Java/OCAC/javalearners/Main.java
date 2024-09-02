import java.util.Random;
import java.util.Scanner;

class TestProvider {
    private static final String[] EASY_TEST_STRINGS = {
        "hello kiran",
        "well come to my programming",
        "i do it test"
    };

    private static final String[] MEDIUM_TEST_STRINGS = {
        "wake up to reality! my name is ghost of uchiha",
        "the true friendship is pear than the gold",
        "own trust is can do everything",
        "learn from mistakes and improve your coding skills"
    };

    private static final String[] HARD_TEST_STRINGS = {
        "You will face many defeats in life, but never let yourself be defeated",
        "dont trust easily every body beacuse all the world is selfis",
        "only love for parents beacuse family is heven dont forget!"
    };

    private Random random = new Random();
    private String[] currentTestStrings;

    public void setDifficulty(String difficulty) {
        switch (difficulty.toLowerCase()) {
            case "easy":
                currentTestStrings = EASY_TEST_STRINGS;
                break;
            case "medium":
                currentTestStrings = MEDIUM_TEST_STRINGS;
                break;
            case "hard":
                currentTestStrings = HARD_TEST_STRINGS;
                break;
            default:
                throw new IllegalArgumentException("Invalid difficulty level. Please select 'easy', 'medium', or 'hard'.");
        }
    }

    public String getTestString() {
        return currentTestStrings[random.nextInt(currentTestStrings.length)];
    }

    public boolean isCorrect(String input, String testString) {
        return input.equals(testString);
    }
}

class Timer {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

class Score {
    private long timeTaken;
    private String testString;

    public void setScore(long timeTaken, String testString) {
        this.timeTaken = timeTaken;
        this.testString = testString;
    }

    public double calculateWPM() {
        double minutes = timeTaken / 60000.0;
        double words = testString.split("\\s+").length;
        return words / minutes;
    }

    public String getFormattedScore() {
        return String.format("Time taken: %.2f seconds\nWords per minute: %.2f", timeTaken / 1000.0, calculateWPM());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestProvider testProvider = new TestProvider();
        Timer timer = new Timer();
        Score score = new Score();
        String[] testResults = new String[10];

        boolean playAgain = true;

        while (playAgain) {
            // Ask user for difficulty level
            System.out.println("Select difficulty level (easy, medium, hard):");
            String difficulty = scanner.nextLine().trim().toLowerCase();

            // Set the difficulty for the test provider
            try {
                testProvider.setDifficulty(difficulty);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue; // Prompt for difficulty again
            }

            // Run the typing tests
            for (int i = 0; i < testResults.length; i++) {
                String testString = testProvider.getTestString();
                System.out.println("Test " + (i + 1) + ": Type the following text:");
                System.out.println(testString);
                timer.start();
                String userInput = scanner.nextLine();
                timer.stop();
                score.setScore(timer.getElapsedTime(), testString);
                if (testProvider.isCorrect(userInput, testString)) {
                    testResults[i] = String.format("Test %d: Correct! %s", i + 1, score.getFormattedScore());
                } else {
                    testResults[i] = String.format("Test %d: Incorrect. %s", i + 1, score.getFormattedScore());
                }
                System.out.println(testResults[i]);
                System.out.println();
            }

            // Ask if the user wants to restart
            System.out.println("Do you want to restart the game? (yes/no)");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false;
            }
        }

        scanner.close();
        System.out.println("Thank you for playing!");
    }
}
