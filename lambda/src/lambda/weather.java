package lambda;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class weather {
	public static void main(String[] args) {
		String param = "version=v1";
		StringBuilder sb = new StringBuilder();
		InputStream is = null;
		BufferedReader br = null;
		PrintWriter out = null;
		try {
		    //�ӿڵ�ַ
		    String url = "https://www.tianqiapi.com/api/";
		    URL    uri = new URL(url);
		    HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
		    connection.setRequestMethod("POST");
		    connection.setReadTimeout(5000);
		    connection.setConnectTimeout(10000);
		    connection.setRequestProperty("accept", "*/*");
		    //���Ͳ���
		    connection.setDoOutput(true);
		    out = new PrintWriter(connection.getOutputStream());
		    out.print(param);
		    out.flush();
		    //���ս��
		    is = connection.getInputStream();
		    br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		    String line;
		    //�������ж�ȡ
		    while ( ( line = br.readLine() ) != null ) {
		        sb.append(line);
		    }
		    System.out.println(sb.toString());
		} catch ( Exception ignored ) {
		} finally {
		    //�ر���
		    try {
		        if(is!=null){
		            is.close();
		        }
		        if(br!=null){
		            br.close();
		        }
		        if (out!=null){
		            out.close();
		        }
		    } catch ( Exception ignored ) {}
		}
	}

}
