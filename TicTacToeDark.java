import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeDark extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[9];
    private boolean playerXTurn = true;
    private JLabel statusLabel;
    private JButton restartButton;

    public TicTacToeDark() {
        setTitle("🌑 Tic Tac Toe - Dark Mode");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 3));
        gridPanel.setBackground(Color.DARK_GRAY);
