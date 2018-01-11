package core;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import button.ButtonAdd;
import button.ButtonDivide;
import button.ButtonEqual;
import button.ButtonMultiply;
import button.ButtonNumber;
import button.ButtonSubstract;
import command.Command;
import command.CommandAdd;

public class Calculator extends JFrame {

    Calculator test;

    private boolean reset = false;
    private double memory = 0;
    private JTextArea display;
    private Command command = new CommandAdd();

    public Calculator() {
        setSize(500, 500);
        setTitle("Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        draw();

    }

    private void draw() {
        JPanel root = new JPanel(new BorderLayout());
        root.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setContentPane(root);

        JPanel left = new JPanel(new GridLayout(4, 3));
        left.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        JPanel right = new JPanel(new GridLayout(4, 3));
        right.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 0));
        getContentPane().add(left, BorderLayout.LINE_START);
        getContentPane().add(right, BorderLayout.LINE_END);

        display = new JTextArea();
        display.setPreferredSize(new Dimension(200, 40));
        root.add(display, BorderLayout.PAGE_START);

        left.add(new ButtonNumber("7", this));
        left.add(new ButtonNumber("8", this));
        left.add(new ButtonNumber("9", this));
        left.add(new ButtonNumber("4", this));
        left.add(new ButtonNumber("5", this));
        left.add(new ButtonNumber("6", this));
        left.add(new ButtonNumber("1", this));
        left.add(new ButtonNumber("2", this));
        left.add(new ButtonNumber("3", this));
        left.add(new ButtonNumber("0", this));
        left.add(new ButtonNumber(".", this));
        left.add(new ButtonEqual(this));
        root.add(left, BorderLayout.LINE_START);

        ButtonAdd buttonAdd = new ButtonAdd(this);
        ButtonSubstract buttonSubtract = new ButtonSubstract(this);
        ButtonMultiply buttonMultiply = new ButtonMultiply(this);
        ButtonDivide buttonDivide = new ButtonDivide(this);
        right.add(buttonAdd);
        right.add(buttonSubtract);
        right.add(buttonMultiply);
        right.add(buttonDivide);

        root.add(right, BorderLayout.CENTER);

        pack();
    }

    public JTextArea getDisplay() {
        return display;
    }

    public boolean isReset() {
        return reset;
    }

    public void refresh() {

    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    public double getMemory() {
        reset = false;
        return memory;
    }

    public void setMemory(double memory) {
        reset = true;
        this.memory = memory;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public static void main(String[] args) {
        Calculator test = new Calculator();
        test.setVisible(true);

    }

}
