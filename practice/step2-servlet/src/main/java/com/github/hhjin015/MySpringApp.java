package com.github.hhjin015;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class MySpringApp {
    public static void main(String[] args) {
        // servlet container == servlet context
        // servlet * n
        // servlet => 요청을 처리하는 서버 컴포넌트
        MyServletContext container = new MyServletContext();

        WebServer webServer = new TomcatServletWebServerFactory().getWebServer(container);

        webServer.start();
    }
}
