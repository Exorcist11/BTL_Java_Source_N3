/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLyLapTop;
import Menu.GUI_Menu;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DBEngine.*;


/**
 *
 * @author PCLENOVO
 */
public class LapTopGUI extends javax.swing.JFrame {
    DefaultTableModel tableModel = new DefaultTableModel();
    public static ArrayList<LapTop> list = new ArrayList<>();
    DBEngine file = new DBEngine();
    String fileName = "saveTXT/Laptop.txt";
    ExportFileExcel ex = new ExportFileExcel();
    String fName = "Laptop.xlsx";
    /**
     * Creates new form LapTopGUI
     */
    public LapTopGUI() {
        initComponents();
        setTitle("Quản lý laptop");
        getContentPane().setBackground(new Color(242,242,242));
        list = LapTop.generatedLapTop(20);
        initTable();
        displayData(list);
        showComboData();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        cbSearch = new javax.swing.JComboBox<>();
        txtYear = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtNumber = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnBackHome = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtPrice1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrice2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Tên");

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel3.setText("Màu sắc");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExport.setText("Xuất file");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        jLabel4.setText("Loại Laptop");

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel5.setText("Năm sản xuất");

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("Số lượng");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Giá");
        jLabel8.setToolTipText("");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        Table.setAutoCreateRowSorter(true);
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        btnBackHome.setText("Quay về màn hình chính");
        btnBackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackHomeActionPerformed(evt);
            }
        });

        jLabel9.setText("Chip");

        txtPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Ram");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("QUẢN LÝ LAPTOP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackHome)
                .addGap(35, 35, 35)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(336, 336, 336))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrice2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnEdit)
                            .addComponent(btnExport))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnDelete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (!validData()) {
            return;
        }
        int id = list.get(list.size() - 1).getId() + 1;
        String name = txtName.getText().trim();
        String color = txtColor.getText().trim();
        String type = txtType.getText().trim();
        int year = Integer.parseInt(txtYear.getText().trim());
        int number = Integer.parseInt(txtNumber.getText().trim());
        int cost = Integer.parseInt(txtPrice.getText().trim());
        String chip = txtPrice1.getText().trim();
        String ram = txtPrice2.getText().trim();
        LapTop p = new LapTop(id, name, color, type, year, number, cost,chip,ram);
        list.add(p);
        displayData(list);
        JOptionPane.showMessageDialog(rootPane, "Thêm thành công", "Successful", JOptionPane.INFORMATION_MESSAGE);

        emptyField();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        try{
            ex.ExportFileExcel(Table, fName);
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, ex.toString());
        }

    }//GEN-LAST:event_btnExportActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (!validData()) {
            return;
        }
        int choice = JOptionPane.showConfirmDialog(rootPane, "Xác nhận sửa thông tin", "Question", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
            emptyField();
            return;
        }
        int editIndex = Table.getSelectedRow();

        int id = (Integer) Table.getValueAt(editIndex, 0);
        String name = txtName.getText().trim();
        String color = txtColor.getText().trim();
        String type = txtType.getText().trim();
        int year = Integer.parseInt(txtYear.getText().trim());
        int number = Integer.parseInt(txtNumber.getText().trim());
        int price = Integer.parseInt(txtPrice.getText().trim());
        String chip = txtPrice1.getText().trim();
        String ram = txtPrice2.getText().trim();
        for (LapTop p : list) {
            if (p.getId() == id) {
                p.setName(name);
                p.setColor(color);
                p.setType(type);
                p.setYear(year);
                p.setNumber(number);
                p.setPrice(price);
                p.setChip(chip);
                p.setRam(ram);
                break;
            }
        }

        displayData(list);
        JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công", "Successful", JOptionPane.INFORMATION_MESSAGE);

        emptyField();

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int deleteIndex = Table.getSelectedRow();
        if (deleteIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chưa chọn phần tử cần xóa!");
            return;
        }

        int choice = JOptionPane.showConfirmDialog(rootPane, "Xác nhận xóa? ", "Question", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
            return;
        }
        list.remove(deleteIndex);
        displayData(list);
        emptyField();
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công", "Successful", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        emptyField();
        displayData(list);
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchValue = txtSearch.getText().toLowerCase().trim();
        if(searchValue.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Nhập thông tin cần tìm kiếm","Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String searchOption = (String)cbSearch.getSelectedItem();
        ArrayList<LapTop> searchList = new ArrayList<>();
        if(searchOption.equals("Tìm theo tên")){
            for(LapTop p : list){
                if(p.getName().toLowerCase().equals(searchValue))
                searchList.add(p);
            }
        }
        if(searchOption.equals("Tìm theo màu")){
            for(LapTop p : list){
                if(p.getColor().toLowerCase().equals(searchValue))
                searchList.add(p);
            }
        }
        if(searchOption.equals("Tìm theo loại")){
            for(LapTop p : list){
                if(p.getType().toLowerCase().equals(searchValue))
                searchList.add(p);
            }
        }
        if(searchOption.equals("Tìm theo năm")){
            for(LapTop p : list){
                if(p.getYear() == Integer.parseInt(searchValue))
                searchList.add(p);
            }
        }
        displayData(searchList);
        emptyField();

    }//GEN-LAST:event_btnSearchActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int row = Table.getSelectedRow();
        txtName.setText((String) Table.getValueAt(row, 1));
        txtColor.setText((String) Table.getValueAt(row, 2));
        txtType.setText((String) Table.getValueAt(row, 3));
        txtYear.setText((String.valueOf((Integer) Table.getValueAt(row, 4))));
        txtNumber.setText((String.valueOf((Integer) Table.getValueAt(row, 5))));
        txtPrice.setText((String.valueOf((Integer) Table.getValueAt(row, 6))));
        txtPrice1.setText((String) Table.getValueAt(row, 7));
        txtPrice2.setText((String) Table.getValueAt(row, 8));
        
    }//GEN-LAST:event_TableMouseClicked

    private void txtPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice1ActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnBackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackHomeActionPerformed
        GUI_Menu gui = new GUI_Menu();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        LapTopGUI.this.dispose();
    }//GEN-LAST:event_btnBackHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public void initTable() {
        String[] columns = {"ID", "Tên Laptop", "Màu sắc", "Loại", "Năm sản xuất", "Số lượng", "Giá" ,"Chip", "Ram"};
        tableModel.setColumnIdentifiers(columns);
        Table.setModel(tableModel);

    }

    public void displayData(ArrayList<LapTop> list) {
        tableModel.setRowCount(0);
        for (LapTop p : list) {
            tableModel.addRow(new Object[]{
                p.getId(), p.getName(), p.getColor(), p.getType(), p.getYear(), p.getNumber(), p.getPrice(), p.getChip(), p.getRam()
            });
        }
    }

    public void emptyField() {
        txtName.setText("");
        txtColor.setText("");
        txtType.setText("");
        txtYear.setText("");
        txtNumber.setText("");
        txtPrice.setText("");
        txtSearch.setText("");
        txtPrice1.setText("");
        txtPrice2.setText("");
    }
    public boolean validData() {
        if (txtName.getText().equals("") || txtColor.getText().equals("")
                || txtType.getText().equals("") || txtYear.getText().equals("")
                || txtNumber.getText().equals("") || txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống dữ liệu!\n");
            return false;
        }

        StringBuilder sb = new StringBuilder();
        try {
            int year = Integer.parseInt(txtYear.getText());
            if (year < 2000) {
                sb.append("Năm phải lớn hơn 2000\n");
            }
        } catch (NumberFormatException e) {
            sb.append("Năm phải là số nguyên\n");
        }
        try {
            int number = Integer.parseInt(txtNumber.getText());
            if (number <= 0) {
                sb.append("Số lượng phải lớn hơn 0\n");
            }
        } catch (NumberFormatException e) {
            sb.append("Số lượng phải là số nguyên\n");
        }
        try {
            int price = Integer.parseInt(txtPrice.getText());
            if (price <= 0) {
                sb.append("Giá phải lớn hơn 0\n");
            }
        } catch (NumberFormatException e) {
            sb.append("Giá phải là số nguyên\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(rootPane, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
     public void showComboData() {
        cbSearch.addItem("Tìm theo tên");
        cbSearch.addItem("Tìm theo màu");
        cbSearch.addItem("Tìm theo loại");
        cbSearch.addItem("Tìm theo năm");
    }
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
            java.util.logging.Logger.getLogger(LapTopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LapTopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LapTopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LapTopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LapTopGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackHome;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPrice1;
    private javax.swing.JTextField txtPrice2;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
