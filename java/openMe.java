import javax.swing.JOptionPane;

public class openMe{
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "Hey!", "<3", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Iv got a question!", "<3", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Will", "<3", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "You", "<3", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Be", "<3", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "My", "<3", JOptionPane.INFORMATION_MESSAGE);

        if (JOptionPane.showConfirmDialog(null, "valentine", "<3",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    
            JOptionPane.showMessageDialog(null, "YAYY!! ur so cute <33 ", "<3", JOptionPane.INFORMATION_MESSAGE);
    } else {

          JOptionPane.showMessageDialog(null, "oh.. okay.. :( thats.. fine i guess.. ill just go *sniff*", "<3", JOptionPane.INFORMATION_MESSAGE);
    // no option 

    }

    } // end of main 
 
} // end of class
