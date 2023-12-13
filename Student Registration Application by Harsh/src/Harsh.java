
public class Harsh {

    int size;
    Student[] array;

    public Harsh(int size) {
        this.size = size;
        array = new Student[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Student();
        }
    }

    public void add(int id, String name, int average) {
        Student newStudent = new Student(id, name, average);
        int index = (id % size);
        Student tmp = array[index];
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newStudent;
    }

    public void remove(int id) {
        int index = (id % size);
        Student tmp = array[index];
        Student tmp2 = array[index];
        tmp = tmp.next;
        while (tmp != null) {
            
            if (id == tmp.id) {
                tmp2.next = tmp2.next.next;
                return;
            }
            tmp2 = tmp;
            tmp = tmp.next;
        }
        System.out.println("There is no exist who student has id " + id);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            Student tmp = array[i];
            tmp = tmp.next;
            System.out.print("Array[" + i + "] --> ");
            while (tmp != null) {
                tmp.showInformations();
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    public void search(int id) {
        int index = (id % size);
        Student tmp = array[index];
        tmp = tmp.next;
        while(tmp != null){
            if(id == tmp.id){
                System.out.println("AVALIABLE:");
                tmp.showInformations();
                return;
            }
            tmp = tmp.next;
        }
        System.out.println("There is no exist who student has id " + id);
    }

}
