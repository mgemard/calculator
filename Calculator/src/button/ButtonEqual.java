package button;

import java.util.Locale;

import javax.swing.JTextArea;

import core.Calculator;

public class ButtonEqual extends Button {

    public ButtonEqual(Calculator calculator) {
        super(calculator);
        setText("=");
    }

    @Override
    public void click() {
        JTextArea display = calculator.getDisplay();

        String textArea = display.getText();
        Double result = calculator.getCommand().execute(calculator.getMemory(), Double.valueOf(textArea));

        display.setText(String.format(Locale.US, "%.2f", result));

        calculator.setReset(true);
        calculator.setMemory(Double.valueOf(display.getText()));

    }

}
