        Font buttonFont = new Font("Arial", Font.BOLD, 60);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(buttonFont);
            buttons[i].setFocusPainted(false);
            buttons[i].setBackground(new Color(40, 40, 40));
            buttons[i].setForeground(Color.WHITE);
            buttons[i].addActionListener(this);
            gridPanel.add(buttons[i]);
        }

        statusLabel = new JLabel("Player X's Turn", SwingConstants.CENTER);
        statusLabel.setForeground(Color.WHITE);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 20));

        restartButton = new JButton("🔄 Restart");
        restartButton.setFont(new Font("Arial", Font.BOLD, 16));
        restartButton.setBackground(new Color(60, 60, 60));
        restartButton.setForeground(Color.WHITE);
        restartButton.addActionListener(e -> resetGame());

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBackground(Color.DARK_GRAY);
        bottomPanel.add(statusLabel, BorderLayout.CENTER);
        bottomPanel.add(restartButton, BorderLayout.EAST);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(gridPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }
