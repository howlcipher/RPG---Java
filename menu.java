import java.util.Scanner;

public class menu {
    private String name;
    private String job;
    private int menuOption;

    public void mainMenu() {
        Scanner menuInput = new Scanner(System.in);
        //main menu
        System.out.println("Menu Options type the number of the menu option");
        System.out.println("1. Create new character\n2. Load character from file\n" +
                "3.Save character to file\n4.Edit character\n5. Delete character\n 6. Quit\n");
        System.out.println("Please enter a number (1 - 5)");
        setMenuOption(menuInput.nextInt());
        menuInput.close();
        switch (menuOption) {
            case 1:
                //create new character
            case 2:
                //load character
            case 3:
                //save character
            case 4:
                //edit character
            case 5:
                //delete character
            case 6:
                //quit program
            default:
                //repeat menu display of options

        }

    }

    public character saveMenu(character c) {
        //save a character
        return c;
    }

    public character loadMenu(character c) {
        //save a character
        return c;
    }

    public character editMenu(character c) {
        //save a character
        return c;
    }

    public character menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Let make a character!");
        System.out.print("Enter your characters name: ");
        //create the characters name
        setName(input.nextLine());
        System.out.println("Pre-made jobs include: Warrior, Cleric, Rogue, and Wizard");
        System.out.print("Enter " + capitalize(this.getName()) + "(')s job: ");
        //create the job
        setJob(input.nextLine());
        input.close();

        //switch case based on job selected
        switch (this.job.toUpperCase()) {
            //creates a warrior and displays it
            case "WARRIOR":
                character warrior = new warrior(this.name, this.job);
                warrior.display();
                return warrior;
            //creates a wizard and displays it
            case "WIZARD":
                character wizard = new wizard(this.name, this.job);
                wizard.display();
                return wizard;
            //creates a rogue and displays it
            case "ROGUE":
                character rogue = new rogue(this.name, this.job);
                rogue.display();
                return rogue;
            //creates a cleric and displays it
            case "CLERIC":
                character cleric = new cleric(this.name, this.job);
                cleric.display();
                return cleric;
            //creates a user defined class and displays it
            default:
                character userCreatedCharacter = new character(this.name, this.job);
                System.out.println("New class created. " + capitalize(this.job) + " is user created.");
                userCreatedCharacter.display();
                return userCreatedCharacter;
        }
    }

    //used for capitalization
    private String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    //name and job getter and setters
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMenuOption() {
        return menuOption;
    }

    public void setMenuOption(int menuOption) {
        this.menuOption = (int) menuOption;
    }
}
