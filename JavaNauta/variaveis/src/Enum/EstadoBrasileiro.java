package Enum;

public enum EstadoBrasileiro {
    //É um conjunto de objetos já pré estabelecidos na aplicação
    //E: Estados do brasil, graude escolaridade, gereno

    // Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
        SAO_PAULO ("SP","São Paulo"),
        RIO_JANEIRO ("RJ", "Rio de Janeiro"),
        PIAUI ("PI", "Piauí"),
        MARANHAO ("MA","Maranhão"),
        PARA ("PA", "Pará");

        private String nome;
        private String sigla;

        private EstadoBrasileiro(String sigla, String nome) {
            this.sigla = sigla;
            this.nome = nome;
        }
        public String getSigla() {
            return sigla;
        }
        public String getNome() {
            return nome;
        }
        public String getNomeMaiusculo() {
            return nome.toUpperCase();
        }
}
