
package command;

public class CommandPower implements Command {

    @Override
    public Double execute(double memory, double textArea) {
        return Math.pow(memory, textArea);
    }

}
