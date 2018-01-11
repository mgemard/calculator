package button;

import command.CommandMultiply;
import core.Calculator;

public class ButtonMultiply extends Button {

    public ButtonMultiply(Calculator calculator) {
        super(calculator);
        setText("*");
    }

    @Override
    public void click() {
        calculator.updateTextArea();

        calculator.setMemory(Double.valueOf(calculator.getDisplay().getText()));
        calculator.setCommand(new CommandMultiply());
    }

}
