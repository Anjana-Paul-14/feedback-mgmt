/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Paul
 */
public class libvieww {
    private String name;
    private String dep;
    private String course;
    private String sem;
    private String Q1;
    private String Q2;
    private String Q3;
    private String Q4;
    private String Q5;
    
    public libvieww(String name,String dep,String course,String sem,String Q1,String Q2,String Q3,String Q4,String Q5)
{
this.name=name;
this.dep=dep;
this.course=course;
this.sem=sem;
this.Q1=Q1;
this.Q2=Q2;
this.Q3=Q3;
this.Q4=Q4;
this.Q5=Q5;

}

    libvieww(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
public String getName(){return name;}
public String getDep(){return dep;}
public String getCourse(){return course;}
public String getSem(){return sem;}
public String getQ1(){return Q1;}
public String getQ2(){return Q2;}
public String getQ3(){return Q3;}
public String getQ4(){return Q4;}
public String getQ5(){return Q5;}

    
}
