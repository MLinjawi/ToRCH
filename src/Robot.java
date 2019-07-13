import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultListModel;

//import Controller.AddRobot;
import Controller.Query;
import Model.Robots;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class Robot 
{
	
	
//	private JFrame frame;
//	Controller.Query q = new Query();
//	Controller.AddRobot AR = new AddRobot();
//	private JTextField txtname;
//	private JTextArea txtrRobotInfo;
//	Robots AddRob ;
//	/**
//	 * Launch the Robot application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Robot window = new Robot();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//	/**Create the application run point */
//	public Robot()
//	{	initialize();		}
}	
//	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//	/***** Initialize the contents of the frame.*****/
//	private void initialize()
//	{
//		frame = new JFrame();
//		frame.getContentPane().setBackground(new Color(255, 250, 205));
//		frame.setBounds(100, 10, 1483, 1022);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//
//		JLabel lblNewLabel = new JLabel("Framework for Characterizing Social Robots  F.C.S.R.   V6");
//		lblNewLabel.setForeground(new Color(165, 42, 42));
//		lblNewLabel.setFont(new Font("Century", Font.BOLD, 40));
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setBounds(34, 0, 1307, 70);
//		frame.getContentPane().add(lblNewLabel);
//		//######################################################################################
//		//######################################################################################
//		// Panel Mechanical intelligence with all its properties
//		//######################################################################################
//		//######################################################################################
//				JPanel panelMech = new JPanel();
//				panelMech.setBackground(new Color(192, 192, 192));
//				panelMech.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Morphological intelligence requirement ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 255)));
//				panelMech.setBounds(34, 67, 1307, 182);
//				frame.getContentPane().add(panelMech);
//				panelMech.setLayout(null);
//				//######################################################################################
//				//	1	JCheckBox cbMobility = new JCheckBox("Mobility");
//				//		cbMobility.setBackground(Color.LIGHT_GRAY);
//				//		cbMobility.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				//		cbMobility.setBounds(52, 47, 110, 25);
//				//		panelMech.add(cbMobility);		
//						//-----------------------------------------------------------------
//						JSlider sldMobility = new JSlider();
//						sldMobility.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldMobility.setPaintLabels(true);
//						sldMobility.setValue(5);
//						sldMobility.setToolTipText("value form 0 to 10.");
//						sldMobility.setMaximum(10);
//						sldMobility.setBounds(74, 51, 200, 58);
//						sldMobility.setMajorTickSpacing(10);
//						sldMobility.setMinorTickSpacing(1);
//						sldMobility.setPaintTicks(true);
//						panelMech.add(sldMobility);
//						//-----------------------------------------------------------------
//						JLabel lblMobility = new JLabel("Mobility");
//						lblMobility.setFont(new Font("Century", Font.PLAIN, 20));
//						lblMobility.setBounds(74, 23, 86, 26);
//						panelMech.add(lblMobility);
//						//-----------------------------------------------------------------
//						JSlider sldWaightMobility = new JSlider();
//						sldWaightMobility.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightMobility.setPaintLabels(true);
//						sldWaightMobility.setValue(5);
//						sldWaightMobility.setToolTipText("value form 1 to 10.");
//						sldWaightMobility.setMaximum(10);
//						sldWaightMobility.setBounds(74, 123, 200, 49);//
//						sldWaightMobility.setMajorTickSpacing(10);
//						sldWaightMobility.setMinorTickSpacing(1);
//						sldWaightMobility.setPaintTicks(true);
//						panelMech.add(sldWaightMobility);
//				//###################################################################################### 
//				//	2	JCheckBox cbManipolation = new JCheckBox("Manipulation");
//				//		cbManipolation.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				//		cbManipolation.setBackground(Color.LIGHT_GRAY);
//				//		cbManipolation.setBounds(330, 47, 155, 25);
//				//		panelMech.add(cbManipolation);		
//						//-----------------------------------------------------------------
//						JSlider sldManip = new JSlider();
//						sldManip.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "User requirement", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldManip.setPaintLabels(true);
//						sldManip.setValue(5);
//						sldManip.setToolTipText("value form 0 to 10.");
//						sldManip.setMinimum(0);
//						sldManip.setMaximum(10);
//						sldManip.setBounds(409, 51, 200, 58);//
//						sldManip.setMajorTickSpacing(10);
//						sldManip.setMinorTickSpacing(1);
//						sldManip.setPaintTicks(true);
//						panelMech.add(sldManip);
//						//-----------------------------------------------------------------
//						JLabel lblManip= new JLabel("Manipulation");
//						lblManip.setFont(new Font("Century", Font.PLAIN, 20));
//						lblManip.setBounds(431, 23, 134, 26);
//						panelMech.add(lblManip);
//						//-----------------------------------------------------------------
//						JSlider sldWaightManipulation = new JSlider();
//						sldWaightManipulation.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightManipulation.setPaintLabels(true);
//						sldWaightManipulation.setValue(5);
//						sldWaightManipulation.setToolTipText("value form 1 to 10.");
//						sldWaightManipulation.setMaximum(10);
//						sldWaightManipulation.setBounds(409, 123, 200, 49);//
//						sldWaightManipulation.setMajorTickSpacing(10);
//						sldWaightManipulation.setMinorTickSpacing(1);
//						sldWaightManipulation.setPaintTicks(true);
//						panelMech.add(sldWaightManipulation);
//						
//				//######################################################################################
//				// 	3	JCheckBox cbEmbodiment = new JCheckBox("Embodiment ");
//				// 		cbEmbodiment.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				// 		cbEmbodiment.setBackground(Color.LIGHT_GRAY);
//				// 		cbEmbodiment.setBounds(367, 74, 147, 25);
//				// 		panel.add(cbEmbodiment);
//						//-----------------------------------------------------------------
//						JSlider sldEmbod = new JSlider();
//						sldEmbod.setBorder(new TitledBorder(null, "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
//						sldEmbod.setPaintLabels(true);
//						sldEmbod.setValue(5);
//						sldEmbod.setToolTipText("value form 0 to 10.");
//						sldEmbod.setMinimum(0);
//						sldEmbod.setMaximum(10);
//						sldEmbod.setBounds(753, 51, 200, 58);//
//						sldEmbod.setMajorTickSpacing(10);
//						sldEmbod.setMinorTickSpacing(1);
//						sldEmbod.setPaintTicks(true);
//						panelMech.add(sldEmbod);
//						//-----------------------------------------------------------------
//						JLabel lblEmboidment = new JLabel("Embodiment");
//						lblEmboidment.setFont(new Font("Century", Font.PLAIN, 20));
//						lblEmboidment.setBounds(753, 23, 127, 26);
//						panelMech.add(lblEmboidment);
//						//-----------------------------------------------------------------	
//						JSlider sldWaightEmbodiment = new JSlider();
//						sldWaightEmbodiment.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightEmbodiment.setPaintLabels(true);
//						sldWaightEmbodiment.setValue(5);
//						sldWaightEmbodiment.setToolTipText("value form 1 to 10.");
//						sldWaightEmbodiment.setMaximum(10);
//						sldWaightEmbodiment.setBounds(753, 123,  200, 49);//
//						sldWaightEmbodiment.setMajorTickSpacing(10);
//						sldWaightEmbodiment.setMinorTickSpacing(1);
//						sldWaightEmbodiment.setPaintTicks(true);
//						panelMech.add(sldWaightEmbodiment);
//				//######################################################################################
//				//	4	JCheckBox cbProxInter = new JCheckBox("Proximity interaction");
//				//		cbProxInter.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				//		cbProxInter.setBackground(Color.LIGHT_GRAY);
//				//		cbProxInter.setBounds(808, 74, 219, 25);
//				//		panelMech.add(cbProxInter);
//						//-----------------------------------------------------------------
//						JSlider sldProxInter = new JSlider();
//						sldProxInter.setBorder(new TitledBorder(null, "User requirement", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
//						sldProxInter.setPaintLabels(true);
//						sldProxInter.setValue(5);
//						sldProxInter.setToolTipText("value form 0 to 10.");
//						sldProxInter.setMinimum(0);
//						sldProxInter.setMaximum(10);
//						sldProxInter.setBounds(1076, 51, 200, 58);//
//						sldProxInter.setMajorTickSpacing(10);
//						sldProxInter.setMinorTickSpacing(1);
//						sldProxInter.setPaintTicks(true);
//						panelMech.add(sldProxInter);
//						//-----------------------------------------------------------------
//						JLabel lblProxInter= new JLabel("Proximal interaction");
//						lblProxInter.setFont(new Font("Century", Font.PLAIN, 20));
//						lblProxInter.setBounds(1076, 21, 200, 30);
//						panelMech.add(lblProxInter);
//						//-----------------------------------------------------------------
//						JSlider sldWaightProximity = new JSlider();			
//						sldWaightProximity.setBorder(new TitledBorder(null, "Weight ", TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM, null, null));
//						sldWaightProximity.setPaintLabels(true);
//						sldWaightProximity.setValue(5);
//						sldWaightProximity.setToolTipText("value form 1 to 10.");
//						sldWaightProximity.setMaximum(10);
//						sldWaightProximity.setBounds(1076, 123,  200, 49);//
//						sldWaightProximity.setMajorTickSpacing(10);
//						sldWaightProximity.setMinorTickSpacing(1);
//						sldWaightProximity.setPaintTicks(true);
//						panelMech.add(sldWaightProximity);
//		//######################################################################################
//		//######################################################################################
//		// Panel Abstract intelligence with all its properties
//		//######################################################################################
//		//######################################################################################
//				JPanel panelAbst = new JPanel();
//				panelAbst.setLayout(null);
//				panelAbst.setBorder( new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cognitive intelligence requirement ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 255)));
//				panelAbst.setBackground(Color.LIGHT_GRAY);
//				panelAbst.setBounds(34, 267, 970, 175);
//				frame.getContentPane().add(panelAbst);
//				//######################################################################################
//				//	5	JCheckBox cbIdentifying = new JCheckBox("Identifying");
//				//		cbIdentifying.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				//		cbIdentifying.setBackground(Color.LIGHT_GRAY);
//				//		cbIdentifying.setBounds(33, 35, 171, 25);
//				//		panelAbst.add(cbIdentifying);
//						//-----------------------------------------------------------------
//						JSlider sldIdent = new JSlider();	
//						sldIdent.setBorder(new TitledBorder(null, "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
//						sldIdent.setPaintLabels(true);
//						sldIdent.setValue(5);
//						sldIdent.setToolTipText("value form 0 to 10.");
//						sldIdent.setMinimum(0);
//						sldIdent.setMaximum(10);
//						sldIdent.setBounds(79, 42, 200, 61);//
//						sldIdent.setMajorTickSpacing(10);
//						sldIdent.setMinorTickSpacing(1);
//						sldIdent.setPaintTicks(true);
//						panelAbst.add(sldIdent);
//						//-----------------------------------------------------------------
//						JLabel lblIdent= new JLabel("Identifying");
//						lblIdent.setBounds(79, 14, 121, 26);
//						panelAbst.add(lblIdent);
//						lblIdent.setFont(new Font("Century", Font.PLAIN, 20));
//						//-----------------------------------------------------------------
//						JSlider sldWaightIdentify = new JSlider();
//						sldWaightIdentify.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightIdentify.setPaintLabels(true);
//						sldWaightIdentify.setValue(5);
//						sldWaightIdentify.setToolTipText("value form 1 to 10.");
//						sldWaightIdentify.setMaximum(10);
//						sldWaightIdentify.setBounds(79, 111, 200, 52);
//						sldWaightIdentify.setMajorTickSpacing(10);
//						sldWaightIdentify.setMinorTickSpacing(1);
//						sldWaightIdentify.setPaintTicks(true);
//						panelAbst.add(sldWaightIdentify);
//				//######################################################################################
//				//	6	JCheckBox cbLearn = new JCheckBox("Learn"); # cbLearn.setFont(new
//				//		Font("Tahoma", Font.PLAIN, 20)); #
//				//		cbLearn.setBackground(Color.LIGHT_GRAY); # cbLearn.setBounds(796, 67,
//				//		150, 25); # panel_1.add(cbLearn);
//						//-----------------------------------------------------------------
//						JSlider sldLearn = new JSlider();
//						sldLearn.setBorder(new TitledBorder(null, "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
//						sldLearn.setPaintLabels(true);
//						sldLearn.setValue(5);
//						sldLearn.setToolTipText("value form 0 to 10.");
//						sldLearn.setMinimum(0);
//						sldLearn.setMaximum(10);
//						sldLearn.setBounds(405, 41,  200, 61);//
//						sldLearn.setMajorTickSpacing(10);
//						sldLearn.setMinorTickSpacing(1);
//						sldLearn.setPaintTicks(true);
//						panelAbst.add(sldLearn);
//						//-----------------------------------------------------------------
//						JLabel lblLearn = new JLabel("Learn");
//						lblLearn.setFont(new Font("Century", Font.PLAIN, 20));
//						lblLearn.setBounds(459, 14, 106, 25);
//						panelAbst.add(lblLearn);
//						//-----------------------------------------------------------------
//						JSlider sldWaightLearn = new JSlider();
//						sldWaightLearn.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightLearn.setPaintLabels(true);
//						sldWaightLearn.setValue(5);
//						sldWaightLearn.setToolTipText("value form 1 to 10.");
//						sldWaightLearn.setMaximum(10);
//						sldWaightLearn.setBounds(405, 110, 200, 52);
//						sldWaightLearn.setMajorTickSpacing(10);
//						sldWaightLearn.setMinorTickSpacing(1);
//						sldWaightLearn.setPaintTicks(true);
//						panelAbst.add(sldWaightLearn);	
//				//######################################################################################
//				//	7	JCheckBox cbAimAndGoal = new JCheckBox("Aims and goals");
//				//		cbAimAndGoal.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				//		cbAimAndGoal.setBackground(Color.LIGHT_GRAY);
//				//		cbAimAndGoal.setBounds(802, 55, 210, 25);
//				//		panelAbst.add(cbAimAndGoal);
//						//-----------------------------------------------------------------
//						JSlider sldAims = new JSlider();
//						sldAims.setBorder(new TitledBorder(null, "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
//						sldAims.setPaintLabels(true);
//						sldAims.setValue(5);
//						sldAims.setToolTipText("value form 0 to 10.");
//						sldAims.setMinimum(0);
//						sldAims.setMaximum(10);
//						sldAims.setBounds(751, 40,  200, 61);//
//						sldAims.setMajorTickSpacing(10);
//						sldAims.setMinorTickSpacing(1);
//						sldAims.setPaintTicks(true);
//						panelAbst.add(sldAims);
//						//-----------------------------------------------------------------
//						JLabel lblAims = new JLabel("Aims and goals");
//					    lblAims.setFont(new Font("Century", Font.PLAIN, 20));
//						lblAims.setBounds(773, 13, 190, 25);
//						panelAbst.add(lblAims);	
//						//-----------------------------------------------------------------
//						JSlider sldWaightAimandGoal = new JSlider();
//						sldWaightAimandGoal.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightAimandGoal.setPaintLabels(true);
//						sldWaightAimandGoal.setValue(5);
//						sldWaightAimandGoal.setToolTipText("value form 1 to 10.");
//						sldWaightAimandGoal.setMaximum(10);
//						sldWaightAimandGoal.setBounds(751, 109, 200, 52);
//						sldWaightAimandGoal.setMajorTickSpacing(10);
//						sldWaightAimandGoal.setMinorTickSpacing(1);
//						sldWaightAimandGoal.setPaintTicks(true);	
//						panelAbst.add(sldWaightAimandGoal);
//		//######################################################################################
//		//######################################################################################
//		// Panel Social intelligence with all its properties
//		//######################################################################################
//		//######################################################################################				
//				JPanel panelSocial = new JPanel();
//				panelSocial.setBounds(29, 455, 1312, 182);
//				frame.getContentPane().add(panelSocial);
//				panelSocial.setLayout(null);
//				panelSocial.setBorder( new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Social intelligence requirement ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 255)));
//				panelSocial.setBackground(Color.LIGHT_GRAY);
//				//######################################################################################
//				//	8	JCheckBox cbInterStructure = new JCheckBox("Social interaction structure");
//				//		cbInterStructure.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				//		cbInterStructure.setBackground(Color.LIGHT_GRAY);
//				//		cbInterStructure.setBounds(31, 60, 285, 25);
//				//		panelSocial.add(cbInterStructure);
//						//-----------------------------------------------------------------
//						JSlider sldInterStructure = new JSlider();
//						sldInterStructure.setBorder(new TitledBorder(null, "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
//						sldInterStructure.setPaintLabels(true);
//						sldInterStructure.setValue(5);
//						sldInterStructure.setToolTipText("value form 0 to 10.");
//						sldInterStructure.setMinimum(0);
//						sldInterStructure.setMaximum(10);
//						sldInterStructure.setBounds(74, 49, 200, 60);//
//						sldInterStructure.setMajorTickSpacing(10);
//						sldInterStructure.setMinorTickSpacing(1);
//						sldInterStructure.setPaintTicks(true);
//						panelSocial.add(sldInterStructure);
//						//-----------------------------------------------------------------
//						JLabel lblInterStructure = new JLabel("Social structure");
//						lblInterStructure.setFont(new Font("Century", Font.PLAIN, 20));
//						lblInterStructure.setBounds(75, 20, 188, 25);
//						panelSocial.add(lblInterStructure);
//						//-----------------------------------------------------------------
//						JSlider sldWaightSocialstructure = new JSlider();
//						sldWaightSocialstructure.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightSocialstructure.setPaintLabels(true);
//						sldWaightSocialstructure.setValue(5);
//						sldWaightSocialstructure.setToolTipText("value form 1 to 10.");
//						sldWaightSocialstructure.setMaximum(10);
//						sldWaightSocialstructure.setBounds(74, 118,  200, 51);//
//						sldWaightSocialstructure.setMajorTickSpacing(10);
//						sldWaightSocialstructure.setMinorTickSpacing(1);
//						sldWaightSocialstructure.setPaintTicks(true);
//						panelSocial.add(sldWaightSocialstructure);
//				//######################################################################################		
//				//	9	JCheckBox cbSocialcommunication = new JCheckBox("Capabilities of social communication");
//				//		cbSocialcommunication.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				//		cbSocialcommunication.setBackground(Color.LIGHT_GRAY));
//				//		cbSocialcommunication.setBounds(331, 60, 354, 25);
//				//		panelSocial.add(cbSocialcommunication);
//						//-----------------------------------------------------------------
//						JSlider sldSocialcommunication = new JSlider();
//						sldSocialcommunication.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldSocialcommunication.setPaintLabels(true);
//						sldSocialcommunication.setValue(5);
//						sldSocialcommunication.setToolTipText("value form 0 to 10.");
//						sldSocialcommunication.setMinimum(0);
//						sldSocialcommunication.setMaximum(10);
//						sldSocialcommunication.setBounds(399, 49, 200, 60);//
//						sldSocialcommunication.setMajorTickSpacing(10);
//						sldSocialcommunication.setMinorTickSpacing(1);
//						sldSocialcommunication.setPaintTicks(true);
//						panelSocial.add(sldSocialcommunication);
//						//-----------------------------------------------------------------
//						JLabel lblSocialcommunication = new JLabel("Communicate socialy ");
//						lblSocialcommunication.setFont(new Font("Century", Font.PLAIN, 20));
//						lblSocialcommunication.setBounds(399, 20, 214, 25);
//						panelSocial.add(lblSocialcommunication);
//						//-----------------------------------------------------------------
//						JSlider sldWaightCommunicateSocialy = new JSlider();						
//						sldWaightCommunicateSocialy.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightCommunicateSocialy.setPaintLabels(true);
//						sldWaightCommunicateSocialy.setValue(5);
//						sldWaightCommunicateSocialy.setToolTipText("value form 1 to 10.");
//						sldWaightCommunicateSocialy.setMaximum(10);
//						sldWaightCommunicateSocialy.setBounds(399, 118,  200, 51);//
//						sldWaightCommunicateSocialy.setMajorTickSpacing(10);
//						sldWaightCommunicateSocialy.setMinorTickSpacing(1);
//						sldWaightCommunicateSocialy.setPaintTicks(true);
//						panelSocial.add(sldWaightCommunicateSocialy);
//				//######################################################################################			
//				//	 10 JCheckBox cbBehaviour = new JCheckBox("Behavior");
//				//		cbBehaviour.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				//		cbBehaviour.setBackground(Color.LIGHT_GRAY);
//				//		cbBehaviour.setBounds(734, 60, 127, 25);
//				//		panelSocial.add(cbBehaviour);
//						//-----------------------------------------------------------------
//					    JSlider sldBehavior = new JSlider();
//					    sldBehavior.setBorder(new TitledBorder(null, "User requirement", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
//					    sldBehavior.setPaintLabels(true);
//					    sldBehavior.setValue(5);
//					    sldBehavior.setToolTipText("value form 0 to 10.");
//					    sldBehavior.setMinimum(0);
//					    sldBehavior.setMaximum(10);
//					    sldBehavior.setBounds(752, 49, 200, 60);//
//					    sldBehavior.setMajorTickSpacing(10);
//					    sldBehavior.setMinorTickSpacing(1);
//					    sldBehavior.setPaintTicks(true);
//						panelSocial.add(sldBehavior);
//						//-----------------------------------------------------------------
//						JLabel lblBehavior = new JLabel("Behavior");
//						lblBehavior.setFont(new Font("Century", Font.PLAIN, 20));
//						lblBehavior.setBounds(782, 20, 169, 25);
//						panelSocial.add(lblBehavior);
//						//-----------------------------------------------------------------
//						JSlider sldWaightBehavior = new JSlider();	
//						sldWaightBehavior.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightBehavior.setPaintLabels(true);
//						sldWaightBehavior.setValue(5);
//						sldWaightBehavior.setToolTipText("value form 1 to 10.");
//						sldWaightBehavior.setMaximum(10);
//						sldWaightBehavior.setBounds(752, 118,  200, 51);//
//						sldWaightBehavior.setMajorTickSpacing(10);
//						sldWaightBehavior.setMinorTickSpacing(1);
//						sldWaightBehavior.setPaintTicks(true);
//						panelSocial.add(sldWaightBehavior);
//				//######################################################################################	
//				//	11	JCheckBox cbEmotion = new JCheckBox("Emotion");
//				//		cbEmotion.setFont(new Font("Tahoma", Font.PLAIN, 20));
//				//		cbEmotion.setBackground(Color.LIGHT_GRAY);
//				//		cbEmotion.setBounds(929, 60, 127, 25);
//				//		panelSocial.add(cbEmotion);
//						//-----------------------------------------------------------------
//						JSlider sldSEmotion = new JSlider();
//						sldSEmotion.setBorder(new TitledBorder(null, "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
//						sldSEmotion.setPaintLabels(true);
//						sldSEmotion.setValue(5);
//						sldSEmotion.setToolTipText("value form 0 to 10.");
//						sldSEmotion.setMinimum(0);
//						sldSEmotion.setMaximum(10);
//						sldSEmotion.setBounds(1100, 49, 200, 60);//
//						sldSEmotion.setMajorTickSpacing(10);
//						sldSEmotion.setMinorTickSpacing(1);
//						sldSEmotion.setPaintTicks(true);
//						panelSocial.add(sldSEmotion);
//						//-----------------------------------------------------------------
//					    JLabel lblEmotion = new JLabel("Emotion");
//						lblEmotion.setFont(new Font("Century", Font.PLAIN, 20));
//						lblEmotion.setBounds(1134, 20, 161, 25);
//						panelSocial.add(lblEmotion);
//						//-----------------------------------------------------------------
//						JSlider sldWaightEmotion = new JSlider();
//						sldWaightEmotion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
//						sldWaightEmotion.setPaintLabels(true);
//						sldWaightEmotion.setValue(5);
//						sldWaightEmotion.setToolTipText("value form 1 to 10.");
//						sldWaightEmotion.setMaximum(10);
//						sldWaightEmotion.setBounds(1100, 118,  200, 51);
//						sldWaightEmotion.setMajorTickSpacing(10);
//						sldWaightEmotion.setMinorTickSpacing(1);
//						sldWaightEmotion.setPaintTicks(true);
//						panelSocial.add(sldWaightEmotion);
//						
//		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//		//&&&&&&&&&&&&&&&&    Search for Robot by type 
//		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
//				//	1   Best fit Scrol pane result 
//						JScrollPane BestFitResultScrollPane = new JScrollPane();
//						BestFitResultScrollPane.setBounds(940, 650, 420, 300);
//						frame.getContentPane().add(BestFitResultScrollPane);
//				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
//				//	2   Best fit text area 
//						JTextArea BestFitTextArea = new JTextArea();
//						BestFitResultScrollPane.setViewportView(BestFitTextArea);
//				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
//				//	3   Best fit  Search button 
//						JButton btnSearchBestFitRobot = new JButton(" Search for best fit");
//						btnSearchBestFitRobot.setHorizontalAlignment(SwingConstants.RIGHT);
//						btnSearchBestFitRobot.setBackground(SystemColor.activeCaption);
//						btnSearchBestFitRobot.setForeground(new Color(204, 0, 0));
//						btnSearchBestFitRobot.setFont(new Font("Century", Font.BOLD, 28));
//						btnSearchBestFitRobot.setBounds(1022, 262, 319, 93);
//						frame.getContentPane().add(btnSearchBestFitRobot); 
//				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//						btnSearchBestFitRobot.addActionListener(new ActionListener() 
//						{ public void actionPerformed(ActionEvent arg0) 
//							{//**************************************************************************************
//							//**************************************************************************************
//							// Button best fit with all action listener methods 
//							//**************************************************************************************
//							//**************************************************************************************
//							// Step1    The sql statement query for all robots the result of the query is saved Array List called "RobotObjectsresult". each row present robot type object. 
//								String statem;
//								statem = "SELECT * FROM ROBOT ;";
//								List<Robots> RobotObjectsresult = new ArrayList<Robots>();
//								RobotObjectsresult = q.getRobotsObjectList(statem);
//							//*******************************************************************************
//							// Step2 	A hash map is defined "robotValue" as Map<Integer, Integer>. the map contain  all the robot object in the RobotObjectsresult.
//							// 		The first column known as map key that present the ID and the second column present the robot goodness value calculated according to the requested value
//								Map<Integer, Integer> robotGoodnessValues = new HashMap<Integer, Integer>();
//							//******************************************************************************
//							// Step3 	The calculation is performed with the least square fitting techniques since it is the simplest and most common solution
//							// 		for finding the best robot fit for the required user value. 
//							// 		for each robot value a calculation is performed as 
//							//      F presenting the factors and their are  11 factors       
//							//      Requested user dimension 	RU	from 0-10
//							//		Calculated robot dimension 	CR	from 0-10
//							//		Dimension weight 			W 	is equivalent for these basic properties 
//							//		Argument R (Goodness)  = Sum of all dimensions (W (RU - CR)^2);
//							// 		iterating thought the RobotObjectsresult Array List to calculate their Goodness through the best fit technique 
//							// 		known also as Least Square Method and present them in best fir order
//								for (Robots robots : RobotObjectsresult) 
//								{ int Goodness = (int) 
//									(	(Math.pow((robots.getmobile()			-   sldMobility.getValue()	) 	, 2	)* sldWaightMobility.getValue())
//									+ 	(Math.pow((robots.getmanipulating()		-	sldManip.getValue()	)       , 2	)* sldWaightManipulation.getValue())
//									+	(Math.pow((robots.getembodiment()		-   sldEmbod.getValue()	) 		, 2	)* sldWaightEmbodiment.getValue())
//									+  	(Math.pow((robots.getproximity_inter()	-	sldProxInter.getValue())    , 2	)* sldWaightProximity.getValue())
//									+ 	(Math.pow((robots.getidentify()			- 	sldIdent.getValue())      	, 2	)* sldWaightIdentify.getValue())
//									+ 	(Math.pow((robots.getlearn()			-	sldLearn.getValue())     	, 2	)* sldWaightLearn.getValue())
//									+ 	(Math.pow((robots.getaim()				- 	sldAims.getValue())      	, 2	)* sldWaightAimandGoal.getValue())
//									+	(Math.pow((robots.getinter_structure()	-   sldInterStructure.getValue()), 2)* sldWaightSocialstructure.getValue())
//									+ 	(Math.pow((robots.getsocial_comm()		-	sldSocialcommunication.getValue()), 2)* sldWaightCommunicateSocialy.getValue())
//									+	(Math.pow((robots.getbehaviour()		-   sldBehavior.getValue()	) 	, 2	)* sldWaightBehavior.getValue())
//									+  	(Math.pow((robots.getemotion()			-	sldSEmotion.getValue())  	, 2	)* sldWaightEmotion.getValue())
//									);
//								robotGoodnessValues.put(robots.getID(), Goodness);
//								}
//							//************************************************************************************************
//							// Step4 	sort hash map into sorted map
//								TreeMap<Integer, Integer> sortedMap = SortByValue(robotGoodnessValues);  
//								System.out.println(sortedMap);
//							//************************************************************************************************
//							// Step5 	Generate a linked list for all sorted robot ID 
//								List<Integer> GoodnessSortedIDList = new ArrayList<Integer>();
//								for (Integer robotID : sortedMap.keySet()) 	
//								{		GoodnessSortedIDList.add(robotID);   			}
//									// 5  	List<Robots> GoodnessSortedRobotList = new ArrayList<Robots>();
//									//   	I need two loops GoodnessSortedList.add(arg0)
//									//******************************************************************************
//							    	// the following loop create the bestListRobot that contains a list of ID for all robot contains the same 
//									// requestedValue calculated above. It loops through the keyset and check if it is equal to the requestedValue
//									// if so then it adds it to the bestListRobot.
//									//	List<Integer> bestListRobot = new ArrayList<Integer>();
//									//	for (Integer robotID : robotValues.keySet()) 
//									//	{	if (robotValues.get(robotID) == bestValue) 
//									//		{	bestListRobot.add(robotID);      }
//									//	}
//							//******************************************************************************
//							// Step6 	The following loop iterate through bestListRobot initialized above, contain all the robot with the minimum
//							// 		error value,  for each robot ID it gets its name and add it to the DLM to be printed it the Jlist. 
//								String RobotName, S;
//								BestFitTextArea.append("--------------------------------------------------------------------------------------------------\n");
//								BestFitTextArea.append(" List of  Robots\t\t\t                   Differances\n");
//								BestFitTextArea.append("--------------------------------------------------------------------------------------------------\n");
//								for (Integer robotID : GoodnessSortedIDList)
//								{	for (Robots robots : RobotObjectsresult) 
//										{	if (robots.getID() == robotID) 
//												{	System.out.println(robots.getname());
//													RobotName = robots.getname().toUpperCase();
//													
//													if (robots.getname().length()<11)
//														S =  RobotName +"\t\t\t\t"+ robotGoodnessValues.get(robots.getID());
//													else if ( robots.getname().length()>=11 && robots.getname().length()<=24 )
//														S = RobotName +"\t\t\t"+ robotGoodnessValues.get(robots.getID());
//													else  if (robots.getname().length()>=24 && robots.getname().length()<=38)
//														S = RobotName +"\t\t"+ robotGoodnessValues.get(robots.getID());
//													else 
//													S = RobotName +"\t"+ robotGoodnessValues.get(robots.getID());
//													BestFitTextArea.append(S +"\n ");
//												//	DLM.addElement(S);
//												//	list.setModel(DLM);
//												//	GoodnessSortedRobotList.add(robots);  //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//												}
//										}
//								}
//							}// action listener 
//						});  // end of action performed 
//				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
//				//	4   Best fit   clear Search area 		
//						JButton btnClearList = new JButton("Clear list");
//						btnClearList.setFont(new Font("Century", Font.BOLD, 14));
//						btnClearList.setForeground(new Color(0, 0, 139));
//						btnClearList.addActionListener(new ActionListener() {
//							public void actionPerformed(ActionEvent arg0) {
//								BestFitTextArea.setText("");
//							}
//						});
//						btnClearList.setBounds(1021, 368, 320, 59);
//						frame.getContentPane().add(btnClearList);
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//////////////     Adding New Robot 
//		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//				JPanel panelAdd = new JPanel();
//				panelAdd.setBorder(new LineBorder(new Color(0, 0, 0), 2));
//				panelAdd.setBounds(34, 650, 611, 297);
//				frame.getContentPane().add(panelAdd);
//				panelAdd.setLayout(null);
//				
//				JScrollPane scrollPane_1 = new JScrollPane();
//				scrollPane_1.setBounds(157, 165, 391, 93);
//				panelAdd.add(scrollPane_1);
//				///////////////////////////////////////////////////////////////////////////////////////////////////////	
//				//	1		
//					JLabel lblAddingNewRobot = new JLabel("Adding New Robot ");
//					lblAddingNewRobot.setHorizontalAlignment(SwingConstants.CENTER);
//					lblAddingNewRobot.setForeground(new Color(0, 204, 0));
//					lblAddingNewRobot.setFont(new Font("Century", Font.BOLD, 30));
//					lblAddingNewRobot.setBounds(0, 0, 611, 46);
//					panelAdd.add(lblAddingNewRobot);
//				///////////////////////////////////////////////////////////////////////////////////////////////////////	
//				//	2	Name lable  					
//						JLabel lblName = new JLabel("Name");
//						lblName.setFont(new Font("Century", Font.PLAIN, 20));
//						lblName.setBounds(12, 59, 72, 28);
//						panelAdd.add(lblName);
//				///////////////////////////////////////////////////////////////////////////////////////////////////////	
//				//	3	Name text box 					
//						txtname = new JTextField();
//						txtname.setFont(new Font("Century", Font.PLAIN, 18));
//						txtname.setBounds(74, 60, 169, 28);
//						txtname.setText("Enter name");
//						panelAdd.add(txtname);
//						txtname.setColumns(10);
//				///////////////////////////////////////////////////////////////////////////////////////////////////////				
//				//	4	Social type lable 					
//						JLabel lblSocialType = new JLabel("Social Type");
//						lblSocialType.setFont(new Font("Century", Font.PLAIN, 20));
//						lblSocialType.setBounds(282, 59, 113, 28);
//						panelAdd.add(lblSocialType);
//				///////////////////////////////////////////////////////////////////////////////////////////////////////
//				//	5	Social type combo BOx  								
//						JComboBox<String> comboBox = new JComboBox<String>();
//						comboBox.setBounds(395, 62, 169, 28);
//						comboBox.addItem("Sociable");
//						comboBox.addItem("Receptive");
//						comboBox.addItem("Socially intelligent");
//						comboBox.addItem("Evocative");
//						comboBox.addItem("Situated");
//						comboBox.addItem("Embedded");
//						comboBox.addItem("Social Interface, performance model");
//						comboBox.addItem("Social Interface, Interface model");
//						panelAdd.add(comboBox);
//				/////////////////////////////////////////////////////////////////////////////////////////////////////////	
//				//	6	Adjust & verify button  
//						JButton btnVerify = new JButton("Adjust & verify ");
//						btnVerify.setBounds(24, 98, 259, 49);
//						panelAdd.add(btnVerify);
//						btnVerify.setForeground(new Color(0, 204, 0));
//						btnVerify.setFont(new Font("Century", Font.BOLD, 25));
//				/////////////////////////////////////////////////////////////////////////////////////////////////////////	
//				//	7	Add the robot Button
//						JButton btnAdd = new JButton("Add the robot ");
//						btnAdd.setEnabled(false);
//						btnAdd.setForeground(new Color(0, 204, 0));
//						btnAdd.setFont(new Font("Century", Font.BOLD, 25));
//						btnAdd.setBounds(305, 98, 259, 49);
//						panelAdd.add(btnAdd);
//				////////////////////////////////////////////////////////////////////////////////////////////////////////	
//				//	8	Robot lable  
//						JLabel lblRobotID = new JLabel("Robot ");
//						lblRobotID.setFont(new Font("Century", Font.PLAIN, 20));
//						lblRobotID.setBounds(51, 190, 94, 28);
//						panelAdd.add(lblRobotID);
//				////////////////////////////////////////////////////////////////////////////////////////////////////////	
//				//	9	Robot lable 				
//						txtrRobotInfo = new JTextArea();
//						scrollPane_1.setViewportView(txtrRobotInfo);
//						txtrRobotInfo.setText("New Robot Info ");
//				/////////////////////////////////////////////////////////////////////////////////////////////////////////				
//				/////////////////////////////////////////////////////////////////////////////////////////////////////////				
//				btnAdd.addActionListener(new ActionListener() 
//					{	public void actionPerformed(ActionEvent arg0) 
//							{	System.out.println(AddRob);
//								AR.InsertRobot(AddRob);
//								txtrRobotInfo.setText(" Robot was added sussesfully !! ");
//								txtname.setText("");
//								comboBox.setSelectedIndex(0);
//								btnAdd.setEnabled(false);
//							}
//					});
//				/////////////////////////////////////////////////////////////////////////////////////////////////////////				
//				/////////////////////////////////////////////////////////////////////////////////////////////////////////				
//				btnVerify.addActionListener(new ActionListener() 
//				{	public void actionPerformed(ActionEvent arg0)
//							{   String insert = "";
//								insert = "INSERT INTO ROBOT (name, socialtype, mobile, manipulating, proximity_inter, embodiment, identify, learn, aim, inter_structure, social_comm, behaviour, emotions) VALUES(  '"+
//										txtname.getText() +"', '"+  comboBox.getSelectedItem()+"', '"+ sldMobility.getValue()+"', '"+ sldManip.getValue() +"', '"+ sldEmbod.getValue() + 
//										"', '"+  sldProxInter.getValue()+"', '"+ sldIdent.getValue()+"', '"+ sldLearn.getValue() +"', '"+ sldAims.getValue() +"', '"+ sldInterStructure.getValue() + 
//										"', '"+  sldSocialcommunication.getValue()  +"', '"+  sldBehavior.getValue()	+"', '"+ sldSEmotion.getValue() +"'); ";
//								System.out.println(insert );
//								int response = JOptionPane.showConfirmDialog(null,"Please verify the values of the new robot " + insert, " Adding a robot Confirm",
//						       JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); 
//								if (response == JOptionPane.NO_OPTION)
//									{	//System.out.println("modify the values, and try again ");
//										txtrRobotInfo.setText(" modify the values, and try again ");
//										btnAdd.setEnabled(false);
//										AddRob = null;
//									}
//								else if (response == JOptionPane.YES_OPTION) 
//									{	System.out.println("Yes button clicked");	
//										txtrRobotInfo.setText("If the follwoing values are okay. Please press the ADD button \n "+"  '"+
//										txtname.getText() +"', '"+  comboBox.getSelectedItem()+"', '"+ sldMobility.getValue()+"', '"+ sldManip.getValue() +"', '"+ sldEmbod.getValue() + 
//										"', '"+  sldProxInter.getValue()+"', '"+ sldIdent.getValue()+"', '"+ sldLearn.getValue() +"', '"+ sldAims.getValue() +"', '"+ 
//										sldInterStructure.getValue() + "', '"+  sldSocialcommunication.getValue()  +"', '"+  sldBehavior.getValue()	+"', '"+ sldSEmotion.getValue() +"'); ");
//										btnAdd.setEnabled(true);
//										AddRob = new Robots();
//										AddRob.setID(100);
//										AddRob.setname(txtname.getText());
//										AddRob.setsocialtype(comboBox.getSelectedItem().toString());
//										AddRob.setmobile( sldMobility.getValue());
//										AddRob.setmanipulating(sldManip.getValue());
//										AddRob.setproximity_inter(sldProxInter.getValue());
//										AddRob.setembodiment(sldEmbod.getValue());
//										AddRob.setidentify(sldIdent.getValue());
//										AddRob.setlearn(sldLearn.getValue());
//										AddRob.setaim( sldAims.getValue());
//										AddRob.setinter_structure( sldInterStructure.getValue());
//										AddRob.setsocial_comm( sldSocialcommunication.getValue() );
//										AddRob.setbehaviour(sldBehavior.getValue());
//										AddRob.setemotion(sldSEmotion.getValue()); 
//									} 
//								else if (response == JOptionPane.CLOSED_OPTION)
//									{	System.out.println("JOptionPane closed");	
//										txtrRobotInfo.setText("JOptionPane closed");
//										btnAdd.setEnabled(false);
//									}	
//							} // action performed 
//				});
//		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		//////////////    Search for Robot by type 
//		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
//				JPanel SocialTypePanel = new JPanel();
//				SocialTypePanel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(64, 64, 64), Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
//				SocialTypePanel.setBounds(685, 650, 227, 297);
//				frame.getContentPane().add(SocialTypePanel);
//				SocialTypePanel.setLayout(null);
//				
//				JScrollPane scrollPane_SocialTypeSearch = new JScrollPane();
//				scrollPane_SocialTypeSearch.setBounds(12, 74, 200, 210);
//				SocialTypePanel.add(scrollPane_SocialTypeSearch);
//				
//				JList<String> PrintListSocialTypeRobots = new JList<String>();
//				scrollPane_SocialTypeSearch.setViewportView(PrintListSocialTypeRobots);
//				//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		
//				// 1	Search by type lable
//					JLabel lblSearchByType = new JLabel("Search by type ");
//					lblSearchByType.setBounds(30, 13, 144, 25);
//					SocialTypePanel.add(lblSearchByType);
//					lblSearchByType.setFont(new Font("Century", Font.PLAIN, 20));
//				//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//				// 2 Search Social Type combo Box
//					JComboBox<String> comboBoxSearchSocialType = new JComboBox<String>();
//					comboBoxSearchSocialType.setBounds(12, 40, 200, 25);
//					SocialTypePanel.add(comboBoxSearchSocialType);
//					comboBoxSearchSocialType.setEditable(false);
//				
//					comboBoxSearchSocialType.addItem("Sociable");
//					comboBoxSearchSocialType.addItem("Receptive");
//					comboBoxSearchSocialType.addItem("Socially intelligent");
//					comboBoxSearchSocialType.addItem("Evocative");
//					comboBoxSearchSocialType.addItem("Situated");
//					comboBoxSearchSocialType.addItem("Embedded");
//					comboBoxSearchSocialType.addItem("Social Interface, performance model");
//					comboBoxSearchSocialType.addItem("Social Interface, Interface model");
//				//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//				//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//					comboBoxSearchSocialType.addActionListener(new ActionListener() 
//					{public void actionPerformed(ActionEvent arg0) 
//					{
//						DefaultListModel<String> DLM = new DefaultListModel<String>();
//						String  social ;
//						DLM.clear();
//						social = (String) comboBoxSearchSocialType.getSelectedItem();
//						System.out.println(social);
//						String statem;
//						statem = "SELECT * FROM ROBOT WHERE socialtype = '"+ social+"' ;";
//						System.out.println(social);
//						//*****************************************************************************
//						// the result of the query is saved Array List called "RobotObjectsresult". each row is saved in robot type object. 
//						List<Robots> SocialResult = new ArrayList<Robots>();
//						SocialResult.clear();
//						SocialResult = q.getRobotsObjectList(statem);
//						System.out.println("Printing Objects of robots :");
//						//**************************************************************				
//						///scrollPane.setViewportView(PrintList);
//					    //for (Integer robotID : bestListRobot)
//						// {	
//						if (SocialResult.isEmpty())
//						{ DLM.addElement(" NO robots are available ");
//						  PrintListSocialTypeRobots.setModel(DLM);
//						}
//						else 
//						{	 for (Robots robots : SocialResult) 
//							{	System.out.println(robots.getID()+" "+robots.getname());
//									DLM.addElement(robots.getname());
//									PrintListSocialTypeRobots.setModel(DLM);
//							}
//						}
//					}
//				});
//		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//	
//	} // end of initialize method
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	
//	// hash map sort method   
//	public static TreeMap<Integer, Integer> SortByValue (Map<Integer, Integer> robotValues) 
//	{
//		ValueComparator vc =  new ValueComparator(robotValues);
//		TreeMap<Integer,Integer> sortedMap = new TreeMap<Integer,Integer>(vc);
//		sortedMap.putAll(robotValues);
//		return sortedMap;
//	}
//}
////%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//class ValueComparator implements Comparator<Integer> {
//	 
//    Map<Integer, Integer> map;
// 
//    public ValueComparator(Map<Integer, Integer> base) 
//    {
//        this.map = base;
//    }
// 
//    public int compare(Integer a, Integer b) {
//        if (map.get(a) <= map.get(b)) {
//            return -1;
//        } else {
//            return 1;
//        } // returning 0 would merge keys 
//    }
//}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//// NOt used 
////************************************************************************************************				
////for (Integer robotID : robotValues.keySet()) 						
////{	System.out.println(" the robot ID : " + robotID +" Goodness :"+ robotValues.get(robotID));  }
////System.out.println("*****************************");
////System.out.println(robotValues);
////private JTable RobotTable;
////DefaultListModel<String> DLM = new DefaultListModel<String>();
////Object[][] data  = new Object[][];
////*****************************************************************************
////JScrollPane scrollPane_2 = new JScrollPane();
////scrollPane_2.setBounds(1020,460, 320, 100);
////frame.getContentPane().add(scrollPane_2);
////JList<String> list = new JList<String>();
////scrollPane_2.setViewportView(list);
////&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
////JScrollPane scrollPane_RobotTable = new JScrollPane();
////scrollPane_RobotTable.setBounds(1022, 650, 319, 100);
////frame.getContentPane().add(scrollPane_RobotTable);
////RobotTable = new JTable();
////scrollPane_RobotTable.setViewportView(RobotTable);
//////$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//////RobotTable.setModel((TableModel) DLM);	
////String[] columnName  ={ "Robot Name", "Goodness"};
////for (Robots robotOb : GoodnessSortedRobotList)
////RobotTable.setPreferredScrollableViewportSize(new Dimension(400, 60));		
////$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
////sldLearn.addChangeListener(new ChangeListener()
////{ public void stateChanged(ChangeEvent arg0) { // learnValue = 0;
////		learnValue = sldLearn.getValue();
////		// LE = ( learnValue == 0 )? "NO" : "YES";
////		if (learnValue == 0) {
////			LE = "NO";
////		} else {
////			LE = "YES";
////		}
////	}
////});
////*********************************************************************************************
//// BestValue = Math.abs(((BestListRobot.get(0)).getembodiment()*
//// (BestListRobot.get(0)).getembodiment())
//// +
//// ((BestListRobot.get(0)).getlearn()*(BestListRobot.get(0).getlearn()))-
//// requestedValue
//// );
//// for (Robots R : RobotObjectsresult) {
//// int ValueofRobot = Math.abs(
//// ((R.getembodiment() * R.getembodiment()) + (R.getlearn() *
//// R.getlearn())) - requestedValue);
//// if (ValueofRobot < bestValue) {
//// bestValue = ValueofRobot;
//// bestRobot = R;
//// }
//// }
//// for (Robots R : RobotObjectsresult) {
//// int ValueofRobot = Math.abs(
//// ((R.getembodiment() * R.getembodiment()) + (R.getlearn() *
//// R.getlearn())) - requestedValue);
//// if (ValueofRobot == bestValue)
//// bestListRobot.add(R);
//// }
//// // DefaultListModel<String> DLM = new
//// // DefaultListModel<String>();
//// // for (String name : result)
//// // //outputArea += name + " ";
//// if (bestListRobot != null) {
//// for (Robots R : bestListRobot) {
//// String name;
//// // name = BestRobot.getname();
//// name = R.getname();
//// DLM.addElement(name);
//// }
//// System.out.println(outputArea);
//// list_2.setModel(DLM);
//// }
//// ####################################################################
//// $ JOptionPane.showMessageDialog(null, stat);
//// $ List<Robots> Objectsresult = new ArrayList<Robots>();
//// $ Objectsresult = q.getRobotsObjectList(stat);
//// $ System.out.println("Printing Objects of robots : ");
//// $ System.out.println(Objectsresult);
//// $ String outputArea= "";
//// JOptionPane.showMessageDialog(null, Objectsresult);
///*
// * for(Robots R : Objectsresult) { String name; name =
// * R.getname(); outputArea += name + " "; DLM.addElement(name);
// * } System.out.println(outputArea ); list_2.setModel(DLM);
// */ // ***************************************************
//	// DefaultListModel<String> DLM = new
//	// DefaultListModel<String>();
//	// for (String name : Objectsresult)
//	// { System.out.println(name);
//	// DLM.addElement(name);
//	// }
//	// JOptionPane.showMessageDialog(null, outputArea);
//	///////////////////////////////////////
//	// for (int i = 0; i < Objectsresult.size(); i++) {
//	// // System.out.println(
//	// outputArea += Objectsresult.get(i).getname();
//	// }
//////#############################################################################333
//		// ####################################
//		// # StrLearn =cbLearn.isSelected()? "YES": "NO";
//		// # StrLearn = LE;
//		// # StrLearn = sldLearn.getValue() ==10 ? "YES": "NO";
//		// ####################################
//		//String StrMobility, StrManipolation, StrProxInter, StrEmbodiment;
//		//String StrIdentifying, StrAimAndGoal, StrLearn;
//		//String StrInterStructure, StrSocialcommunication, StrBehaviour, StrEmotion;
//		
//		//StrMobility = cbMobility.isSelected() ? "YES" : "NO";
//		//StrManipolation = cbManipolation.isSelected() ? "YES" : "NO";
//		//StrProxInter = cbProxInter.isSelected() ? "YES" : "NO";
//		// ####################################
//		// # StrEmbodiment = cbEmbodiment.isSelected()? "YES": "NO";
//		// # StrEmbodiment = Embod;
//		// # StrEmbodiment = sldEmbod.getValue()==10 ? "YES": "NO";
//		// ####################################
//		//StrIdentifying = cbIdentifying.isSelected() ? "YES" : "NO";
//		//StrAimAndGoal = cbAimAndGoal.isSelected() ? "YES" : "NO";
//		
//		//StrInterStructure = cbInterStructure.isSelected() ? "YES" : "NO";
//		//StrSocialcommunication = cbSocialcommunication.isSelected() ? "YES" : "NO";
//		//StrBehaviour = cbBehaviour.isSelected() ? "YES" : "NO";
//		//StrEmotion = cbEmotion.isSelected() ? "YES" : "NO";
//
////@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
////DefaultListModel<String> DLM = new DefaultListModel<String>();
//// for (String name : result) { System.out.println(name);
//// DLM.addElement(name); } list_2.setModel(DLM);
//// 			st = "SELECT * FROM ROBOTS WHERE" 
////						+ " mobile = \"" + StrMobility + "\" AND " + " manipulating = \""
////						+ StrManipolation + "\" AND " + " proximity_inter = \"" + StrProxInter + "\"  "
////						// $ + " embodiment = "+ sldEmbod.getValue()
////						+ " AND " + " identify = \"" + StrIdentifying + "\"  "
////						// $ + " learn = " + sldLearn.getValue()
////						+ " AND " + " aim = \"" + StrAimAndGoal + "\" AND " + " inter_structure = \""
////						+ StrInterStructure + "\" AND " + " social_comm = \"" + StrSocialcommunication + "\" AND "
////						+ " behaviour = \"" + StrBehaviour + "\" AND " + " emotions = \"" + StrEmotion + "\";";
////#########################################################################3
//// # st = "SELECT * FROM ROBOTS WHERE"
//// # + " mobile = \""+ StrMobility
//// # +"\" AND " + " manipulating = \""+ StrManipolation
//// # +"\" AND " + " proximity_inter = \""+ StrProxInter
//// # +"\" AND " + " embodiment = \""+ StrEmbodiment
//// # +"\" AND " + " identify = \""+ StrIdentifying
//// # +"\" AND " + " learn = \""+ StrLearn
//// # +"\" AND " + " aim = \""+ StrAimAndGoal
//// # +"\" AND " + " inter_structure = \""+ StrInterStructure
//// # +"\" AND " + " social_comm = \""+ StrSocialcommunication
//// # +"\" AND " + " behaviour = \""+ StrBehaviour
//// # +"\" AND " + " emotions = \""+ StrEmotion
//// # +"\";";
//// ####################################################################
///*
// * String s = ""; s = "SELECT name FROM ROBOTS WHERE" +
// * " mobile = \""+ StrMobility +"\" AND " + " manipulating = \""
// * + StrManipolation +"\" AND " + " proximity_inter = \""+
// * StrProxInter +"\" AND " + " embodiment = \""+ StrEmbodiment +
// * "\" AND " + " identify = \""+ StrIdentifying +"\" AND " +
// * " learn = \""+ StrLearn +"\" AND " + " aim = \""+
// * StrAimAndGoal +"\" AND " + " inter_structure = \""+
// * StrInterStructure +"\" AND " + " social_comm = \""+
// * StrSocialcommunication +"\" AND " + " behaviour = \""+
// * StrBehaviour +"\" AND " + " emotions = \""+ StrEmotion
// * +"\";"; JOptionPane.showMessageDialog(null, s); List<String>
// * result = new ArrayList<String>(); result = q.getRobots(s);
// * System.out.println(result);
// * JOptionPane.showMessageDialog(null, result);
// */
////###########################################################################
//// $ String stat;
//// $ stat = "SELECT * FROM ROB WHERE"
//// $ + " mobile = \""+ StrMobility
//// $ +"\" AND " + " manipulating = \""+ StrManipolation
//// $ +"\" AND " + " proximity_inter = \""+ StrProxInter
//// $ +"\" AND " + " embodiment = "+ sldEmbod.getValue()
//// $ +" AND " + " identify = \""+ StrIdentifying
//// $ +"\" AND " + " learn = " + sldLearn.getValue()
//// $ +" AND " + " aim = \""+ StrAimAndGoal
//// $ +"\" AND " + " inter_structure = \""+ StrInterStructure
//// $ +"\" AND " + " social_comm = \""+ StrSocialcommunication
//// $ +"\" AND " + " behaviour = \""+ StrBehaviour
//// $ +"\" AND " + " emotions = \""+ StrEmotion
//// $ +"\";";
//// $ System.out.println();
//// $ System.out.println(stat);
//// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//// int requestedVale= (sldEmbod.getValue()*sldEmbod.getValue())+ (sldLearn.getValue()*sldLearn.getValue());
/////////////////////////////////////////////////////////////////////////////////
////JSlider sldEmbod = new JSlider();
////sldEmbod.addChangeListener(new ChangeListener() {
////	public void stateChanged(ChangeEvent arg0) { // EmbodimentValue =
////													// sldEmbod.getValue();
////													// LE = ( learnValue
////													// == 0 )? "NO" :
////													// "YES";
////		if (sldEmbod.getValue() == 0) {
////			Embod = "NO";
////		} else {
////			Embod = "YES";
////		}
////	}
////});
////sldEmbod.setToolTipText("value form 0 to 10.");
////sldEmbod.setMaximum(10);
////sldEmbod.setValue(0);
////sldEmbod.setBounds(520, 74, 245, 26);
////panelMech.add(sldEmbod);
//
////******************************************************************************
////  a user requested Value is calculated in a variable called "requestedValue".
////	int requestedValue = (sldLearn.getValue() * sldLearn.getValue())
////						+ (sldEmbod.getValue() * sldEmbod.getValue());
////	System.out.println("requested value is :" + requestedValue);
