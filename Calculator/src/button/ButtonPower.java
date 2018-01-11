package button;

import command.CommandPower;
import core.Calculator;

public class ButtonPower extends Button {

    public ButtonPower(Calculator calculator) {
        super(calculator);
        setText("^");
    }

    @Override
    public void click() {

        calculator.updateTextArea();

        calculator.setMemory(Double.valueOf(calculator.getDisplay().getText()));
        calculator.setCommand(new CommandPower());
    }

}
