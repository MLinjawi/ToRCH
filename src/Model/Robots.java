package Model;

public class Robots {
//	private int id;
//	private String name;
//	private String socialtype;
//	private int mobile;
//	private int manipulating;
//	private int proximity_inter;
//	private int embodiment;
//	private int identify;
//	private int learn;
//	private int aim;
//	private int inter_structure;
//	private int social_comm;
//	private int Behavior ;
//	private int emotion;

//Rob table
	private int Id;
	private String Name;
	private int PObj;
	private int PDigInfo;
	private int PSoAg;
	private int PEm;
	private int PSoBeh;
	private int PGen;
	private int PEnviro;
	private int PSelfLoc;
	private int PObjLoc;
	private int PSoAgLoc;
	private int PTrace;
	private String PMod;
	private int PhyObjInter;
	private int CogInterp;
	private int SoInterp;
	private int UnConsMo;
	private int ConsMo;
	private int Grap;
	private int Hold;
	private int Handle;
	private int Knowl;
	private int Cog;
	private int EmExp;
	private int SoBehExp;
	private int SoSkill;
	private int GenAction;
	private int ActPurObj;
	private int ActPurPpl;
	private int ActPurInfo;
	private int EnvPhysi;
	private int EnvSo;
	private int EnvInfo;
	private int EnvCog;
	private int DeciAuto;
	private int TaskAdap;
	private int SysDepen;
	private int HRIFeedBack;
	private int HRIModel;
	private int SoHRILevel;
	private int ObjInter;
	private int RToR;
	private int RToD;
	private int PhyMotionInter;
	private int SoCogInter;
	private int LearnInter;
	private int CogInter;
	private int MethodInter;
	private int HRIProximity;
	private String TalSkil;
	private String Intel;

	public Robots() {
	}

	public Robots(int Id, String Name, int PObj, int PDigInfo, int PSoAg, int PEm, int PSoBeh, int PGen, int PEnviro,
			int PSelfLoc, int PObjLoc, int PSoAgLoc, int PTrace, String PMod, int PhyObjInter, int CogInterp,
			int SoInterp, int UnConsMo, int ConsMo, int Grap, int Hold, int Handle, int Knowl, int Cog, int EmExp,
			int SoBehExp, int SoSkill, int GenAction, int ActPurObj, int ActPurPpl, int ActPurInfo, int EnvPhysi,
			int EnvSo, int EnvInfo, int EnvCog, int DeciAuto, int TaskAdap, int SysDepen, int HRIFeedBack, int HRIModel,
			int SoHRILevel, int ObjInter, int RToR, int RToD, int PhyMotionInter, int SoCogInter, int LearnInter,
			int CogInter, int MethodInter, int HRIProximity, String TalSkil, String Intel) {
		this.Id = Id;
		this.Name = Name;
		this.PObj = PObj;
		this.PDigInfo = PDigInfo;
		this.PSoAg = PSoAg;
		this.PEm = PEm;
		this.PSoBeh = PSoBeh;
		this.PGen = PGen;
		this.PEnviro = PEnviro;
		this.PSelfLoc = PSelfLoc;
		this.PObjLoc = PObjLoc;
		this.PSoAgLoc = PSoAgLoc;
		this.PTrace = PTrace;
		this.PMod = PMod;
		this.PhyObjInter = PhyObjInter;
		this.CogInterp = CogInterp;
		this.SoInterp = SoInterp;
		this.UnConsMo = UnConsMo;
		this.ConsMo = ConsMo;
		this.Grap = Grap;
		this.Hold = Hold;
		this.Handle = Handle;
		this.Knowl = Knowl;
		this.Cog = Cog;
		this.EmExp = EmExp;
		this.SoBehExp = SoBehExp;
		this.SoSkill = SoSkill;
		this.GenAction = GenAction;
		this.ActPurObj = ActPurObj;
		this.ActPurPpl = ActPurPpl;
		this.ActPurInfo = ActPurInfo;
		this.EnvPhysi = EnvPhysi;
		this.EnvSo = EnvSo;
		this.EnvInfo = EnvInfo;
		this.EnvCog = EnvCog;
		this.DeciAuto = DeciAuto;
		this.DeciAuto = TaskAdap;
		this.SysDepen = SysDepen;
		this.HRIFeedBack = HRIFeedBack;
		this.HRIModel = HRIModel;
		this.SoHRILevel = SoHRILevel;
		this.ObjInter = ObjInter;
		this.RToR = RToR;
		this.RToD = RToD;
		this.PhyMotionInter = PhyMotionInter;
		this.SoCogInter = SoCogInter;
		this.LearnInter = LearnInter;
		this.CogInter = CogInter;
		this.MethodInter = MethodInter;
		this.HRIProximity = HRIProximity;
		this.TalSkil = TalSkil;
		this.Intel = Intel;
	}

	public Robots(String RName, int RPObj, int RPDigInfo, int RPSoAg, int RPEm, int RPSoBeh, int RPGen, int RPEnviro,
			int RPSelfLoc, int RPObjLoc, int RPSoAgLoc, int RPTrace, String RPMod, int RPhyObjInter, int RCogInterp,
			int RSoInterp, int RUnConsMo, int RConsMo, int RGrap, int RHold, int RHandle, int RKnowl, int RCog,
			int REmExp, int RSoBehExp, int RSoSkill, int RGenAction, int RActPurObj, int RActPurPpl, int RActPurInfo,
			int REnvPhysi, int REnvSo, int REnvInfo, int REnvCog, int RDeciAuto, int RTaskAdap, int RSysDepen,
			int RHRIFeedBack, int RHRIModel, int RSoHRILevel, int RObjInter, int RRToR, int RRToD, int RPhyMotionInter,
			int RSoCogInter, int RLearnInter, int RCogInter, int RMethodInter, int RHRIProximity, String RTalSkil,
			String RIntel) {
		Name = RName;
		PObj = RPObj;
		PDigInfo = RPDigInfo;
		PSoAg = RPSoAg;
		PEm = RPEm;
		PSoBeh = RPSoBeh;
		PGen = RPGen;
		PEnviro = RPEnviro;
		PSelfLoc = RPSelfLoc;
		PObjLoc = RPObjLoc;
		PSoAgLoc = RPSoAgLoc;
		PTrace = RPTrace;
		PMod = RPMod;
		PhyObjInter = RPhyObjInter;
		CogInterp = RCogInterp;
		SoInterp = RSoInterp;
		UnConsMo = RUnConsMo;
		ConsMo = RConsMo;
		Grap = RGrap;
		Hold = RHold;
		Handle = RHandle;
		Knowl = RKnowl;
		Cog = RCog;
		EmExp = REmExp;
		SoBehExp = RSoBehExp;
		SoSkill = RSoSkill;
		GenAction = RGenAction;
		ActPurObj = RActPurObj;
		ActPurPpl = RActPurPpl;
		ActPurInfo = RActPurInfo;
		EnvPhysi = REnvPhysi;
		EnvSo = REnvSo;
		EnvInfo = REnvInfo;
		EnvCog = REnvCog;
		DeciAuto = RDeciAuto;
		TaskAdap = RTaskAdap;
		SysDepen = RSysDepen;
		HRIFeedBack = RHRIFeedBack;
		HRIModel = RHRIModel;
		SoHRILevel = RSoHRILevel;
		ObjInter = RObjInter;
		RToR = RRToR;
		RToD = RRToD;
		PhyMotionInter = RPhyMotionInter;
		SoCogInter = RSoCogInter;
		LearnInter = RLearnInter;
		CogInter = RCogInter;
		MethodInter = RMethodInter;
		HRIProximity = RHRIProximity;
		TalSkil = RTalSkil;
		Intel = RIntel;
	}

	public void setID(int RID) {
		Id = RID;
	}

	public int getID() {
		return Id;
	}

	//
	public void setname(String Rname) {
		Name = Rname;
	}

	public String getname() {
		return Name;
	}

	//
	public void setPObj(int RPObj) {
		PObj = RPObj;
	}

	public int getPObj() {
		return PObj;
	}

	//
	public void setPDigInfo(int RPDigInfo) {
		PDigInfo = RPDigInfo;
	}

	public int getPDigInfo() {
		return PDigInfo;
	}

	//
	public void setPSoAg(int RPSoAg) {
		PSoAg = RPSoAg;
	}

	public int getPSoAg() {
		return PSoAg;
	}

	//
	public void setPEm(int RPEm) {
		PEm = RPEm;
	}

	public int getPEm() {
		return PEm;
	}

	//
	public void setPSoBeh(int RPSoBeh) {
		PSoBeh = RPSoBeh;
	}

	public int getPSoBeh() {
		return PSoBeh;
	}

	//
	public void setPGen(int RPGen) {
		PGen = RPGen;
	}

	public int getPGen() {
		return PGen;
	}

	//
	public void setPEnviro(int RPEnviro) {
		PEnviro = RPEnviro;
	}

	public int getPEnviro() {
		return PEnviro;
	}

	//
	public void setPSelfLoc(int RPSelfLoc) {
		PSelfLoc = RPSelfLoc;
	}

	public int getPSelfLoc() {
		return PSelfLoc;
	}

	//
	public void setPObjLoc(int RPObjLoc) {
		PObjLoc = RPObjLoc;
	}

	public int getPObjLoc() {
		return PObjLoc;
	}

	//
	public void setPSoAgLoc(int RPSoAgLoc) {
		PSoAgLoc = RPSoAgLoc;
	}

	public int getPSoAgLoc() {
		return PSoAgLoc;
	}

	//
	public void setPTrace(int RPTrace) {
		PTrace = RPTrace;
	}

	public int getPTrace() {
		return PTrace;
	}

	//
	public void setPMod(String RPMod) {
		PMod = RPMod;
	}

	public String getPMod() {
		return PMod;
	}

	//
	public void setPhyObjInter(int RPhyObjInter) {
		PhyObjInter = RPhyObjInter;
	}

	public int getPhyObjInter() {
		return PhyObjInter;
	}

	// this.CogInterp = CogInterp;
	public void setCogInterp(int RCogInterp) {
		CogInterp = RCogInterp;
	}

	public int getCogInterp() {
		return CogInterp;
	}

	// this.SoInterp = SoInterp;
	public void setSoInterp(int RSoInterp) {
		SoInterp = RSoInterp;
	}

	public int getSoInterp() {
		return SoInterp;
	}

	// this.UnConsMo = UnConsMo;
	public void setUnConsMo(int RUnConsMo) {
		UnConsMo = RUnConsMo;
	}

	public int getUnConsMo() {
		return UnConsMo;
	}

	// this.ConsMo = ConsMo;
	public void setConsMo(int RConsMo) {
		ConsMo = RConsMo;
	}

	public int getConsMo() {
		return ConsMo;
	}

	// this.Grap = Grap;
	public void setGrap(int RGrap) {
		Grap = RGrap;
	}

	public int getGrap() {
		return Grap;
	}

	// this.Hold = Hold;
	public void setHold(int RHold) {
		Hold = RHold;
	}

	public int getHold() {
		return Hold;
	}

	// this.Handle= Handle;
	public void setHandle(int RHandle) {
		Handle = RHandle;
	}

	public int getHandle() {
		return Handle;
	}

	// this.Knowl= Knowl;
	public void setKnowl(int RKnowl) {
		Knowl = RKnowl;
	}

	public int getKnowl() {
		return Knowl;
	}

	// this.Cog= Cog;
	public void setCog(int RCog) {
		Cog = RCog;
	}

	public int getCog() {
		return Cog;
	}

	// this.EmExp= EmExp;
	public void setEmExp(int REmExp) {
		EmExp = REmExp;
	}

	public int getEmExp() {
		return EmExp;
	}

	// this.SoBehExp = SoBehExp;
	public void setSoBehExp(int RSoBehExp) {
		SoBehExp = RSoBehExp;
	}

	public int getSoBehExp() {
		return SoBehExp;
	}

	// this.SoSkill = SoSkill;
	public void setSoSkill(int RSoSkill) {
		SoSkill = RSoSkill;
	}

	public int getSoSkill() {
		return SoSkill;
	}

	// this.GenAction= GenAction;
	public void setGenAction(int RGenAction) {
		GenAction = RGenAction;
	}

	public int getGenAction() {
		return GenAction;
	}

	// this.ActPurObj = ActPurObj;
	public void setActPurObj(int RActPurObj) {
		ActPurObj = RActPurObj;
	}

	public int getActPurObj() {
		return ActPurObj;
	}

	// this.ActPurPpl = ActPurPpl;
	public void setActPurPpl(int RActPurPpl) {
		ActPurPpl = RActPurPpl;
	}

	public int getActPurPpl() {
		return ActPurPpl;
	}

	// this.ActPurInfo= ActPurInfo;
	public void setActPurInfo(int RActPurInfo) {
		ActPurInfo = RActPurInfo;
	}

	public int getActPurInfo() {
		return ActPurInfo;
	}

	// this.EnvPhysi= EnvPhysi;
	public void setEnvPhysi(int REnvPhysi) {
		EnvPhysi = REnvPhysi;
	}

	public int getEnvPhysi() {
		return EnvPhysi;
	}

	// this.EnvSo = EnvSo;
	public void setEnvSo(int REnvSo) {
		EnvSo = REnvSo;
	}

	public int getEnvSo() {
		return EnvSo;
	}

	// this.EnvInfo= EnvInfo;
	public void setEnvInfo(int REnvInfo) {
		EnvInfo = REnvInfo;
	}

	public int getEnvInfo() {
		return EnvInfo;
	}

	// this.EnvCog = EnvCog;
	public void setEnvCog(int REnvCog) {
		EnvCog = REnvCog;
	}

	public int getEnvCog() {
		return EnvCog;
	}

	// this.DeciAuto = DeciAuto;
	public void setDeciAuto(int RDeciAuto) {
		DeciAuto = RDeciAuto;
	}

	public int getDeciAuto() {
		return DeciAuto;
	}

	// this.TaskAdap= TaskAdap;
	public void setTaskAdap(int RTaskAdap) {
		TaskAdap = RTaskAdap;
	}

	public int getTaskAdap() {
		return TaskAdap;
	}

	// this.SysDepen= SysDepen;
	public void setSysDepen(int RSysDepen) {
		SysDepen = RSysDepen;
	}

	public int getSysDepen() {
		return SysDepen;
	}

	// this.HRIFeedBack = HRIFeedBack;
	public void setHRIFeedBack(int RHRIFeedBack) {
		HRIFeedBack = RHRIFeedBack;
	}

	public int getHRIFeedBack() {
		return HRIFeedBack;
	}

	// this.HRIModel = HRIModel;
	public void setHRIModel(int RHRIModel) {
		HRIModel = RHRIModel;
	}

	public int getHRIModel() {
		return HRIModel;
	}

	// this.SoHRILevel = SoHRILevel;
	public void setSoHRILevel(int RSoHRILevel) {
		SoHRILevel = RSoHRILevel;
	}

	public int getSoHRILevel() {
		return SoHRILevel;
	}

	// this.ObjInter = ObjInter;
	public void setObjInter(int RObjInter) {
		ObjInter = RObjInter;
	}

	public int getObjInter() {
		return ObjInter;
	}

	// this.RToR = RToR;
	public void setRToR(int RRToR) {
		RToR = RRToR;
	}

	public int getRToR() {
		return RToR;
	}

	// this.RToD = RToD;
	public void setRToD(int RRToD) {
		RToD = RRToD;
	}

	public int getRToD() {
		return RToD;
	}

	// this.PhyMotionInter = PhyMotionInter;
	public void setPhyMotionInter(int RPhyMotionInter) {
		PhyMotionInter = RPhyMotionInter;
	}

	public int getPhyMotionInter() {
		return PhyMotionInter;
	}

	// this.SoCogInter = SoCogInter;
	public void setSoCogInter(int RSoCogInter) {
		SoCogInter = RSoCogInter;
	}

	public int getSoCogInter() {
		return SoCogInter;
	}

	// this.LearnInter = LearnInter;
	public void setLearnInter(int RLearnInter) {
		LearnInter = RLearnInter;
	}

	public int getLearnInter() {
		return LearnInter;
	}

	// this.CogInter = CogInter;
	public void setCogInter(int RCogInter) {
		CogInter = RCogInter;
	}

	public int getCogInter() {
		return CogInter;
	}

	// this.MethodInter = MethodInter;
	public void setMethodInter(int RMethodInter) {
		MethodInter = RMethodInter;
	}

	public int getMethodInter() {
		return MethodInter;
	}

	// this.HRIProximity = HRIProximity;
	public void setHRIProximity(int RHRIProximity) {
		HRIProximity = RHRIProximity;
	}

	public int getHRIProximity() {
		return HRIProximity;
	}

	// his.TalSkil = TalSkil;
	public void setTalSkil(String RTalSkil) {
		TalSkil = RTalSkil;
	}

	public String getTalSkil() {
		return TalSkil;
	}

	// this.Intel= Intel ;
	public void setIntel(String RIntel) {
		Intel = RIntel;
	}

	public String getIntel() {
		return Intel;
	}

	public void Display() {

		System.out.println("The Robot value presented as : " + getID() + " " + getname() + " " + getPObj() + " "
				+ getPDigInfo() + " " + getPSoAg() + " " + getPEm() + " " + getPSoBeh() + " " + getPGen() + " "
				+ getPEnviro() + " " + getPSelfLoc() + " " + getPObjLoc() + " " + getPSoAgLoc() + " " + getPTrace()
				+ " " + getPMod() + " " + getPhyObjInter() + " " + getCogInterp() + " " + getSoInterp() + " "
				+ getUnConsMo() + " " + getConsMo() + " " + getGrap() + " " + getHold() + " " + getHandle() + " "
				+ getKnowl() + " " + getCog() + " " + getEmExp() + " " + getSoBehExp() + " " + getSoSkill() + " "
				+ getGenAction() + " " + getActPurObj() + " " + getActPurPpl() + " " + getActPurInfo() + " "
				+ getEnvPhysi() + " " + getEnvSo() + " " + getEnvInfo() + " " + getEnvCog() + " " + getDeciAuto() + " "
				+ getTaskAdap() + " " + getSysDepen() + " " + getHRIFeedBack() + " " + getHRIModel() + " "
				+ getSoHRILevel() + " " + getObjInter() + " " + getRToR() + " " + getRToD() + " " + getPhyMotionInter()
				+ " " + getSoCogInter() + " " + getLearnInter() + " " + getCogInter() + " " + getMethodInter() + " "
				+ getHRIProximity() + " " + getTalSkil() + " " + getIntel());

	}

	public void ToString() {

		System.out.println("The Robot value presented as : " + getID() + " " + getname() + " " + getPObj() + " "
				+ getPDigInfo() + " " + getPSoAg() + " " + getPEm() + " " + getPSoBeh() + " " + getPGen() + " "
				+ getPEnviro() + " " + getPSelfLoc() + " " + getPObjLoc() + " " + getPSoAgLoc() + " " + getPTrace()
				+ " " + getPMod() + " " + getPhyObjInter() + " " + getCogInterp() + " " + getSoInterp() + " "
				+ getUnConsMo() + " " + getConsMo() + " " + getGrap() + " " + getHold() + " " + getHandle() + " "
				+ getKnowl() + " " + getCog() + " " + getEmExp() + " " + getSoBehExp() + " " + getSoSkill() + " "
				+ getGenAction() + " " + getActPurObj() + " " + getActPurPpl() + " " + getActPurInfo() + " "
				+ getEnvPhysi() + " " + getEnvSo() + " " + getEnvInfo() + " " + getEnvCog() + " " + getDeciAuto() + " "
				+ getTaskAdap() + " " + getSysDepen() + " " + getHRIFeedBack() + " " + getHRIModel() + " "
				+ getSoHRILevel() + " " + getObjInter() + " " + getRToR() + " " + getRToD() + " " + getPhyMotionInter()
				+ " " + getSoCogInter() + " " + getLearnInter() + " " + getCogInter() + " " + getMethodInter() + " "
				+ getHRIProximity() + " " + getTalSkil() + " " + getIntel());

	}

	public String getRobotIdentity() {
		String result = "";
		result += getID() + " " + getname();
		return result;

	}

}

//********************************************************************
/*
 * public void setsocialtype(String Rsocialtype) {socialtype = Rsocialtype; }
 * public String getsocialtype() {return socialtype; }
 * 
 * public void setmobile(int i) {mobile = i; } public int getmobile() {return
 * mobile; }
 * 
 * public void setmanipulating(int Rmanipulating) {manipulating = Rmanipulating;
 * } public int getmanipulating() {return manipulating; }
 * 
 * public void setproximity_inter(int Rproximity_inter) {proximity_inter =
 * Rproximity_inter; } public int getproximity_inter() {return proximity_inter;
 * }
 * 
 * public void setembodiment(int Rembodiment) {embodiment = Rembodiment; }
 * public int getembodiment() {return embodiment; }
 * 
 * public void setidentify(int Ridentify) {identify = Ridentify; } public int
 * getidentify() {return identify; }
 * 
 * public void setlearn(int Rlearn) {learn = Rlearn; } public int getlearn()
 * {return learn; }
 * 
 * public void setaim(int Raim) {aim = Raim; } public int getaim() {return aim;
 * }
 * 
 * public void setinter_structure(int Rinter_structure) {inter_structure =
 * Rinter_structure; } public int getinter_structure() {return inter_structure;
 * }
 * 
 * public void setsocial_comm(int Rsocial_comm) {social_comm = Rsocial_comm; }
 * public int getsocial_comm() {return social_comm; }
 * 
 * public void setbehaviour(int Rbehavior) {Behavior = Rbehavior; } public int
 * getbehaviour() {return Behavior ; }
 * 
 * public void setemotion(int Remotion) {emotion = Remotion; } public int
 * getemotion() {return emotion; }
 * 
 */
//********************************************************************
/*
 * id = Rid; name = Rname; socialtype = Rsocialtype; mobile = Rmobile;
 * manipulating = Rmanipulating; proximity_inter = Rproximity_inter; embodiment
 * = Rembodiment; identify = Ridentify; learn = Rlearn; aim = Raim;
 * inter_structure = Rinter_structure; social_comm = Rsocial_comm; Behavior =
 * Rbehavior ; emotion = Remotion;
 */
