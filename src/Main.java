public class Main {
    public static void main(String[] args) {
        String[] A = new String[4];
        String[] B = new String[4];
        String[] C = new String[5];

        String[] G1 = new String[3];
        String[] G2 = new String[3];
        String[] G3 = new String[3];
        String[] G4 = new String[4];

        String[] pivot;

        for (int i = 0; i < A.length; i++) {
            A[i] = "A" + i;
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = "B" + i;
        }
        for (int i = 0; i < C.length; i++) {
            C[i] = "C" + i;
        }

        while (A.length > 0) {
            int r = (int) (Math.random() * A.length);
            switch (A.length) {
                case 4:
                    G1[0] = A[r];
                    A[r] = null;
                    break;
                case 3:
                    G2[0] = A[r];
                    A[r] = null;
                    break;
                case 2:
                    G3[0] = A[r];
                    A[r] = null;
                    break;
                case 1:
                    G4[0] = A[r];
                    A[r] = null;
                    break;
            }

            pivot = new String[A.length-1];

            for (int i = 0; i < A.length; i++) {
                if (A[i] != null) {
                    for (int j = 0; j < pivot.length; j++) {
                        if (pivot[j] == null) {
                            pivot[j] = A[i];
                            break;
                        }
                    }
                }
            }

            A = pivot;
        }
        while (B.length > 0) {
            int r = (int) (Math.random() * B.length);
            switch (B.length) {
                case 4:
                    G1[1] = B[r];
                    B[r] = null;
                    break;
                case 3:
                    G2[1] = B[r];
                    B[r] = null;
                    break;
                case 2:
                    G3[1] = B[r];
                    B[r] = null;
                    break;
                case 1:
                    G4[1] = B[r];
                    B[r] = null;
                    break;
            }

            pivot = new String[B.length-1];

            for (int i = 0; i < B.length; i++) {
                if (B[i] != null) {
                    for (int j = 0; j < pivot.length; j++) {
                        if (pivot[j] == null) {
                            pivot[j] = B[i];
                            break;
                        }
                    }
                }
            }

            B = pivot;
        }
        while (C.length > 0) {
            int r = (int) (Math.random() * C.length);
            switch (C.length) {
                case 5:
                    G1[2] = C[r];
                    C[r] = null;
                    break;
                case 4:
                    G2[2] = C[r];
                    C[r] = null;
                    break;
                case 3:
                    G3[2] = C[r];
                    C[r] = null;
                    break;
                case 2:
                    G4[2] = C[r];
                    C[r] = null;
                    break;
                case 1:
                    G4[3] = C[r];
                    C[r] = null;
                    break;
            }

            pivot = new String[C.length-1];

            for (int i = 0; i < C.length; i++) {
                if (C[i] != null) {
                    for (int j = 0; j < pivot.length; j++) {
                        if (pivot[j] == null) {
                            pivot[j] = C[i];
                            break;
                        }
                    }
                }
            }

            C = pivot;
        }
        for (String s : G1) {
            System.out.println(s);
        }
        for (String s : G2) {
            System.out.println(s);
        }
        for (String s : G3) {
            System.out.println(s);
        }
        for (String s : G4) {
            System.out.println(s);
        }
    }
}
