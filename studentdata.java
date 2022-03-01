import java.util.*;
class Student{
private int stuno;
private String sname;
private int prnid;

Student(int stuno, String sname, int prnid){
this.stuno=stuno;
this.sname=sname; 
this.prnid=prnid;
}

public int getStuno(){

return stuno;

 }
public int getPrnid(){ 
    return prnid;
}
public String getSname(){ 
    return sname;
}
public String toString(){

return stuno+" "+sname+" "+prnid;
   }   
}

class HelloWorld{

public static void main(String[] args) {
List<Student> StList =new ArrayList<Student>();    
Scanner s = new Scanner (System.in);
Scanner s1 = new Scanner (System.in);
int ch;
do{
System.out.println("1.INSERT");
System.out.println("2.DISPLAY"); 
System.out.println("3.SEARCH");
System.out.println("4.DELETE");
System.out.println("5.UPDATE");
System.out.print("Enter Your Choice: "); 
ch=s.nextInt();
switch(ch){
    case 1:
    System.out.print("Enter Stuno : ");
    int sno = s1.nextInt();
     System.out.print("Enter Stuname : ");
    String sname = s1.nextLine();
     System.out.print("Enter Prnid : ");
    int prnid = s1.nextInt();

    StList.add(new Student(sno,sname,prnid));
    break;
    case 2:
    System.out.println("----------------------------------------");
    Iterator<Student> i=StList.iterator();
    while(i.hasNext()){
     Student st1 = i.next();
     System.out.println(st1);
    }
    System.out.println("----------------------------------------");
    break;
    case 3:
    boolean found = false;
    System.out.println("Enter Stuno to search : ");
    int stuno = s1.nextInt();
    System.out.println("----------------------------------------");
    i=StList.iterator();
    while(i.hasNext()){
     Student st2 = i.next();
     if(st2.getStuno() == stuno);{
     System.out.println(st2);
     found = true;
     }
    }
    if(!found){
         System.out.println("Record Not Found");
    }
    System.out.println("----------------------------------------");
    break;

    case 4:
   found = false;
    System.out.println("Enter Stuno to Delete : ");
    stuno = s1.nextInt();
    System.out.println("----------------------------------------");
    i=StList.iterator();
    while(i.hasNext()){
     Student st3 = i.next();
     if(st3.getStuno() == stuno);{
     i.remove();
     found = true;
     }
    }
    if(!found){
         System.out.println("Record Not Found");
    }else{
        System.out.println("Record Is Deleted Successfully....!");
    }
    System.out.println("----------------------------------------");
    break;
     case 5:
   found = false;
    System.out.println("Enter Stuno to Update : ");
    stuno = s1.nextInt();
    
    ListIterator<Student>li = StList.listIterator();
    while(li.hasNext()){
     Student st4 = li.next();
     if(st4.getStuno() == stuno);{
     System.out.print("Enter The New Name : ");
     sname =s1.nextLine();

     System.out.println("Enter The Prnid : ");
     prnid = s1.nextInt();
     li.set(new Student(stuno,sname,prnid));
     found = true;
     }
    }
    if(!found){
         System.out.println("Record Not Found");
    }else{
        System.out.println("Record Is Updated Successfully....!");
    }

    break;
}
}
while(ch!=0);
   }
}
