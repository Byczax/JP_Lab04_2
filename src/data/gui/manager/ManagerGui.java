package data.gui.manager;

import data.gui.results.ResultsGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerGui {
    private JButton servicesButton;
    private JButton surveysManagementButton;
    private JPanel mainPanel;
    private JButton conectingAndResultsButton;
    private JButton results;

    public ManagerGui() {
        servicesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerServiceGui managerGui = new ManagerServiceGui();
                JPanel root = managerGui.getServiceMainPanel();
                JFrame frame = new JFrame();
                managerGui.createTable();
                frame.setTitle("Manager Service Management");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setContentPane(root);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
        surveysManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerSurveysGui managerGui = new ManagerSurveysGui();
                JPanel root = managerGui.getMainSurveyPanel();
                JFrame frame = new JFrame();
                managerGui.createTable();
                frame.setTitle("Manager Surveys Management");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setContentPane(root);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        conectingAndResultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerConnectGui managerGui = new ManagerConnectGui();
                JPanel root = managerGui.getMainConnectPanel();
                JFrame frame = new JFrame();
                managerGui.createServiceTable();
                managerGui.createSurveyTable();
                frame.setTitle("Manager Connection Management");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setContentPane(root);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        results.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultsGui resultsGui = new ResultsGui();
                JPanel root = resultsGui.getMainPanel();
                JFrame frame = new JFrame();
                resultsGui.createTable();
                frame.setTitle("Surveys results");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setContentPane(root);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setMinimumSize(new Dimension(300,300));
                frame.setVisible(true);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}