package button;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import command.Command;
import core.Calculator;

public abstract class Button extends JButton {

    protected Calculator calculator;

    public Button(Calculator calculator) {
        this.calculator = calculator;
        setPreferredSize(new Dimension(50, 50));
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                click();
            }
        });
    }
    
    protected abstract void click(); 

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;

        } catch (NumberFormatException e) {

        }
        return false;
    }

}
