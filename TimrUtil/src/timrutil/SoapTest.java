/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timrutil;

import java.io.PrintWriter;
import java.io.StringWriter;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.xml.soap.SOAPException;

/**
 *
 * @author kiro
 */
public class SoapTest extends javax.swing.JFrame {

    static final String NAMESPACE = "http://tempuri.org/";
    static final String URL = "http://ms.info.uaic.ro/webservice/TimrService.asmx";
    static final String XmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n";
    private SOAPClient soap;
    String[] services = {"ValidateUser", "InsertUser", "GetTimetableForBachelorYear", 
        "GetTimetableForMastersYear", "GetTimetableForUser", "GetStudentAsXml", 
        "GetAllMonitoredWebsitesAsXml", 
    "GetStudentNotificationsAsXml",
    "GetAllGroups",
    "GetFaculties",
    "GetTeacherAsXml",
    "InsertFeed",
    "InsertWebsite",
    "SaveWebsite",
    "SolveUserNotification"    
    };

    public void addFrame(String message) {


        JInternalFrame fr = new JInternalFrame("SOAP", true, true, true, true);
        JTextArea text = new JTextArea(message);
        JScrollPane scroll = new JScrollPane(text);
        fr.add(scroll);
        fr.setSize(400, 300);

        desktopPane.add(fr);
        fr.setVisible(true);
        desktopPane.setSelectedFrame(fr);

    }

    public void handleEx(Exception ex) {
        ex.printStackTrace();
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            String str = "------\r\n" + sw.toString() + "------\r\n";
            addFrame(str);
        } catch (Exception e2) {
            addFrame("Unknown error");
        }

    }

    public SoapTest() {
        initComponents();
        serviceCombo.removeAllItems();
        serviceCombo.addItem("From Name speciefied Bellow");
        for (String string : services) {
            serviceCombo.addItem(string);
        }
        try {
            soap = new SOAPClient(URL);
        } catch (Exception ex) {
            handleEx(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serviceCombo = new javax.swing.JComboBox();
        servicename = new javax.swing.JTextField();
        tagname = new javax.swing.JTextField();
        value = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        parameters = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        serviceCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        servicename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicenameActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        parameters.setColumns(20);
        parameters.setRows(5);
        jScrollPane1.setViewportView(parameters);

        jButton1.setText("Call ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Service");

        jLabel2.setText("Service");

        jButton3.setText("Set");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(68, 68, 68)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(value)
                            .addComponent(tagname, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(servicename)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(serviceCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tagname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void servicenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicenameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            soap.addParameter(tagname.getText(), value.getText());
            parameters.append(tagname.getText() + " : " + value.getText() + "\n");
            tagname.setText("");
            value.setText("");

        } catch (SOAPException ex) {
            handleEx(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            addFrame(soap.call());
            soap = new SOAPClient(URL);
        } catch (Exception ex) {
            handleEx(ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (serviceCombo.getSelectedIndex() == 0) {
                soap.addCallName(servicename.getText(), NAMESPACE);
                parameters.append("Service set : " + servicename.getText() + "\n");
            } else {
                soap.addCallName(serviceCombo.getSelectedItem().toString(), NAMESPACE);
                parameters.append("Service set : " + serviceCombo.getSelectedItem().toString() + "\n");
            }
            serviceCombo.setEnabled(false);
            servicename.setEnabled(false);
            jButton3.setEnabled(false);
        } catch (Exception ex) {
            handleEx(ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            parameters.setText("");
            //resultArea.setText("");
            soap = new SOAPClient(URL);
            serviceCombo.setEnabled(true);
            servicename.setEnabled(true);
            jButton3.setEnabled(true);
        } catch (Exception ex) {
            handleEx(ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea parameters;
    private javax.swing.JComboBox serviceCombo;
    private javax.swing.JTextField servicename;
    private javax.swing.JTextField tagname;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
