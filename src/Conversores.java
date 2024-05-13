public class Conversores {

    public int converter(int opcaoEscolhida, double valor) {
        Conversor conversor = new Conversor();
        switch (opcaoEscolhida) {
            case 1 -> {
                Moeda moedaUSDToBRL = conversor.converterValores("USD", "BRL");
                System.out.println(valor + " [USD] são " + (Double.parseDouble(moedaUSDToBRL.getValorMoedaConvertida()) * valor)
                        + " reais.");
                return 1;
            }

            case 2 -> {
                Moeda moedaBRLToUSD = conversor.converterValores("BRL", "USD");
                System.out.println(valor + " [BRL] são " + (Double.parseDouble(moedaBRLToUSD.getValorMoedaConvertida()) * valor)
                        + " dólares.");
                return 2;
            }

            case 3 -> {
                Moeda moedaEURToUSD = conversor.converterValores("EUR", "USD");
                System.out.println(valor + " [EUR] são " + (Double.parseDouble(moedaEURToUSD.getValorMoedaConvertida()) * valor)
                        + " dólares.");
                return 3;
            }

            case 4 -> {
                Moeda moedaUSDToEUR = conversor.converterValores("USD", "EUR");
                System.out.println(valor + " [USD] são " + (Double.parseDouble(moedaUSDToEUR.getValorMoedaConvertida()) * valor)
                        + " euros.");
                return 4;
            }

            case 5 -> {
                Moeda moedaGBPToUSD = conversor.converterValores("GBP", "USD");
                System.out.println(valor + " [GBP] são " + (Double.parseDouble(moedaGBPToUSD.getValorMoedaConvertida()) * valor)
                        + " dólares.");
                return 5;
            }

            case 6 -> {
                Moeda moedaUSDToGBP = conversor.converterValores("USD", "GBP");
                System.out.println(valor + " [USD] são " + (Double.parseDouble(moedaUSDToGBP.getValorMoedaConvertida()) * valor)
                        + " libras esterlinas.");
                return 6;
            }

            default -> {
                System.out.println("Insira uma opção correta.");
                return 0;
            }
        }
    }


}
