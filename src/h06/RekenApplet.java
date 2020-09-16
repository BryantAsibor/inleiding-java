package h06;
import java.awt.*;
import java.applet.*;

public class RekenApplet extends Applet {

    int a, b, c, d;
    double uitkomst;


    public void init() {
        a = 50;
        b = 50;
        c = 13;
        d = 4;
        uitkomst = (a + b + c) / d;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

        g.drawString("28€",20,120);
        g.drawString("Jan",20,140);

        g.drawString("28€",100,120);
        g.drawString("Ali",100,140);

        g.drawString("28€",180,120);
        g.drawString("Jeannette",180,140);

        g.drawString("28€",280,120);
        g.drawString("Bryce",280,140);
    }
}
