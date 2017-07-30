import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstFrame extends JFrame implements WindowFocusListener {
    DataObject data = new DataObject();
    private JButton openFrame2Button;
    private JLabel jLabelRetrievedValue;
    private JPanel jPanel;

    public FirstFrame() throws HeadlessException {
        setContentPane(jPanel);
        addWindowFocusListener(this);

        openFrame2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SecondFrame secondFrame = new SecondFrame(data);
                secondFrame.pack();
                secondFrame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        FirstFrame firstFrame = new FirstFrame();
        firstFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        firstFrame.pack();
        firstFrame.setVisible(true);
    }


    public void windowGainedFocus(WindowEvent e) {
        if (data.getName() != null)
            jLabelRetrievedValue.setText(data.getName());
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        System.out.println("lost focus");
    }
}
