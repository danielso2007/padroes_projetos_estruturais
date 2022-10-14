package br.com.estruturais.mediator.swing.before.components;

import javax.swing.JButton;

public class ResetButton extends JButton {
    private static final long serialVersionUID = -6170178595314483794L;

    public ResetButton(State state, Label label, AddButton button) {
        super("Reset");

        this.addActionListener(e -> {
            state.setCounter(0);
            button.setEnabled(true);
            label.refresh();
        });
    }

}
