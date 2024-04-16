public class Palavra {

    public static void main(String[] args) {
        String a = "alunos";
        String b = "alunas";
        System.out.println("Numero de Edições da Gulosa: " + DistanciaGulosa(a, b));

    }

    public static int DistanciaGulosa(String a, String b) {
        int edicoes = 0;
        int i = 0, j = 0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) != b.charAt(j)) {

                if (i + 1 < a.length() && a.charAt(i + 1) == b.charAt(j)) {
                    edicoes++;
                    i++;
                } else if (j + 1 < b.length() && b.charAt(j + 1) == a.charAt(i)) {
                    edicoes++;
                    j++;
                } else {
                    edicoes++;
                    i++;
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }

        edicoes += Math.abs(a.length() - i) + Math.abs(b.length() - j);

        return edicoes;
    }


}
