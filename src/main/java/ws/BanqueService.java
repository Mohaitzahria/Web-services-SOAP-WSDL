package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWs")
public class BanqueService{
    @WebMethod(operationName = "convert")
    public double Conversion(@WebParam(name = "montant") double mt)
    {
       return mt * 10.65;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "Code") int Code)
    {
        return new Compte(Code,Math.random()*9999,new Date());
    }
    @WebMethod
    public List<Compte>  getComptes()
    {
        return List.of(new Compte(1,Math.random()*9999,new Date()),
                new Compte(2,Math.random()*9999,new Date()),
                new Compte(3 ,Math.random()*9999,new Date()));
    }
}
