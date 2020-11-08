package command;

import dagger.Module;

import javax.inject.Inject;

public class LoginCommand extends SingleArgCommand {

    private final Outputter outputter;

    @Inject
    public LoginCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    public Status handleArg(String username) {
        outputter.output(username + " is logged in.");
        return Status.HANDLED;
    }

    @Override
    public String key() {
        return "login";
    }
}
