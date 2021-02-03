/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murillo.albernaz.instanciandoproduto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import murillo.albernaz.instanciandoproduto.model.Produto;
import murillo.albernaz.instanciandoproduto.model.ProdutoBuilder;

/**
 *
 * @author murillo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p = new ProdutoBuilder(1, "OLA", "FORD", 123, LocalDate.of(2021, 1, 2), "sei la")
                .codigoEan("12312312321")
               .createProduto();
        System.out.println(p);
    }
    
}
