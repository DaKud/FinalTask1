package org.project.View.Commands;

import org.project.View.ConsoleUI;

public class SearchByID extends Commands {

    public SearchByID(ConsoleUI consoleUI) {
        super("Search by ID", consoleUI);
    }

    @Override
    public void execute() {
        System.out.println("Searching by ID");
        super.getConsoleUI().searchByID();
    }
}
