package main.command;

import main.Database;

import javax.inject.Inject;

import static main.Database.*;

public class LoginCommand extends SingleArgCommand {

    private final Database database;
    private final Outputter outputter;

    @Inject
    public LoginCommand(Database database, Outputter outputter) {
        this.database = database;
        this.outputter = outputter;

        System.out.println("Creating a new " + this);
    }

    @Override
    public Status handleArg(String username) {
        Account account = database.getAccount(username);
        outputter.output(username + " is logged in with balance: " + account.balance());
        return Status.HANDLED;
    }
}
