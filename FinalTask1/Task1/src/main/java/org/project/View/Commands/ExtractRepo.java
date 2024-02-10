package org.project.View.Commands;

import org.project.View.ConsoleUI;

public class ExtractRepo extends Commands {

    public ExtractRepo(ConsoleUI consoleUI) {
        super("Extract outta repository", consoleUI);
    }

    @Override
    public void execute() {
        System.out.println("Extracting");
        super.getConsoleUI().extractRepo();
    }
}
