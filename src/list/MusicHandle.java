package list;

import javax.tools.JavaFileObject;

public class MusicHandle {
	/**���Ҹ�����Ϣ
	 * @return ���ֵ�briefDesc--���ظ�ʽ������������String��JsonObject��*/
	public String getArtistInformation(String ID,String IDType){String s = null;return s;};
	/**����ר����Ϣ
	 * @return --���ظ�ʽ������������String��JsonObject��*/
	public String getAlbumInformation(String ID,String IDType){String s = null;return s;};
	/**��������һ�����ֵĸ����б�
	 * @return --���ظ�ʽ������������String��JsonObject��*/
	public String getArtistSongList(String ID,String IDType,int Offset,int Limit){String s = null;return s;};
	/**��������һ��ר���а����ĸ����б�
	 * @return --���ظ�ʽ������������String��JsonObject��*/
	public String getAlbumSongList(String ID,String IDType,int Offset,int Limit){String s = null;return s;};
	/**��������һ�����ֵ�ר���б�
	 * @return --���ظ�ʽ������������String��JsonObject��*/
	public String getArtistAlbumList(String ID,String IDType,int Offset,int Limit){String s = null;return s;};
	/**
	 * ��ȡ�����б�*/
	public JavaFileObject getCategoryList(){JavaFileObject s = null;
	return s;};
	

}
