package com.kevin6shah.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double prev;
    char op;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button zero = findViewById(R.id.zero);
        Button dot = findViewById(R.id.dot);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button divide = findViewById(R.id.divide);
        Button multiply = findViewById(R.id.multiply);
        Button equals = findViewById(R.id.equals);
        Button clear = findViewById(R.id.clear);
        Button back = findViewById(R.id.back);
        final TextView display = findViewById(R.id.display);
        final TextView previous = findViewById(R.id.prev);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText() != "") {
                    if (display.getText().length() != 1) {
                        display.setText(display.getText().toString().substring(0, display.getText().toString().length() - 1));
                    } else display.setText("");
                } else display.setText("");
                if (prev == 0) counter = 0;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
                counter = 1;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
                counter = 1;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
                counter = 1;
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
                counter = 1;
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
                counter = 1;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
                counter = 1;
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
                counter = 1;
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
                counter = 1;
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
                counter = 1;
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
                counter = 1;
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + ".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                previous.setText("Previous: ");
                op = ' ';
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter != 0) {
                    String temp = display.getText().toString();
                    if (prev != 0 && Double.parseDouble(temp) != 0) {
                        equal(display, previous);
                        temp = display.getText().toString();
                        prev = Double.parseDouble(temp);
                        op = 'p';
                        display.setText("");
                        if (prev == Math.floor(prev) && !Double.isInfinite(prev)) {
                            previous.setText("Previous: " + (int) Math.floor(prev));
                        } else previous.setText("Previous: " + prev);
                    } else {
                        prev = Double.parseDouble(temp);
                        op = 'p';
                        display.setText("");
                        if (prev == Math.floor(prev) && !Double.isInfinite(prev)) {
                            previous.setText("Previous: " + (int) Math.floor(prev));
                        } else previous.setText("Previous: " + prev);
                    }
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter != 0) {
                    String temp = display.getText().toString();
                    if (prev != 0 && Double.parseDouble(temp) != 0) {
                        equal(display, previous);
                        temp = display.getText().toString();
                        prev = Double.parseDouble(temp);
                        op = 's';
                        display.setText("");
                        if (prev == Math.floor(prev) && !Double.isInfinite(prev)) {
                            previous.setText("Previous: " + (int) Math.floor(prev));
                        } else previous.setText("Previous: " + prev);
                    } else {
                        prev = Double.parseDouble(temp);
                        op = 's';
                        display.setText("");
                        if (prev == Math.floor(prev) && !Double.isInfinite(prev)) {
                            previous.setText("Previous: " + (int) Math.floor(prev));
                        } else previous.setText("Previous: " + prev);
                    }
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter != 0) {
                    String temp = display.getText().toString();
                    if (prev != 0 && Double.parseDouble(temp) != 0) {
                        equal(display, previous);
                        temp = display.getText().toString();
                        prev = Double.parseDouble(temp);
                        op = 'm';
                        display.setText("");
                        if (prev == Math.floor(prev) && !Double.isInfinite(prev)) {
                            previous.setText("Previous: " + (int) Math.floor(prev));
                        } else previous.setText("Previous: " + prev);
                    } else {
                        prev = Double.parseDouble(temp);
                        op = 'm';
                        display.setText("");
                        if (prev == Math.floor(prev) && !Double.isInfinite(prev)) {
                            previous.setText("Previous: " + (int) Math.floor(prev));
                        } else previous.setText("Previous: " + prev);
                    }
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter != 0) {
                    String temp = display.getText().toString();
                    if (prev != 0 && Double.parseDouble(temp) != 0) {
                        equal(display, previous);
                        temp = display.getText().toString();
                        prev = Double.parseDouble(temp);
                        op = 'd';
                        display.setText("");
                        if (prev == Math.floor(prev) && !Double.isInfinite(prev)) {
                            previous.setText("Previous: " + (int) Math.floor(prev));
                        } else previous.setText("Previous: " + prev);
                    } else {
                        prev = Double.parseDouble(temp);
                        op = 'd';
                        display.setText("");
                        if (prev == Math.floor(prev) && !Double.isInfinite(prev)) {
                            previous.setText("Previous: " + (int) Math.floor(prev));
                        } else previous.setText("Previous: " + prev);
                    }
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 'p' || op == 's' || op == 'm' || op == 'd') {
                    String temp = display.getText().toString();
                    if (op == 'p') {
                        Double Sum = prev + Double.parseDouble(temp);
                        if ((Sum == Math.floor(Sum)) && !Double.isInfinite(Sum)) {
                            int n = (int) Math.floor(Sum);
                            display.setText("" + n);
                            previous.setText("Previous: ");
                            prev = 0;
                        } else {
                            display.setText("" + Sum.toString());
                            previous.setText("Previous: ");
                            prev = 0;
                        }
                    } else if (op == 's') {
                        Double Difference = prev - Double.parseDouble(temp);
                        if ((Difference == Math.floor(Difference)) && !Double.isInfinite(Difference)) {
                            int n = (int) Math.floor(Difference);
                            display.setText("" + n);
                            previous.setText("Previous: ");
                            prev = 0;
                        } else {
                            display.setText("" + Difference.toString());
                            previous.setText("Previous: ");
                            prev = 0;
                        }
                    } else if (op == 'm') {
                        Double Product = prev * Double.parseDouble(temp);
                        if ((Product == Math.floor(Product)) && !Double.isInfinite(Product)) {
                            int n = (int) Math.floor(Product);
                            display.setText("" + n);
                            previous.setText("Previous: ");
                            prev = 0;
                        } else {
                            display.setText("" + Product.toString());
                            previous.setText("Previous: ");
                            prev = 0;
                        }
                    } else if (op == 'd') {
                        Double Division = prev / Double.parseDouble(temp);
                        if ((Division == Math.floor(Division)) && !Double.isInfinite(Division)) {
                            int n = (int) Math.floor(Division);
                            display.setText("" + n);
                            previous.setText("Previous: ");
                            prev = 0;
                        } else {
                            display.setText("" + Division.toString());
                            previous.setText("Previous: ");
                            prev = 0;
                        }
                    }
                } else display.setText("");
            }
        });
    }
    void equal(TextView display, TextView previous) {
        if (op == 'p' || op == 's' || op == 'm' || op == 'd') {
            String temp = display.getText().toString();
            if (op == 'p') {
                Double Sum = prev + Double.parseDouble(temp);
                if ((Sum == Math.floor(Sum)) && !Double.isInfinite(Sum)) {
                    int n = (int) Math.floor(Sum);
                    display.setText("" + n);
                    previous.setText("Previous: ");
                    prev = 0;
                } else {
                    display.setText("" + Sum.toString());
                    previous.setText("Previous: ");
                    prev = 0;
                }
            } else if (op == 's') {
                Double Difference = prev - Double.parseDouble(temp);
                if ((Difference == Math.floor(Difference)) && !Double.isInfinite(Difference)) {
                    int n = (int) Math.floor(Difference);
                    display.setText("" + n);
                    previous.setText("Previous: ");
                    prev = 0;
                } else {
                    display.setText("" + Difference.toString());
                    previous.setText("Previous: ");
                    prev = 0;
                }
            } else if (op == 'm') {
                Double Product = prev * Double.parseDouble(temp);
                if ((Product == Math.floor(Product)) && !Double.isInfinite(Product)) {
                    int n = (int) Math.floor(Product);
                    display.setText("" + n);
                    previous.setText("Previous: ");
                    prev = 0;
                } else {
                    display.setText("" + Product.toString());
                    previous.setText("Previous: ");
                    prev = 0;
                }
            } else if (op == 'd') {
                Double Division = prev / Double.parseDouble(temp);
                if ((Division == Math.floor(Division)) && !Double.isInfinite(Division)) {
                    int n = (int) Math.floor(Division);
                    display.setText("" + n);
                    previous.setText("Previous: ");
                    prev = 0;
                } else {
                    display.setText("" + Division.toString());
                    previous.setText("Previous: ");
                    prev = 0;
                }
            }
        } else display.setText("");
    }
}
