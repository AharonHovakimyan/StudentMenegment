package students;

import javax.jws.soap.SOAPBinding;

public class UserStorage {


    static User[] array = new User[10];
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

    public void add(User student) {
        if (size == array.length) {
            increasArray();

        }
        array[size++] = student;
    }

    private void increasArray() {
        User[] temp = new User[array.length + 10];
        System.arraycopy(array, 0, temp, 0, array.length);
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

    public User getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)) {
                return array[i];
            }

        }
        return null;
    }
}