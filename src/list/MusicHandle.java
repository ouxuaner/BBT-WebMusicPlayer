package list;

import javax.tools.JavaFileObject;

public class MusicHandle {
	/**查找歌手信息
	 * @return 歌手的briefDesc--返回格式待定（可以是String，JsonObject）*/
	public String getArtistInformation(String ID,String IDType){String s = null;return s;};
	/**查找专辑信息
	 * @return --返回格式待定（可以是String，JsonObject）*/
	public String getAlbumInformation(String ID,String IDType){String s = null;return s;};
	/**查找其中一名歌手的歌曲列表
	 * @return --返回格式待定（可以是String，JsonObject）*/
	public String getArtistSongList(String ID,String IDType,int Offset,int Limit){String s = null;return s;};
	/**查找其中一个专辑中包含的歌曲列表
	 * @return --返回格式待定（可以是String，JsonObject）*/
	public String getAlbumSongList(String ID,String IDType,int Offset,int Limit){String s = null;return s;};
	/**查找其中一个歌手的专辑列表
	 * @return --返回格式待定（可以是String，JsonObject）*/
	public String getArtistAlbumList(String ID,String IDType,int Offset,int Limit){String s = null;return s;};
	/**
	 * 获取分类列表*/
	public JavaFileObject getCategoryList(){JavaFileObject s = null;
	return s;};
	

}
