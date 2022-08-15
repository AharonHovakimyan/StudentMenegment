package students;

public class StudentStorage {


    static Student[] array = new Student[10];
    static int size = 0;

    public static void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                size--;
                System.out.println("student deleted ");
            }
        } else
            System.out.println("index out of bounds");
    }

    public void add(Student student) {
        if (size == array.length) {
            increasArray();

        }
        array[size++] = student;
    }

    private void increasArray() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    public int getSize() {
        return size;
    }
}