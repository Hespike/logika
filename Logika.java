public class Logika {

    static boolean logikai(boolean[] ertekek) {
    for (int i = 0; i < ertekek.length; i++) {
       if (ertekek[i] == true) {
        continue;
       } else {
        return false; }
    }
    return true;
    }

}

/* also
public class Logika {

    static boolean logikai(boolean[] ertekek) {
        for (int i = 0; i < ertekek.length; i++) {
            if (!ertekek[i]) {
                return false;
            }
        }

        return true;
    }

}
 */
