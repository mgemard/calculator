package command;

public class CommandAdd implements Command {

    @Override
    public Double execute(double memory, double textArea) {
        return memory + textArea;
    }

}
