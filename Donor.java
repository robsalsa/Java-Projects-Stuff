import java.util.Scanner;
public class Donor {
    private BloodBank blood;

    public Donor(BloodBank blood) {
        this.blood = blood;
    }

    public void donorLogin(Scanner something) {
        boolean flag = false;

        do {
            System.out.println("This part is ONLY for Donors. Please enter EXIT if you are not one or press enter to continue");
            String validation = something.nextLine();

            if (validation.equalsIgnoreCase("Exit")) {
                flag = true;
            } else {
                System.out.print("Please enter your username: ");
                String username = something.nextLine();

                if (username.equals("ImDonor")) {
                    System.out.print("Please enter your password:");
                    String password = something.nextLine();

                    if (password.equals("password")) {
                        System.out.println("Access Granted\n");
                        System.out.print("Please enter your name: ");
                        String name = something.nextLine();
                        System.out.println("Please enter your birthdate: xx xx xxxx");
                        String birth = something.nextLine();
                        
                        System.out.println("Please enter today's date: xx xx xxxx");
                        String today = something.nextLine();
                        

                        boolean newFlag = false;

                        do {
                            System.out.println("\nPlease enter the type of blood you will be donating today");
                            String bloodType = something.nextLine();
                            System.out.println("Please enter if the blood is negative or positive");
                            String yesOrNo = something.nextLine();

                            if (yesOrNo.equalsIgnoreCase("positive") || yesOrNo.equals("+")) {
                                System.out.println("NOTE: Unlike Australia, in the US, the total amount of blood we can stea- I mean, you can donate is 3 packets of blood."
                                        + " Within 48 hours, better than the 1-2 months from lame Australia."
                                        + " The amount of money you will be getting is subject to change when we feel like it."
                                        + " So hopefully through this notice, you'll feel more inclined to give me as much blood as you have every 2 days");
                                System.out.println("Could you tell us the amount of blood packets you will be donating today?");
                                int amount = something.nextInt();
                                something.nextLine();

                                if (amount == 1) {
                                    System.out.println("Your blood is cheap, hope to see you again.");
                                    newFlag = true;
                                    System.exit(0);
                                } else if (amount == 2) {
                                    System.out.println("Your blood, although desperate and tart, it's never enough. Hope to see you again.");
                                    newFlag = true;
                                    System.exit(0);
                                } else if (amount == 3) {
                                    System.out.println("Your blood is now enough to satisfy those with more, sweeter the scent when spiked in a party."
                                            + " Although you will never be invited, you'll be the lifeblood of the party");
                                    newFlag = true;
                                    System.exit(0);
                                } else {
                                    System.out.println("Sorry, but although we'd love that much blood we can't... sadly it's illegal, try again");
                                    something.nextLine();
                                }
                            } else if (yesOrNo.equalsIgnoreCase("negative") || yesOrNo.equals("-")) {
                                System.out.println("NOTE: Unlike Australia, in the US, the total amount of blood we can stea- I mean, you can donate is 3 packets of blood."
                                        + " Within 48 hours, better than the 1-2 months from lame Australia."
                                        + " The amount of money you will be getting is subject to change when we feel like it."
                                        + " So hopefully through this notice, you'll feel more inclined to give me as much blood as you have every 2 days");
                                System.out.println("Could you tell us the amount of blood packets you will be donating today?");
                                int amount = something.nextInt();
                                something.nextLine();

                                if (amount == 1) {
                                    System.out.println("Your blood is cheap, hope to see you again.");
                                    newFlag = true;
                                    System.exit(0);
                                } else if (amount == 2) {
                                    System.out.println("Your blood, although desperate and tart, it's never enough. Hope to see you again.");
                                    newFlag = true;
                                    System.exit(0);
                                } else if (amount == 3) {
                                    System.out.println("Your blood is now enough to satisfy those with more, sweeter the scent when spiked in a party."
                                            + " Although you will never be invited, you'll be the lifeblood of the party");
                                    newFlag = true;
                                    System.exit(0);
                                } else {
                                    System.out.println("Sorry, but although we'd love that much blood we can't... sadly it's illegal, try again");
                                    something.nextLine();
                                }
                            }
                        } while (!newFlag);

                        System.exit(0);
                    }
                }
            }
        } while (!flag);

        System.exit(0);
    }
}
