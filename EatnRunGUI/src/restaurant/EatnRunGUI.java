/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;


import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author james
 */
public class EatnRunGUI extends javax.swing.JFrame {
    private static ArrayList <menu> list;
    double add = 0, total = 0,taxPercent = 0.12,tax = 0,sum = 0;
    RestaurantController RC;
    bill Bill = new bill();
    menu product = new menu();
    public EatnRunGUI() {
        this.RC = new RestaurantController();
        initComponents();
        addRowtoMenuTable();
        Seticon();
    }

    
    
    public final void addRowtoMenuTable(){
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        list = RC.menuList();
        Object rowData[] = new Object[list.size()];
        for(int a = 0;a< list.size();a++){
            rowData[0] = list.get(a).itemName;
            rowData[1] = String.format("%.2f",list.get(a).price);
            model.addRow(rowData);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        name = new javax.swing.JTextArea();
        printReceipt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        subTotals = new javax.swing.JLabel();
        allTotal = new javax.swing.JLabel();
        taxValue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eat n Run Cafe");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        menuTable.setBackground(new java.awt.Color(153, 153, 153));
        menuTable.setForeground(new java.awt.Color(0, 0, 0));
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        menuTable.setGridColor(new java.awt.Color(153, 153, 153));
        menuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menuTable);

        selectedTable.setBackground(new java.awt.Color(153, 153, 153));
        selectedTable.setForeground(new java.awt.Color(0, 0, 0));
        selectedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        selectedTable.setGridColor(new java.awt.Color(153, 153, 153));
        selectedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(selectedTable);

        jLabel2.setBackground(new java.awt.Color(0, 153, 204));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("Eat n Run Cafe");

        jLabel1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Menu List");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Selected Items");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Customer Name:");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setColumns(20);
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setRows(5);
        jScrollPane3.setViewportView(name);

        printReceipt.setBackground(new java.awt.Color(153, 153, 153));
        printReceipt.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        printReceipt.setForeground(new java.awt.Color(0, 0, 0));
        printReceipt.setText("PRINT RECEIPT");
        printReceipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        printReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printReceiptMouseClicked(evt);
            }
        });
        printReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReceiptActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Sub Total:");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Tax(12%):");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Total:");

        subTotals.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        subTotals.setForeground(new java.awt.Color(204, 204, 204));
        subTotals.setText("0");

        allTotal.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        allTotal.setForeground(new java.awt.Color(204, 204, 204));
        allTotal.setText("0");

        taxValue.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        taxValue.setForeground(new java.awt.Color(204, 204, 204));
        taxValue.setText("0");

        jLabel8.setText("To buy: double-click to select, update, and delete items.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(subTotals))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(taxValue))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(allTotal))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subTotals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(allTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addComponent(printReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(867, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedTableMouseClicked
        if(evt.getClickCount() == 2){
            try{
            JTable table = (JTable)evt.getSource();
            String product = (String)table.getValueAt(table.getSelectedRow(), 0);
            double price = Double.valueOf(table.getValueAt(table.getSelectedRow(), 1).toString());
            int quantity = (int)table.getValueAt(table.getSelectedRow(), 2);
            String in = JOptionPane.showInputDialog(this,"Update quantity: "+product+"\nPrice: "+price+"\nCurrent order: "+quantity,"Update",JOptionPane.QUESTION_MESSAGE);
            int qty = Integer.parseInt(in);
            double totalBill = price * qty;
            DefaultTableModel item = (DefaultTableModel) selectedTable.getModel();
            if(totalBill > 0){
                item.setValueAt(product,selectedTable.getSelectedRow(), 0);
                item.setValueAt(price,selectedTable.getSelectedRow(), 1);
                item.setValueAt(qty,selectedTable.getSelectedRow(), 2);
                item.setValueAt(totalBill,selectedTable.getSelectedRow(), 3);
                JOptionPane.showMessageDialog(this,"Update Successfully.","Message",JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                item.removeRow(selectedTable.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Delete Successfully.","Message",JOptionPane.INFORMATION_MESSAGE);
            }
            double total = 0,tax=0,taxPercent = 0.12,sum = 0;
                for(int a = 0;a < selectedTable.getRowCount();a++){
                    total += Double.valueOf(item.getValueAt(a, 3).toString());
                    }
                subTotals.setText(String.format("%.2f", Bill.getSubtotal(total)));
                tax = taxPercent * total;
                sum = tax + total;
                allTotal.setText(String.format("%.2f", Bill.getTotalBill(sum)));
                taxValue.setText(String.format("%.2f",Bill.getTax(tax)));
                
               
            }catch(NumberFormatException e){
                
                } 
        }
    }//GEN-LAST:event_selectedTableMouseClicked

    private void menuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTableMouseClicked
        
        if(evt.getClickCount() == 2){
            try{
                double times = 0, total = 0,taxPercent = 0.12,tax = 0,sum = 0;
                TableModel model1 = menuTable.getModel();
                int[] index = menuTable.getSelectedRows();
                Object[]row = new Object[4];
                    for(int i = 0;i < index.length;i++){
                        String s = JOptionPane.showInputDialog(this,model1.getValueAt(index[i], 0)+" Selected.\nPlease Enter quantity.","",JOptionPane.QUESTION_MESSAGE);
                        int qty = Integer.parseInt(s);
                        if(qty > 0){
                            row[0] = model1.getValueAt(index[i], 0);
                            row[1] = model1.getValueAt(index[i], 1);
                            row[2] = qty;
                            times = qty * Double.parseDouble(model1.getValueAt(index[i], 1).toString());
                            row[3] = String.format("%.2f", times);
                            DefaultTableModel model2 = (DefaultTableModel) selectedTable.getModel();
                            model2.addRow(row);
                                for(int a = 0;a < selectedTable.getRowCount();a++){
                                    total += Double.parseDouble( model2.getValueAt(a, 3).toString());
                                }
                                tax = taxPercent * total;
                                sum = tax + total;
                                allTotal.setText(String.format("%.2f", Bill.getTotalBill(sum)));
                                taxValue.setText(String.format("%.2f", Bill.getTax(tax)));
                                subTotals.setText(String.format("%.2f",Bill.getSubtotal(total)));
                                
                        }else{
                            JOptionPane.showMessageDialog(this,"Cannot add Item: "+model1.getValueAt(index[i], 0)+".\nQuantity should be greater than 0.","Error",JOptionPane.ERROR_MESSAGE);

                        }
                    }
            }catch(NumberFormatException e){
            } 
        }    
    }//GEN-LAST:event_menuTableMouseClicked

    private void printReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReceiptActionPerformed

    }//GEN-LAST:event_printReceiptActionPerformed

    private void printReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printReceiptMouseClicked
        DefaultTableModel model = (DefaultTableModel) selectedTable.getModel();
        ArrayList <menu> item = new ArrayList<>();
        for(int a=0;a<model.getRowCount();a++){
            menu cartItem = new menu();
            String name = model.getValueAt(a, 0).toString();
            double price = Double.valueOf(model.getValueAt(a, 1).toString());
            int qty = Integer.valueOf(model.getValueAt(a, 2).toString());
            double total = Double.valueOf(model.getValueAt(a, 3).toString());
            cartItem.setItemname(name);
            cartItem.setPrice(price);
            cartItem.setQuantity(qty);
            cartItem.setTotal(total);
            item.add(cartItem);
            Bill.setMenuList(item);
        }
        Bill.setCustomername(name.getText());
        int ask = JOptionPane.showConfirmDialog(this, "Are you sure to print the Receipt?","Question" , JOptionPane.YES_NO_OPTION );
        if(ask == 0){
            Bill.printReceipt();
            
            while(model.getRowCount()!= 0){
                model.removeRow(0);
            }
            name.setText("");
            subTotals.setText("0");
            taxValue.setText("0");
            allTotal.setText("0");
        }
        
    }//GEN-LAST:event_printReceiptMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EatnRunGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EatnRunGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EatnRunGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EatnRunGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EatnRunGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextArea name;
    private javax.swing.JButton printReceipt;
    private javax.swing.JTable selectedTable;
    private javax.swing.JLabel subTotals;
    private javax.swing.JLabel taxValue;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ico.png")));         
    }
}
