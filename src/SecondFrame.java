import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

public class SecondFrame extends JFrame {
    private JPanel panel1;
    private JButton clickToSetNameButton;
    private JTextField fieldName;

    public SecondFrame(Consumer<String> consumer) {
        setContentPane(panel1);
        clickToSetNameButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                consumer.accept(fieldName.getText());
                dispose();
            }
        });
    }
}
