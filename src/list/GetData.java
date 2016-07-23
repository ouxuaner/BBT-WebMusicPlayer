package list;

import javax.tools.JavaFileObject;

public class GetData {
	/**从后台获取数据，得到的数据以jsonobject形式呈现,!!注意其中的JavaFileObject全部替换成JSONObject!*/
	public JavaFileObject getData(final User user,String ID,String IDType, JavaFileObject jsonObject){return jsonObject;};
	public JavaFileObject getData(String ID,String IDType, JavaFileObject jsonObject){return jsonObject;};
}
