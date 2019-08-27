import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
//import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
//import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

//import Controller.AddRobot;
import Controller.Query;
import Model.Robots;

/**
 * class fram robot capabilities  contain all the  second layer capabilities available in ToRCH. 
 * @param Robot object contain all values to be inserted  
 * @return  nothing 
 * @author MLinjawi
 */

public class RobotCapabilities {

	// ######################################################################################
	// ######################################################################################
	// Variables declaration
	// ######################################################################################
	// ######################################################################################
	private JFrame RPframe;
	Controller.Query q = new Query();

	private JTextField txtName = new JTextField();   // to insert the name of a new robot 
	private JTextArea txtrRobotInfo;
	Robots AddRob;
	String insertvalue;

	JButton buttonADD, btnSave;

	JPanel panelPercep, panelInterp, panelTask, panelAction, panelGeneral, panelInter;
	JLabel lblName, lblObjPercep;

	
	JComboBox<String> comBxPhObjPercep, comBxDigiInfoPercep, comBxSocAgPercep, comBxSocEmPercep, comBxSocBehPercep,
			comBxGenPercep, comBxGenEnvPercep, comBxGenSelLocPercep, comBxPhObjLocPercep, comBxSocAgLocPercep, comBxPhTrackercep,
			comBxModPercep;
	JComboBox<String> comBxPhyObjInter, comBxDCogInterp, comBxSoInterp;
	JComboBox<String> comBxPhUnConsMotion, comBxPhConMo, comBxPhGrasping, comBxPhHold, comBxPhHandling, comBxCogKnowledge,
			comBxCognition, comBxSocEmExp, comBxSocBeh, comBxSocskilEx;
	JComboBox<String> comBxGenAction, comBxPhActPurObj, comBxSocActPurPpl, comBxPhEnviPhys, comBxSocEnviSocial, comBxCogEnviInfo,
			comBxCogEnviCog;
	JComboBox<String> comBxAutonomy, comBxTaskAdapt, comBxSysDepend;
	JComboBox<String> comBxSocHRIFB, comBxSocHRIM, comBxInterLExt, comBxPhObjInterac, comBxCogR2R, comBxCogR2Sys, comBxPhyinter,
			comBxSocCogInterLearning, comBxSocHRICogAbility, comBxHRIMethIner, comBxProx;

	JTextField txtOtherSkill;
	
	DefaultListModel<String> listModel;				// keeps the list of all skills in the JList
	JLabel lblMessage;
	/////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////
	// 

	String pleaseSelect = "Please Select";
	List<Object> guiComponentList = new ArrayList<>();
	List<String> columnNamesList = new ArrayList<>();

	// ######################################################################################
	// ######################################################################################
	// ######################################################################################
	// ######################################################################################
	// Constructor to Create the application run point
	// ######################################################################################
	// ######################################################################################
	// ######################################################################################
	// ######################################################################################

	public RobotCapabilities() {
		initialize();
	}

	// ######################################################################################
	// ######################################################################################
	// ######################################################################################
	// ######################################################################################
	// /***** Initialise the contents of the frame.*****/
	// ######################################################################################
	// ######################################################################################
	// ######################################################################################
	// ######################################################################################
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	private void initialize() {
		RPframe = new JFrame();
		RPframe.getContentPane().setBackground(new Color(255, 250, 205));
		RPframe.setBounds(100, 10, 1492, 1057);
		RPframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RPframe.getContentPane().setLayout(null);
		// -------------------------------------------------------------------------------------
		JScrollPane scrollPane_RobPro = new JScrollPane();
		scrollPane_RobPro.setBounds(1458, 48, 28, 287);
		//SocialTypePanel.add(scrollPane_RobPro);
		RPframe.getContentPane().add(scrollPane_RobPro);
		
		
		
		// Assign the column names to the list
		columnNamesList.add("PObj");
		columnNamesList.add("PDigInfo");
		columnNamesList.add("PSoAg");
		columnNamesList.add("PEm");
		columnNamesList.add("PSoBeh");
		columnNamesList.add("PGen");
		columnNamesList.add("PEnviro");
		columnNamesList.add("PSelfLoc");
		columnNamesList.add("PObjLoc");
		columnNamesList.add("PSoAgLoc");
		columnNamesList.add("PTrace");
		columnNamesList.add("PMod");
		columnNamesList.add("PhyObjInter");
		columnNamesList.add("CogInterp");
		columnNamesList.add("SoInterp");
		columnNamesList.add("UnConsMo");
		columnNamesList.add("ConsMo");
		columnNamesList.add("Grap");
		columnNamesList.add("Hold");
		columnNamesList.add("Handle");
		columnNamesList.add("Knowl");
		columnNamesList.add("Cog");
		columnNamesList.add("EmExp");
		columnNamesList.add("SoBehExp");
		columnNamesList.add("SoSkill");
		columnNamesList.add("GenAction");
		columnNamesList.add("ActPurObj");
		columnNamesList.add("ActPurPpl");
		columnNamesList.add("ActPurInfo");
		columnNamesList.add("EnvPhysi");
		columnNamesList.add("EnvSo");
		columnNamesList.add("EnvInfo");
		columnNamesList.add("EnvCog");
		columnNamesList.add("DeciAuto");
		columnNamesList.add("TaskAdap");
		columnNamesList.add("SysDepen");
		columnNamesList.add("HRIFeedBack");
		columnNamesList.add("HRIModel");
		columnNamesList.add("SoHRILevel");
		columnNamesList.add("ObjInter");
		columnNamesList.add("RToR");
		columnNamesList.add("RToD");
		columnNamesList.add("PhyMotionInter");
		columnNamesList.add("SoCogInter");
		columnNamesList.add("LearnInter");
		columnNamesList.add("CogInter");
		columnNamesList.add("MethodInter");
		columnNamesList.add("HRIProximity");
		columnNamesList.add("TalSkil");
		columnNamesList.add("Intel");
		// 12 SEPT remove comments from above other columns x

		// -------------------------------------------------------------------------------------
		JLabel lblNewLabel = new JLabel("ToRCH   V12");
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(559, 0, 303, 48);
		RPframe.getContentPane().add(lblNewLabel);
		// ######################################################################################
		// ######################################################################################
		// ######################################################################################
		// ######################################################################################
		// ######################################################################################
		// ######################################################################################
		// Panel perception
		// ######################################################################################
		// ######################################################################################
		// ######################################################################################
		// ######################################################################################
		// ######################################################################################
		// ######################################################################################
		// JPanel
		panelPercep = new JPanel();
		panelPercep.setBackground(new Color(192, 192, 192));
		panelPercep.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Perception", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelPercep.setBounds(16, 55, 1419, 141);
		RPframe.getContentPane().add(panelPercep);
		panelPercep.setLayout(null);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 1 Object Perception label
		// JLabel
		lblObjPercep = new JLabel("Object ");
		lblObjPercep.setForeground(new Color(0, 0, 255));
		lblObjPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblObjPercep.setBounds(21, 22, 89, 28);
		panelPercep.add(lblObjPercep);
		// -----------------------------------------------------------------
		// object Perception combo BOx
		// JComboBox<String>
		comBxPhObjPercep = new JComboBox<String>();
		comBxPhObjPercep.setBounds(122, 22, 121, 28);
		comBxPhObjPercep.addItem("Level 0");
		comBxPhObjPercep.addItem("Level 1");
		comBxPhObjPercep.addItem("Level 2");
		comBxPhObjPercep.addItem("Level 3");
		comBxPhObjPercep.addItem("Level 4");
		comBxPhObjPercep.addItem("Level 5");
		comBxPhObjPercep.addItem("Level 6");
		comBxPhObjPercep.addItem("Level 7");
		comBxPhObjPercep.addItem("Level 8");
		comBxPhObjPercep.addItem("Level 9");
		comBxPhObjPercep.addItem("Level 10");
		comBxPhObjPercep.addItem("Level 11");
		comBxPhObjPercep.addItem("Level 12");
		setSelectOption(comBxPhObjPercep);
		guiComponentList.add(comBxPhObjPercep); ///// add to the rest 12 Sept

		panelPercep.add(comBxPhObjPercep);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 2 Digital information Perception label
		JLabel lblDigInPercep = new JLabel("Digital Information");
		lblDigInPercep.setForeground(Color.RED);
		lblDigInPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblDigInPercep.setBounds(262, 56, 138, 28);
		panelPercep.add(lblDigInPercep);
		// -----------------------------------------------------------------
		// Digital information Perception combo BOx
		// JComboBox<String>
		comBxDigiInfoPercep = new JComboBox<String>();
		comBxDigiInfoPercep.setBounds(391, 58, 127, 28);
		comBxDigiInfoPercep.addItem("Level 0");
		comBxDigiInfoPercep.addItem("Level 1");
		comBxDigiInfoPercep.addItem("Level 2");
		comBxDigiInfoPercep.addItem("Level 3");
		comBxDigiInfoPercep.addItem("Level 4");
		comBxDigiInfoPercep.addItem("Level 5");
		comBxDigiInfoPercep.addItem("Level 6");
		comBxDigiInfoPercep.addItem("Level 7");
		setSelectOption(comBxDigiInfoPercep);
		guiComponentList.add(comBxDigiInfoPercep);

		panelPercep.add(comBxDigiInfoPercep);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 3 Social agent Perception label
		JLabel lblSoAg = new JLabel("Social Agent");
		lblSoAg.setForeground(new Color(0, 128, 0));
		lblSoAg.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSoAg.setBounds(573, 89, 95, 28);
		panelPercep.add(lblSoAg);
		// -----------------------------------------------------------------
		// Social agent Perception combo BOx
		// JComboBox<String>
		comBxSocAgPercep = new JComboBox<String>();
		comBxSocAgPercep.setBounds(660, 91, 122, 28);
		comBxSocAgPercep.addItem("Level 0");
		comBxSocAgPercep.addItem("Level 1");
		comBxSocAgPercep.addItem("Level 2");
		comBxSocAgPercep.addItem("Level 3");
		comBxSocAgPercep.addItem("Level 4");
		comBxSocAgPercep.addItem("Level 5");
		comBxSocAgPercep.addItem("Level 6");
		comBxSocAgPercep.addItem("Level 7");
		comBxSocAgPercep.addItem("Level 8");
		setSelectOption(comBxSocAgPercep);
		guiComponentList.add(comBxSocAgPercep);

		panelPercep.add(comBxSocAgPercep);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 4 EmotionalPerception label
		JLabel lblEmPercep = new JLabel("Emotional ");
		lblEmPercep.setForeground(new Color(0, 128, 0));
		lblEmPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEmPercep.setBounds(573, 56, 95, 28);
		panelPercep.add(lblEmPercep);
		// -----------------------------------------------------------------
		// Emotional Perception combo BOx
		// JComboBox<String>
		comBxSocEmPercep = new JComboBox<String>();
		comBxSocEmPercep.setBounds(650, 58, 122, 28);
		comBxSocEmPercep.addItem("Level 0");
		comBxSocEmPercep.addItem("Level 1");
		comBxSocEmPercep.addItem("Level 2");
		comBxSocEmPercep.addItem("Level 3");
		comBxSocEmPercep.addItem("Level 4");
		comBxSocEmPercep.addItem("Level 5");
		setSelectOption(comBxSocEmPercep);
		guiComponentList.add(comBxSocEmPercep);
		panelPercep.add(comBxSocEmPercep);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 5 Social Behaviour Perception label
		JLabel lblSoBehPercep = new JLabel("Social Behaviure ");
		lblSoBehPercep.setForeground(new Color(0, 128, 0));
		lblSoBehPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSoBehPercep.setBounds(789, 89, 144, 28);
		panelPercep.add(lblSoBehPercep);
		// -----------------------------------------------------------------
		// Social Behaviour Perception combo BOx
		// JComboBox<String>
		comBxSocBehPercep = new JComboBox<String>();
		comBxSocBehPercep.setBounds(930, 91, 121, 28);
		comBxSocBehPercep.addItem("Level 0");
		comBxSocBehPercep.addItem("Level 1");
		comBxSocBehPercep.addItem("Level 2");
		comBxSocBehPercep.addItem("Level 3");
		comBxSocBehPercep.addItem("Level 4");
		comBxSocBehPercep.addItem("Level 5");
		setSelectOption(comBxSocBehPercep);
		guiComponentList.add(comBxSocBehPercep);
		panelPercep.add(comBxSocBehPercep);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 6 General Perception label
		JLabel lblGenPercep = new JLabel("General ");
		lblGenPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblGenPercep.setBounds(1177, 45, 79, 28);
		panelPercep.add(lblGenPercep);
		// -----------------------------------------------------------------
		// General Perception combo BOx
		// JComboBox<String>
		comBxGenPercep = new JComboBox<String>();
		comBxGenPercep.setBounds(1268, 47, 127, 28);
		comBxGenPercep.addItem("Level 0");
		comBxGenPercep.addItem("Level 1");
		comBxGenPercep.addItem("Level 2");
		comBxGenPercep.addItem("Level 3");
		comBxGenPercep.addItem("Level 4");
		comBxGenPercep.addItem("Level 5");
		comBxGenPercep.addItem("Level 6");
		comBxGenPercep.addItem("Level 7");
		comBxGenPercep.addItem("Level 8");
		setSelectOption(comBxGenPercep);
		guiComponentList.add(comBxGenPercep);
		panelPercep.add(comBxGenPercep);
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 7 Environment Perception label
		JLabel lblEnvPercep = new JLabel("Enviroment");
		lblEnvPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEnvPercep.setBounds(1186, 105, 121, 28);
		panelPercep.add(lblEnvPercep);
		// -----------------------------------------------------------------
		// Environment Perception combo BOx
		// JComboBox<String>
		comBxGenEnvPercep = new JComboBox<String>();
		comBxGenEnvPercep.setBounds(1268, 107, 127, 28);
		comBxGenEnvPercep.addItem("Level 0");
		comBxGenEnvPercep.addItem("Level 1");
		comBxGenEnvPercep.addItem("Level 2");
		comBxGenEnvPercep.addItem("Level 3");
		comBxGenEnvPercep.addItem("Level 4");
		comBxGenEnvPercep.addItem("Level 5");
		comBxGenEnvPercep.addItem("Level 6");
		setSelectOption(comBxGenEnvPercep);
		guiComponentList.add(comBxGenEnvPercep);
		panelPercep.add(comBxGenEnvPercep);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 8 Self Location Perception label
		JLabel lblSelLocPercep = new JLabel("Self Location");
		lblSelLocPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSelLocPercep.setBounds(1158, 78, 127, 28);
		panelPercep.add(lblSelLocPercep);
		// -----------------------------------------------------------------
		// Self Location Perception combo BOx
		// JComboBox<String>
		comBxGenSelLocPercep = new JComboBox<String>();
		comBxGenSelLocPercep.setBounds(1268, 78, 127, 28);
		comBxGenSelLocPercep.addItem("Level 0");
		comBxGenSelLocPercep.addItem("Level 1");
		comBxGenSelLocPercep.addItem("Level 2");
		comBxGenSelLocPercep.addItem("Level 3");
		comBxGenSelLocPercep.addItem("Level 4");
		comBxGenSelLocPercep.addItem("Level 5");
		comBxGenSelLocPercep.addItem("Level 6");
		comBxGenSelLocPercep.addItem("Level 7");
		setSelectOption(comBxGenSelLocPercep);
		guiComponentList.add(comBxGenSelLocPercep);
		panelPercep.add(comBxGenSelLocPercep);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 9 Object Location Perception label
		JLabel lblObjLocPercep = new JLabel("Object Location");
		lblObjLocPercep.setForeground(new Color(0, 0, 255));
		lblObjLocPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblObjLocPercep.setBounds(16, 60, 112, 28);
		panelPercep.add(lblObjLocPercep);
		// -----------------------------------------------------------------
		// Object Location Perception combo BOx
		// JComboBox<String>
		comBxPhObjLocPercep = new JComboBox<String>();
		comBxPhObjLocPercep.setBounds(122, 58, 121, 28);
		comBxPhObjLocPercep.addItem("Level 0");
		comBxPhObjLocPercep.addItem("Level 1");
		comBxPhObjLocPercep.addItem("Level 2");
		comBxPhObjLocPercep.addItem("Level 3");
		comBxPhObjLocPercep.addItem("Level 4");
		comBxPhObjLocPercep.addItem("Level 5");
		comBxPhObjLocPercep.addItem("Level 6");
		comBxPhObjLocPercep.addItem("Level 7");
		setSelectOption(comBxPhObjLocPercep);
		guiComponentList.add(comBxPhObjLocPercep);
		panelPercep.add(comBxPhObjLocPercep);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 10 Social Agent Location Perception label
		JLabel lblSoAgLocPercep = new JLabel("Social Agent Location ");
		lblSoAgLocPercep.setForeground(new Color(0, 128, 0));
		lblSoAgLocPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSoAgLocPercep.setBounds(783, 56, 151, 28);
		panelPercep.add(lblSoAgLocPercep);
		// -----------------------------------------------------------------
		// Social Agent Location Perception combo BOx
		// JComboBox<String>
		comBxSocAgLocPercep = new JComboBox<String>();
		comBxSocAgLocPercep.setBounds(930, 58, 127, 28);
		comBxSocAgLocPercep.addItem("Level 0");
		comBxSocAgLocPercep.addItem("Level 1");
		comBxSocAgLocPercep.addItem("Level 2");
		comBxSocAgLocPercep.addItem("Level 3");
		comBxSocAgLocPercep.addItem("Level 4");
		comBxSocAgLocPercep.addItem("Level 5");
		comBxSocAgLocPercep.addItem("Level 6");
		comBxSocAgLocPercep.addItem("Level 7");
		setSelectOption(comBxSocAgLocPercep);
		guiComponentList.add(comBxSocAgLocPercep);
		panelPercep.add(comBxSocAgLocPercep);
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 11 Tracking Perception label
		JLabel lblTrackPercep = new JLabel("Tracking ");
		lblTrackPercep.setForeground(new Color(0, 0, 255));
		lblTrackPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTrackPercep.setBounds(16, 89, 112, 28);
		panelPercep.add(lblTrackPercep);
		// -----------------------------------------------------------------
		// Tracking Perception combo BOx
		// JComboBox<String>
		comBxPhTrackercep = new JComboBox<String>();
		comBxPhTrackercep.setBounds(122, 91, 121, 28);
		comBxPhTrackercep.addItem("Level 0");
		comBxPhTrackercep.addItem("Level 1");
		comBxPhTrackercep.addItem("Level 2");
		comBxPhTrackercep.addItem("Level 3");
		comBxPhTrackercep.addItem("Level 4");
		comBxPhTrackercep.addItem("Level 5");
		comBxPhTrackercep.addItem("Level 6");
		setSelectOption(comBxPhTrackercep);
		guiComponentList.add(comBxPhTrackercep);
		panelPercep.add(comBxPhTrackercep);
		///////////////////////////////////////////////////////////////////////////////////////////////////////

		// 12 Modes of Perception label
		JLabel lblModPercep = new JLabel("Modes");
		lblModPercep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblModPercep.setBounds(1094, 20, 72, 28);
		panelPercep.add(lblModPercep);
		// ----------------------------------------------------------------- // Modes

		JPanel pMode = new JPanel();
		pMode.setBounds(1166, 20, 247, 28);
		JCheckBox cboxVisual = new JCheckBox("Visual", false);
		JCheckBox cboxAuditory = new JCheckBox("Audio", false);
		JCheckBox cboxPhysical = new JCheckBox("Physical", false);
		pMode.add(cboxVisual);
		pMode.add(cboxAuditory);
		pMode.add(cboxPhysical);
		panelPercep.add(pMode);

		List<JCheckBox> cbgModPercep = new ArrayList<>();
		cbgModPercep.add(cboxVisual);
		cbgModPercep.add(cboxAuditory);
		cbgModPercep.add(cboxPhysical);
		guiComponentList.add(cbgModPercep);

		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// ######################################################################################
		// ######################################################################################
		// Panel Interpretation
		// ######################################################################################
		// ######################################################################################
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		panelInterp = new JPanel();
		panelInterp.setBackground(Color.LIGHT_GRAY);
		panelInterp.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Interpretation ",
				TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelInterp.setBounds(1097, 219, 338, 108);
		RPframe.getContentPane().add(panelInterp);
		panelInterp.setLayout(null);
		/*
		 * /////////////////////////////////////////////////////////////////////////////
		 * ////////////////////////// JPanel panelEnvisioning = new JPanel();
		 * panelEnvisioning.setBackground(new Color(192, 192, 192));
		 * panelEnvisioning.setBorder(new
		 * TitledBorder(UIManager.getBorder("TitledBorder.border"),
		 * "Envisioning requirement ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
		 * null, new Color(0, 0, 255))); panelEnvisioning.setBounds(14, 400, 1400, 70);
		 * frame.getContentPane().add(panelEnvisioning);
		 * panelEnvisioning.setLayout(null); /
		 */ ///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 1 physical Object Interpretation label
		JLabel lblPhyObjInter = new JLabel("Physical Object Interpretation");
		lblPhyObjInter.setForeground(Color.BLUE);
		lblPhyObjInter.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblPhyObjInter.setBounds(6, 20, 214, 28);
		panelInterp.add(lblPhyObjInter);
		// -----------------------------------------------------------------
		// 1 physical Object Interpretation combo BOx
		// JComboBox<String>
		comBxPhyObjInter = new JComboBox<String>();
		comBxPhyObjInter.setBounds(218, 22, 114, 28);
		comBxPhyObjInter.addItem("Level 0");
		comBxPhyObjInter.addItem("Level 1");
		comBxPhyObjInter.addItem("Level 2");
		comBxPhyObjInter.addItem("Level 3");
		comBxPhyObjInter.addItem("Level 4");
		comBxPhyObjInter.addItem("Level 5");
		comBxPhyObjInter.addItem("Level 6");
		comBxPhyObjInter.addItem("Level 7");
		comBxPhyObjInter.addItem("Level 8");
		comBxPhyObjInter.addItem("Level 9");
		setSelectOption(comBxPhyObjInter);
		panelInterp.add(comBxPhyObjInter);
		guiComponentList.add(comBxPhyObjInter);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 2 Cognitive Interpretation label
		JLabel lblCogInterpretation = new JLabel("Cognitive Interpretation ");
		lblCogInterpretation.setForeground(Color.RED);
		lblCogInterpretation.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCogInterpretation.setBounds(38, 47, 168, 28);
		panelInterp.add(lblCogInterpretation);

		// -----------------------------------------------------------------
		// Cognitive Interpretation combo BOx
		// JComboBox<String>
		comBxDCogInterp = new JComboBox<String>();
		comBxDCogInterp.setBounds(218, 47, 114, 28);
		comBxDCogInterp.addItem("Level 0");
		comBxDCogInterp.addItem("Level 1");
		comBxDCogInterp.addItem("Level 2");
		comBxDCogInterp.addItem("Level 3");
		comBxDCogInterp.addItem("Level 4");
		comBxDCogInterp.addItem("Level 5");
		comBxDCogInterp.addItem("Level 6");
		panelInterp.add(comBxDCogInterp);
		setSelectOption(comBxDCogInterp);
		guiComponentList.add(comBxDCogInterp);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 3 Social Interpretation label
		JLabel lblSoInterp = new JLabel("Social Interpretation  ");
		lblSoInterp.setForeground(new Color(0, 128, 0));
		lblSoInterp.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSoInterp.setBounds(59, 72, 147, 28);
		panelInterp.add(lblSoInterp);
		// -----------------------------------------------------------------
		// Social Interpretation combo BOx
		// JComboBox<String>
		comBxSoInterp = new JComboBox<String>();
		comBxSoInterp.setBounds(218, 74, 114, 28);
		comBxSoInterp.addItem("Level 0");
		comBxSoInterp.addItem("Level 1");
		comBxSoInterp.addItem("Level 2");
		comBxSoInterp.addItem("Level 3");
		comBxSoInterp.addItem("Level 4");
		comBxSoInterp.addItem("Level 5");
		setSelectOption(comBxSoInterp);
		panelInterp.add(comBxSoInterp);
		guiComponentList.add(comBxSoInterp);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// ######################################################################################
		// ######################################################################################
		// Panel Task
		// ######################################################################################
		// ######################################################################################
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// Task capabilities Panel
		panelTask = new JPanel();
		panelTask.setBackground(new Color(192, 192, 192));
		panelTask.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Task performance ",
				TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelTask.setBounds(16, 219, 1059, 108);
		RPframe.getContentPane().add(panelTask);
		panelTask.setLayout(null);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 1 Un constrain Motion capabilities label
		JLabel lblUnConMo = new JLabel("Unconstraion Motion");
		lblUnConMo.setForeground(new Color(0, 0, 255));
		lblUnConMo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblUnConMo.setBounds(19, 20, 153, 28);
		panelTask.add(lblUnConMo);
		// -----------------------------------------------------------------
		// Un constrain Motion capabilities combo BOx
		// JComboBox<String>
		comBxPhUnConsMotion = new JComboBox<String>();
		comBxPhUnConsMotion.setBounds(169, 22, 113, 28);
		comBxPhUnConsMotion.addItem("Level 0");
		comBxPhUnConsMotion.addItem("Level 1");
		comBxPhUnConsMotion.addItem("Level 2");
		comBxPhUnConsMotion.addItem("Level 3");
		comBxPhUnConsMotion.addItem("Level 4");
		comBxPhUnConsMotion.addItem("Level 5");
		comBxPhUnConsMotion.addItem("Level 6");
		comBxPhUnConsMotion.addItem("Level 7");
		setSelectOption(comBxPhUnConsMotion);
		panelTask.add(comBxPhUnConsMotion);
		guiComponentList.add(comBxPhUnConsMotion);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 2 Constrain Motion capabilities label
		JLabel lblConMo = new JLabel("Constrain Motion ");
		lblConMo.setForeground(new Color(0, 0, 255));
		lblConMo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblConMo.setBounds(19, 45, 153, 28);
		panelTask.add(lblConMo);
		// -----------------------------------------------------------------
		// Constrain Motion capabilities combo BOx
		// JComboBox<String>
		comBxPhConMo = new JComboBox<String>();
		comBxPhConMo.setBounds(169, 47, 113, 28);
		comBxPhConMo.addItem("Level 0");
		comBxPhConMo.addItem("Level 1");
		comBxPhConMo.addItem("Level 2");
		comBxPhConMo.addItem("Level 3");
		comBxPhConMo.addItem("Level 4");
		comBxPhConMo.addItem("Level 5");
		setSelectOption(comBxPhConMo);
		panelTask.add(comBxPhConMo);
		guiComponentList.add(comBxPhConMo);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 3 Grasping capabilities label
		JLabel lblGrasp = new JLabel("Grasping");
		lblGrasp.setForeground(new Color(0, 0, 255));
		lblGrasp.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblGrasp.setBounds(29, 72, 121, 28);
		panelTask.add(lblGrasp);
		// -----------------------------------------------------------------
		// Grasping combo BOx
		// JComboBox<String>
		comBxPhGrasping = new JComboBox<String>();
		comBxPhGrasping.setBounds(169, 74, 113, 28);
		comBxPhGrasping.addItem("Level 0");
		comBxPhGrasping.addItem("Level 1");
		comBxPhGrasping.addItem("Level 2");
		comBxPhGrasping.addItem("Level 3");
		comBxPhGrasping.addItem("Level 4");
		comBxPhGrasping.addItem("Level 5");
		comBxPhGrasping.addItem("Level 6");
		comBxPhGrasping.addItem("Level 7");
		comBxPhGrasping.addItem("Level 8");
		setSelectOption(comBxPhGrasping);
		panelTask.add(comBxPhGrasping);
		guiComponentList.add(comBxPhGrasping);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 4 Hold capabilities label
		JLabel lblHold = new JLabel("Holding");
		lblHold.setForeground(new Color(0, 0, 255));
		lblHold.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblHold.setBounds(304, 20, 97, 28);
		panelTask.add(lblHold);
		// -----------------------------------------------------------------
		// Holding capabilities combo BOx
		// JComboBox<String>
		comBxPhHold = new JComboBox<String>();
		comBxPhHold.setBounds(369, 22, 113, 28);
		comBxPhHold.addItem("Level 0");
		comBxPhHold.addItem("Level 1");
		comBxPhHold.addItem("Level 2");
		comBxPhHold.addItem("Level 3");
		comBxPhHold.addItem("Level 4");
		comBxPhHold.addItem("Level 5");
		setSelectOption(comBxPhHold);
		panelTask.add(comBxPhHold);
		guiComponentList.add(comBxPhHold);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 5 Handling label
		JLabel lblHandling = new JLabel("Handling");
		lblHandling.setForeground(new Color(0, 0, 255));
		lblHandling.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblHandling.setBounds(297, 45, 104, 28);
		panelTask.add(lblHandling);
		// -----------------------------------------------------------------
		// Handling combo BOx
		// JComboBox<String>
		comBxPhHandling = new JComboBox<String>();
		comBxPhHandling.setBounds(367, 47, 115, 28);
		comBxPhHandling.addItem("Level 0");
		comBxPhHandling.addItem("Level 1");
		comBxPhHandling.addItem("Level 2");
		comBxPhHandling.addItem("Level 3");
		comBxPhHandling.addItem("Level 4");
		comBxPhHandling.addItem("Level 5");
		comBxPhHandling.addItem("Level 6");
		comBxPhHandling.addItem("Level 7");
		comBxPhHandling.addItem("Level 8");
		comBxPhHandling.addItem("Level 9");
		setSelectOption(comBxPhHandling);
		panelTask.add(comBxPhHandling);
		guiComponentList.add(comBxPhHandling);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 6 Knowledge label
		JLabel lblKnowl = new JLabel("Knowledge ");
		lblKnowl.setForeground(Color.RED);
		lblKnowl.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblKnowl.setBounds(509, 32, 88, 28);
		panelTask.add(lblKnowl);
		// -----------------------------------------------------------------
		// Knowledge combo BOx
		// JComboBox<String>
		comBxCogKnowledge = new JComboBox<String>();
		comBxCogKnowledge.setBounds(594, 34, 113, 28);
		comBxCogKnowledge.addItem("Level 0");
		comBxCogKnowledge.addItem("Level 1");
		comBxCogKnowledge.addItem("Level 2");
		comBxCogKnowledge.addItem("Level 3");
		comBxCogKnowledge.addItem("Level 4");
		comBxCogKnowledge.addItem("Level 5");
		comBxCogKnowledge.addItem("Level 6");
		comBxCogKnowledge.addItem("Level 7");
		comBxCogKnowledge.addItem("Level 8");
		comBxCogKnowledge.addItem("Level 9");
		comBxCogKnowledge.addItem("Level 10");
		comBxCogKnowledge.addItem("Level 11");
		comBxCogKnowledge.addItem("Level 12");
		comBxCogKnowledge.addItem("Level 13");
		comBxCogKnowledge.addItem("Level 14");
		comBxCogKnowledge.addItem("Level 15");
		setSelectOption(comBxCogKnowledge);
		panelTask.add(comBxCogKnowledge);
		guiComponentList.add(comBxCogKnowledge);
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 7 Cognition label
		JLabel lblCognition = new JLabel("Reasoning");
		lblCognition.setForeground(Color.RED);
		lblCognition.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCognition.setBounds(509, 60, 88, 28);
		panelTask.add(lblCognition);
		// -----------------------------------------------------------------
		// Cognition combo BOx
		// JComboBox<String>
		comBxCognition = new JComboBox<String>();
		comBxCognition.setBounds(594, 60, 113, 28);
		comBxCognition.addItem("Level 0");
		comBxCognition.addItem("Level 1");
		comBxCognition.addItem("Level 2");
		comBxCognition.addItem("Level 3");
		comBxCognition.addItem("Level 4");
		comBxCognition.addItem("Level 5");
		comBxCognition.addItem("Level 6");
		comBxCognition.addItem("Level 7");
		comBxCognition.addItem("Level 8");
		setSelectOption(comBxCognition);
		panelTask.add(comBxCognition);
		guiComponentList.add(comBxCognition);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 8 Emotional Expression label
		JLabel lblEmExp = new JLabel("Emotional Expresion");
		lblEmExp.setForeground(new Color(0, 128, 0));
		lblEmExp.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEmExp.setBounds(785, 20, 153, 28);
		panelTask.add(lblEmExp);
		// -----------------------------------------------------------------
		// Emotional Expression combo BOx
		// JComboBox<String>
		comBxSocEmExp = new JComboBox<String>();
		comBxSocEmExp.setBounds(930, 16, 113, 28);
		comBxSocEmExp.addItem("Level 0");
		comBxSocEmExp.addItem("Level 1");
		comBxSocEmExp.addItem("Level 2");
		comBxSocEmExp.addItem("Level 3");
		comBxSocEmExp.addItem("Level 4");
		comBxSocEmExp.addItem("Level 5");
		setSelectOption(comBxSocEmExp);
		panelTask.add(comBxSocEmExp);
		guiComponentList.add(comBxSocEmExp);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 9 Social behaviour Expression label
		JLabel lblSoBeh = new JLabel("Social Behaviur Expresion");
		lblSoBeh.setForeground(new Color(0, 128, 0));
		lblSoBeh.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSoBeh.setBounds(757, 43, 181, 28);
		panelTask.add(lblSoBeh);
		// -----------------------------------------------------------------
		// Social behaviour Expression combo BOx
		// JComboBox<String>
		comBxSocBeh = new JComboBox<String>();
		comBxSocBeh.setBounds(930, 45, 113, 28);
		comBxSocBeh.addItem("Level 0");
		comBxSocBeh.addItem("Level 1");
		comBxSocBeh.addItem("Level 2");
		comBxSocBeh.addItem("Level 3");
		comBxSocBeh.addItem("Level 4");
		comBxSocBeh.addItem("Level 5");
		setSelectOption(comBxSocBeh);
		panelTask.add(comBxSocBeh);
		guiComponentList.add(comBxSocBeh);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 10 Social skill Expression label
		JLabel lblSoskilEx = new JLabel("Social Skill Expresion");
		lblSoskilEx.setForeground(new Color(0, 128, 0));
		lblSoskilEx.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSoskilEx.setBounds(785, 70, 153, 28);
		panelTask.add(lblSoskilEx);
		// -----------------------------------------------------------------
		// Social skill Expression combo BOx
		// JComboBox<String>
		comBxSocskilEx = new JComboBox<String>();
		comBxSocskilEx.setBounds(930, 72, 113, 28);
		comBxSocskilEx.addItem("Level 0");
		comBxSocskilEx.addItem("Level 1");
		comBxSocskilEx.addItem("Level 2");
		comBxSocskilEx.addItem("Level 3");
		comBxSocskilEx.addItem("Level 4");
		comBxSocskilEx.addItem("Level 5");
		setSelectOption(comBxSocskilEx);
		panelTask.add(comBxSocskilEx);
		guiComponentList.add(comBxSocskilEx);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// ######################################################################################
		// ######################################################################################
		// Panel Action
		// ######################################################################################
		// ######################################################################################
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// action
		panelAction = new JPanel();
		panelAction.setBackground(new Color(192, 192, 192));
		panelAction.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Action", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.BLACK));
		panelAction.setBounds(16, 360, 1419, 79);
		RPframe.getContentPane().add(panelAction);
		panelAction.setLayout(null);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 1 General action capabilities label
		JLabel lblGenAction = new JLabel("General action ");
		lblGenAction.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblGenAction.setBounds(1203, 36, 103, 28);
		panelAction.add(lblGenAction);
		// -----------------------------------------------------------------
		// 1 General action capabilities combo BOx
		// JComboBox<String>
		comBxGenAction = new JComboBox<String>();
		comBxGenAction.setBounds(1300, 38, 113, 28);
		comBxGenAction.addItem("Level 0");
		comBxGenAction.addItem("Level 1");
		comBxGenAction.addItem("Level 2");
		panelAction.add(comBxGenAction);
		setSelectOption(comBxGenAction);
		guiComponentList.add(comBxGenAction);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 2 acting purposfully to object capabilities label
		JLabel lblActPurObj = new JLabel("Object purposful Acting");
		lblActPurObj.setForeground(new Color(0, 0, 255));
		lblActPurObj.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblActPurObj.setBounds(6, 20, 165, 28);
		panelAction.add(lblActPurObj);
		// -----------------------------------------------------------------
		// JComboBox<String>
		// acting purposefully to object capabilities combo BOx
		comBxPhActPurObj = new JComboBox<String>();
		comBxPhActPurObj.setBounds(173, 22, 113, 28);
		comBxPhActPurObj.addItem("Level 0");
		comBxPhActPurObj.addItem("Level 1");
		comBxPhActPurObj.addItem("Level 2");
		comBxPhActPurObj.addItem("Level 3");
		comBxPhActPurObj.addItem("Level 4");
		comBxPhActPurObj.addItem("Level 5");
		comBxPhActPurObj.addItem("Level 5");
		comBxPhActPurObj.addItem("Level 6");
		comBxPhActPurObj.addItem("Level 7");
		comBxPhActPurObj.addItem("Level 8");
		comBxPhActPurObj.addItem("Level 9");
		setSelectOption(comBxPhActPurObj);
		panelAction.add(comBxPhActPurObj);
		guiComponentList.add(comBxPhActPurObj);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 3 acting purposefully to ppl capabilities label
		JLabel lblActPurPpl = new JLabel("Purposful Acting agent");
		lblActPurPpl.setForeground(new Color(0, 128, 0));
		lblActPurPpl.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblActPurPpl.setBounds(909, 20, 165, 28);
		panelAction.add(lblActPurPpl);
		// -----------------------------------------------------------------
		// Grasping combo BOx
		// JComboBox<String> ActPurPpl;
		comBxSocActPurPpl = new JComboBox<String>();
		comBxSocActPurPpl.setBounds(1063, 22, 110, 28);
		comBxSocActPurPpl.addItem("Level 0");
		comBxSocActPurPpl.addItem("Level 1");
		comBxSocActPurPpl.addItem("Level 2");
		comBxSocActPurPpl.addItem("Level 3");
		comBxSocActPurPpl.addItem("Level 4");
		comBxSocActPurPpl.addItem("Level 5");
		comBxSocActPurPpl.addItem("Level 6");
		comBxSocActPurPpl.addItem("Level 7");
		comBxSocActPurPpl.addItem("Level 8");
		comBxSocActPurPpl.addItem("Level 9");
		setSelectOption(comBxSocActPurPpl);
		panelAction.add(comBxSocActPurPpl);
		guiComponentList.add(comBxSocActPurPpl);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 4 acting purposefully to information capabilities label
		JLabel lblActPurInfo = new JLabel("Actiong purposfully Information");
		lblActPurInfo.setForeground(new Color(255, 0, 0));
		lblActPurInfo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblActPurInfo.setBounds(379, 20, 226, 28);
		panelAction.add(lblActPurInfo);
		// -----------------------------------------------------------------
		// acting purposefully to information capabilities combo BOx
		JComboBox<String> comBxCogActPurInfo = new JComboBox<String>();
		comBxCogActPurInfo.setBounds(606, 22, 113, 28);
		comBxCogActPurInfo.addItem("Level 0");
		comBxCogActPurInfo.addItem("Level 1");
		comBxCogActPurInfo.addItem("Level 2");
		// comBxActPurInfo.addItem("Level 3");
		// comBxActPurInfo.addItem("Level 4");
		// comBxActPurInfo.addItem("Level 5");
		setSelectOption(comBxCogActPurInfo);
		panelAction.add(comBxCogActPurInfo);
		guiComponentList.add(comBxCogActPurInfo);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 5 Envisioning physical label
		JLabel lblEnviPhys = new JLabel("Envisioning physical ");
		lblEnviPhys.setForeground(Color.BLUE);
		lblEnviPhys.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEnviPhys.setBounds(6, 49, 165, 28);
		panelAction.add(lblEnviPhys);
		// -----------------------------------------------------------------
		// Handling combo BOx
		// JComboBox<String>
		comBxPhEnviPhys = new JComboBox<String>();
		comBxPhEnviPhys.setBounds(171, 49, 115, 28);
		comBxPhEnviPhys.addItem("Level 0");
		comBxPhEnviPhys.addItem("Level 1");
		comBxPhEnviPhys.addItem("Level 2");
		comBxPhEnviPhys.addItem("Level 3");
		comBxPhEnviPhys.addItem("Level 4");
		comBxPhEnviPhys.addItem("Level 5");
		comBxPhEnviPhys.addItem("Level 6");
		comBxPhEnviPhys.addItem("Level 7");
		comBxPhEnviPhys.addItem("Level 8");
		// comBxEnviPhys.addItem("Level 9");
		setSelectOption(comBxPhEnviPhys);
		panelAction.add(comBxPhEnviPhys);
		guiComponentList.add(comBxPhEnviPhys);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 6 Envisioning socialy label
		JLabel lblEnviSocial = new JLabel("Envisioning Socialy");
		lblEnviSocial.setForeground(new Color(0, 128, 0));
		lblEnviSocial.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEnviSocial.setBounds(926, 49, 138, 28);
		panelAction.add(lblEnviSocial);
		// -----------------------------------------------------------------
		// Envisioning socialy combo BOx
		// JComboBox<String>
		comBxSocEnviSocial = new JComboBox<String>();
		comBxSocEnviSocial.setBounds(1060, 51, 113, 28);
		comBxSocEnviSocial.addItem("Level 0");
		comBxSocEnviSocial.addItem("Level 1");
		comBxSocEnviSocial.addItem("Level 2");
		comBxSocEnviSocial.addItem("Level 3");
		comBxSocEnviSocial.addItem("Level 4");
		comBxSocEnviSocial.addItem("Level 5");
		/*
		 * comBxEnviSocial.addItem("Level 6"); comBxEnviSocial.addItem("Level 7");
		 * comBxEnviSocial.addItem("Level 8"); comBxEnviSocial.addItem("Level 9");
		 * comBxEnviSocial.addItem("Level 10"); comBxEnviSocial.addItem("Level 11");
		 * comBxEnviSocial.addItem("Level 12"); comBxEnviSocial.addItem("Level 13");
		 * comBxEnviSocial.addItem("Level 14"); comBxEnviSocial.addItem("Level 15");
		 */
		setSelectOption(comBxSocEnviSocial);
		panelAction.add(comBxSocEnviSocial);
		guiComponentList.add(comBxSocEnviSocial);
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 7 Envisioning Information label
		JLabel lblEnviInfo = new JLabel("Envisioning Information");
		lblEnviInfo.setForeground(Color.RED);
		lblEnviInfo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEnviInfo.setBounds(334, 49, 171, 28);
		panelAction.add(lblEnviInfo);
		// -----------------------------------------------------------------
		// Envisioning Information combo BOx
		// JComboBox<String>
		comBxCogEnviInfo = new JComboBox<String>();
		comBxCogEnviInfo.setBounds(507, 49, 113, 28);
		comBxCogEnviInfo.addItem("Level 0");
		comBxCogEnviInfo.addItem("Level 1");
		comBxCogEnviInfo.addItem("Level 2");
		comBxCogEnviInfo.addItem("Level 3");
		comBxCogEnviInfo.addItem("Level 4");
		setSelectOption(comBxCogEnviInfo);
		panelAction.add(comBxCogEnviInfo);
		guiComponentList.add(comBxCogEnviInfo);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 8 Envisioning cognitive label
		JLabel lblEnviCog = new JLabel("Envisioning cognitive ");
		lblEnviCog.setForeground(Color.RED);
		lblEnviCog.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEnviCog.setBounds(627, 49, 149, 28);
		panelAction.add(lblEnviCog);
		// -----------------------------------------------------------------
		// Envisioning cognitive combo BOx
		// JComboBox<String>
		comBxCogEnviCog = new JComboBox<String>();
		comBxCogEnviCog.setBounds(778, 51, 113, 28);
		comBxCogEnviCog.addItem("Level 0");
		comBxCogEnviCog.addItem("Level 1");
		comBxCogEnviCog.addItem("Level 2");
		comBxCogEnviCog.addItem("Level 3");
		comBxCogEnviCog.addItem("Level 4");
		comBxCogEnviCog.addItem("Level 5");
		panelAction.add(comBxCogEnviCog);
		setSelectOption(comBxCogEnviCog);
		guiComponentList.add(comBxCogEnviCog);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// ######################################################################################
		// ######################################################################################
		// Panel General
		// ######################################################################################
		// ######################################################################################
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// General capabilities Panel
		panelGeneral = new JPanel();
		panelGeneral.setBackground(new Color(192, 192, 192));
		panelGeneral.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "General Capabiliites", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.BLACK));
		panelGeneral.setBounds(1132, 469, 303, 114);
		RPframe.getContentPane().add(panelGeneral);
		panelGeneral.setLayout(null);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 1 decisional autonomy capabilities label
		JLabel lblautonomy = new JLabel("Decisional Autonomy");
		lblautonomy.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblautonomy.setBounds(6, 20, 153, 28);
		panelGeneral.add(lblautonomy);
		// -----------------------------------------------------------------
		// Un constrain Motion capabilities combo BOx
		// JComboBox<String>
		comBxAutonomy = new JComboBox<String>();
		comBxAutonomy.setBounds(181, 22, 113, 28);
		comBxAutonomy.addItem("Level 0");
		comBxAutonomy.addItem("Level 1");
		comBxAutonomy.addItem("Level 2");
		comBxAutonomy.addItem("Level 3");
		comBxAutonomy.addItem("Level 4");
		comBxAutonomy.addItem("Level 5");
		comBxAutonomy.addItem("Level 6");
		comBxAutonomy.addItem("Level 7");
		comBxAutonomy.addItem("Level 8");
		comBxAutonomy.addItem("Level 9");
		comBxAutonomy.addItem("Level 10");
		comBxAutonomy.addItem("Level 11");
		setSelectOption(comBxAutonomy);
		panelGeneral.add(comBxAutonomy);
		guiComponentList.add(comBxAutonomy);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 2 task adaptability capabilities label
		JLabel lblTaskAdapt = new JLabel("Task Adaptability");
		lblTaskAdapt.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTaskAdapt.setBounds(16, 43, 124, 28);
		panelGeneral.add(lblTaskAdapt);
		// -----------------------------------------------------------------
		// Constrain Motion capabilities combo BOx
		// JComboBox<String>
		comBxTaskAdapt = new JComboBox<String>();
		comBxTaskAdapt.setBounds(181, 45, 113, 28);
		comBxTaskAdapt.addItem("Level 0");
		comBxTaskAdapt.addItem("Level 1");
		comBxTaskAdapt.addItem("Level 2");
		comBxTaskAdapt.addItem("Level 3");
		comBxTaskAdapt.addItem("Level 4");
		setSelectOption(comBxTaskAdapt);
		panelGeneral.add(comBxTaskAdapt);
		guiComponentList.add(comBxTaskAdapt);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 3 System Dependabilites capabilities label
		JLabel lblSysDep = new JLabel("System Dependabilities");
		lblSysDep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSysDep.setBounds(16, 74, 164, 28);
		panelGeneral.add(lblSysDep);
		// -----------------------------------------------------------------
		// System Dependabilites combo BOx
		// JComboBox<String>
		comBxSysDepend = new JComboBox<String>();
		comBxSysDepend.setBounds(181, 76, 113, 28);
		comBxSysDepend.addItem("Level 0");
		comBxSysDepend.addItem("Level 1");
		comBxSysDepend.addItem("Level 2");
		comBxSysDepend.addItem("Level 3");
		comBxSysDepend.addItem("Level 4");
		comBxSysDepend.addItem("Level 5");
		comBxSysDepend.addItem("Level 6");
		comBxSysDepend.addItem("Level 7");
		setSelectOption(comBxSysDepend);
		panelGeneral.add(comBxSysDepend);
		guiComponentList.add(comBxSysDepend);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// ######################################################################################
		// #####################################################################################
		// Panel interaction
		// ######################################################################################
		// ######################################################################################
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Interaction capabilities Panel 14
		// JPanel
		panelInter = new JPanel();
		panelInter.setForeground(Color.BLACK);
		panelInter.setBounds(19, 488, 1084, 265);
		RPframe.getContentPane().add(panelInter);
		panelInter.setLayout(null);
		panelInter.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Interaction ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.BLACK));
		panelInter.setBackground(Color.LIGHT_GRAY);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 1 HRI Feed back
		JLabel lblHRIFB = new JLabel("HRI Feed back");
		lblHRIFB.setForeground(new Color(0, 128, 0));
		lblHRIFB.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblHRIFB.setBounds(836, 22, 114, 28);
		panelInter.add(lblHRIFB);
		// -----------------------------------------------------------------
		comBxSocHRIFB = new JComboBox<String>();
		comBxSocHRIFB.setBounds(944, 24, 114, 28);
		comBxSocHRIFB.addItem("Level 0");
		comBxSocHRIFB.addItem("Level 1");
		comBxSocHRIFB.addItem("Level 2");
		comBxSocHRIFB.addItem("Level 3");
		comBxSocHRIFB.addItem("Level 4");
		comBxSocHRIFB.addItem("Level 5");
		comBxSocHRIFB.addItem("Level 6");
		comBxSocHRIFB.addItem("Level 7");
		comBxSocHRIFB.addItem("Level 8");
		setSelectOption(comBxSocHRIFB);
		panelInter.add(comBxSocHRIFB);
		guiComponentList.add(comBxSocHRIFB);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 2 HRI model"
		JLabel lblHRIM = new JLabel("HRI model");
		lblHRIM.setForeground(new Color(0, 128, 0));
		lblHRIM.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblHRIM.setBounds(617, 87, 80, 28);
		panelInter.add(lblHRIM);
		// -----------------------------------------------------------------
		comBxSocHRIM = new JComboBox<String>();
		comBxSocHRIM.setBounds(697, 89, 127, 28);
		comBxSocHRIM.addItem("Level 0");
		comBxSocHRIM.addItem("Level 1");
		comBxSocHRIM.addItem("Level 2");
		comBxSocHRIM.addItem("Level 3");
		comBxSocHRIM.addItem("Level 4");
		comBxSocHRIM.addItem("Level 5");
		comBxSocHRIM.addItem("Level 6");
		setSelectOption(comBxSocHRIM);
		panelInter.add(comBxSocHRIM);
		guiComponentList.add(comBxSocHRIM);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 3 social human interaction levels of extenct
		JLabel lblInterLExt = new JLabel("Interaction extencts");
		lblInterLExt.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblInterLExt.setBounds(818, 132, 140, 28);
		panelInter.add(lblInterLExt);
		// -------------------------------------------------------------------------
		// JComboBox<String>
		comBxInterLExt = new JComboBox<String>();
		comBxInterLExt.setBounds(959, 134, 119, 28);
		comBxInterLExt.addItem("Level 0");
		comBxInterLExt.addItem("Level 1");
		comBxInterLExt.addItem("Level 2");
		comBxInterLExt.addItem("Level 3");
		comBxInterLExt.addItem("Level 4");
		comBxInterLExt.addItem("Level 5");
		comBxInterLExt.addItem("Level 6");
		comBxInterLExt.addItem("Level 7");
		setSelectOption(comBxInterLExt);
		panelInter.add(comBxInterLExt);
		guiComponentList.add(comBxInterLExt);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 4
		JLabel lblObjInter = new JLabel("Object Interaction");
		lblObjInter.setForeground(Color.BLUE);
		lblObjInter.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblObjInter.setBounds(19, 51, 140, 28);
		panelInter.add(lblObjInter);

		// JComboBox<String>
		comBxPhObjInterac = new JComboBox<String>();
		comBxPhObjInterac.setBounds(140, 53, 122, 28);
		comBxPhObjInterac.addItem("Level 0");
		comBxPhObjInterac.addItem("Level 1");
		comBxPhObjInterac.addItem("Level 2");
		comBxPhObjInterac.addItem("Level 3");
		comBxPhObjInterac.addItem("Level 4");
		comBxPhObjInterac.addItem("Level 5");
		comBxPhObjInterac.addItem("Level 6");
		comBxPhObjInterac.addItem("Level 7");
		setSelectOption(comBxPhObjInterac);
		panelInter.add(comBxPhObjInterac);
		guiComponentList.add(comBxPhObjInterac);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 5 Robot to robot interaction
		JLabel lblRTR = new JLabel("Robot to robot  ");
		lblRTR.setForeground(Color.RED);
		lblRTR.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblRTR.setBounds(297, 22, 114, 28);
		panelInter.add(lblRTR);
		// ---------------------------------------------------------------------
		// JComboBox<String>
		comBxCogR2R = new JComboBox<String>();
		comBxCogR2R.setBounds(401, 24, 99, 28);
		comBxCogR2R.addItem("Level 0");
		comBxCogR2R.addItem("Level 1");
		comBxCogR2R.addItem("Level 2");
		comBxCogR2R.addItem("Level 3");
		comBxCogR2R.addItem("Level 4");
		comBxCogR2R.addItem("Level 5");
		comBxCogR2R.addItem("Level 6");
		setSelectOption(comBxCogR2R);
		panelInter.add(comBxCogR2R);
		guiComponentList.add(comBxCogR2R);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 6 robot to system /devices interaction
		JLabel lblR2Sys = new JLabel("Robot to Sys");
		lblR2Sys.setForeground(Color.RED);
		lblR2Sys.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblR2Sys.setBounds(295, 51, 99, 28);

		panelInter.add(lblR2Sys);
		// ---------------------------------------------------------------------
		// JComboBox<String>
		comBxCogR2Sys = new JComboBox<String>();
		comBxCogR2Sys.setBounds(394, 60, 106, 28);
		comBxCogR2Sys.addItem("Level 0");
		comBxCogR2Sys.addItem("Level 1");
		comBxCogR2Sys.addItem("Level 2");
		comBxCogR2Sys.addItem("Level 3");
		comBxCogR2Sys.addItem("Level 4");
		comBxCogR2Sys.addItem("Level 5");
		setSelectOption(comBxCogR2Sys);
		panelInter.add(comBxCogR2Sys);
		guiComponentList.add(comBxCogR2Sys);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 7 Physical motion interaction
		JLabel lblPhyinter = new JLabel("Physical motion");
		lblPhyinter.setForeground(Color.BLUE);
		lblPhyinter.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblPhyinter.setBounds(19, 22, 114, 28);
		panelInter.add(lblPhyinter);
		// ---------------------------------------------------------------------
		// JComboBox<String>
		comBxPhyinter = new JComboBox<String>();
		comBxPhyinter.setBounds(140, 24, 122, 28);
		comBxPhyinter.addItem("Level 0");
		comBxPhyinter.addItem("Level 1");
		comBxPhyinter.addItem("Level 2");
		comBxPhyinter.addItem("Level 3");
		comBxPhyinter.addItem("Level 4");
		setSelectOption(comBxPhyinter);
		panelInter.add(comBxPhyinter);
		guiComponentList.add(comBxPhyinter);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 8 social cognitive interaction
		JLabel lblSoCogInter = new JLabel("Social Cognitive");
		lblSoCogInter.setForeground(new Color(0, 128, 0));
		lblSoCogInter.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSoCogInter.setBounds(836, 62, 114, 28);
		panelInter.add(lblSoCogInter);
		// ---------------------------------------------------------------------
		JComboBox<String> combBxSocCogInter = new JComboBox<String>();
		combBxSocCogInter.setBounds(946, 62, 112, 28);
		combBxSocCogInter.addItem("Level 0");
		combBxSocCogInter.addItem("Level 1");
		combBxSocCogInter.addItem("Level 2");
		combBxSocCogInter.addItem("Level 3");
		combBxSocCogInter.addItem("Level 4");
		setSelectOption(combBxSocCogInter);
		panelInter.add(combBxSocCogInter);
		guiComponentList.add(combBxSocCogInter);
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 9 social cognitive interaction with learning
		JLabel lblSoCogInterLearning = new JLabel("Social cognitive learning");
		lblSoCogInterLearning.setForeground(new Color(0, 128, 0));
		lblSoCogInterLearning.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSoCogInterLearning.setBounds(534, 22, 180, 28);
		panelInter.add(lblSoCogInterLearning);
		// ---------------------------------------------------------------------
		// JComboBox<String>
		comBxSocCogInterLearning = new JComboBox<String>();
		comBxSocCogInterLearning.setBounds(702, 24, 122, 28);
		comBxSocCogInterLearning.addItem("Level 0");
		comBxSocCogInterLearning.addItem("Level 1");
		comBxSocCogInterLearning.addItem("Level 2");
		comBxSocCogInterLearning.addItem("Level 3");
		setSelectOption(comBxSocCogInterLearning);
		panelInter.add(comBxSocCogInterLearning);
		guiComponentList.add(comBxSocCogInterLearning);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 10 HRI with cognitive ability
		JLabel lblHRICogAbility = new JLabel("HRI with cognitive");
		lblHRICogAbility.setForeground(new Color(0, 128, 0));
		lblHRICogAbility.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblHRICogAbility.setBounds(563, 51, 127, 28);
		panelInter.add(lblHRICogAbility);
		// ---------------------------------------------------------------------
		// JComboBox<String>
		comBxSocHRICogAbility = new JComboBox<String>();
		comBxSocHRICogAbility.setBounds(697, 53, 127, 28);
		comBxSocHRICogAbility.addItem("Level 0");
		comBxSocHRICogAbility.addItem("Level 1");
		comBxSocHRICogAbility.addItem("Level 2");
		comBxSocHRICogAbility.addItem("Level 3");
		comBxSocHRICogAbility.addItem("Level 4");
		comBxSocHRICogAbility.addItem("Level 5");
		comBxSocHRICogAbility.addItem("Level 6");
		comBxSocHRICogAbility.addItem("Level 7");
		setSelectOption(comBxSocHRICogAbility);
		panelInter.add(comBxSocHRICogAbility);
		guiComponentList.add(comBxSocHRICogAbility);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 11 HRI method of interaction
		JLabel lblMethInter = new JLabel("HRI method of interaction");
		lblMethInter.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblMethInter.setBounds(646, 168, 180, 28);
		panelInter.add(lblMethInter);
		// ---------------------------------------------------------------------
		// JComboBox<String>
		comBxHRIMethIner = new JComboBox<String>();
		comBxHRIMethIner.setBounds(679, 134, 127, 28);
		comBxHRIMethIner.addItem("Level 0");
		comBxHRIMethIner.addItem("Level 1");
		comBxHRIMethIner.addItem("Level 2");
		comBxHRIMethIner.addItem("Level 3");
		comBxHRIMethIner.addItem("Level 4");
		comBxHRIMethIner.addItem("Level 5");
		comBxHRIMethIner.addItem("Level 6");
		comBxHRIMethIner.addItem("Level 7");
		comBxHRIMethIner.addItem("Level 8");
		setSelectOption(comBxHRIMethIner);
		panelInter.add(comBxHRIMethIner);
		guiComponentList.add(comBxHRIMethIner);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 12 HR proximity
		JLabel lblprox = new JLabel("HR proximity");
		lblprox.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblprox.setBounds(573, 132, 99, 28);
		panelInter.add(lblprox);
		// ---------------------------------------------------------------------
		// JComboBox<String>
		comBxProx = new JComboBox<String>();
		comBxProx.setBounds(838, 172, 127, 28);
		comBxProx.addItem("Level 0");
		comBxProx.addItem("Level 1");
		comBxProx.addItem("Level 2");
		comBxProx.addItem("Level 3");
		comBxProx.addItem("Level 4");
		comBxProx.addItem("Level 5");
		comBxProx.addItem("Level 6");
		setSelectOption(comBxProx);
		panelInter.add(comBxProx);
		guiComponentList.add(comBxProx);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 13 Skill
		JLabel lblSkill = new JLabel("Skill");
		lblSkill.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblSkill.setBounds(16, 85, 47, 28);
		panelInter.add(lblSkill);

		
		txtOtherSkill = new JTextField();
		txtOtherSkill.setFont(new Font("Century", Font.PLAIN, 18));
		txtOtherSkill.setBounds(303, 211, 140, 28);
		txtOtherSkill.setColumns(10);
		txtOtherSkill.setVisible(false);
		panelInter.add(txtOtherSkill);

		// ---------------------------------------------------------------------
		JPanel paneSkill = new JPanel();
		paneSkill.setBounds(25, 117, 269, 140);
		panelInter.add(paneSkill);

		listModel = new DefaultListModel<>();
		JList<String> skillList = new JList<String>(listModel);
		updateSkillsList();
		JScrollPane listScroller = new JScrollPane(skillList);
		listScroller.setPreferredSize(new Dimension(250, 120));
		paneSkill.add(listScroller);
		
		
		skillList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				if (!event.getValueIsAdjusting()) {
					List<String> selectedValuesList = skillList.getSelectedValuesList();
					boolean isOtherSelected = false;
					for (String selected : selectedValuesList) {
						if (selected.equals("Other")) {
							isOtherSelected = true;
							break;
						}
					}
					if (isOtherSelected) {
						txtOtherSkill.setVisible(true);
					} else {
						txtOtherSkill.setVisible(false);
					}
				}
			}
		});

		guiComponentList.add(skillList);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		// 14 Intelligence
		JLabel lblIntelle = new JLabel("Intellegence");
		lblIntelle.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblIntelle.setBounds(475, 212, 92, 28);
		panelInter.add(lblIntelle);

		JPanel panelInt = new JPanel();
		panelInt.setBounds(573, 212, 485, 32);
		panelInter.add(panelInt);

		JCheckBox checkBoxInt1 = new JCheckBox("Social", false);
		panelInt.add(checkBoxInt1);

		JCheckBox checkBoxInt2 = new JCheckBox("Cognitive", false);
		panelInt.add(checkBoxInt2);

		JCheckBox checkBoxInt3 = new JCheckBox("Physical-Morphological", false);
		panelInt.add(checkBoxInt3);

		JCheckBox checkBoxInt4 = new JCheckBox("Collective", false);
		panelInt.add(checkBoxInt4);

		List<JCheckBox> cbgIntelle = new ArrayList<>();
		cbgIntelle.add(checkBoxInt1);
		cbgIntelle.add(checkBoxInt2);
		cbgIntelle.add(checkBoxInt3);
		cbgIntelle.add(checkBoxInt4);
		
		guiComponentList.add(cbgIntelle);

		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&& Search for Robot with specific capabilities
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 1 Best fit Scroll pane result
		JScrollPane BestFitResultScrollPane = new JScrollPane();
		BestFitResultScrollPane.setBounds(1132, 603, 290, 150);
		RPframe.getContentPane().add(BestFitResultScrollPane);
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// 2 Best fit text area
		JTextArea bestFitTextArea = new JTextArea();
		BestFitResultScrollPane.setViewportView(bestFitTextArea);
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// 3 Best fit Search button
		JButton btnSearchBestFitRobot = new JButton(" Search for robot ");
		btnSearchBestFitRobot.setBackground(SystemColor.activeCaption);
		btnSearchBestFitRobot.setForeground(new Color(204, 0, 0));
		btnSearchBestFitRobot.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSearchBestFitRobot.setBounds(16, 15, 170, 39);
		RPframe.getContentPane().add(btnSearchBestFitRobot);
		// --------------------------------------------------------------------------------
		btnSearchBestFitRobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// **************************************************************************************
				// **************************************************************************************
				// Button best fit with all action listener methods
				// **************************************************************************************
				// **************************************************************************************
				//  The sql statement query for all robots the result of the query is saved
				// Array List called "RobotObjectsresult". each row present robot type object.
				String query;
				// statem = "SELECT * FROM ROBOT ;";
				query = "SELECT * FROM ROB WHERE ";
				// Build WHERE statement

				for (int i = 0; i < columnNamesList.size(); i++) {
					String colName = columnNamesList.get(i);

					Object object = guiComponentList.get(i);
					if (object instanceof JComboBox) {
						JComboBox comboBox = (JComboBox) object;
						int selectedIndex = comboBox.getSelectedIndex();
						String selectedText = comboBox.getSelectedItem().toString();
						if (selectedText.equals(pleaseSelect))
							continue;
						System.out.println("ColName:" + colName + " Value:" + selectedIndex);
						query += "(" + colName + " = " + selectedIndex + ")";

					} else if (object instanceof ArrayList) {
						ArrayList<JCheckBox> lst = (ArrayList<JCheckBox>) object;
						String subQuery = "";
						int cnt = 0;
						for (JCheckBox chkBox : lst) {
							if (chkBox.isSelected()) {
								if (cnt != 0) {
									subQuery += ",";
								}
								subQuery += chkBox.getText();
								cnt++;
							}

						}
						query += "(" + colName + " = '" + subQuery + "')";

					} else if (object instanceof JList) {
						JList jList = (JList) object;
						List<String> lst = jList.getSelectedValuesList();
						String subQuery = "";
						int cnt = 0;
						for (String val : lst) {
							if (cnt != 0) {
								subQuery += ",";
							}
							subQuery += val;
							cnt++;
						}
						query += "(" + colName + " = '" + subQuery + "')";
					}

					if (i + 1 < columnNamesList.size()) {
						query += " AND ";
					} else {
						query += ";";
					}

				}
				System.out.println("query:" + query);

				List<Robots> robotObjectsresult = new ArrayList<Robots>();
				robotObjectsresult = q.getRobotsObjectList(query);

				// ******************************************************************************
				// 
				String robotName, S;
				// bestFitTextArea.append("-------------------------------------\n");
				   bestFitTextArea.append(" List of  Robots                       ");
				   bestFitTextArea.append("-------------------------------------\n");

				for (Robots robot : robotObjectsresult) {
					bestFitTextArea.append(robot.getRobotIdentity() + "\n");
				}

			}// action listener
		}); // end of action performed
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&& Best fit clear Search area
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// 4 Best fit clear Search area
			JButton btnClearList = new JButton("Clear list");
			btnClearList.setFont(new Font("Century", Font.BOLD, 14));
			btnClearList.setForeground(new Color(0, 0, 139));
			btnClearList.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					bestFitTextArea.setText("");
				}
			});
			btnClearList.setBounds(431, 16, 102, 37);
			RPframe.getContentPane().add(btnClearList);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&& Add Robot
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 5 Add Robot
		buttonADD = new JButton("New Robot");
		buttonADD.setForeground(new Color(204, 0, 0));
		buttonADD.setBackground(Color.WHITE);
		buttonADD.setFont(new Font("Dialog", Font.BOLD, 20));
		buttonADD.setBounds(1298, 13, 137, 35);
		RPframe.getContentPane().add(buttonADD);			

		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////	
		//	adding	Name lable  					
			lblName = new JLabel("Name");												// delete this line of code to erase the button Add Robot  25 Aug
			lblName.setFont(new Font("Century", Font.PLAIN, 20));						// delete this line of code to erase the button Add Robot  25 Aug
			lblName.setBounds(874, 16, 90, 37);											// delete this line of code to erase the button Add Robot  25 Aug
			RPframe.getContentPane().add(lblName);														// delete this line of code to erase the button Add Robot  25 Aug
			
			lblName.setVisible(false);

			
		///////////////////////////////////////////////////////////////////////////////////////////////////////	
		//	adding	JTextField for Name  to enter robot name via text box 
			txtName = new JTextField();													// delete this line of code to erase the button Add Robot  25 Aug
			txtName.setFont(new Font("Century", Font.PLAIN, 18));									// delete this line of code to erase the button Add Robot  25 Aug	
			txtName.setBounds(930, 16, 205, 37);													// delete this line of code to erase the button Add Robot  25 Aug
			txtName.setText("Enter name");															// delete this line of code to erase the button Add Robot  25 Aug
			txtName.setColumns(10);																	// delete this line of code to erase the button Add Robot  25 Aug	
			txtName.setVisible(true);																// delete this line of code to erase the button Add Robot  25 Aug												
			txtName.setBounds(950, 16, 102, 37);													// delete this line of code to erase the button Add Robot  25 Aug
			RPframe.getContentPane().add(txtName);	
			txtName.setVisible(false);	
			
		///////////////////////////////////////////////////////////////////////////////////////////////////////	
		//	adding	botton save 
			btnSave = new JButton("Save");		
			btnSave.setVisible(false);
			
		///////////////////////////////////////////////////////////////////////////////////////////////////////	
		//	
			
			
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// addActionListener for the robot buttonADD  
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
		buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							

				if (buttonADD.getText().equals("New Robot")) 
				{
					buttonADD.setText("Cancel");
					lblName.setVisible(true);
					txtName.setVisible(true);
					txtName.setText("");
					listModel.addElement("Other");
					txtOtherSkill.setVisible(true);
					btnSave.setVisible(true);
				} 
				
				else if (buttonADD.getText().equals("Cancel")) 
				{
					//cancelNewRobot();
					buttonADD.setText("New Robot");
					lblName.setVisible(false);
					txtName.setVisible(false);
					listModel.removeElement("Other");
					btnSave.setVisible(false);
				}
			}
		});
		
		
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// addActionListener for the robot btnSave procedure   
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%		
		
		
		btnSave.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				boolean isInsertValid = true;
				String query = "INSERT INTO ROB (name,"; // name is not in the colNameList, so add it first
				String colName = "";
				for (int i = 0; i < columnNamesList.size(); i++) {

					colName += columnNamesList.get(i);
					if (i + 1 != columnNamesList.size()) {
						colName += ",";
					}

				}
				colName += ") ";

				if (isTXTEmpty(txtName)) {
					printMessage("The name of the robot cannot be empty!");
				} else {

					query += colName + "VALUES ('" + txtName.getText() + "',";

					String values = "";
					outerLoop: for (int i = 0; i < guiComponentList.size(); i++) {
						String value = "";
						Object object = guiComponentList.get(i);
						if (object instanceof JComboBox) {
							JComboBox comboBox = (JComboBox) object;
							int selectedIndex = comboBox.getSelectedIndex();
							String selectedText = comboBox.getSelectedItem().toString();
							if (selectedText.equals(pleaseSelect))
								continue;
							value = String.valueOf(selectedIndex);
						} else if (object instanceof ArrayList) {
							ArrayList<JCheckBox> lst = (ArrayList<JCheckBox>) object;
							String subQuery = "'";
							int cnt = 0;
							for (JCheckBox chkBox : lst) {
								if (chkBox.isSelected()) {
									if (cnt != 0) {
										subQuery += ",";
									}
									subQuery += chkBox.getText();
									cnt++;
								}

							}
							value = subQuery + "'";

						} else if (object instanceof JList) {
							JList jList = (JList) object;
							List<String> lst = jList.getSelectedValuesList();
							String subQuery = "'";
							int cnt = 0;
							for (String val : lst) {
								if (cnt != 0) {
									subQuery += ",";
								}
								// if the other is selected, there will be a new skill not exits in the SKILLS
								// table.
								// Hence, this skill to the ROBOT feature set, also add it to SKILLS table.
								if (val.equals("Other")) {
									String otherSkill = txtOtherSkill.getText();
									if (otherSkill.isEmpty()) {
										printMessage("You have selected 'Other' skills. Please provide a skill name!");
										isInsertValid = false;
										break outerLoop;
									} else {
										subQuery += otherSkill;
										saveNewSkill(otherSkill);
									}

								} else {
									subQuery += val;
								}
								cnt++;
							}
							value = subQuery + "'";
						}
						if (i + 1 < guiComponentList.size()) {
							values += value + ",";
						} else {
							values += value;
						}

					}
					query += values + ");";
					
					insertvalue = query;                  
					//System.out.println( "query value "+ query);
					//System.out.println( "query value second varioable  "+ insertvalue);
					
					if (isInsertValid) {
						if(q.insertRecord(query)) {
							insertSuccessful();
							
						}
					}
				}
				
			} // actionPerformed
		});
		
		
		
		btnSave.setBounds(993, 765, 117, 29);
		RPframe.getContentPane().add(btnSave);
		
		lblMessage = new JLabel("message");
		lblMessage.setForeground(Color.RED);
		lblMessage.setBounds(122, 720, 470, 323);
		lblMessage.setVisible(true);
		RPframe.getContentPane().add(lblMessage);
	//	lblMessage.setText(insertvalue);
		

} // end of initialise method

	
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// Procedures used for adding new robot 
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
		/**
		 *  successfully adding new robot
		 */
		
		protected void insertSuccessful() {
			buttonADD.doClick();
			updateSkillsList();	
			//lblMessage.setText(insertvalue);
	
			  int response = JOptionPane.showConfirmDialog( null,"Please verify the values of the new robot " , "Adding a robot Confirm", 
					  JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); 
			 if (response == JOptionPane.NO_OPTION) 
			 {
				 System.out.println("modify the values, and try again ");
				 txtrRobotInfo.setText(" modify the values, and try again ");
				 btnSave.setEnabled(false); 
				 AddRob = null;
			} 
			else if (response == JOptionPane.YES_OPTION) 
			{ 
				System.out.println("Yes button clicked");

				btnSave.setEnabled(true); 
				AddRob = new Robots();						// has to be filled, if needed 
				AddRob.setID(100); 
				lblMessage.setText("");

			} 
			else if (response ==  JOptionPane.CLOSED_OPTION)
			{ 	System.out.println("JOptionPane closed");
				txtrRobotInfo.setText("JOptionPane closed"); 
				btnSave.setEnabled(false); 
			} 
			
			
			
			JOptionPane.showMessageDialog(null, "New robot added successfully." , "Info",JOptionPane.INFORMATION_MESSAGE);   
		}
	
		private void updateSkillsList() {
			listModel.removeAllElements();
			List<String> skills = q.getRobotSkills();
			for (String skill : skills) {
				listModel.addElement(skill);
			}
		}

		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// Add skill
		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	

	/**
	 * Add the new skills to the SKILL Table
	 * 
	 * @param otherSkill
	 */
	protected void saveNewSkill(String otherSkill) {
		String[] skills = otherSkill.split(",");
		for (int i = 0; i < skills.length; i++) {
			String skill = skills[i].trim();
			if (!skill.isEmpty()) {
				String query = "INSERT INTO SKILL (SkillName) VALUES ('" + skill + "');";
				q.insertRecord(query);
			}
		}
	}

	protected void printMessage(String message) {
		lblMessage.setVisible(true);
		lblMessage.setText(message);
		JOptionPane.showMessageDialog(null, message , "Error",JOptionPane.ERROR_MESSAGE);
	}

	protected boolean isTXTEmpty(JTextField txtField) {
		return txtField.getText().isEmpty();
	}

	/**
	 * @param pleaseSelect
	 */
	private void setSelectOption(JComboBox<String> cmb) {
		cmb.addItem(pleaseSelect);
//		cmb.setSelectedItem(pleaseSelect);
		cmb.setSelectedIndex(1);
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// Launch the Robot application.
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	
	public static void main(String[] args) {

		//////////////////////////////////////////////////////////////////////////////////////////////
		//// Splash screen
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
		JWindow w = new JWindow();
		w.getContentPane().add(new JLabel("Splash Screen",
			//	new ImageIcon("/Users/mlinjawi/eclipse-workspace/RobotCapabilities/ToRCH-1.png"),SwingConstants.CENTER));
				new ImageIcon("./ToRCH.png"), SwingConstants.CENTER));
		w.setBounds(250, 0, 820, 700);
		w.setVisible(true);
		try {
			Thread.sleep(4000); 
		} catch (InterruptedException e) {
			w.dispose();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Running the application
		//////////////////////////////////////////////////////////////////////////////////////////////
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					RobotCapabilities window = new RobotCapabilities();
					window.RPframe.setVisible(true);
					w.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
} // end of class RobotCapabilities
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

