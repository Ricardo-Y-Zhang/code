package cn.zy.java.exer6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;

/**
 * @program: code
 * @description: URL网络编程
 * @author: Mr.Yan
 * @create: 2021-07-13 14:41
 **/
public class URLTest {

    public static void main(String[] args) {
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            URL url = new URL("https://image.baidu.com/search/d");
            urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.connect();

            inputStream = urlConnection.getInputStream();

            fileOutputStream = new FileOutputStream("onepiece.jpg");

            byte[] buffer = new byte[1024];
            int len;
            while((len = inputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }

    }
}
