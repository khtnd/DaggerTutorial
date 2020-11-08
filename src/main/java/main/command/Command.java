package main.command;

import java.util.List;

/** Logic to process some user input. */
public interface Command {
    /**
     * String token that signifies this main.command should be selected (e.g.:
     * "deposit", "withdraw")
     */
    String key();

    /** Process the rest of the main.command's words and do something. */
    Status handleInput(List<String> input);

    enum Status {
        INVALID,
        HANDLED
    }
}