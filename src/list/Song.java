package list;


public class Song {
	/**@author cjy
	*/
	
	public Song(){};
	private String url;
	/**id   ���������֣�ר����mv����ʵ�id,�����赥id,ר��ͼƬid*/
	private String id;
	/**idType ����Ϊsong,artist,album,mv,lyc,list,picture*/
	private String idType;
	/**name  ���������֣�ר����mv����ʵ����֣������赥������*/
	private String name;
	/**����song��artist��album,mv,lyc,list��picture*/
	private String nameType;
	/**playCount ��¼�Ѿ����ŵ�λ��*/
	private int playCount;
	private String briefDesc; 
	/** ���������֣�ר����mv������--�����ʷֱ�Ϊ-song��artist��album��mv*/
	private String briefDescType;
	private String artistSex;
	private int priority;
	private int statusCode;
	
	
	/**@return id*/
	public String getID(){/**@*/ return id;};
	/**@return idType*/
	public String getidType(){return idType;};
	public String getName(){return name;};
	public int getPlayCount(){return playCount;};
	public String getBriefDesc(){return briefDesc;};
	public int getStatusCode(){return statusCode; };
	
	
	public void setID(String ID){this.id=ID;};
	public void setIDType(String IDType){this.idType=IDType;};
	public void setName(String Name){this.name=Name;};
	public void setPlayCount(int PlayCount){this.playCount=PlayCount;};
	public void setBriefDesc(String BriefDesc){this.briefDesc=BriefDesc;};
	public void setStatusCode(int StatusCode){this.statusCode=StatusCode;};
	
	
	
	
	
	
};
