package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//寫法一_精簡配置寫法
//@WebServlet("/Hello")

//寫法二_標準配置寫法
//@WebServlet(urlPatterns = "/Hello")

//寫法三
//@WebServlet(urlPatterns = {"/Hello"})

//寫法四


//這個寫法表示瀏覽器可以透過 http://localhost:8080/Javaweb/hello 網址執行到此Servlet程式

//同一個網站可以給多個網址，例如廣告公司可以計算不同廠商的流量。
@WebServlet(urlPatterns = {"/Hello", "/Welcome", "/aaa", "/hi.php"}) 


public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("Hello JavaServlet"); //將字串回應給瀏覽器
	}

	
	
}
