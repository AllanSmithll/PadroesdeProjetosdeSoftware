package model;

public enum TipoClassificacao {

    NORMAL {
        public double getPreco(DVD dvd) {
            return 10.0;
        }
    },

    LANCAMENTO {
        public double getPreco(DVD dvd) {
            return 15.0;
        }
    },

    INFANTIL {
        public double getPreco(DVD dvd) {
            return 8.0;
        }
    };

    public abstract double getPreco(DVD dvd);
}

