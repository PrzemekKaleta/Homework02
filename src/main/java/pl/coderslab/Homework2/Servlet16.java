package pl.coderslab.Homework2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@WebServlet("/Servlet16")
public class Servlet16 extends HttpServlet {

    protected Map<String, String> mapOfGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String> map = new HashMap<String, String>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }

        return map;
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String> map = mapOfGet(request, response);

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry keyValue = (Map.Entry)it.next();
            response.getWriter().println(keyValue.getKey() + " = " + keyValue.getValue());
        }


    }



}
