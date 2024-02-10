package org.project.View.Commands;

import org.project.View.ConsoleUI;

public class SearchByAuthor extends Commands {

    public SearchByAuthor(ConsoleUI consoleUI) {
        super("Search by author", consoleUI);
    }

    @Override
    public void execute() {
        System.out.println("Searcing by author");
        super.getConsoleUI().searchByAuthor();
    }
}
