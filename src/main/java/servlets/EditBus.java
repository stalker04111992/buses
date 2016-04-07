package servlets;

import entities.Bus;
import service.BusDao;

import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(value = "/management/editbus")
public class EditBus extends HttpServlet {

    @EJB
    BusDao busDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try{
            ArrayList<Bus> buses = busDao.findAll();
            request.setAttribute("buses", buses);
        }
        catch (SQLException exception){
            request.setAttribute("error", "Ошибка подключения к базе данных");
            exception.printStackTrace();
        }
        catch (NamingException exception){
            request.setAttribute("error", "Ошибка запроса к базе данных");
            exception.printStackTrace();
        }
        finally{
            request.getRequestDispatcher("WEB-INF/pages/editbus.jsp").forward(request, response);
        }
    }
}