package DATAS_E_HORARIOS;

import java.time.LocalDate;

public class ex05 {
    public static void main(String[] args) {
        // Data a ser verificada
        LocalDate dataParaVerificar = LocalDate.of(2025, 1, 30);

        // Período específico
        LocalDate dataInicio = LocalDate.of(2025, 1, 1);
        LocalDate dataFim = LocalDate.of(2025, 12, 31);

        // Verificação se a data está dentro do período
        if (isDataDentroDoPeriodo(dataParaVerificar, dataInicio, dataFim)) {
            System.out.println("A data " + dataParaVerificar + " está dentro do período.");
        } else {
            System.out.println("A data " + dataParaVerificar + " não está dentro do período.");
        }
    }

    public static boolean isDataDentroDoPeriodo(LocalDate data, LocalDate inicio, LocalDate fim) {
        return (data.isEqual(inicio) || data.isEqual(fim) || (data.isAfter(inicio) && data.isBefore(fim)));
    }
}