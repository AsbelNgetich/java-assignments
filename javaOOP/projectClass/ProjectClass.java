public class ProjectClass {

    private String name;
    private String description;

    // constructors
    public ProjectClass() {

    }

    public ProjectClass(String name) {
        this.name = name;
    }

    public ProjectClass(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String elevatorPitch() {

        return this.name + " : " + this.description;
    }

}
