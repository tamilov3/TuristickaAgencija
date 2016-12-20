/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.klijent;

import Kontroler.GUIKontroler;
import Kontroler.Kontroler;
import domen.Agent;
import domen.Klijent;
import domen.Rezervacija;
import forme.GlavnaForma;
import forme.login.LoginForma;
import forme.rezervacije.DodajRezervacijuPanel;
import forme.rezervacije.PrikaziRezervacijeKlijentaPanel;
import java.awt.BorderLayout;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import komunikacija.Komunikacija;
import konstante.Konstante;
import model.KlijentiTableModel;
import model.PrikaziRezTableModel;
import sesija.Sesija;
import transfer.KlijentTransfer;
import transfer.ServerTransfer;

/**
 *
 * @author Tami
 */
public class KlijentForma extends javax.swing.JFrame {

    /**
     * Creates new form KlijentForma
     */
    public KlijentForma() {
        initComponents();
       srediFormu();
        jmiAranzmani.setEnabled(false);
        jmiUnosAranzmana.setEnabled(false);
        this.setTitle("Klijenti");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblKlijenti = new javax.swing.JTable();
        jbtnIzmeni = new javax.swing.JButton();
        jbtnSacuvajIzmene = new javax.swing.JButton();
        jbtnObrisiKlijenta = new javax.swing.JButton();
        jbtnDodajKlijenta = new javax.swing.JButton();
        jbtnDodajRezervaciju = new javax.swing.JButton();
        jtxtPretragaIme = new javax.swing.JTextField();
        jtxtPretragaPrezime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtnNadjiKlijenta = new javax.swing.JButton();
        jbtnPrikaziRezervacije = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmDatoteka = new javax.swing.JMenu();
        jmiPocetna = new javax.swing.JMenuItem();
        jmiPoslovniPartner = new javax.swing.JMenuItem();
        jmiKlijenti = new javax.swing.JMenuItem();
        jmiAranzmani = new javax.swing.JMenuItem();
        jmUnos = new javax.swing.JMenu();
        jmiUnosKlijenta = new javax.swing.JMenuItem();
        jmiUnosPoslovnogPartnera = new javax.swing.JMenuItem();
        jmiUnosAranzmana = new javax.swing.JMenuItem();
        jmiAgent = new javax.swing.JMenu();
        jmiPrijaviKlijenta = new javax.swing.JMenuItem();
        jmiOdjaviAgenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jtblKlijenti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblKlijenti);

        jbtnIzmeni.setText("Izmeni klijenta");
        jbtnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzmeniActionPerformed(evt);
            }
        });

        jbtnSacuvajIzmene.setText("SacuvajIzmene");
        jbtnSacuvajIzmene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSacuvajIzmeneActionPerformed(evt);
            }
        });

        jbtnObrisiKlijenta.setText("Obrisi klijenta");
        jbtnObrisiKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiKlijentaActionPerformed(evt);
            }
        });

        jbtnDodajKlijenta.setText("Dodaj klijenta");
        jbtnDodajKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajKlijentaActionPerformed(evt);
            }
        });

        jbtnDodajRezervaciju.setText("Dodaj rezervaciju");
        jbtnDodajRezervaciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajRezervacijuActionPerformed(evt);
            }
        });

        jLabel6.setText("Ime klijenta");

        jLabel7.setText("Prezime klijenta");

        jbtnNadjiKlijenta.setText("Nađi klijenta");
        jbtnNadjiKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNadjiKlijentaActionPerformed(evt);
            }
        });

        jbtnPrikaziRezervacije.setText("Prikazi rezervacije");
        jbtnPrikaziRezervacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrikaziRezervacijeActionPerformed(evt);
            }
        });

        jmDatoteka.setText("Datoteka");

        jmiPocetna.setText("Pocetna");
        jmiPocetna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPocetnaActionPerformed(evt);
            }
        });
        jmDatoteka.add(jmiPocetna);

        jmiPoslovniPartner.setText("Poslovni partneri");
        jmiPoslovniPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPoslovniPartnerActionPerformed(evt);
            }
        });
        jmDatoteka.add(jmiPoslovniPartner);

        jmiKlijenti.setText("Klijenti");
        jmiKlijenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiKlijentiActionPerformed(evt);
            }
        });
        jmDatoteka.add(jmiKlijenti);

        jmiAranzmani.setText("Aranzmani");
        jmiAranzmani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAranzmaniActionPerformed(evt);
            }
        });
        jmDatoteka.add(jmiAranzmani);

        jMenuBar1.add(jmDatoteka);

        jmUnos.setText("Unos");

        jmiUnosKlijenta.setText("Novi klijent");
        jmiUnosKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUnosKlijentaActionPerformed(evt);
            }
        });
        jmUnos.add(jmiUnosKlijenta);

        jmiUnosPoslovnogPartnera.setText("Novi poslovni partner");
        jmiUnosPoslovnogPartnera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUnosPoslovnogPartneraActionPerformed(evt);
            }
        });
        jmUnos.add(jmiUnosPoslovnogPartnera);

        jmiUnosAranzmana.setText("Novi aranzman");
        jmiUnosAranzmana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUnosAranzmanaActionPerformed(evt);
            }
        });
        jmUnos.add(jmiUnosAranzmana);

        jMenuBar1.add(jmUnos);

        jmiAgent.setText("Agent");

        jmiPrijaviKlijenta.setText("Prijavi se");
        jmiAgent.add(jmiPrijaviKlijenta);

        jmiOdjaviAgenta.setText("Odjavi se");
        jmiAgent.add(jmiOdjaviAgenta);

        jMenuBar1.add(jmiAgent);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnNadjiKlijenta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnIzmeni)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnObrisiKlijenta)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnDodajKlijenta)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnPrikaziRezervacije)
                                .addGap(29, 29, 29)
                                .addComponent(jbtnDodajRezervaciju)
                                .addGap(39, 39, 39)
                                .addComponent(jbtnSacuvajIzmene))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtPretragaIme, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtPretragaPrezime)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtPretragaIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPretragaPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jbtnNadjiKlijenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnIzmeni)
                    .addComponent(jbtnObrisiKlijenta)
                    .addComponent(jbtnDodajKlijenta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDodajRezervaciju)
                    .addComponent(jbtnSacuvajIzmene)
                    .addComponent(jbtnPrikaziRezervacije))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiKlijentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiKlijentiActionPerformed
        
    }//GEN-LAST:event_jmiKlijentiActionPerformed

    private void jmiAranzmaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAranzmaniActionPerformed
        
    }//GEN-LAST:event_jmiAranzmaniActionPerformed

    private void jmiPoslovniPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPoslovniPartnerActionPerformed
        GUIKontroler.invokePartnerForm();
        this.setVisible(false);
    }//GEN-LAST:event_jmiPoslovniPartnerActionPerformed

    private void jmiPocetnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPocetnaActionPerformed
        GUIKontroler.invokeMainForm();
        this.setVisible(false);
    }//GEN-LAST:event_jmiPocetnaActionPerformed

    private void jmiUnosKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUnosKlijentaActionPerformed
        
    }//GEN-LAST:event_jmiUnosKlijentaActionPerformed

    private void jmiUnosPoslovnogPartneraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUnosPoslovnogPartneraActionPerformed
        
    }//GEN-LAST:event_jmiUnosPoslovnogPartneraActionPerformed

    private void jmiUnosAranzmanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUnosAranzmanaActionPerformed
        
    }//GEN-LAST:event_jmiUnosAranzmanaActionPerformed

    private void jbtnNadjiKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNadjiKlijentaActionPerformed
        try {
            if (jtxtPretragaIme.getText().isEmpty() && jtxtPretragaPrezime.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Morate uneti barem jedan kriterijum pretrage");
            }
            String imeprezime = jtxtPretragaIme.getText()+" "+jtxtPretragaPrezime.getText();
            KlijentTransfer kt = new KlijentTransfer();
            kt.setOperacija(Konstante.PRETRAZI_KLIJENTE);
            kt.setParametar(imeprezime);
            Komunikacija.getInstance().sendRequest(kt);
            ServerTransfer st = Komunikacija.getInstance().readResponse();
            List<Klijent> listanadjenih = (List<Klijent>) st.getPodaci();
            List<Rezervacija> klijentskeRez = new LinkedList<>();
            for (Klijent nadjen : listanadjenih) {
                klijentskeRez = postaviRezervacije(nadjen);
                
            }
            KlijentiTableModel ktm = new KlijentiTableModel(listanadjenih);
            jtblKlijenti.setModel(ktm);
            
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(KlijentForma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtnNadjiKlijentaActionPerformed

    private void jbtnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzmeniActionPerformed
        KlijentiTableModel ktm = (KlijentiTableModel) jtblKlijenti.getModel();
        if (jtblKlijenti.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(this, "Morate selektovati klijenta!");
        }
        
        ktm.setMenjaj(true);
        ktm.fireTableDataChanged();
        
    }//GEN-LAST:event_jbtnIzmeniActionPerformed

    private void jbtnObrisiKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiKlijentaActionPerformed
        try {
            
            KlijentiTableModel ktm = (KlijentiTableModel) jtblKlijenti.getModel();
            if (jtblKlijenti.getSelectedRow()==-1) {
                JOptionPane.showMessageDialog(this, "Morate selektovati klijenta!");
                return;
            }
            
            KlijentTransfer kt = new KlijentTransfer();
            kt.setOperacija(Konstante.OBRISI_KLIJENTA);
            Klijent k = ktm.getKlijenti().get(jtblKlijenti.getSelectedRow());
            System.out.println(k.toString());
            kt.setParametar(k);
            Komunikacija.getInstance().sendRequest(kt);
            ServerTransfer st = Komunikacija.getInstance().readResponse();
            if (st.getUspesnost()==Konstante.USPEH) {
                JOptionPane.showMessageDialog(this, "Klijent uspesno obrisan");
                ktm.getKlijenti().remove(k);
                ktm.fireTableDataChanged();
            }else{
                JOptionPane.showMessageDialog(this, "Klijent nije obrisan. Greska: "+st.getException());
            }
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(KlijentForma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtnObrisiKlijentaActionPerformed

    private void jbtnDodajKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajKlijentaActionPerformed
        DodajKlijentaPanel dkf = new DodajKlijentaPanel();
        JDialog dialog = new JDialog(this, "Unos Klijenta", true);
        dialog.setLayout(new BorderLayout());
        dialog.add(dkf, BorderLayout.CENTER);
        dialog.pack();
        dialog.setVisible(true);
    }//GEN-LAST:event_jbtnDodajKlijentaActionPerformed

    private void jbtnSacuvajIzmeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSacuvajIzmeneActionPerformed
        try {
            KlijentiTableModel ktm = (KlijentiTableModel) jtblKlijenti.getModel();
            if (jtblKlijenti.getSelectedRow()==-1) {
                JOptionPane.showMessageDialog(this, "Morate selektovati klijenta!");
                return;
            }
            Klijent k = (Klijent) ktm.getKlijenti().get(jtblKlijenti.getSelectedRow());
            KlijentTransfer kt = new KlijentTransfer();
            kt.setOperacija(Konstante.IZMENI_KLIJENTA);
            kt.setParametar(k);
            Komunikacija.getInstance().sendRequest(kt);
            ServerTransfer st = Komunikacija.getInstance().readResponse();
            if (st.getUspesnost()==Konstante.USPEH) {
                JOptionPane.showMessageDialog(this, "Klijent uspesno izmenjen!");
                ktm.fireTableDataChanged();
            }
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(KlijentForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnSacuvajIzmeneActionPerformed

    private void jbtnDodajRezervacijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajRezervacijuActionPerformed
        if (jtblKlijenti.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(this, "Morate selektovati klijenta");
            return;
        }
        KlijentiTableModel ktm = (KlijentiTableModel) jtblKlijenti.getModel();
        DodajRezervacijuPanel drp = new DodajRezervacijuPanel((Klijent) ktm.getKlijenti().get(jtblKlijenti.getSelectedRow()));
        JDialog dialog = new JDialog(this, "Unos rezervacije", true);
        dialog.setLayout(new BorderLayout());
        dialog.add(drp, BorderLayout.CENTER);
        dialog.pack();
        dialog.setVisible(true);
    }//GEN-LAST:event_jbtnDodajRezervacijuActionPerformed

    private void jbtnPrikaziRezervacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrikaziRezervacijeActionPerformed
        if (jtblKlijenti.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(this, "Morate selektovati klijenta");
            return;
        }
        KlijentiTableModel ktm = (KlijentiTableModel) jtblKlijenti.getModel();
        PrikaziRezervacijeKlijentaPanel panel = new PrikaziRezervacijeKlijentaPanel((Klijent) ktm.getKlijenti().get(jtblKlijenti.getSelectedRow()));
        JDialog dialog = new JDialog(this, "Unos rezervacije", true);
        dialog.setLayout(new BorderLayout());
        dialog.add(panel, BorderLayout.CENTER);
        dialog.pack();
        dialog.setVisible(true);
        
    }//GEN-LAST:event_jbtnPrikaziRezervacijeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            Agent ulogovan = (Agent) Sesija.vratiInstancu().getMapa().get("agent");
            System.out.print("Ovog hocu da obrisem: "+ulogovan.toString());
            
            Kontroler.getInstance().izlogujSe(ulogovan);
            Sesija.vratiInstancu().getMapa().remove("agent", ulogovan);
            
            this.setVisible(false);
            this.dispose();
            
            LoginForma lf = new LoginForma();
            lf.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(GlavnaForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private List<Rezervacija> postaviRezervacije(Klijent k){
        List<Rezervacija> rezlista = new LinkedList<>();
        try {
            KlijentTransfer kt = new KlijentTransfer();
            kt.setOperacija(Konstante.VRATI_KLIJENTSKE_REZERVACIJE);
            kt.setParametar(k);
            Komunikacija.getInstance().sendRequest(kt);
            ServerTransfer st = Komunikacija.getInstance().readResponse();
            rezlista = (List<Rezervacija>) st.getPodaci();
            
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(KlijentForma.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rezlista;
    }
    private void srediFormu() {
        jmiKlijenti.getComponent().setEnabled(false);
        jmiOdjaviAgenta.getComponent().setEnabled(true);
        jmiAgent.getComponent().setEnabled(false);    
        List<Klijent> klijenti = vratiKlijente();
        
        KlijentiTableModel ktm = new KlijentiTableModel(klijenti);
        jtblKlijenti.setModel(ktm);
    }
    private List<Klijent> vratiKlijente(){
        List<Klijent> klijenti = new LinkedList<>();
        try {
            KlijentTransfer kt = new KlijentTransfer();
            kt.setOperacija(Konstante.VRATI_KLIJENTE);
            Komunikacija.getInstance().sendRequest(kt);
            ServerTransfer st = Komunikacija.getInstance().readResponse();
            klijenti = (List<Klijent>) st.getPodaci();
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(KlijentForma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return klijenti;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDodajKlijenta;
    private javax.swing.JButton jbtnDodajRezervaciju;
    private javax.swing.JButton jbtnIzmeni;
    private javax.swing.JButton jbtnNadjiKlijenta;
    private javax.swing.JButton jbtnObrisiKlijenta;
    private javax.swing.JButton jbtnPrikaziRezervacije;
    private javax.swing.JButton jbtnSacuvajIzmene;
    private javax.swing.JMenu jmDatoteka;
    private javax.swing.JMenu jmUnos;
    private javax.swing.JMenu jmiAgent;
    private javax.swing.JMenuItem jmiAranzmani;
    private javax.swing.JMenuItem jmiKlijenti;
    private javax.swing.JMenuItem jmiOdjaviAgenta;
    private javax.swing.JMenuItem jmiPocetna;
    private javax.swing.JMenuItem jmiPoslovniPartner;
    private javax.swing.JMenuItem jmiPrijaviKlijenta;
    private javax.swing.JMenuItem jmiUnosAranzmana;
    private javax.swing.JMenuItem jmiUnosKlijenta;
    private javax.swing.JMenuItem jmiUnosPoslovnogPartnera;
    private javax.swing.JTable jtblKlijenti;
    private javax.swing.JTextField jtxtPretragaIme;
    private javax.swing.JTextField jtxtPretragaPrezime;
    // End of variables declaration//GEN-END:variables

    
}

