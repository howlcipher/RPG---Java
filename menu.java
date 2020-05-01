import java.util.Scanner;

public class menu {
    private String name;
    private String job;

    Scanner input = new Scanner(System.in);

    public character menu() {
        System.out.println("Let make a character!");
        System.out.print("Enter your characters name: ");
        //create the characters name
        setName(input.nextLine());
        System.out.println("Pre-made jobs include: Warrior, Cleric, Rogue, and Wizard");
        System.out.print("Enter " + capitalize(this.getName()) + "(')s job: ");
        //create the job
        setJob(input.nextLine());

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
}
