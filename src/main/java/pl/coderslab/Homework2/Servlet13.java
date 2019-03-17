package pl.coderslab.Homework2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@WebServlet("/Servlet13")
public class Servlet13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        File file = new File("/home/przemo/workspace/Homework02/src/main/files/oop.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            response.getWriter().println(scanner.nextLine());
        }


    }
}
