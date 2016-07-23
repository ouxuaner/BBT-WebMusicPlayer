package list;


public class Song {
	/**@author cjy
	*/
	
	public Song(){};
	private String url;
	/**id   歌曲，歌手，专辑，mv，歌词的id,所属歌单id,专辑图片id*/
	private String id;
	/**idType 类型为song,artist,album,mv,lyc,list,picture*/
	private String idType;
	/**name  歌曲，歌手，专辑，mv，歌词的名字，所属歌单的名字*/
	private String name;
	/**包括song，artist，album,mv,lyc,list，picture*/
	private String nameType;
	/**playCount 记录已经播放的位置*/
	private int playCount;
	private String briefDesc; 
	/** 歌曲，歌手，专辑，mv的描述--描述词分别为-song，artist，album，mv*/
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
