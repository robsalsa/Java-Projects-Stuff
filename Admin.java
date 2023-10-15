import java.util.Scanner;

public class Admin {
    private BloodBank blood;

    public Admin(BloodBank blood) {
        this.blood = blood;
    }

    public void adminLogin(Scanner something) {
        boolean flag = false;

        do {
            System.out.println("Hello, this part is only for Admins. If you are not one, please enter 'Exit' or press enter to continue");
            String validation = something.nextLine();

            if (validation.equalsIgnoreCase("exit")) {
                flag = true;
            } else {
                System.out.print("Please enter your username: ");
                String username = something.nextLine();

                if (username.equals("ImAdmin")) {
                    System.out.print("Please enter your password: ");
                    String password = something.nextLine();

                    if (password.equals("password")) {
                        System.out.println("Access Granted\n");
                        System.out.print("Please enter your name: ");
                        String name = something.nextLine();
                        System.out.println("Please enter your date of birth: xx xx xxxx");
                        String birth = something.nextLine();
                       
                        System.out.print("Please enter today's date: ");
                        String today = something.nextLine();
                       

                        int[] existingBlood = blood.mailingBlood();
                        System.out.println("These are the current existing amounts of blood this facility has");
                        System.out.println("O: " + existingBlood[0]);
                        System.out.println("-O: " + existingBlood[0] / 2);
                        System.out.println("+O: " + existingBlood[0] / 2);
                        System.out.println("A: " + existingBlood[1]);
                        System.out.println("-A: " + existingBlood[1] / 2);
                        System.out.println("+A: " + existingBlood[1] / 2);
                        System.out.println("B: " + existingBlood[2]);
                        System.out.println("-B: " + existingBlood[2] / 2);
                        System.out.println("+B: " + existingBlood[2] / 2);
                        System.out.println("AB: " + existingBlood[3]);
                        System.out.println("-AB: " + existingBlood[3] / 2);
                        System.out.println("+AB: " + existingBlood[3] / 2);
                        System.exit(0);
                    } else {
                        System.out.println("Sorry, but you entered the wrong information. Please try again");
                    }
                } else {
                    continue;
                }
            }
        } while (!flag);
    }
}
