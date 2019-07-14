package tcp.ip;


import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.LoggerProvider;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;

import java.io.IOException;
import java.util.logging.*;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardo
 */
public class Navegador {
    public void antonio (){
         Browser browser = new Browser();
    
      BrowserView view = new BrowserView(browser);
      

        JFrame frame = new JFrame("JxBrowser - Hello World");
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(view,BorderLayout.CENTER);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
       

        browser.loadURL("https://app.powerbi.com/view?r=eyJrIjoiMDYwNDIzZjAtYzY5OC00YmJjLTk5MzktY2E1NmFhZWFmN2ZkIiwidCI6ImU2YmVkMTFkLWM2YzMtNDFkMC05NzU3LTkxNWQwZjIzZmQ4NyJ9");
    }
    
}
