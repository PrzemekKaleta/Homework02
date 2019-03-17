package pl.coderslab.Homework2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet041")
public class Servlet141 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                for(int i=0; i<10; i++) {

                String pattern = "<a href='/Servlet042?id=%s'>Link do produktu %s</a><br>";

                String link = String.format(pattern, i, i);
                response.getWriter().println(link);
            }

    }
}
