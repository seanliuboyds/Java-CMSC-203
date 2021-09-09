import java.util.Scanner;

public class WiFiDriver {
    public static void main(String []args) {
        Scanner response = new Scanner(System.in);
        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n\nFirst step: reboot your computer \nAre you able to connect with the internet? (yes or no)\n");

        String answer = response.nextLine();
        if(answer.equals("yes")) {
            System.out.println("Rebooting the computer seemed to work");
        } else if (answer.equals("no")) {
            System.out.println("Second step: reboot your router\nNow are you able to connect with the internet? (yes or no)\n");
            answer = response.nextLine();
            if(answer.equals("yes")) {
                System.out.println("Rebooting the router seemed to work");
            } else if (answer.equals("no")) {
                System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\nNow are you able to connect with the internet? (yes or no)\n");
                answer = response.nextLine();
                if (answer.equals("yes")) {
                    System.out.println("Firmly plugging in the cables seemed to work");
                } else if (answer.equals("no")) {
                    System.out.println("Fourth step: move your computer closer to your router\nNow are you able to connect with the internet? (yes or no)\n");
                    answer = response.nextLine();
                    if (answer.equals("yes")) {
                        System.out.println("Moving the computer closer to the router seemed to work");
                    } else if (answer.equals("no")) {
                        System.out.println("Fifth step: contact your ISP\nMake sure your ISP is hooked up to your router.\n");


                    }
                }
            }
        }
    }
}
