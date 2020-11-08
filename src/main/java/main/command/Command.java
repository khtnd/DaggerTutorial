package main.command;

import java.util.List;

/** Logic to process some user input. */
public interface Command {

    /** Process the rest of the main.command's words and do something. */
    Status handleInput(List<String> input);

    enum Status {
        INVALID,
        HANDLED
    }
}