package Lumiamuyu.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* req.getRequestDispatcher("WEB-INF/pages/register.jsp").forward(req,resp);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String passwords = req.getParameter("passwords");
        String telephone = req.getParameter("telephone");
        System.out.println(username+"   "+password+"   "+passwords+"   "+telephone);
        resp.sendRedirect("login");*/
       req.getRequestDispatcher("WEB-INF/pages/register.jsp").forward(req,resp);
    }
}
