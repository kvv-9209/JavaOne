package lesson8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CounterApp extends JFrame {
    private int value;

    private static final String COUNTER_NORMAL = "Счетчик в норме";
    private static final String COUNTER_IS_TOO_BIG = "Счетчик слишком большой";
    private static final String COUNTER_IS_TOO_LOW = "Вы натыкали очень мало";


    public CounterApp(int initialValue) {
        this.value = initialValue;
        setBounds(500, 500, 500, 150);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Создадим шрифт
        Font font = new Font("Arial", Font.BOLD, 18);
        setLayout(null);
        //Создадим сам счетчик
        JLabel counterValue = new JLabel(String.valueOf(this.value));
        counterValue.setFont(font);
        counterValue.setBounds(230,15,100,100);
        add(counterValue);

        JLabel infoPane = new JLabel(COUNTER_NORMAL);
        infoPane.setBounds(190,0,200,15);
        add(infoPane);


        //Уменьшение значения

        JButton decrement = new JButton("-1");
        JButton decrement5 = new JButton("-5");
        JButton decrement10 = new JButton("-10");
        decrement.setFont(font);
        decrement5.setFont(font);
        decrement10.setFont(font);
        decrement.setBounds(120, 15, 60, 100);
        decrement5.setBounds(60, 15, 60, 100);
        decrement10.setBounds(0, 15, 60, 100);
        add(decrement);
        add(decrement5);
        add(decrement10);

        //Увеличение значения
        JButton increment = new JButton("+1");
        JButton increment5 = new JButton("+5");
        JButton increment10 = new JButton("+10");
        increment.setFont(font);
        increment5.setFont(font);
        increment10.setFont(font);
        increment.setBounds(300, 15, 60, 100);
        increment5.setBounds(362, 15, 60, 100);
        increment10.setBounds(423, 15, 65, 100);
        add(increment);
        add(increment5);
        add(increment10);

        //Добавляем слушателей
        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValue.setText(String.valueOf(value));
                if (value < -100) {
                    infoPane.setText(COUNTER_IS_TOO_LOW);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });
        decrement5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value-=5;
                counterValue.setText(String.valueOf(value));
                if (value < -100) {
                    infoPane.setText(COUNTER_IS_TOO_LOW);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });
        decrement10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value-=10;
                counterValue.setText(String.valueOf(value));
                if (value < -100) {
                    infoPane.setText(COUNTER_IS_TOO_LOW);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValue.setText(String.valueOf(value));
                if (value > 100) {
                    infoPane.setText(COUNTER_IS_TOO_BIG);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });
        increment5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value+=5;
                counterValue.setText(String.valueOf(value));
                if (value > 100) {
                    infoPane.setText(COUNTER_IS_TOO_BIG);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });
        increment10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value+=10;
                counterValue.setText(String.valueOf(value));
                if (value > 100) {
                    infoPane.setText(COUNTER_IS_TOO_BIG);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });


        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}
