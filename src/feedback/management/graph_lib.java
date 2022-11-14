/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback.management;

import java.sql.*;
import java.io.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Paul
 */
public class graph_lib {
    public static void main(String[] args) throws Exception {

	       String query = "SELECT * from for_lib";
	       JDBCCategoryDataset dataset = new JDBCCategoryDataset(
		"jdbc:mysql://localhost:3306/feedback", 
                "com.mysql.jdbc.Driver","root", "");
	       dataset.executeQuery(query);
	       JFreeChart chart =  
                ChartFactory.createBarChart3D("Test", "Id", "Score",
	        dataset, PlotOrientation.VERTICAL, true, true, false);
	       try {
	       ChartUtilities.saveChartAsJPEG(new File("C:/graphs/libchart.jpg"),
                chart,400, 300);
	       } catch (IOException e) {
	       System.out.println("Problem in creating chart.");
  }
	}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
