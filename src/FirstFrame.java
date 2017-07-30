import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstFrame extends JFrame {
    private JButton openFrame2Button;
    private JLabel jLabelRetrievedValue;
    private JPanel jPanel;

    public FirstFrame() throws HeadlessException {
        setContentPane(jPanel);

        openFrame2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SecondFrame secondFrame = new SecondFrame(text -> jLabelRetrievedValue.setText(text));
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
}
