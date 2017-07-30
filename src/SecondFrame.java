import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SecondFrame extends JFrame {
    private JPanel panel1;
    private JButton clickToSetNameButton;
    private JTextField fieldName;
    private DataObject data;

    public SecondFrame(DataObject data) {
        setContentPane(panel1);
        this.data = data;
        clickToSetNameButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                data.setName(fieldName.getText());
                dispose();
            }
        });
    }
}
