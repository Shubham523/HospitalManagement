/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHUBHAM
 */
public class SearchDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchDoctorPanel
     */
    public SearchDoctorPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchDoctorBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SearchDoctorField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SearchDoctorId = new javax.swing.JLabel();
        SearchDoctorName = new javax.swing.JLabel();
        SearchDoctorAge = new javax.swing.JLabel();
        SearchDoctorGender = new javax.swing.JLabel();
        SearchDoctorType = new javax.swing.JLabel();
        SearchDoctorService = new javax.swing.JLabel();
        SearchDoctorPhoneNo = new javax.swing.JLabel();

        SearchDoctorBackground.setBackground(new java.awt.Color(0, 0, 0));
        SearchDoctorBackground.setForeground(new java.awt.Color(51, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Search Doctor");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Enter the Name of Doctor : ");

        SearchDoctorField.setBackground(new java.awt.Color(0, 0, 0));
        SearchDoctorField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchDoctorField.setForeground(new java.awt.Color(0, 255, 255));
        SearchDoctorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchDoctorFieldActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Result :");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        SearchDoctorId.setBackground(new java.awt.Color(51, 51, 51));
        SearchDoctorId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchDoctorId.setForeground(new java.awt.Color(0, 255, 255));
        SearchDoctorId.setText("ID");

        SearchDoctorName.setBackground(new java.awt.Color(51, 51, 51));
        SearchDoctorName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchDoctorName.setForeground(new java.awt.Color(51, 255, 255));
        SearchDoctorName.setText("Name");

        SearchDoctorAge.setBackground(new java.awt.Color(51, 51, 51));
        SearchDoctorAge.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchDoctorAge.setForeground(new java.awt.Color(51, 255, 255));
        SearchDoctorAge.setText("Age");

        SearchDoctorGender.setBackground(new java.awt.Color(51, 51, 51));
        SearchDoctorGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchDoctorGender.setForeground(new java.awt.Color(51, 255, 255));
        SearchDoctorGender.setText("Gender");

        SearchDoctorType.setBackground(new java.awt.Color(51, 51, 51));
        SearchDoctorType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchDoctorType.setForeground(new java.awt.Color(51, 255, 255));
        SearchDoctorType.setText("Type");

        SearchDoctorService.setBackground(new java.awt.Color(51, 51, 51));
        SearchDoctorService.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchDoctorService.setForeground(new java.awt.Color(51, 255, 255));
        SearchDoctorService.setText("Service");

        SearchDoctorPhoneNo.setBackground(new java.awt.Color(51, 51, 51));
        SearchDoctorPhoneNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchDoctorPhoneNo.setForeground(new java.awt.Color(51, 255, 255));
        SearchDoctorPhoneNo.setText("Phone_no");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchDoctorId)
                .addGap(37, 37, 37)
                .addComponent(SearchDoctorName)
                .addGap(49, 49, 49)
                .addComponent(SearchDoctorAge)
                .addGap(77, 77, 77)
                .addComponent(SearchDoctorGender)
                .addGap(66, 66, 66)
                .addComponent(SearchDoctorType)
                .addGap(82, 82, 82)
                .addComponent(SearchDoctorService)
                .addGap(58, 58, 58)
                .addComponent(SearchDoctorPhoneNo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchDoctorId)
                    .addComponent(SearchDoctorName)
                    .addComponent(SearchDoctorAge)
                    .addComponent(SearchDoctorGender)
                    .addComponent(SearchDoctorType)
                    .addComponent(SearchDoctorService)
                    .addComponent(SearchDoctorPhoneNo))
                .addContainerGap())
        );

        javax.swing.GroupLayout SearchDoctorBackgroundLayout = new javax.swing.GroupLayout(SearchDoctorBackground);
        SearchDoctorBackground.setLayout(SearchDoctorBackgroundLayout);
        SearchDoctorBackgroundLayout.setHorizontalGroup(
            SearchDoctorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchDoctorBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(309, 309, 309))
            .addGroup(SearchDoctorBackgroundLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(SearchDoctorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(SearchDoctorBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchDoctorField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SearchDoctorBackgroundLayout.setVerticalGroup(
            SearchDoctorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchDoctorBackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(SearchDoctorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SearchDoctorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchDoctorBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchDoctorBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchDoctorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchDoctorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchDoctorFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SearchDoctorAge;
    private javax.swing.JPanel SearchDoctorBackground;
    private javax.swing.JTextField SearchDoctorField;
    private javax.swing.JLabel SearchDoctorGender;
    private javax.swing.JLabel SearchDoctorId;
    private javax.swing.JLabel SearchDoctorName;
    private javax.swing.JLabel SearchDoctorPhoneNo;
    private javax.swing.JLabel SearchDoctorService;
    private javax.swing.JLabel SearchDoctorType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
