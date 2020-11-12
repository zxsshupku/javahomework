import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.security.MessageDigest;
import java.util.Vector;

public class hash {
	//定义一个全局字符串vector来记录每个文件路径
	static Vector<String> dfsFile = new Vector<String>();
	
	public static void dfs(String path) {
		File dir = new File(path);
		File[] fs = dir.listFiles();
		for(int i = 0; i < fs.length; i++) {
			//稍微修改dfs算法，如果是文件就将路径存入dfsFile组
			if(fs[i].isFile()) {
				dfsFile.add(path + File.separator+fs[i].getName());
			}
			if(fs[i].isDirectory()) {
				dfs(path + File.separator + fs[i].getName());
			}
		}
	}
	
	public static byte[] SHA1Checksum(InputStream is) throws Exception{
		byte[] buffer = new byte[1024];
		MessageDigest complete = MessageDigest.getInstance("SHA-1");
		int numRead = 0;
		do {
			numRead = is.read(buffer);
			if(numRead > 0) {
				complete.update(buffer, 0, numRead);
			}
		}while(numRead != -1);
		is.close();
		return complete.digest();
	}

	public static void main(String[] args) {
		try {
			dfs("D:\\hashtest");
			Vector<InputStream> streams = new Vector<>();
			//做一个循环，将每个文件的输入流存入一个vector里
			for(int i = 0; i < dfsFile.size(); i++) {
				File file = new File(dfsFile.elementAt(i));
				FileInputStream is = new FileInputStream(file);
				streams.add(is);
			}
			//合并所有的输入流
			SequenceInputStream allis = new SequenceInputStream(streams.elements());
			byte[] sha1 = SHA1Checksum(allis);
			String result = "";
			for(int i = 0; i< sha1.length; i++) {
				result += Integer.toString(sha1[i]&0xFF, 16);
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
