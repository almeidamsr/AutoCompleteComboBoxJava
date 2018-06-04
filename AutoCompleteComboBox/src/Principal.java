import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.text.JTextComponent;

class Principal {
private static void createAndShowGUI() {
    // the combo box (add/modify items if you like to)
    JComboBox comboBox = new JComboBox(new Object[] {"Ester", "Jordi", "Jordina", "Jorge", "Sergi", "1040506070", "SISTEMAS DA INFORMAÇÃO", "SAL", "GOIANIA", "COORDENACAO DE RH"});
    // has to be editable
    comboBox.setEditable(true);
    // get the combo boxes editor component
    JTextComponent editor = (JTextComponent) comboBox.getEditor().getEditorComponent();
    // change the editor's document
    editor.setDocument(new SearchableComboBox(comboBox));
    comboBox.setSelectedIndex(-1);

    // create and show a window containing the combo box
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(3);
    frame.getContentPane().add(comboBox);
    frame.pack(); frame.setVisible(true);
}


public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI();
        }
    });}

}