package list;

public class MyMusic {
	//对song的操作
	public void addMusicToaMyList(final User user,String songID,String MyListID){};
	public void downloadMusic(final User user,String ID,String IDType){};
	public void uploadMusic(final User user,String Name,String NameType){};
	public void deleteMusic(final User user,String ID,String IDType){};
	public void moveMusic(final User user,String songID,String ListID){
		//分配一个新的id地址，post到服务器
	};
	//对Mylist的操作
	public void addMyList(final User user,String Name,String NameType){
		//分配一个新的id地址，post到服务器
	};
	public void deleteMyList(final User user,String ID,String IDType){
	};
	
	
}
