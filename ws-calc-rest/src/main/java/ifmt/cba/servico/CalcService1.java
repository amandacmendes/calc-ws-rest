package ifmt.cba.servico;

import ifmt.cba.vo.Calculadora;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculadora1")
public class CalcService1 {

    Calculadora calc = new Calculadora();

    @GET
    @Path("somar/{valorUm}/{valorDois}")
    @Produces(MediaType.TEXT_PLAIN)
    public double somar(
            @PathParam("valorUm") double valorUm,
            @PathParam("valorDois") double valorDois) {

        double res = calc.somar(valorUm, valorDois);
        return res;
    }

    @GET
    @Path("subtrair/{valorUm}/{valorDois}")
    @Produces(MediaType.TEXT_PLAIN)
    public double subtrair(
            @PathParam("valorUm") double valorUm,
            @PathParam("valorDois") double valorDois) {

        double res = calc.subtrair(valorUm, valorDois);
        return res;
    }

    @GET
    @Path("multiplicar/{valorUm}/{valorDois}")
    @Produces(MediaType.TEXT_PLAIN)
    public double multiplicar(
            @PathParam("valorUm") double valorUm,
            @PathParam("valorDois") double valorDois) {

        double res = calc.multiplicar(valorUm, valorDois);
        return res;
    }

    @GET
    @Path("dividir/{valorUm}/{valorDois}")
    @Produces(MediaType.TEXT_PLAIN)
    public double dividir(
            @PathParam("valorUm") double valorUm,
            @PathParam("valorDois") double valorDois) {

        double res = calc.dividir(valorUm, valorDois);
        return res;
    }

}
