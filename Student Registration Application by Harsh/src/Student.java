
public class Student {
    int id;
    String name;
    int average;
    boolean status = false;
    
    Student next;
    
    public Student(){
    }

    public Student(int id, String name, int average) {
        this.id = id;
        this.name = name;
        this.average = average;
        if(average >= 50){
            status = true;
        }
    }
    
    public void showInformations(){
        System.out.print("id: " + id);
        System.out.print(", name: " + name);
        System.out.print(", average: " + average);  
        String go = "";
        if(status){
            go += "passed";
        }else{
            go += "failed";
        }
        System.out.print(", status: " + go + "   ---   ");
    }
    
    
    
}
