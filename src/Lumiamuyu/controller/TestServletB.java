package Lumiamuyu.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServletB extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getInitParameter("init1"));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.write("中文");
        pw.write("<div style='background-color:green'>sdftyu</div>");*/
/*        req.setAttribute("key","value");
        req.getRequestDispatcher("jsp/indexa.jsp").forward(req,resp);*/

/*        HttpSession session= req.getSession();
        session.setAttribute("session","sessionvalue");*/
        /*session作用域至会话结束*/
        req.getSession().setAttribute("session","sessionValue");
        /*application作用域至服务器重启/关闭*/
        req.getServletContext().setAttribute("servletContext","servletContextValue");
        /*转发请求*/
        req.getRequestDispatcher("jsp/indexb.jsp").forward(req,resp);



/*        *//*重定向*//*
        *//*setAttribute不能设置到重定向网页*//*
        resp.sendRedirect("https://github.com/Lumiamuyu");*/


    }


    @Override
    public void destroy() {
        System.out.println("desory");
    }
}
