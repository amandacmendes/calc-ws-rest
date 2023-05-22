package ifmt.cba.servico;

import ifmt.cba.vo.Calculadora;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/calculadora2")
public class CalcService2 {

    Calculadora calc = new Calculadora();

    @GET
    @Path("somar")
    @Produces(MediaType.TEXT_PLAIN)
    public double somar(@DefaultValue("0.0") @QueryParam("valor1") double valorUm,
            @DefaultValue("0.0") @QueryParam("valor2") double valorDois) {

        return calc.somar(valorUm, valorDois);
    }

    @GET
    @Path("subtrair")
    @Produces(MediaType.TEXT_PLAIN)
    public double subtrair(@DefaultValue("0.0") @QueryParam("valor1") double valorUm,
            @DefaultValue("0.0") @QueryParam("valor2") double valorDois) {

        return calc.subtrair(valorUm, valorDois);
    }

    @GET
    @Path("multiplicar")
    @Produces(MediaType.TEXT_PLAIN)
    public double multiplicar(@DefaultValue("0.0") @QueryParam("valor1") double valorUm,
            @DefaultValue("0.0") @QueryParam("valor2") double valorDois) {

        return calc.multiplicar(valorUm, valorDois);
    }

    @GET
    @Path("dividir")
    @Produces(MediaType.TEXT_PLAIN)
    public double dividir(@DefaultValue("0.0") @QueryParam("valor1") double valorUm,
            @DefaultValue("0.0") @QueryParam("valor2") double valorDois) {

        return calc.dividir(valorUm, valorDois);
    }

}
