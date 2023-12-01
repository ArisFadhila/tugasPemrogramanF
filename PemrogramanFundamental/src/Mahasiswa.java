package tugas9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Mahasiswa extends JFrame {
    private JPanel panel1;
    private JPanel panelMain;
    private JTextField tfname;
    private JComboBox bulan;
    private JComboBox tanggal;
    private JComboBox Tahun;
    private JButton BPROSES;
    private JTextField tfAlamat;
    private JTextArea taNama;
    private JTextArea taTglLahir;
    private JTextArea taAlamat;
    private JTextArea taUsia;
    private JLabel AlamatLabel;
    private JLabel NamaLabel;
    private JLabel tanggalLahirLabel;

    public Mahasiswa() {
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        BPROSES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tfname.getText();
                int tlTanggal = Integer.parseInt((String) tanggal.getSelectedItem());
                int tlBulan = bulan.getSelectedIndex() + 1;
                int tlTahun = Integer.parseInt((String) Tahun.getSelectedItem());
                String alamat = tfAlamat.getText();

                taNama.setText("Nama              :" + " " + nama);
                taTglLahir.setText("Tanggal Lahir            :" + " " + tlTanggal + " " + bulan.getSelectedItem() + " " + tlTahun);
                taAlamat.setText("Alamat              :" + " " + alamat);

                LocalDate birthdate = LocalDate.of(tlTahun, tlBulan, tlTanggal);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                taUsia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setVisible(true);
    }
}