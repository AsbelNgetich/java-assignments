public class ProjectClassTest {

    public static void main(String[] args) {

        ProjectClass assistant = new ProjectClass();
        assistant.setName("Alexa");
        assistant.setDescription("My audio helper");
        // System.out.println("My project name is: " + assistant.getName());
        // System.out.println("My project description: " + assistant.getDescription());

        System.out.println(assistant.elevatorPitch());

    }

}
