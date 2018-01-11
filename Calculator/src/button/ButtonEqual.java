package button;

import java.util.Locale;

import javax.swing.JTextArea;

import command.CommandAdd;
import core.Calculator;

public class ButtonEqual extends Button {

    public ButtonEqual(Calculator calculator) {
        super(calculator);
        setText("=");
    }

    @Override
    public void click() {

        calculator.updateTextArea();
        
        calculator.setCommand(new CommandAdd());
        calculator.setMemory(0);

    }

}
