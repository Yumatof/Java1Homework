package Application;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
    private GameField gameField;
    private JPanel panelControls;
    private JPanel dashboard;
    private JButton buttonGameStart;
    private JButton buttonGameEND;
    private int winPosX;
    private int winPosY;
    private int winWidth;
    private int winHeight;

    GameWindow() {
        this.setVisible(true);
        this.createWindow();
        this.createButton();
        this.createPanelControls();
        this.createDashboard();
        this.gameField = new GameField();
        this.add(this.gameField);
        this.add(this.dashboard, "East");
        this.dashboard.add(this.panelControls, "North");
    }

    void createWindow() {
        this.setDefaultCloseOperation(3);
        this.winWidth = 1024;
        this.winHeight = 768;
        this.winPosX = 300;
        this.winPosY = 150;
        this.setSize(this.winWidth, this.winHeight);
        this.setLocation(this.winPosX, this.winPosY);
        this.setTitle("Application#1 © MD");
        this.setResizable(false);
    }

    void createDashboard() {
        this.dashboard = new JPanel();
        this.setBackground(new Color(8684733));
        this.dashboard.setBorder(BorderFactory.createEtchedBorder(0));
        this.panelControls.setLayout(new GridLayout(6, 1));
    }

    void createButton() {
        this.buttonGameStart = new JButton("Start game");
        this.buttonGameEND = new JButton("End game");
    }

    void createPanelControls() {
        this.panelControls = new JPanel();
        this.panelControls.setLayout(new GridLayout(3, 1));
        this.panelControls.add(this.buttonGameStart, "North");
        this.panelControls.add(this.buttonGameEND, "North");
    }
}

