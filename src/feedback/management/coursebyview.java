/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback.management;

/**
 *
 * @author Paul
 */
public class coursebyview {
    private String lecture;
    private String name;
    private String dep;
    private String course;
    private String sem;
    private String Qa1;
    private String Qa2;
    private String Qa3;
    private String Qa4;
    private String Qa5;
    private String Qa6;
    private String Qa7;
    private String Qa8;
    private String Qa9;
    private String Qa10;
    
    public coursebyview( String lecture,String name,String dep,String course,String sem,String Qa1,String Qa2,String Qa3,String Qa4,String Qa5,String Qa6,String Qa7,String Qa8,String Qa9,String Qa10)
{
this.lecture=lecture;
this.name=name;
this.dep=dep;
this.course=course;
this.sem=sem;
this.Qa1=Qa1;
this.Qa2=Qa2;
this.Qa3=Qa3;
this.Qa4=Qa4;
this.Qa5=Qa5;
this.Qa6=Qa6;
this.Qa7=Qa7;
this.Qa8=Qa8;
this.Qa9=Qa9;
this.Qa10=Qa10;

}

    coursebyview(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
public String getLecture(){return lecture;}
public String getName(){return name;}
public String getDep(){return dep;}
public String getCourse(){return course;}
public String getSem(){return sem;}
public String getQa1(){return Qa1;}
public String getQa2(){return Qa2;}
public String getQa3(){return Qa3;}
public String getQa4(){return Qa4;}
public String getQa5(){return Qa5;}
public String getQa6(){return Qa6;}
public String getQa7(){return Qa7;}
public String getQa8(){return Qa8;}
public String getQa9(){return Qa9;}
public String getQa10(){return Qa10;}


}
