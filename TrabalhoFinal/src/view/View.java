package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JCheckBox;

public class View extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setPreferredSize(new Dimension(595, 842));
		setTitle("Reserva de sala");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 842);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelHeader = new JPanel();
		contentPane.add(panelHeader, BorderLayout.NORTH);
		panelHeader.setLayout(new BoxLayout(panelHeader, BoxLayout.Y_AXIS));
		
		JLabel lblImgBr = new JLabel("REP\u00DABICA FEDERATIVA DO BRASIL.jpg");
		panelHeader.add(lblImgBr);
		
		JLabel lblImgUfcspa = new JLabel("Pretend this is UFCSPA.jpg");
		panelHeader.add(lblImgUfcspa);
		
		JLabel lblFormulrioParaReserva = new JLabel("Formul\u00E1rio para Reserva de Sala de Aula no Setor de Apoio \u00E0s Salas de Aula");
		panelHeader.add(lblFormulrioParaReserva);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox);
		
		JPanel panelIdentificacao = new JPanel();
		verticalBox.add(panelIdentificacao);
		
		JLabel lblGraduao = new JLabel("Gradua\u00E7\u00E3o:");
		panelIdentificacao.add(lblGraduao);
		
		JCheckBox chckbxBiomedicina = new JCheckBox("Biomedicina");
		panelIdentificacao.add(chckbxBiomedicina);
		
		JCheckBox chckbxEnfermagem = new JCheckBox("Enfermagem");
		panelIdentificacao.add(chckbxEnfermagem);
		
		JCheckBox chckbxFisioterapia = new JCheckBox("Fisioterapia");
		panelIdentificacao.add(chckbxFisioterapia);
		
		JCheckBox chckbxFonoaudiologia = new JCheckBox("Fonoaudiologia");
		panelIdentificacao.add(chckbxFonoaudiologia);
		
		JCheckBox chckbxMedicina = new JCheckBox("Medicina");
		panelIdentificacao.add(chckbxMedicina);
		
		JCheckBox chckbxNutrio = new JCheckBox("Nutri\u00E7\u00E3o");
		panelIdentificacao.add(chckbxNutrio);
		
		JCheckBox chckbxPsicologia = new JCheckBox("Psicologia");
		panelIdentificacao.add(chckbxPsicologia);
		
		JLabel lblPsgraduao = new JLabel("P\u00F3s-Gradua\u00E7\u00E3o:");
		panelIdentificacao.add(lblPsgraduao);
		
		JCheckBox chckbxEspecializao = new JCheckBox("Especializa\u00E7\u00E3o");
		panelIdentificacao.add(chckbxEspecializao);
		
		JCheckBox chckbxResidnciaMdica = new JCheckBox("Resid\u00EAncia M\u00E9dica");
		panelIdentificacao.add(chckbxResidnciaMdica);
		
		JCheckBox chckbxPsgraduao = new JCheckBox("P\u00F3s-Gradua\u00E7\u00E3o");
		panelIdentificacao.add(chckbxPsgraduao);
		
		JPanel panelHorarios = new JPanel();
		verticalBox.add(panelHorarios);
		
		JPanel panelApoio = new JPanel();
		verticalBox.add(panelApoio);
	}

}
