
/*
 * NAME: KRIS TRINIDAD
 * COURSE: PROGRAMMING (JAVA 2)
 */


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class ConferenceHandler implements ActionListener, ItemListener, FocusListener
{
    private ConferenceGUI gui;
    
    
    public ConferenceHandler(ConferenceGUI gui)
    {
        this.gui = gui;
    }
    
    private double calcTotalCharges()
    {
        double totalCharges;
        double regPanelCharges;
        double keyNoteCharge;
        double workCharge;
        
        regPanelCharges = gui.regPanel.getRegistrationCost();
        keyNoteCharge = gui.regPanel.getKeyNoteCost();
        workCharge = gui.workShopPanel.getWorkshopCost();
        
        if(gui.regPanel.dinnerKeyNote.isSelected())
        {
            // Total charges with keynote checkbox selected
            
            totalCharges = regPanelCharges + keyNoteCharge + workCharge;
        }else{
            // Total charges without keynote checkbox 
            
            totalCharges = regPanelCharges + workCharge;
        }
        
        return totalCharges;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == gui.calculateButton)
        {
            DecimalFormat fmt = new DecimalFormat("#,##0.00");
            
            String name = gui.regPanel.registrantTextField.getText();
            
            
                if(gui.regPanel.getRegType() == "Please select a type")
                {
                    JOptionPane.showMessageDialog(null, "Please select a registration type", "Type Error", JOptionPane.ERROR_MESSAGE);
                }
                
                if(gui.regPanel.dinnerKeyNote.isSelected())
                {
                    gui.textArea.setText("Keynote address will be attended");                    
                }else{
                    gui.textArea.setText("Keynote address will not be attended");
                }
                
                
                gui.textArea.setText(name + "is registered in these workshops" + gui.workShopPanel.getWorkshopList());
                
                gui.textArea.setText("Total charges for " + name + " are " + fmt.format(calcTotalCharges())); // Total charges output. -- WORKS!
            
        }else if(e.getSource() == gui.clearButton)
        {
            gui.regPanel.registrantTextField.setText("");
            gui.textArea.setText("");
            gui.workShopPanel.workShopListBox.setSelectedIndex(0);
            gui.regPanel.registrantTypeComboBox.setSelectedIndex(0);
        }
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        String name = gui.regPanel.registrantTextField.getText();
        String type = gui.regPanel.getRegType();              
                   
        if(e.getStateChange() == gui.regPanel.registrantTypeComboBox.getSelectedIndex())
        {
            gui.textArea.setText(name + " is a " + type + " registration");
        }
          
    }
    
   
      
    public void focusLost(FocusEvent e)
    {
        if(e.getSource() == gui.regPanel.registrantTextField)
        {
           if(gui.regPanel.registrantTextField.getText().length() == 0)
           {
            gui.regPanel.registrantTextField.setText("Please enter a name");
            gui.regPanel.registrantTextField.requestFocus();
            
           }
        }else{
          gui.regPanel.registrantTextField.setText("");
        }
        }            
    
     public void focusGained(FocusEvent e)
    {              
        gui.regPanel.registrantTextField.selectAll();
    }
}
