package Ex1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.FlowLayout; //Specifies how components are arranged

public class LabelFrame extends JFrame {
    //Variables
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrame(){
        super("JLabel Demo"); //This called J Label constructor and sets the title of the window
        setLayout(new FlowLayout()); //Flow Layout is not that much usable

        //create lable 1 and difine it's features

        label1 = new JLabel("Label with Text");
        label1.setToolTipText("Label 1 tooptip text");

        add(label1); //components

        //create label2 with a string, an image and alignment
        Icon bug = new ImageIcon(getClass().getResource("GUItip.gif"));
        label2 = new JLabel("Label with Text Icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is Label 2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Label with ICON and Test at the Bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label 3");
        add(label3);

    }
}
