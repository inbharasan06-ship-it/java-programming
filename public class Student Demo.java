public class Student Demo {
 
  static class Student {
     int rollNo;
     String name;
     Student(int r,String n) {
       rollNo=r;
       name=n;
       System.out.println("Constructor called for Roll No:"+ rollNo);
     } 

     void display(){
       System.out.println("Roll No:"+ rollNo+"\+Name:"+name);
     }

     @Override
     protected void finalize(){
       System.out.println("Destruction (finalize) called for Roll No:"+ rollNo);
     }
  }
  public static void main(String[]args)
    System.out.println("-----Creating array of objects-----");
    Student[]s=new Student[3];
    s[0]=new Student(101,"Arun");
    s[1]=new Student(102,"Bala");
    s[2]=new Student(103,"Chitra");
 
    System.out.println("\n-----Displaying student detials-----");
    for(int i=0;i<0.length,i++) 
       s[i].didplay(); 

    System.out.println("\n-----Dereferencing objects and requesting garbage collection-----");
  for(int i=0;i<s.length;i++)
     s[i].null; 

  System.gc();
  Tread.sleep(500);
  }
}
