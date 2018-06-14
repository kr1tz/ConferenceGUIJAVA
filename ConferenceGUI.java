
/*
 * NAME: KRIS TRINIDAD
 * COURSE: PROGRAMMING (JAVA 2)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ConferenceGUI extends JPanel
{
    protected JPanel titlePanel;
    protected RegPanel regPanel;
    
    protected WorkShopPanel workShopPanel;
    protected JPanel buttonPanel;
    
    protected JButton calculateButton;
    protected JButton clearButton;
    
    protected JTextArea textArea;
    
    protected JLabel label;
    
    protected JScrollPane scrollpanel;
    
    public ConferenceGUI()
    {
        super(new BorderLayout());
        
        regPanel = new RegPanel();
        workShopPanel = new WorkShopPanel();
        
        
        
        buildTitlePanel();
        buildButtonPanel();
        
        ConferenceHandler itemListener = new ConferenceHandler(this);        
        regPanel.registrantTypeComboBox.addItemListener(itemListener);
        
        ConferenceHandler focusListener = new ConferenceHandler(this);
        regPanel.registrantTextField.addFocusListener(focusListener);
        
        
        add(titlePanel, BorderLayout.NORTH);
        add(regPanel, BorderLayout.WEST);
        add(workShopPanel, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);
        
       
    }
    
    private void buildTitlePanel()
    {
        titlePanel = new JPanel();
        
        Font myFont = new Font("SansSerif", Font.BOLD, 18);
        
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        label = new JLabel ("Select Registration Options", JLabel.CENTER);
        label.setFont(myFont);
        
        titlePanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
        titlePanel.add(label);
        
        validate();
    }
    
    private void buildButtonPanel()
    {
        buttonPanel = new JPanel();
        
        buttonPanel.setLayout(new FlowLayout());
        
        calculateButton = new JButton("Calculate Charge");
        clearButton = new JButton("Clear");
        
        textArea = new JTextArea(5, 30);
        textArea.setWrapStyleWord(true);
        
                                
               
        ConferenceHandler handler = new ConferenceHandler(this);
        
        
        calculateButton.addActionListener(handler);     clearButton.addActionListener(handler);
        
        
        
        buttonPanel.add(calculateButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(new JScrollPane(this.textArea));
        
    }
}
