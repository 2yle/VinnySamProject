public class SleepThread {
    public static void main(String[] args) {
        try {
            Thread.sleep(650,1500); // Pause for 3 seconds
            }
        catch (InterruptedException e) {
            e.printStackTrace(); // Handle the exception (if needed)
        }
    }
}
