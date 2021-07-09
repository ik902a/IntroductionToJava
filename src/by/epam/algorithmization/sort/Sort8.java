package by.epam.algorithmization.sort;

// Даны дроби p1/q1, p2/q2, .., pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

public class Sort8 {
    static int [] p = {5, 1, 3, 3, 2};
    static int [] q = {6, 3, 4, 4, 7};

    public static void main(String[] args) {
        int commonDenominator = leastCommonMultiple();

        for (int i = 0; i < p.length; i++) {
            p[i] = p[i] * (commonDenominator / q[i]);
        }
        sort();

        for (int elem : p) {
            System.out.println(elem + "/" + commonDenominator);
        }
    }

    static int findMax() {
        int max = 0;

        for (int elem : q) {
            if ( elem > max) {
                max = elem;
            }
        }
        return max;
    }

    static int leastCommonMultiple() {
        int max = findMax();
        int com = max;

        for (int i = 0; i < q.length; i++) {
            if (com % q[i] != 0) {
                com += max;
                i = 0;
            }
        }
        return com;
    }

    static void sort() {
        int box;

        for (int i = 0; i < p.length - 1;) {
            if (p[i] > p[i + 1]) {
                box = p[i];
                p[i] = p[i + 1];
                p[i + 1] = box;
                i--;
                if (i < 0) {
                    i = 0;
                }
            } else {
                i++;
            }
        }
    }
}
