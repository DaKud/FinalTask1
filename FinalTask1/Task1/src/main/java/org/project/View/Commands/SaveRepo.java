package org.project.View.Commands;

import org.project.View.ConsoleUI;

public class SaveRepo extends Commands {

    public SaveRepo(ConsoleUI consoleUI) {
        super("Seve to repository", consoleUI);
    }

    @Override
    public void execute() {
        System.out.println("Saving");
        super.getConsoleUI().saveRepo();
    }
}
