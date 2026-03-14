package DESAFIO_POO.entitis;


    public class Triangle {
        public double a;
        public double b;
        public double c;

        public double area() {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        /*
        A outra opcao era de se inserir o tipo de variavel por exemplo
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;

        Essa maneira tbm funciona mas o melhor 'e o de cima por evita quantidades enormes de codigos.
        */
        public String verificararea(Triangle x, Triangle y) {
            String areamaior;
            if (x.area() > y.area()) {
                areamaior = "x é a area maior";
            } else if (x.area() > y.area()) {
                areamaior = "y é a area maior";
            } else {
                areamaior = "areasiguais";

            }
            return areamaior;
        }
    }


