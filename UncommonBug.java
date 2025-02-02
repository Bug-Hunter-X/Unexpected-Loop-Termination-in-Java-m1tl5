public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
            if (i == 5) {
                // Simulate an uncommon error: exit the loop prematurely due to an unexpected condition
                break; //This line causes the loop to stop early unexpectedly
            }
        }
    }
}