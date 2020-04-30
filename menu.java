public class menu {
    private String name;
    private String job;


    public character menu(String name, String job) {
        setName(name);
        setJob(job);
        this.name = getName();
        this.job = getJob();

        switch (job.toUpperCase()) {
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
                character noCharacter = new character(this.name, this.job);
                System.out.println("No character created. " + this.job.substring(0,1).toUpperCase() + this.job.substring(1).toLowerCase() + " is not valid.");
                noCharacter.display();
                return noCharacter;
        }
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
