import java.util.Scanner;

public class menu {
    private String name;
    private String job;

    Scanner input = new Scanner(System.in);

    public character menu(String name, String job) {
        System.out.println("Let make a character!");
        System.out.print("Enter your characters name: ");
        setName(input.nextLine());
        System.out.println("Pre-made jobs include: Warrior, Cleric, Rogue, and Wizard");
        System.out.print("Enter " + this.getName() + "(')s job: ");
        setJob(input.nextLine());

        switch (this.job.toUpperCase()) {
            case "WARRIOR":
                character warrior = new warrior(this.name, this.job);
                warrior.display();
                return warrior;
            case "WIZARD":
                character wizard = new wizard(this.name, this.job);
                wizard.display();
                return wizard;
            case "ROGUE":
                character rogue = new rogue(this.name, this.job);
                rogue.display();
                return rogue;
            case "CLERIC":
                character cleric = new cleric(this.name, this.job);
                cleric.display();
                return cleric;
            default:
                character userCreatedCharacter = new character(this.name, this.job);
                System.out.println("New class created. " + capitalize(this.job) + " is user created.");
                userCreatedCharacter.display();
                return userCreatedCharacter;
        }
    }

    private String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

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
