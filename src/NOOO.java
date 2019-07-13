
public class NOOO {

}

/*
 * JSlider sldMobility = new JSlider(); sldMobility.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "User requirement ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldMobility.setPaintLabels(true); sldMobility.setValue(5);
 * sldMobility.setToolTipText("value form 0 to 10.");
 * sldMobility.setMaximum(10); sldMobility.setBounds(74, 51, 200, 58);
 * sldMobility.setMajorTickSpacing(10); sldMobility.setMinorTickSpacing(1);
 * sldMobility.setPaintTicks(true); panelPercep.add(sldMobility);
 * //----------------------------------------------------------------- JLabel
 * lblMobility = new JLabel("Mobility"); lblMobility.setFont(new Font("Century",
 * Font.PLAIN, 20)); lblMobility.setBounds(74, 23, 86, 26);
 * panelPercep.add(lblMobility);
 * //----------------------------------------------------------------- JSlider
 * sldWaightMobility = new JSlider(); sldWaightMobility.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightMobility.setPaintLabels(true); sldWaightMobility.setValue(5);
 * sldWaightMobility.setToolTipText("value form 1 to 10.");
 * sldWaightMobility.setMaximum(10); sldWaightMobility.setBounds(74, 123, 200,
 * 49);// sldWaightMobility.setMajorTickSpacing(10);
 * sldWaightMobility.setMinorTickSpacing(1);
 * sldWaightMobility.setPaintTicks(true); panelPercep.add(sldWaightMobility);
 * //###########################################################################
 * ########### // 2 JCheckBox cbManipolation = new JCheckBox("Manipulation"); //
 * cbManipolation.setFont(new Font("Tahoma", Font.PLAIN, 20)); //
 * cbManipolation.setBackground(Color.LIGHT_GRAY); //
 * cbManipolation.setBounds(330, 47, 155, 25); // panelMech.add(cbManipolation);
 * //----------------------------------------------------------------- JSlider
 * sldManip = new JSlider(); sldManip.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "User requirement",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldManip.setPaintLabels(true); sldManip.setValue(5);
 * sldManip.setToolTipText("value form 0 to 10."); sldManip.setMinimum(0);
 * sldManip.setMaximum(10); sldManip.setBounds(409, 51, 200, 58);//
 * sldManip.setMajorTickSpacing(10); sldManip.setMinorTickSpacing(1);
 * sldManip.setPaintTicks(true); panelPercep.add(sldManip);
 * //----------------------------------------------------------------- JLabel
 * lblManip= new JLabel("Manipulation"); lblManip.setFont(new Font("Century",
 * Font.PLAIN, 20)); lblManip.setBounds(431, 23, 134, 26);
 * panelPercep.add(lblManip);
 * //----------------------------------------------------------------- JSlider
 * sldWaightManipulation = new JSlider(); sldWaightManipulation.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightManipulation.setPaintLabels(true);
 * sldWaightManipulation.setValue(5);
 * sldWaightManipulation.setToolTipText("value form 1 to 10.");
 * sldWaightManipulation.setMaximum(10); sldWaightManipulation.setBounds(409,
 * 123, 200, 49);// sldWaightManipulation.setMajorTickSpacing(10);
 * sldWaightManipulation.setMinorTickSpacing(1);
 * sldWaightManipulation.setPaintTicks(true);
 * panelPercep.add(sldWaightManipulation);
 * 
 * //###########################################################################
 * ########### // 3 JCheckBox cbEmbodiment = new JCheckBox("Embodiment "); //
 * cbEmbodiment.setFont(new Font("Tahoma", Font.PLAIN, 20)); //
 * cbEmbodiment.setBackground(Color.LIGHT_GRAY); // cbEmbodiment.setBounds(367,
 * 74, 147, 25); // panel.add(cbEmbodiment);
 * //----------------------------------------------------------------- JSlider
 * sldEmbod = new JSlider(); sldEmbod.setBorder(new TitledBorder(null,
 * "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
 * sldEmbod.setPaintLabels(true); sldEmbod.setValue(5);
 * sldEmbod.setToolTipText("value form 0 to 10."); sldEmbod.setMinimum(0);
 * sldEmbod.setMaximum(10); sldEmbod.setBounds(753, 51, 200, 58);//
 * sldEmbod.setMajorTickSpacing(10); sldEmbod.setMinorTickSpacing(1);
 * sldEmbod.setPaintTicks(true); panelMech.add(sldEmbod);
 * //----------------------------------------------------------------- JLabel
 * lblEmboidment = new JLabel("Embodiment"); lblEmboidment.setFont(new
 * Font("Century", Font.PLAIN, 20)); lblEmboidment.setBounds(753, 23, 127, 26);
 * panelMech.add(lblEmboidment);
 * //----------------------------------------------------------------- JSlider
 * sldWaightEmbodiment = new JSlider(); sldWaightEmbodiment.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightEmbodiment.setPaintLabels(true); sldWaightEmbodiment.setValue(5);
 * sldWaightEmbodiment.setToolTipText("value form 1 to 10.");
 * sldWaightEmbodiment.setMaximum(10); sldWaightEmbodiment.setBounds(753, 123,
 * 200, 49);// sldWaightEmbodiment.setMajorTickSpacing(10);
 * sldWaightEmbodiment.setMinorTickSpacing(1);
 * sldWaightEmbodiment.setPaintTicks(true); panelMech.add(sldWaightEmbodiment);
 * //###########################################################################
 * ########### // 4 JCheckBox cbProxInter = new
 * JCheckBox("Proximity interaction"); // cbProxInter.setFont(new Font("Tahoma",
 * Font.PLAIN, 20)); // cbProxInter.setBackground(Color.LIGHT_GRAY); //
 * cbProxInter.setBounds(808, 74, 219, 25); // panelMech.add(cbProxInter);
 * //----------------------------------------------------------------- JSlider
 * sldProxInter = new JSlider(); sldProxInter.setBorder(new TitledBorder(null,
 * "User requirement", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
 * sldProxInter.setPaintLabels(true); sldProxInter.setValue(5);
 * sldProxInter.setToolTipText("value form 0 to 10.");
 * sldProxInter.setMinimum(0); sldProxInter.setMaximum(10);
 * sldProxInter.setBounds(1076, 51, 200, 58);//
 * sldProxInter.setMajorTickSpacing(10); sldProxInter.setMinorTickSpacing(1);
 * sldProxInter.setPaintTicks(true); panelMech.add(sldProxInter);
 * //----------------------------------------------------------------- JLabel
 * lblProxInter= new JLabel("Proximal interaction"); lblProxInter.setFont(new
 * Font("Century", Font.PLAIN, 20)); lblProxInter.setBounds(1076, 21, 200, 30);
 * panelMech.add(lblProxInter);
 * //----------------------------------------------------------------- JSlider
 * sldWaightProximity = new JSlider(); sldWaightProximity.setBorder(new
 * TitledBorder(null, "Weight ", TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM,
 * null, null)); sldWaightProximity.setPaintLabels(true);
 * sldWaightProximity.setValue(5);
 * sldWaightProximity.setToolTipText("value form 1 to 10.");
 * sldWaightProximity.setMaximum(10); sldWaightProximity.setBounds(1076, 123,
 * 200, 49);// sldWaightProximity.setMajorTickSpacing(10);
 * sldWaightProximity.setMinorTickSpacing(1);
 * sldWaightProximity.setPaintTicks(true); panelMech.add(sldWaightProximity);
 * 
 * //###########################################################################
 * ###########
 * //###########################################################################
 * ########### // Panel Abstract intelligence with all its properties
 * //###########################################################################
 * ###########
 * //###########################################################################
 * ########### JPanel panelAbst = new JPanel(); panelAbst.setLayout(null);
 * panelAbst.setBorder( new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"),
 * "Cognitive intelligence requirement ", TitledBorder.CENTER,
 * TitledBorder.ABOVE_TOP, null, new Color(0, 0, 255)));
 * panelAbst.setBackground(Color.LIGHT_GRAY); panelAbst.setBounds(34, 267, 970,
 * 175); frame.getContentPane().add(panelAbst);
 * //###########################################################################
 * ########### // 5 JCheckBox cbIdentifying = new JCheckBox("Identifying"); //
 * cbIdentifying.setFont(new Font("Tahoma", Font.PLAIN, 20)); //
 * cbIdentifying.setBackground(Color.LIGHT_GRAY); // cbIdentifying.setBounds(33,
 * 35, 171, 25); // panelAbst.add(cbIdentifying);
 * //----------------------------------------------------------------- JSlider
 * sldIdent = new JSlider(); sldIdent.setBorder(new TitledBorder(null,
 * "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
 * sldIdent.setPaintLabels(true); sldIdent.setValue(5);
 * sldIdent.setToolTipText("value form 0 to 10."); sldIdent.setMinimum(0);
 * sldIdent.setMaximum(10); sldIdent.setBounds(79, 42, 200, 61);//
 * sldIdent.setMajorTickSpacing(10); sldIdent.setMinorTickSpacing(1);
 * sldIdent.setPaintTicks(true); panelAbst.add(sldIdent);
 * //----------------------------------------------------------------- JLabel
 * lblIdent= new JLabel("Identifying"); lblIdent.setBounds(79, 14, 121, 26);
 * panelAbst.add(lblIdent); lblIdent.setFont(new Font("Century", Font.PLAIN,
 * 20)); //-----------------------------------------------------------------
 * JSlider sldWaightIdentify = new JSlider(); sldWaightIdentify.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightIdentify.setPaintLabels(true); sldWaightIdentify.setValue(5);
 * sldWaightIdentify.setToolTipText("value form 1 to 10.");
 * sldWaightIdentify.setMaximum(10); sldWaightIdentify.setBounds(79, 111, 200,
 * 52); sldWaightIdentify.setMajorTickSpacing(10);
 * sldWaightIdentify.setMinorTickSpacing(1);
 * sldWaightIdentify.setPaintTicks(true); panelAbst.add(sldWaightIdentify);
 * //###########################################################################
 * ########### // 6 JCheckBox cbLearn = new JCheckBox("Learn"); #
 * cbLearn.setFont(new // Font("Tahoma", Font.PLAIN, 20)); # //
 * cbLearn.setBackground(Color.LIGHT_GRAY); # cbLearn.setBounds(796, 67, // 150,
 * 25); # panel_1.add(cbLearn);
 * //----------------------------------------------------------------- JSlider
 * sldLearn = new JSlider(); sldLearn.setBorder(new TitledBorder(null,
 * "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
 * sldLearn.setPaintLabels(true); sldLearn.setValue(5);
 * sldLearn.setToolTipText("value form 0 to 10."); sldLearn.setMinimum(0);
 * sldLearn.setMaximum(10); sldLearn.setBounds(405, 41, 200, 61);//
 * sldLearn.setMajorTickSpacing(10); sldLearn.setMinorTickSpacing(1);
 * sldLearn.setPaintTicks(true); panelAbst.add(sldLearn);
 * //----------------------------------------------------------------- JLabel
 * lblLearn = new JLabel("Learn"); lblLearn.setFont(new Font("Century",
 * Font.PLAIN, 20)); lblLearn.setBounds(459, 14, 106, 25);
 * panelAbst.add(lblLearn);
 * //----------------------------------------------------------------- JSlider
 * sldWaightLearn = new JSlider(); sldWaightLearn.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightLearn.setPaintLabels(true); sldWaightLearn.setValue(5);
 * sldWaightLearn.setToolTipText("value form 1 to 10.");
 * sldWaightLearn.setMaximum(10); sldWaightLearn.setBounds(405, 110, 200, 52);
 * sldWaightLearn.setMajorTickSpacing(10);
 * sldWaightLearn.setMinorTickSpacing(1); sldWaightLearn.setPaintTicks(true);
 * panelAbst.add(sldWaightLearn);
 * //###########################################################################
 * ########### // 7 JCheckBox cbAimAndGoal = new JCheckBox("Aims and goals"); //
 * cbAimAndGoal.setFont(new Font("Tahoma", Font.PLAIN, 20)); //
 * cbAimAndGoal.setBackground(Color.LIGHT_GRAY); // cbAimAndGoal.setBounds(802,
 * 55, 210, 25); // panelAbst.add(cbAimAndGoal);
 * //----------------------------------------------------------------- JSlider
 * sldAims = new JSlider(); sldAims.setBorder(new TitledBorder(null,
 * "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
 * sldAims.setPaintLabels(true); sldAims.setValue(5);
 * sldAims.setToolTipText("value form 0 to 10."); sldAims.setMinimum(0);
 * sldAims.setMaximum(10); sldAims.setBounds(751, 40, 200, 61);//
 * sldAims.setMajorTickSpacing(10); sldAims.setMinorTickSpacing(1);
 * sldAims.setPaintTicks(true); panelAbst.add(sldAims);
 * //----------------------------------------------------------------- JLabel
 * lblAims = new JLabel("Aims and goals"); lblAims.setFont(new Font("Century",
 * Font.PLAIN, 20)); lblAims.setBounds(773, 13, 190, 25);
 * panelAbst.add(lblAims);
 * //----------------------------------------------------------------- JSlider
 * sldWaightAimandGoal = new JSlider(); sldWaightAimandGoal.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightAimandGoal.setPaintLabels(true); sldWaightAimandGoal.setValue(5);
 * sldWaightAimandGoal.setToolTipText("value form 1 to 10.");
 * sldWaightAimandGoal.setMaximum(10); sldWaightAimandGoal.setBounds(751, 109,
 * 200, 52); sldWaightAimandGoal.setMajorTickSpacing(10);
 * sldWaightAimandGoal.setMinorTickSpacing(1);
 * sldWaightAimandGoal.setPaintTicks(true); panelAbst.add(sldWaightAimandGoal);
 * //###########################################################################
 * ###########
 * //###########################################################################
 * ########### // Panel Social intelligence with all its properties
 * //###########################################################################
 * ###########
 * //###########################################################################
 * ########### JPanel panelSocial = new JPanel(); panelSocial.setBounds(29, 455,
 * 1312, 182); frame.getContentPane().add(panelSocial);
 * panelSocial.setLayout(null); panelSocial.setBorder( new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"),
 * "Social intelligence requirement ", TitledBorder.CENTER,
 * TitledBorder.ABOVE_TOP, null, new Color(0, 0, 255)));
 * panelSocial.setBackground(Color.LIGHT_GRAY);
 * //###########################################################################
 * ########### // 8 JCheckBox cbInterStructure = new
 * JCheckBox("Social interaction structure"); // cbInterStructure.setFont(new
 * Font("Tahoma", Font.PLAIN, 20)); //
 * cbInterStructure.setBackground(Color.LIGHT_GRAY); //
 * cbInterStructure.setBounds(31, 60, 285, 25); //
 * panelSocial.add(cbInterStructure);
 * //----------------------------------------------------------------- JSlider
 * sldInterStructure = new JSlider(); sldInterStructure.setBorder(new
 * TitledBorder(null, "User requirement ", TitledBorder.CENTER,
 * TitledBorder.BOTTOM, null, null)); sldInterStructure.setPaintLabels(true);
 * sldInterStructure.setValue(5);
 * sldInterStructure.setToolTipText("value form 0 to 10.");
 * sldInterStructure.setMinimum(0); sldInterStructure.setMaximum(10);
 * sldInterStructure.setBounds(74, 49, 200, 60);//
 * sldInterStructure.setMajorTickSpacing(10);
 * sldInterStructure.setMinorTickSpacing(1);
 * sldInterStructure.setPaintTicks(true); panelSocial.add(sldInterStructure);
 * //----------------------------------------------------------------- JLabel
 * lblInterStructure = new JLabel("Social structure");
 * lblInterStructure.setFont(new Font("Century", Font.PLAIN, 20));
 * lblInterStructure.setBounds(75, 20, 188, 25);
 * panelSocial.add(lblInterStructure);
 * //----------------------------------------------------------------- JSlider
 * sldWaightSocialstructure = new JSlider();
 * sldWaightSocialstructure.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightSocialstructure.setPaintLabels(true);
 * sldWaightSocialstructure.setValue(5);
 * sldWaightSocialstructure.setToolTipText("value form 1 to 10.");
 * sldWaightSocialstructure.setMaximum(10);
 * sldWaightSocialstructure.setBounds(74, 118, 200, 51);//
 * sldWaightSocialstructure.setMajorTickSpacing(10);
 * sldWaightSocialstructure.setMinorTickSpacing(1);
 * sldWaightSocialstructure.setPaintTicks(true);
 * panelSocial.add(sldWaightSocialstructure);
 * //###########################################################################
 * ########### // 9 JCheckBox cbSocialcommunication = new
 * JCheckBox("Capabilities of social communication"); //
 * cbSocialcommunication.setFont(new Font("Tahoma", Font.PLAIN, 20)); //
 * cbSocialcommunication.setBackground(Color.LIGHT_GRAY)); //
 * cbSocialcommunication.setBounds(331, 60, 354, 25); //
 * panelSocial.add(cbSocialcommunication);
 * //----------------------------------------------------------------- JSlider
 * sldSocialcommunication = new JSlider(); sldSocialcommunication.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "User requirement ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldSocialcommunication.setPaintLabels(true);
 * sldSocialcommunication.setValue(5);
 * sldSocialcommunication.setToolTipText("value form 0 to 10.");
 * sldSocialcommunication.setMinimum(0); sldSocialcommunication.setMaximum(10);
 * sldSocialcommunication.setBounds(399, 49, 200, 60);//
 * sldSocialcommunication.setMajorTickSpacing(10);
 * sldSocialcommunication.setMinorTickSpacing(1);
 * sldSocialcommunication.setPaintTicks(true);
 * panelSocial.add(sldSocialcommunication);
 * //----------------------------------------------------------------- JLabel
 * lblSocialcommunication = new JLabel("Communicate socialy ");
 * lblSocialcommunication.setFont(new Font("Century", Font.PLAIN, 20));
 * lblSocialcommunication.setBounds(399, 20, 214, 25);
 * panelSocial.add(lblSocialcommunication);
 * //----------------------------------------------------------------- JSlider
 * sldWaightCommunicateSocialy = new JSlider();
 * sldWaightCommunicateSocialy.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightCommunicateSocialy.setPaintLabels(true);
 * sldWaightCommunicateSocialy.setValue(5);
 * sldWaightCommunicateSocialy.setToolTipText("value form 1 to 10.");
 * sldWaightCommunicateSocialy.setMaximum(10);
 * sldWaightCommunicateSocialy.setBounds(399, 118, 200, 51);//
 * sldWaightCommunicateSocialy.setMajorTickSpacing(10);
 * sldWaightCommunicateSocialy.setMinorTickSpacing(1);
 * sldWaightCommunicateSocialy.setPaintTicks(true);
 * panelSocial.add(sldWaightCommunicateSocialy);
 * //###########################################################################
 * ########### // 10 JCheckBox cbBehaviour = new JCheckBox("Behavior"); //
 * cbBehaviour.setFont(new Font("Tahoma", Font.PLAIN, 20)); //
 * cbBehaviour.setBackground(Color.LIGHT_GRAY); // cbBehaviour.setBounds(734,
 * 60, 127, 25); // panelSocial.add(cbBehaviour);
 * //----------------------------------------------------------------- JSlider
 * sldBehavior = new JSlider(); sldBehavior.setBorder(new TitledBorder(null,
 * "User requirement", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
 * sldBehavior.setPaintLabels(true); sldBehavior.setValue(5);
 * sldBehavior.setToolTipText("value form 0 to 10."); sldBehavior.setMinimum(0);
 * sldBehavior.setMaximum(10); sldBehavior.setBounds(752, 49, 200, 60);//
 * sldBehavior.setMajorTickSpacing(10); sldBehavior.setMinorTickSpacing(1);
 * sldBehavior.setPaintTicks(true); panelSocial.add(sldBehavior);
 * //----------------------------------------------------------------- JLabel
 * lblBehavior = new JLabel("Behavior"); lblBehavior.setFont(new Font("Century",
 * Font.PLAIN, 20)); lblBehavior.setBounds(782, 20, 169, 25);
 * panelSocial.add(lblBehavior);
 * //----------------------------------------------------------------- JSlider
 * sldWaightBehavior = new JSlider(); sldWaightBehavior.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightBehavior.setPaintLabels(true); sldWaightBehavior.setValue(5);
 * sldWaightBehavior.setToolTipText("value form 1 to 10.");
 * sldWaightBehavior.setMaximum(10); sldWaightBehavior.setBounds(752, 118, 200,
 * 51);// sldWaightBehavior.setMajorTickSpacing(10);
 * sldWaightBehavior.setMinorTickSpacing(1);
 * sldWaightBehavior.setPaintTicks(true); panelSocial.add(sldWaightBehavior);
 * //###########################################################################
 * ########### // 11 JCheckBox cbEmotion = new JCheckBox("Emotion"); //
 * cbEmotion.setFont(new Font("Tahoma", Font.PLAIN, 20)); //
 * cbEmotion.setBackground(Color.LIGHT_GRAY); // cbEmotion.setBounds(929, 60,
 * 127, 25); // panelSocial.add(cbEmotion);
 * //----------------------------------------------------------------- JSlider
 * sldSEmotion = new JSlider(); sldSEmotion.setBorder(new TitledBorder(null,
 * "User requirement ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
 * sldSEmotion.setPaintLabels(true); sldSEmotion.setValue(5);
 * sldSEmotion.setToolTipText("value form 0 to 10."); sldSEmotion.setMinimum(0);
 * sldSEmotion.setMaximum(10); sldSEmotion.setBounds(1100, 49, 200, 60);//
 * sldSEmotion.setMajorTickSpacing(10); sldSEmotion.setMinorTickSpacing(1);
 * sldSEmotion.setPaintTicks(true); panelSocial.add(sldSEmotion);
 * //----------------------------------------------------------------- JLabel
 * lblEmotion = new JLabel("Emotion"); lblEmotion.setFont(new Font("Century",
 * Font.PLAIN, 20)); lblEmotion.setBounds(1134, 20, 161, 25);
 * panelSocial.add(lblEmotion);
 * //----------------------------------------------------------------- JSlider
 * sldWaightEmotion = new JSlider(); sldWaightEmotion.setBorder(new
 * TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weight ",
 * TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
 * sldWaightEmotion.setPaintLabels(true); sldWaightEmotion.setValue(5);
 * sldWaightEmotion.setToolTipText("value form 1 to 10.");
 * sldWaightEmotion.setMaximum(10); sldWaightEmotion.setBounds(1100, 118, 200,
 * 51); sldWaightEmotion.setMajorTickSpacing(10);
 * sldWaightEmotion.setMinorTickSpacing(1);
 * sldWaightEmotion.setPaintTicks(true); panelSocial.add(sldWaightEmotion);
 */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// NOt used 
//************************************************************************************************				
//for (Integer robotID : robotValues.keySet()) 						
//{	System.out.println(" the robot ID : " + robotID +" Goodness :"+ robotValues.get(robotID));  }
//System.out.println("*****************************");
//System.out.println(robotValues);
//private JTable RobotTable;
//DefaultListModel<String> DLM = new DefaultListModel<String>();
//Object[][] data  = new Object[][];
//*****************************************************************************
//JScrollPane scrollPane_2 = new JScrollPane();
//scrollPane_2.setBounds(1020,460, 320, 100);
//frame.getContentPane().add(scrollPane_2);
//JList<String> list = new JList<String>();
//scrollPane_2.setViewportView(list);
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//JScrollPane scrollPane_RobotTable = new JScrollPane();
//scrollPane_RobotTable.setBounds(1022, 650, 319, 100);
//frame.getContentPane().add(scrollPane_RobotTable);
//RobotTable = new JTable();
//scrollPane_RobotTable.setViewportView(RobotTable);
////$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
////RobotTable.setModel((TableModel) DLM);	
//String[] columnName  ={ "Robot Name", "Goodness"};
//for (Robots robotOb : GoodnessSortedRobotList)
//RobotTable.setPreferredScrollableViewportSize(new Dimension(400, 60));		
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//sldLearn.addChangeListener(new ChangeListener()
//{ public void stateChanged(ChangeEvent arg0) { // learnValue = 0;
//		learnValue = sldLearn.getValue();
//		// LE = ( learnValue == 0 )? "NO" : "YES";
//		if (learnValue == 0) {
//			LE = "NO";
//		} else {
//			LE = "YES";
//		}
//	}
//});
//*********************************************************************************************
// BestValue = Math.abs(((BestListRobot.get(0)).getembodiment()*
// (BestListRobot.get(0)).getembodiment())
// +
// ((BestListRobot.get(0)).getlearn()*(BestListRobot.get(0).getlearn()))-
// requestedValue
// );
// for (Robots R : RobotObjectsresult) {
// int ValueofRobot = Math.abs(
// ((R.getembodiment() * R.getembodiment()) + (R.getlearn() *
// R.getlearn())) - requestedValue);
// if (ValueofRobot < bestValue) {
// bestValue = ValueofRobot;
// bestRobot = R;
// }
// }
// for (Robots R : RobotObjectsresult) {
// int ValueofRobot = Math.abs(
// ((R.getembodiment() * R.getembodiment()) + (R.getlearn() *
// R.getlearn())) - requestedValue);
// if (ValueofRobot == bestValue)
// bestListRobot.add(R);
// }
// // DefaultListModel<String> DLM = new
// // DefaultListModel<String>();
// // for (String name : result)
// // //outputArea += name + " ";
// if (bestListRobot != null) {
// for (Robots R : bestListRobot) {
// String name;
// // name = BestRobot.getname();
// name = R.getname();
// DLM.addElement(name);
// }
// System.out.println(outputArea);
// list_2.setModel(DLM);
// }
// ####################################################################
// $ JOptionPane.showMessageDialog(null, stat);
// $ List<Robots> Objectsresult = new ArrayList<Robots>();
// $ Objectsresult = q.getRobotsObjectList(stat);
// $ System.out.println("Printing Objects of robots : ");
// $ System.out.println(Objectsresult);
// $ String outputArea= "";
// JOptionPane.showMessageDialog(null, Objectsresult);
/*
 * for(Robots R : Objectsresult) { String name; name = R.getname(); outputArea
 * += name + " "; DLM.addElement(name); } System.out.println(outputArea );
 * list_2.setModel(DLM);
 */ // ***************************************************
	// DefaultListModel<String> DLM = new
	// DefaultListModel<String>();
	// for (String name : Objectsresult)
	// { System.out.println(name);
	// DLM.addElement(name);
	// }
	// JOptionPane.showMessageDialog(null, outputArea);
	///////////////////////////////////////
	// for (int i = 0; i < Objectsresult.size(); i++) {
	// // System.out.println(
	// outputArea += Objectsresult.get(i).getname();
	// }
////#############################################################################333
// ####################################
// # StrLearn =cbLearn.isSelected()? "YES": "NO";
// # StrLearn = LE;
// # StrLearn = sldLearn.getValue() ==10 ? "YES": "NO";
// ####################################
// String StrMobility, StrManipolation, StrProxInter, StrEmbodiment;
// String StrIdentifying, StrAimAndGoal, StrLearn;
// String StrInterStructure, StrSocialcommunication, StrBehaviour, StrEmotion;

// StrMobility = cbMobility.isSelected() ? "YES" : "NO";
// StrManipolation = cbManipolation.isSelected() ? "YES" : "NO";
// StrProxInter = cbProxInter.isSelected() ? "YES" : "NO";
// ####################################
// # StrEmbodiment = cbEmbodiment.isSelected()? "YES": "NO";
// # StrEmbodiment = Embod;
// # StrEmbodiment = sldEmbod.getValue()==10 ? "YES": "NO";
// ####################################
// StrIdentifying = cbIdentifying.isSelected() ? "YES" : "NO";
// StrAimAndGoal = cbAimAndGoal.isSelected() ? "YES" : "NO";

// StrInterStructure = cbInterStructure.isSelected() ? "YES" : "NO";
// StrSocialcommunication = cbSocialcommunication.isSelected() ? "YES" : "NO";
// StrBehaviour = cbBehaviour.isSelected() ? "YES" : "NO";
// StrEmotion = cbEmotion.isSelected() ? "YES" : "NO";

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
//DefaultListModel<String> DLM = new DefaultListModel<String>();
// for (String name : result) { System.out.println(name);
// DLM.addElement(name); } list_2.setModel(DLM);
// 			st = "SELECT * FROM ROBOTS WHERE" 
//						+ " mobile = \"" + StrMobility + "\" AND " + " manipulating = \""
//						+ StrManipolation + "\" AND " + " proximity_inter = \"" + StrProxInter + "\"  "
//						// $ + " embodiment = "+ sldEmbod.getValue()
//						+ " AND " + " identify = \"" + StrIdentifying + "\"  "
//						// $ + " learn = " + sldLearn.getValue()
//						+ " AND " + " aim = \"" + StrAimAndGoal + "\" AND " + " inter_structure = \""
//						+ StrInterStructure + "\" AND " + " social_comm = \"" + StrSocialcommunication + "\" AND "
//						+ " behaviour = \"" + StrBehaviour + "\" AND " + " emotions = \"" + StrEmotion + "\";";
//#########################################################################3
// # st = "SELECT * FROM ROBOTS WHERE"
// # + " mobile = \""+ StrMobility
// # +"\" AND " + " manipulating = \""+ StrManipolation
// # +"\" AND " + " proximity_inter = \""+ StrProxInter
// # +"\" AND " + " embodiment = \""+ StrEmbodiment
// # +"\" AND " + " identify = \""+ StrIdentifying
// # +"\" AND " + " learn = \""+ StrLearn
// # +"\" AND " + " aim = \""+ StrAimAndGoal
// # +"\" AND " + " inter_structure = \""+ StrInterStructure
// # +"\" AND " + " social_comm = \""+ StrSocialcommunication
// # +"\" AND " + " behaviour = \""+ StrBehaviour
// # +"\" AND " + " emotions = \""+ StrEmotion
// # +"\";";
// ####################################################################
/*
 * String s = ""; s = "SELECT name FROM ROBOTS WHERE" + " mobile = \""+
 * StrMobility +"\" AND " + " manipulating = \"" + StrManipolation +"\" AND " +
 * " proximity_inter = \""+ StrProxInter +"\" AND " + " embodiment = \""+
 * StrEmbodiment + "\" AND " + " identify = \""+ StrIdentifying +"\" AND " +
 * " learn = \""+ StrLearn +"\" AND " + " aim = \""+ StrAimAndGoal +"\" AND " +
 * " inter_structure = \""+ StrInterStructure +"\" AND " + " social_comm = \""+
 * StrSocialcommunication +"\" AND " + " behaviour = \""+ StrBehaviour
 * +"\" AND " + " emotions = \""+ StrEmotion +"\";";
 * JOptionPane.showMessageDialog(null, s); List<String> result = new
 * ArrayList<String>(); result = q.getRobots(s); System.out.println(result);
 * JOptionPane.showMessageDialog(null, result);
 */
//###########################################################################
// $ String stat;
// $ stat = "SELECT * FROM ROB WHERE"
// $ + " mobile = \""+ StrMobility
// $ +"\" AND " + " manipulating = \""+ StrManipolation
// $ +"\" AND " + " proximity_inter = \""+ StrProxInter
// $ +"\" AND " + " embodiment = "+ sldEmbod.getValue()
// $ +" AND " + " identify = \""+ StrIdentifying
// $ +"\" AND " + " learn = " + sldLearn.getValue()
// $ +" AND " + " aim = \""+ StrAimAndGoal
// $ +"\" AND " + " inter_structure = \""+ StrInterStructure
// $ +"\" AND " + " social_comm = \""+ StrSocialcommunication
// $ +"\" AND " + " behaviour = \""+ StrBehaviour
// $ +"\" AND " + " emotions = \""+ StrEmotion
// $ +"\";";
// $ System.out.println();
// $ System.out.println(stat);
// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
// int requestedVale= (sldEmbod.getValue()*sldEmbod.getValue())+ (sldLearn.getValue()*sldLearn.getValue());
///////////////////////////////////////////////////////////////////////////////
//JSlider sldEmbod = new JSlider();
//sldEmbod.addChangeListener(new ChangeListener() {
//	public void stateChanged(ChangeEvent arg0) { // EmbodimentValue =
//													// sldEmbod.getValue();
//													// LE = ( learnValue
//													// == 0 )? "NO" :
//													// "YES";
//		if (sldEmbod.getValue() == 0) {
//			Embod = "NO";
//		} else {
//			Embod = "YES";
//		}
//	}
//});
//sldEmbod.setToolTipText("value form 0 to 10.");
//sldEmbod.setMaximum(10);
//sldEmbod.setValue(0);
//sldEmbod.setBounds(520, 74, 245, 26);
//panelMech.add(sldEmbod);

//******************************************************************************
//  a user requested Value is calculated in a variable called "requestedValue".
//	int requestedValue = (sldLearn.getValue() * sldLearn.getValue())
//						+ (sldEmbod.getValue() * sldEmbod.getValue());
//	System.out.println("requested value is :" + requestedValue);

