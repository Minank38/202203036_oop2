import java.applet.*;
import java.awt.*;
import java.util.*;

public class First extends Applet {
    String name = "User";

    public void init() {
        name = getParameter("name");
        if (name == null) {
            name = "User";
        }
    }

    public void paint(Graphics g) {
		String s;
		Scanner sc=new Scanner(System.in);
s=sc.nextLine();
        g.drawString("Hello " + name + "!", getWidth() / 2, getHeight() / 2);
    }
}