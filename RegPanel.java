
/*
 * NAME: KRIS TRINIDAD
 * COURSE: PROGRAMMING (JAVA 2)
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegPanel extends JPanel
{
   protected JPanel registrantPanel;
   protected JPanel dinnerKeynotePanel;
   
   protected JTextField registrantTextField;
   protected JComboBox registrantTypeComboBox;
   
   
   protected JPanel panel;
   
   private double BUSINESS_REG = 895.00;
   private double STUDENT_REG = 495.00;
   private double DINNER_KEYNOTE_SPEECH = 30.00;
   private double COMPLEMENT_REG = 0.00;
   
   
   private final String[] WORKSHOPS = {"Please select a type",
                                    "Business",
                                    "Student",
                                    "Complimentary"};
   
   private final double[] WORKSHOP_COST = { BUSINESS_REG, STUDENT_REG, COMPLEMENT_REG };
   
   
   
                            
   protected JCheckBox dinnerKeyNote;
   
   
  
   
   public RegPanel()
   {
     
       
     setLayout(new GridLayout(2,1));
          
          
     buildRegistrantPanel();
     buildDinnerKeynotePanel();
     
     add(registrantPanel);
     add(dinnerKeyNote);
     
          
   
     
     
     }
     
   
     
     public void buildRegistrantPanel()
     {
       registrantPanel = new JPanel();
         
       setLayout(new GridLayout());
         
       registrantPanel.setBorder(BorderFactory.createTitledBorder("Registrant's Name & Type"));
       
       registrantTextField = new JTextField(20);
       registrantTextField.setHorizontalAlignment(JTextField.RIGHT);
       
       registrantTypeComboBox = new JComboBox(WORKSHOPS);
            
       String comboBox = registrantTypeComboBox.getSelectedItem().toString();
       
       
       
       
       
       registrantPanel.add(registrantTextField);           
       
       registrantPanel.add(registrantTypeComboBox);
          
     
     }
     
     public void buildDinnerKeynotePanel()
     {
         dinnerKeynotePanel = new JPanel();
         
         setLayout(new FlowLayout());
                          
         dinnerKeyNote = new JCheckBox("Dinner and Keynote Speech", false);
         
         
        
         
     }
     
    public double getRegistrationCost()
    {
        double cost = 0;
        
        int i = registrantTypeComboBox.getSelectedIndex();
        
        switch(i)
        {
            case 0:
                break;
                
                case 1:
                    cost = 895; break;
                    
                    
                        case 2:
                            cost = 295; break;
                            
                            
                           case 3:
                                cost = 0; break;
                
               
        }
        
        return cost;
    }

    public double getKeyNoteCost()
    {
        return DINNER_KEYNOTE_SPEECH;
    }
    
    public String getRegType()
    {
        String registrationType = registrantTypeComboBox.getSelectedItem().toString();
        
        return registrationType;
    }
   
   }

       