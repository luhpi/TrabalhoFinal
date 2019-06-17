package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEspecificar1;
	private JTextField textFieldSolicitante;
	private JTextField textFieldTelefone;
	private JTextField textFieldEmail;
	private JTextField textFieldEspecificar2;
	private JTextField textFieldData;
	private JTextField textFieldInicio;
	private JTextField textFieldTermino;
	private JTextField textFieldHorarioReserva;
	private JTextField textFieldPrevisaoAlunos;
	private JTextField textFieldEspecificarApoio;
	private JTextField textFieldSalaConcedida;
	private JTextField textFieldNomeServidor;
	private JTextField textFieldDataReserva;
	private JTextField textFieldObservacao;
	private JTextField textField;

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
		
		JCheckBox chckbxNutricao = new JCheckBox("Nutri\u00E7\u00E3o");
		panelIdentificacao.add(chckbxNutricao);
		
		JCheckBox chckbxPsicologia = new JCheckBox("Psicologia");
		panelIdentificacao.add(chckbxPsicologia);
		
		JLabel lblPosGraduacao = new JLabel("P\u00F3s-Gradua\u00E7\u00E3o:");
		panelIdentificacao.add(lblPosGraduacao);
		
		JCheckBox chckbxEspecializacao = new JCheckBox("Especializa\u00E7\u00E3o");
		panelIdentificacao.add(chckbxEspecializacao);
		
		JCheckBox chckbxResidenciaMedica = new JCheckBox("Resid\u00EAncia M\u00E9dica");
		panelIdentificacao.add(chckbxResidenciaMedica);
		
		JCheckBox chckbxPosGraduacao = new JCheckBox("P\u00F3s-Gradua\u00E7\u00E3o");
		panelIdentificacao.add(chckbxPosGraduacao);
		
		JLabel lblOutroEspecificar = new JLabel("Outro: Especificar");
		panelIdentificacao.add(lblOutroEspecificar);
		
		textFieldEspecificar1 = new JTextField();
		panelIdentificacao.add(textFieldEspecificar1);
		textFieldEspecificar1.setColumns(10);
		
		JLabel lblSolicitante = new JLabel("Solicitante:");
		panelIdentificacao.add(lblSolicitante);
		
		textFieldSolicitante = new JTextField();
		panelIdentificacao.add(textFieldSolicitante);
		textFieldSolicitante.setColumns(10);
		
		JLabel lblTelefoneParaContato = new JLabel("Telefone para contato:");
		panelIdentificacao.add(lblTelefoneParaContato);
		
		textFieldTelefone = new JTextField();
		panelIdentificacao.add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		JLabel lblEnderecoEletronico = new JLabel("Endere\u00E7o Eletr\u00F4nico:");
		panelIdentificacao.add(lblEnderecoEletronico);
		
		textFieldEmail = new JTextField();
		panelIdentificacao.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblAtividadeCurricularaula = new JLabel("Atividade curricular (aula, semin\u00E1rio, etc.)");
		panelIdentificacao.add(lblAtividadeCurricularaula);
		
		JCheckBox chckbxAula = new JCheckBox("aula");
		panelIdentificacao.add(chckbxAula);
		
		JCheckBox chckbxSeminario = new JCheckBox("semin\u00E1rio");
		panelIdentificacao.add(chckbxSeminario);
		
		JCheckBox chckbxProva = new JCheckBox("prova");
		panelIdentificacao.add(chckbxProva);
		
		JLabel lblWarn1 = new JLabel("1) N\u00E3o ser\u00E3o agendadas provas e aulas fora do hor\u00E1rio fornecido pela secretaria;");
		panelIdentificacao.add(lblWarn1);
		
		JLabel lblWarn2 = new JLabel("2) Ter\u00E3o prioridade as atividades curriculares no agendamento de reserva especial de salas");
		panelIdentificacao.add(lblWarn2);
		
		JCheckBox chckbxOutraEspecificar = new JCheckBox("outra: Especificar");
		panelIdentificacao.add(chckbxOutraEspecificar);
		
		textFieldEspecificar2 = new JTextField();
		panelIdentificacao.add(textFieldEspecificar2);
		textFieldEspecificar2.setColumns(10);
		
		JLabel lblData = new JLabel("Data: ");
		panelIdentificacao.add(lblData);
		
		textFieldData = new JTextField();
		panelIdentificacao.add(textFieldData);
		textFieldData.setColumns(10);
		
		JLabel lblPeriodo = new JLabel("Per\u00EDodo (in\u00EDcio e t\u00E9rmino):");
		panelIdentificacao.add(lblPeriodo);
		
		textFieldInicio = new JTextField();
		panelIdentificacao.add(textFieldInicio);
		textFieldInicio.setColumns(10);
		
		JLabel lblA = new JLabel("a");
		panelIdentificacao.add(lblA);
		
		textFieldTermino = new JTextField();
		panelIdentificacao.add(textFieldTermino);
		textFieldTermino.setColumns(10);
		
		JPanel panelHorarios = new JPanel();
		verticalBox.add(panelHorarios);
		
		JLabel lblHorariosDeReserva = new JLabel("Hor\u00E1rios de Reserva:");
		panelHorarios.add(lblHorariosDeReserva);
		
		textFieldHorarioReserva = new JTextField();
		panelHorarios.add(textFieldHorarioReserva);
		textFieldHorarioReserva.setColumns(10);
		
		JScrollPane scrollPaneTabela = new JScrollPane();
		panelHorarios.add(scrollPaneTabela);
		textField = new JTextField();
		panelHorarios.add(textField);
		textField.setColumns(10);
		
		JTable tabelaHorariosReserva = new JTable();
		panelHorarios.add(tabelaHorariosReserva);
		
		JLabel lblPrevisaoDeAlunos = new JLabel("Previs\u00E3o de alunos");
		panelHorarios.add(lblPrevisaoDeAlunos);
		
		textFieldPrevisaoAlunos = new JTextField();
		panelHorarios.add(textFieldPrevisaoAlunos);
		textFieldPrevisaoAlunos.setColumns(10);
		
		JLabel lblEspecificarAlunos = new JLabel("ESPECIFICAR N\u00BA DE ALUNOS");
		panelHorarios.add(lblEspecificarAlunos);
		
		JLabel lblObsSalas = new JLabel("Obs.: Todas as salas possuem computador e equipamento multim\u00EDdia. Outros equipamentos devem ser solicitados com anteced\u00EAncia m\u00EDnima de 24 horas ao Setor de Apoio \u00E0s Salas de Aula. Reserva para eventos dever\u00E3o ser realizadas no protocolo, com no m\u00EDnimo 45 dias de anteced\u00EAncia, conforme normas institucionais.");
		panelHorarios.add(lblObsSalas);
		
		JLabel lblOutrosEquipamentos = new JLabel("Outros equipamentos:");
		panelHorarios.add(lblOutrosEquipamentos);
		
		JCheckBox chckbxProjetorDeSlides = new JCheckBox("projetor de slides");
		panelHorarios.add(chckbxProjetorDeSlides);
		
		JCheckBox chckbxRetroprojetor = new JCheckBox("retroprojetor");
		panelHorarios.add(chckbxRetroprojetor);
		
		JCheckBox chckbxEquipamentoDeAudio = new JCheckBox("equipamento de \u00E1udio");
		panelHorarios.add(chckbxEquipamentoDeAudio);
		
		JCheckBox chckbxDvd = new JCheckBox("DVD");
		panelHorarios.add(chckbxDvd);
		
		JCheckBox chckbxOutroEspecificar = new JCheckBox("outro. Especificar");
		panelHorarios.add(chckbxOutroEspecificar);
		
		textFieldEspecificarApoio = new JTextField();
		panelHorarios.add(textFieldEspecificarApoio);
		textFieldEspecificarApoio.setColumns(10);
		
		JPanel panelApoio = new JPanel();
		verticalBox.add(panelApoio);
		
		JLabel lblNaoPreencher = new JLabel("N\u00E3o preencher (somente apoio salas):");
		panelApoio.add(lblNaoPreencher);
		
		JLabel lblSalaConcedida = new JLabel("Sala concedida:");
		panelApoio.add(lblSalaConcedida);
		
		textFieldSalaConcedida = new JTextField();
		panelApoio.add(textFieldSalaConcedida);
		textFieldSalaConcedida.setColumns(10);
		
		JLabel lblNomeDoServidor = new JLabel("Nome do Servidor que realizou a reserva:");
		panelApoio.add(lblNomeDoServidor);
		
		textFieldNomeServidor = new JTextField();
		panelApoio.add(textFieldNomeServidor);
		textFieldNomeServidor.setColumns(10);
		
		JLabel lblDataDaReserva = new JLabel("Data da reserva:");
		panelApoio.add(lblDataDaReserva);
		
		textFieldDataReserva = new JTextField();
		panelApoio.add(textFieldDataReserva);
		textFieldDataReserva.setColumns(10);
		
		JLabel lblObservacao = new JLabel("Observa\u00E7\u00E3o");
		panelApoio.add(lblObservacao);
		
		textFieldObservacao = new JTextField();
		panelApoio.add(textFieldObservacao);
		textFieldObservacao.setColumns(10);
	}

}
