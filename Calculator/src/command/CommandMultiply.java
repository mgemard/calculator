package command;

public class CommandMultiply implements Command {

    @Override
    public Double execute(double memory, double textArea) {
        return memory * textArea;
    }

}
