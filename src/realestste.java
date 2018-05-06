import javax.swing.JOptionPane;
public class realestste {
    public static void main(String[]args) {
        String myprice = JOptionPane.showInputDialog("enter your price");
        Float pprice = Float.parseFloat(myprice);
        String mysize = JOptionPane.showInputDialog("enter the itemsize");
        Float psize = Float.parseFloat(mysize);
        String mytype = JOptionPane.showInputDialog("enter property type ");

        realeststeListings land = new realeststeListings(pprice, psize, mytype);
        realeststeListings land1 = new realeststeListings(60000, 3.5, "oursecond land listing ");
        JOptionPane.showMessageDialog(null, land.toString());
        JOptionPane.showMessageDialog(null, land1.toString());
    }
}

