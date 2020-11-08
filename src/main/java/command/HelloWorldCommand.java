package command;

import javax.inject.Inject;
import java.util.List;

public class HelloWorldCommand implements Command {

    private Outputter outputter;

    @Inject
    public HelloWorldCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    public String key() {
        return "hello";
    }

    @Override
    public Status handleInput(List<String> input) {
        outputter.output("world");
        return Status.HANDLED;
    }
}
