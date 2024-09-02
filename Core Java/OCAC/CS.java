public class CS {
    public static void main(String[] args) {
        int age = 20;
        boolean hasVoterID = false;

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("You can vote.");
            } else {
                System.out.println("You need a voter ID to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
