package reflection.dependencyinjection;

public class UserController {

    @Inject
    private MessageService service; 

    public void process() {
        service.sendMessage("Hello from UserController!");
    }
}