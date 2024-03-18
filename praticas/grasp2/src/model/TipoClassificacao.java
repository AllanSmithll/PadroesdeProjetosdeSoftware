package model;

public enum TipoClassificacao {

    NORMAL {
        public double getPreco(DVD dvd) {
            return 2.0;
        }
    },

    LANCAMENTO {
        public double getPreco(DVD dvd) {
            return 3.0;
        }
    },

    INFANTIL {
        public double getPreco(DVD dvd) {
            return 1.5;
        }
    };

    public abstract double getPreco(DVD dvd);
}

