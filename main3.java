    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (!clicked.getText().equals("")) return;

        if (playerXTurn) {
            clicked.setText("X");
            clicked.setForeground(new Color(255, 100, 100));
            statusLabel.setText("Player O's Turn");
        } else {
            clicked.setText("O");
            clicked.setForeground(new Color(100, 200, 255));
            statusLabel.setText("Player X's Turn");
        }

        clicked.setEnabled(false);
        playerXTurn = !playerXTurn;

        checkGameStatus();
    }

    private void checkGameStatus() {
        String[][] board = new String[3][3];
        boolean draw = true;

        for (int i = 0; i < 9; i++) {
            board[i / 3][i % 3] = buttons[i].getText();
            if (buttons[i].getText().equals("")) {
                draw = false;
            }
        }

        String winner
