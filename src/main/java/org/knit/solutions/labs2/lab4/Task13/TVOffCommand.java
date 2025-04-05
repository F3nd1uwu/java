package org.knit.solutions.labs2.lab4.Task13;

public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
