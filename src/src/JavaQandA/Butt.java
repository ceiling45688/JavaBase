package JavaQandA;

import java.awt.*;

public class Butt extends Frame {
    public static void main(String[] args){
        Butt myButt = new Butt();
    }
    Butt(){
        Button helloButton = new Button("hello");
        Button byeButton = new Button("bye");
        add(helloButton);
        add(byeButton);
        setSize(300,300);
        setVisible(true);
    }
}
