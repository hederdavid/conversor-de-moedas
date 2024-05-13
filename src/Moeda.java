import com.google.gson.annotations.SerializedName;

public class Moeda {
    @SerializedName("conversion_rate")
    private String valorMoedaConvertida = "";

    public Moeda(String valorMoedaConvertida) {
        this.valorMoedaConvertida = valorMoedaConvertida;
    }

    public String getValorMoedaConvertida() {
        return valorMoedaConvertida;
    }

    public void setValorMoedaConvertida(String valorMoedaConvertida) {
        this.valorMoedaConvertida = valorMoedaConvertida;
    }

    @Override
    public String toString() {
        return "Moedas{" +
                "valorMoedaConvertida='" + valorMoedaConvertida + '\'' +
                '}';
    }
}

