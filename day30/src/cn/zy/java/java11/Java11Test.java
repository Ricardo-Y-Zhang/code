package cn.zy.java.java11;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Consumer;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-22 16:28
 **/
public class Java11Test {

    //java 11新特性：局部变量类型推断的升级
    @Test
    public void test(){
        Consumer<String> con = (@Deprecated var t) -> System.out.println(t);
    }


    @Test
    public void tes1() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8080")).build();
        HttpResponse.BodyHandler<String> stringBodyHandler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> send = httpClient.send(request, stringBodyHandler);
        String body = send.body();
        System.out.println(body);
    }
}
