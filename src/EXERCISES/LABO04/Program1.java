package EXERCISES.LABO04;

public class Program1 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int studentId = in.nextInt();
        System.out.println("Hello s" + studentId);
    }
}

class Program2 {
    public static void main(String[] args) {
        double a = 1;
        double x;
        if (a >= 0) x = 1.701;
        else x = 2D * 3.14f;
        //if(a <  0)x = 2D*3.14f;
        System.out.println(x);
    }
}

class Program3 {
    public static void main(String[] args) {
        int zmInt = 4;
        double zmDouble = -1.0;
        if (zmInt > 0) {
            if (zmDouble > 0) {
                System.out.println("Here I am!");
            } else {
                System.out.println("No, I am here!");
            }
        } else {
            System.out.println("No, actually , I am here!");
        }
    }
}

class Program4 {
    public static void main(String[] args) {
        boolean doesSignificantWork = true;
        boolean makesBreakthrough = false;
        boolean nobelPrizeCandidate = doesSignificantWork && makesBreakthrough;

//		if (doesSignificantWork) {
//			if (makesBreakthrough)
//				nobelPrizeCandidate = true;
//			else
//				nobelPrizeCandidate = false;
//		} else if (!doesSignificantWork)
//			nobelPrizeCandidate = false;
    }
}

class Program5 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 1;
        System.out.println(
                a == b && b == c ? "Sa takie same" : "Nie sa takie same"
        );
    }
}

class Program6 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        //boolean w = ( ! (a<b) && ! (a>b) ); to jest
        boolean w = a == b;
    }
}

class Program7 {
    public static void main(String[] args) {
        //double zmienna = 243.84;
        java.util.Scanner in = new java.util.Scanner(System.in);
        double zmienna = in.nextDouble();
        if (zmienna < 0) {
            System.out.println("Nalezy do B= (-niesk,1]");
        } else if (zmienna > 1) {
            System.out.println("Nalezy do A= [0,niesk)");
        } else {
            System.out.println("Nalezy do A= [0,niesk) i B= (-niesk,1] i C= [0,1]");
        }
    }
}

class Program8 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int wrt = in.nextInt();
        if (wrt == -4 || wrt == -3)
            System.out.println("Zmienna wrt nalezy do wspolnej czesci zbiorow A, B i C.");
        else
            System.out.println("Zmienna wrt nie nalezy do wspolnej czesci zbiorow A, B i C.");
    }
}

class Program9 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int year = in.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Podany rok jest przestepny.");
        else
            System.out.println("Podany rok nie jest przestepny.");
    }
}

class Program10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= 10) {
            System.out.println(j++);
        }

        int k = 1;
        do {
            System.out.println(k++);
        } while (k <= 10);
    }
}

class Program11 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "  ");
            }
            System.out.println();
        }
    }
}

class Program12 {
    public static void main(String[] args) {
        System.out.println("Ile chcesz wierszy?");
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}