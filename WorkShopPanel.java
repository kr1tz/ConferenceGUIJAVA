
/*
 * NAME: KRIS TRINIDAD
 * COURSE: PROGRAMMING (JAVA 2)
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WorkShopPanel extends JPanel
{
    private JPanel shopPanel;
    
    
    private final double COST_IT_TRENDS_WS = 295.00;
    private final double COST_DREAM_CAREER_WS = 295.00;
    private final double COST_JAVA_WS = 395.00;
    private final double COST_ETHICS_WS = 395.00;
    
    private final String[] WORKSHOP_NAMES = { "IT Trends in Manitoba", "Creating a Dream Career", "Advanced Java Programming", "Ethics: The Challenge Continues" };
    private final double[] WORKSHOP_FEES = {COST_IT_TRENDS_WS, COST_DREAM_CAREER_WS, COST_JAVA_WS, COST_ETHICS_WS};
    
    protected JList workShopListBox; // To hold List
    
   
    
   
   
    
    public WorkShopPanel()
    {
      
        
      setLayout(new FlowLayout());
       
      buildWorkShopPanel();
      
      
      add(shopPanel);
      
      
      
        
      
    }
    
    public void buildWorkShopPanel()
    {
        shopPanel = new JPanel();
        
        setLayout(new FlowLayout());
        
        shopPanel.setBorder(BorderFactory.createTitledBorder("Workshops"));
        
        workShopListBox = new JList(WORKSHOP_NAMES);
        workShopListBox.setSelectionMode(2);
        
        shopPanel.add(workShopListBox);
        
       
    }
    
   
    public double getWorkshopCost()
    {
        double workShopCost = 0;
        
        int[] costArray = workShopListBox.getSelectedIndices();
        
            for(int i = 0; i < costArray.length; i++)
            {
                workShopCost += WORKSHOP_FEES[i];
            }
            
                return workShopCost;
    }

    public String getWorkshopList()
    {
        String workShopList = "";
        
        int[]listArray = workShopListBox.getSelectedIndices();
        
            for(int i = 0; i < listArray.length; i++)
            {
                workShopList = WORKSHOP_NAMES[i];
            }
            
            return workShopList;
        }
    

  
  
}