import java.util.Date;
import java.awt.*;
import java.applet.*;
import java.awt.event.*; 

public class Second extends Applet implements ItemListener {

    Choice c;

    public void init() {
        c = new Choice();
        c.add("Red");
        c.add("Green");
        c.add("Blue");
	c.add("Pink");
	c.add("Orange");
	c.add("Yellow");
        c.addItemListener(this);
        add(c);
    }

    public void itemStateChanged(ItemEvent e) {
        String colorString = c.getSelectedItem();
        Color color = null;
        switch(colorString) {
            case "Red":
                color = Color.RED;
                break;
            case "Green":
                color = Color.GREEN;
                break;
            case "Blue":
                color = Color.BLUE;
                break;
	case "Pink":
                color = Color.PINK;
                break;
	case "Orange":
                color = Color.ORANGE;
                break;
	case "Yellow":
                color = Color.YELLOW;
                break;
            default:
                color = Color.WHITE;
        }
        setBackground(color);
    }
}