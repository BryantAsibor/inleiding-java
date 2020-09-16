package h06;
import java.awt.*;
import java.applet.*;

public class NegatieveWaarde extends Applet {

    int a, b;
    double uitkomst;


    public void init() {
        a = 2147483645;
        b = 33;
        uitkomst = (a + b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
