package BOOK4U;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.UIManager;

public class HTMLListCellRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel component = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);if (value instanceof String) {
        String[] parts = ((String) value).split(", ");
        String htmlText;
if(parts[5].equals("1")){
   htmlText = "<html><body style='width: 300px; margin-left:30px; margin-top:30px;'>" +
                   "<table width='400px'>" +
                   "<tr>" +
                   "<td style='padding-right: 10px;'>" +
                   "<div>" +
                   "<p style='color: blue;'>" + parts[0] + "</p> <br>" +
                   "<p><b>Precio:</b> " + parts[1] + "</p>" +
                   "<p><b>Entrada:</b> <span style='color: green;'>" + parts[2] + "</span></p>" +
                   "<p><b>Salida:</b> <span style='color: red;'>" + parts[3] + "</span></p>" + 
                   "<p><b>Avaliable:</b> <span style='color: green;'>Yes</span></p>" +
                   "<p><b>Paid:</b>Yes</p>" +
                   "</div>" +
                   "</td>" +
                   "<td style='vertical-align: top;'>" +
                   "<img src="+Controlador.buscar(Integer.parseInt(parts[4]))+" style='width: 50px; height: 50px; margin-left:70px;' />" +
                   "</td>" +
                   "</tr>" +
                   "</table> <br>" +
                   "</body></html>"; 
}else{
    htmlText = "<html><body style='width: 300px; margin-left:30px; margin-top:30px;'>" +
                   "<table width='400px'>" +
                   "<tr>" +
                   "<td style='padding-right: 10px;'>" +
                   "<div>" +
                   "<p style='color: blue;'>" + parts[0] + "</p> <br>" +
                   "<p><b>Precio:</b> " + parts[1] + "</p>" +
                   "<p><b>Entrada:</b> <span style='color: green;'>" + parts[2] + "</span></p>" +
                   "<p><b>Salida:</b> <span style='color: red;'>" + parts[3] + "</span></p>" + 
                   "<p><b>Avaliable:</b> <span style='color: red;'>No</span></p>" +
                   "<p><b>Paid:</b>Yes</p>" +
                   "</div>" +
                   "</td>" +
                   "<td style='vertical-align: top;'>" +
                   "<img src="+Controlador.buscar(Integer.parseInt(parts[4]))+" style='width: 50px; height: 50px; margin-left:70px;' />" +
                   "</td>" +
                   "</tr>" +
                   "</table> <br>" +
                   "</body></html>";
}
 




        component.setText(htmlText);
    }

    return component;
}}
