package h12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class TabelGetallen extends Applet {

    TextField[] input = new TextField[5];
    Button confirm;
    int[] getal = new int[5];

    public void init() {

        int teller;

        for (teller = 0; teller < input.length; teller++) {

            input[teller] = new TextField("", 10);
            input[teller].addActionListener(new Listener());
            add(input[teller]);
        }
        confirm = new Button("ok");
        confirm.addActionListener(new Listener());
        add(confirm);
    }
}