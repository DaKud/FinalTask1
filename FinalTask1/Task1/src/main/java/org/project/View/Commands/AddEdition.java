package org.project.View.Commands;

import org.project.View.ConsoleUI;

public class AddEdition extends Commands {

    public AddEdition(ConsoleUI consoleUI) {
        super("Add to repository", consoleUI);
    }

    @Override
    public void execute() {
        System.out.println("Adding");
        super.getConsoleUI().addEdition();
    }
}
