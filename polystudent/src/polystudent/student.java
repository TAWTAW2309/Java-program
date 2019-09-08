/**
 * 
 */
package polystudent;

/**
 * @author nubhe
 *
 */
public class student {
  private String name;
  private int studentNo;
  private String add;
  private char gender;
  
  
  public student() {
  
	  
  }
  
  /**
   * 3 parameter constructor to create  a student without a studentNo
   * @param name of student
   * @param add of student
   * @param gender of student
   */
  public student(String name, String add, char gender) {
	  this.name = name;
	  this.add = add;
	  this.gender = gender;
	  this.studentNo = 0;//studentNo not yet assigned
  }
  
  /**
   * 4 parameter constructor
   * @param name of student
   * @param studentNo of student
   * @param add of student
   * @param gender of student
   */
  public student(String name, int studentNo, String add, char gender) {
	  this.name = name;
	  this.add = add;
	  this.gender = gender;
	  this.studentNo = studentNo;
	  
  }
  
  //getter
  public String getName() {
	  return this.name;
  }
  public int getstudentno() {
	  return this.studentNo;
  }
  public String getadd() {
	  return this.add;
  }
  public char getgender() {
	  return this.gender;
  }
  
  
  //setter
 public void setname(String name) {
	 this.name = name;
 }
 public void setstudentno(int studentno) {
	 this.studentNo = studentno;
 }
 public void setadd(String add) {
	 this.add = add;
 }
 public void setgender(char gender) {
	 this.gender = gender;
 }
 
 public String toString() {
	 return this.name+ " "+this.studentNo +" "+this.add+" "+this.gender;
 }
  
  }
  
  
  
  
