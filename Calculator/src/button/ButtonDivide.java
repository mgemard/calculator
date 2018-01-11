package button;

import javax.swing.JTextArea;

import core.Calculator;

public class ButtonDivide extends Button {

    public ButtonDivide(Calculator calculator) {
        super(calculator);
        setText("/");
    }

    @Override
    public void click() {
        JTextArea display = calculator.getDisplay();
        display.setText(display.getText() + "/");
    }

}
