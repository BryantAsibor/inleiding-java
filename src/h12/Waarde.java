package h12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Waarde extends Applet {

    int array[] = {100, 200, 300, 400, 500};
    TextField input;
    Label label;
    int getal;
    boolean gevonden;

    public void init() {
        label = new Label("Zoek naar een getal");
        input = new TextField("", 10);
        input.addActionListener(new Listener());
        add(label);
        add(input);
    }
}
