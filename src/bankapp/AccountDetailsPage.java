/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author Niyatipc
 */
public class AccountDetailsPage extends javax.swing.JDialog {

    /**
     * Creates new form AccountDetailsPage
     */
    public AccountDetailsPage(java.awt.Frame parent, boolean modal,Customer customer) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        firstNameField.setText(customer.getFirstName());
        lastNameField.setText(customer.getLastName());
        ssnField.setText(customer.getSsn());
        accountTypeField.setText(customer.getAccount().getAccountType());
        accountNumberField.setText(String.valueOf(customer.getAccount().getAccountNumber()));
        balanceField.setText(String.valueOf(customer.getAccount().getBalance()));
        transactionField.setText(String.valueOf(customer.getAccount().getTransactionFee()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JLabel();
        ssnLabel = new javax.swing.JLabel();
        ssnField = new javax.swing.JLabel();
        accountTypeLabel = new javax.swing.JLabel();
        accountTypeField = new javax.swing.JLabel();
        accountNumberLabel = new javax.swing.JLabel();
        accountNumberField = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        balanceField = new javax.swing.JLabel();
        transactionsLabel = new javax.swing.JLabel();
        transactionField = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account Details");
        getContentPane().setLayout(new java.awt.GridLayout(8, 2, 5, 5));

        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel);
        getContentPane().add(firstNameField);

        lastNameLabel.setText("Last Name:");
        getContentPane().add(lastNameLabel);
        getContentPane().add(lastNameField);

        ssnLabel.setText("Unique Identity Number:");
        getContentPane().add(ssnLabel);
        getContentPane().add(ssnField);

        accountTypeLabel.setText("Acount Type:");
        getContentPane().add(accountTypeLabel);
        getContentPane().add(accountTypeField);

        accountNumberLabel.setText("Account Number:");
        getContentPane().add(accountNumberLabel);
        getContentPane().add(accountNumberField);

        balanceLabel.setText("Balance:");
        getContentPane().add(balanceLabel);
        getContentPane().add(balanceField);

        transactionsLabel.setText("Transaction fee:");
        getContentPane().add(transactionsLabel);
        getContentPane().add(transactionField);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNumberField;
    private javax.swing.JLabel accountNumberLabel;
    private javax.swing.JLabel accountTypeField;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JLabel balanceField;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel ssnField;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JLabel transactionField;
    private javax.swing.JLabel transactionsLabel;
    // End of variables declaration//GEN-END:variables
}
