/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_contact_app;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Aboubcar Doumbouya
 */
public class MyFunc {
    public ImageIcon resizePic(String picPath,int wdth,int hgt) {

        ImageIcon myIm = new ImageIcon(picPath);
        Image img = myIm.getImage().getScaledInstance(wdth, hgt, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(img);
        return myPicture;

    }
    
    public String browseImage(JLabel lbl){
        
        String path = "";
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));

        //file extension
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter(".Images", "jpg", "png", "gif");
        filec.addChoosableFileFilter(fileFilter);

        int fileState = filec.showSaveDialog(null);

        //if the user select the file
        if (fileState == JFileChooser.APPROVE_OPTION) {

            File selectedFile = filec.getSelectedFile();
             path = selectedFile.getAbsolutePath();
            //imagePth = path;
            //display the image in the JLabel            
            // jLabelPic.setIcon(new ImageIcon(path));

            //display the image in the JLabel using resize image
            lbl.setIcon(resizePic(path,lbl.getWidth(),lbl.getHeight()));

        } // if the user cancel
        else if (fileState == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Image Selected");
        }
        
        return path;
    }
}
