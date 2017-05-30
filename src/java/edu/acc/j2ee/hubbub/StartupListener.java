package edu.acc.j2ee.hubbub;

import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        String jdbcUrl  = sc.getInitParameter("jdbc.url");
        String jdbcUser = sc.getInitParameter("jdbc.user");
        String jdbcPass = sc.getInitParameter("jdbc.pass");
        try {
            Dao dao = new HubbubDao(jdbcUrl, jdbcUser, jdbcPass);
            sce.getServletContext().setAttribute("dao", dao);
        } catch (SQLException sqle) {
            throw new RuntimeException("Unable to create DAO", sqle);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        Dao dao = (Dao)sce.getServletContext().getAttribute("dao");
        if (dao != null) dao.close();
    }
}
