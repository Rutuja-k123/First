package calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Calculator");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300, 400);

		JTextField input = new JTextField(20);
		input.setEditable(false);

		JPanel button = new JPanel(new GridLayout(3, 6));

		JButton[] numberButtons = new JButton[10]; // create digits from 0 to 9
		for (int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			int finalI = i;
			numberButtons[i].addActionListener(new ActionListener() {
				@override

				public void actionPerformed(ActionEvent e) {
					input.setText(input.getText() + finalI);
				}
			});
			button.add(numberButtons[i]);
		}
		// create operator buttons
		JButton addButton = new JButton("+");
		JButton subtractButton = new JButton("-");
		JButton multiplicationButton = new JButton("*");
		JButton divisionButton = new JButton("/");
		JButton clearButton = new JButton("C");
		JButton equalButton = new JButton("=");
		JButton decimalpt = new JButton(".");
		JButton mod = new JButton("%");

		button.add(addButton);
		button.add(subtractButton);
		button.add(multiplicationButton);
		button.add(divisionButton);
		button.add(decimalpt);
		button.add(mod);
		button.add(clearButton);
		button.add(equalButton);

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "+");
			}
		});
		subtractButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "-");
			}
		});
		multiplicationButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "*");
			}
		});
		divisionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "/");
			}
		});
		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		decimalpt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + ".");

			}

		});
		mod.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "%");
			}
		});
		equalButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String expression = input.getText();
				try {
					javax.script.ScriptEngineManager manager = new javax.script.ScriptEngineManager();
					javax.script.ScriptEngine engine = manager.getEngineByName("js");
					Object result = engine.eval(expression);

					// Display the result
					input.setText(result.toString());
				} catch (Exception ex) {
					// Handle any exceptions that may occur during evaluation
					input.setText("Error");
				}
			}
		});

		jf.add(input);
		jf.add(button);
		jf.setLayout(new GridLayout(2, 1));
		jf.setVisible(true);

	}

}
