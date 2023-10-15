import java.util.Scanner;
public class Patient {
    private BloodBank blood;

    public Patient(BloodBank blood) {
        this.blood = blood;
    }

    public void patientLogIn(Scanner something) {
        boolean flag = false;
        int[] existingBlood = blood.mailingBlood();

        do {
            System.out.println("This is a Patient ONLY screen. If this does not apply to you, enter EXIT or press enter to continue");
            String answer = something.nextLine();

            if (answer.equalsIgnoreCase("Exit")) {
                flag = true;
            } else {
                System.out.print("Please enter your username: ");
                String username = something.nextLine();

                if (username.equals("ImPatient")) {
                    System.out.print("Please enter your password: ");
                    String password = something.nextLine();

                    if (password.equals("password")) {
                        System.out.println("Access Granted\n");
                        System.out.println("Please enter your name: ");
                        String name = something.nextLine();
                        System.out.println("Please enter your birthdate: xx xx xxxx");
                        int birth = something.nextInt();
                        something.nextLine();
                        System.out.println("Please enter the current date: xx xx xxxx");
                        int date = something.nextInt();
                        something.nextLine();
                        System.out.println("Please enter your blood type to find compatibilities: ");
                        String youType = something.nextLine();

                        if (youType.equalsIgnoreCase("O-type") || youType.equalsIgnoreCase("O") || youType.equalsIgnoreCase("O type")) {
                            System.out.println("Please enter if it is positive or negative");
                            String ugh = something.nextLine();

                            if (ugh.equalsIgnoreCase("positive") || ugh.equalsIgnoreCase("+")) {
                                System.out.println("The compatible blood types are O-Positive and Negative");
                                System.out.println("This is the existing blood type in this facility: " + existingBlood[0]);
                                System.out.println("Is this okay?");
                                String thisBoring = something.nextLine();

                                if (thisBoring.equalsIgnoreCase("yes") || thisBoring.equalsIgnoreCase("y")) {
                                    System.out.println("Your request went through");
                                    flag = true;
                                } else if (thisBoring.equalsIgnoreCase("no") || thisBoring.equalsIgnoreCase("n")) {
                                    System.out.println("Your Request did not go through");
                                } else {
                                    System.out.println("Sorry but try again");
                                }
                            } else if (ugh.equalsIgnoreCase("negative") || ugh.equalsIgnoreCase("-")) {
                                System.out.println("The compatible blood type is ONLY O-Negative");
                                System.out.println("This is the existing blood type in this facility: " + existingBlood[0] / 2);
                                System.out.println("Is this okay?");
                                String thisBoring = something.nextLine();

                                if (thisBoring.equalsIgnoreCase("yes") || thisBoring.equalsIgnoreCase("y")) {
                                    System.out.println("Your request went through");
                                    flag = true;
                                } else if (thisBoring.equalsIgnoreCase("no") || thisBoring.equalsIgnoreCase("n")) {
                                    System.out.println("Your Request did not go through");
                                } else {
                                    System.out.println("Sorry but try again");
                                }
                            }
                        } else if (youType.equalsIgnoreCase("A-type") || youType.equalsIgnoreCase("a") || youType.equalsIgnoreCase("A type")) {
                            System.out.println("Please enter if it is positive or negative");
                            String ugh = something.nextLine();

                            if (ugh.equalsIgnoreCase("positive") || ugh.equalsIgnoreCase("+")) {
                                System.out.println("The compatible blood types are A-Positive and Negative or O-Positive and Negative");
                                System.out.println("This is the existing amount of both in this facility: A type " + existingBlood[1] + " O type " + existingBlood[0]);
                                System.out.println("Is this okay?");
                                String thisBoring = something.nextLine();

                                if (thisBoring.equalsIgnoreCase("yes") || thisBoring.equalsIgnoreCase("y")) {
                                    System.out.println("Your request went through");
                                    flag = true;
                                } else if (thisBoring.equalsIgnoreCase("no") || thisBoring.equalsIgnoreCase("n")) {
                                    System.out.println("Your Request did not go through");
                                } else {
                                    System.out.println("Sorry but try again");
                                }
                            } else if (ugh.equalsIgnoreCase("negative") || ugh.equalsIgnoreCase("-")) {
                                System.out.println("The compatible blood types are ONLY O-Negative and A-Negative");
                                System.out.println("This is the existing amount in this facility: O type " + existingBlood[0] / 2 + " A type " + existingBlood[1] / 2);
                                System.out.println("Is this okay?");
                                String thisBoring = something.nextLine();

                                if (thisBoring.equalsIgnoreCase("yes") || thisBoring.equalsIgnoreCase("y")) {
                                    System.out.println("Your request went through");
                                    flag = true;
                                } else if (thisBoring.equalsIgnoreCase("no") || thisBoring.equalsIgnoreCase("n")) {
                                    System.out.println("Your Request did not go through");
                                } else {
                                    System.out.println("Sorry but try again");
                                }
                            }
                        } else if (youType.equalsIgnoreCase("B-type") || youType.equalsIgnoreCase("B") || youType.equalsIgnoreCase("B type")) {
                            System.out.println("Please enter if it is positive or negative");
                            String ugh = something.nextLine();

                            if (ugh.equalsIgnoreCase("positive") || ugh.equalsIgnoreCase("+")) {
                                System.out.println("The compatible blood types are B and O-Positive and Negative");
                                System.out.println("This is the existing amount of both in this facility: B type " + existingBlood[2] + " O type " + existingBlood[0]);
                                System.out.println("Is this okay?");
                                String thisBoring = something.nextLine();

                                if (thisBoring.equalsIgnoreCase("yes") || thisBoring.equalsIgnoreCase("y")) {
                                    System.out.println("Your request went through");
                                    flag = true;
                                } else if (thisBoring.equalsIgnoreCase("no") || thisBoring.equalsIgnoreCase("n")) {
                                    System.out.println("Your Request did not go through");
                                } else {
                                    System.out.println("Sorry but try again");
                                }
                            } else if (ugh.equalsIgnoreCase("negative") || ugh.equalsIgnoreCase("-")) {
                                System.out.println("The compatible blood types are ONLY B-Negative and O-Negative");
                                System.out.println("This is the existing amount of both in this facility: A type " + existingBlood[2] / 2 + " O type " + existingBlood[0] / 2);
                                System.out.println("Is this okay?");
                                String thisBoring = something.nextLine();

                                if (thisBoring.equalsIgnoreCase("yes") || thisBoring.equalsIgnoreCase("y")) {
                                    System.out.println("Your request went through");
                                    flag = true;
                                } else if (thisBoring.equalsIgnoreCase("no") || thisBoring.equalsIgnoreCase("n")) {
                                    System.out.println("Your Request did not go through");
                                } else {
                                    System.out.println("Sorry but try again");
                                }
                            }
                        } else if (youType.equalsIgnoreCase("AB-type") || youType.equalsIgnoreCase("AB") || youType.equalsIgnoreCase("AB type")) {
                            System.out.println("Please enter if it is positive or negative");
                            String ugh = something.nextLine();

                            if (ugh.equalsIgnoreCase("positive") || ugh.equalsIgnoreCase("+")) {
                                System.out.println("The compatible blood types are AB, A, B, and O-Positive and Negative");
                                System.out.println("This is the existing amount of those type in this facility: AB " + existingBlood[3] + ", A " + existingBlood[1] + ", B " + existingBlood[2] + ", O " + existingBlood[0]);
                                System.out.println("Is this okay?");
                                String thisBoring = something.nextLine();

                                if (thisBoring.equalsIgnoreCase("yes") || thisBoring.equalsIgnoreCase("y")) {
                                    System.out.println("Your request went through");
                                    flag = true;
                                } else if (thisBoring.equalsIgnoreCase("no") || thisBoring.equalsIgnoreCase("n")) {
                                    System.out.println("Your Request did not go through");
                                } else {
                                    System.out.println("Sorry but try again");
                                }
                            } else if (ugh.equalsIgnoreCase("negative") || ugh.equalsIgnoreCase("-")) {
                                System.out.println("The compatible blood types are ONLY AB, A, B, O-Negative");
                                System.out.println("This is the existing amount of those type in this facility: AB " + existingBlood[3] / 2 + ", A " + existingBlood[1] / 2 + ", B " + existingBlood[2] / 2 + ", O " + existingBlood[0] / 2);
                                System.out.println("Is this okay?");
                                String thisBoring = something.nextLine();

                                if (thisBoring.equalsIgnoreCase("yes") || thisBoring.equalsIgnoreCase("y")) {
                                    System.out.println("Your request went through");
                                    flag = true;
                                } else if (thisBoring.equalsIgnoreCase("no") || thisBoring.equalsIgnoreCase("n")) {
                                    System.out.println("Your Request did not go through");
                                } else {
                                    System.out.println("Sorry but try again");
                                }
                            }
                        }
                    }
                }
            }
        } while (!flag);

        System.exit(0);
    }
}
