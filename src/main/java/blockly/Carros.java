package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
import java.util.concurrent.Callable;



@CronappSwagger
@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Carros {

public static final int TIMEOUT = 300;

/**
 *
 * Carros
 *
 * @author Francisco Iago De Sousa Mendes
 * @since 11/7/2022, 3:50:54 PM
 *
 */
public static Var getCarrosBanco() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.database.Operations.query(Var.valueOf("codex.entity.Carro"),Var.valueOf("select \n	c.marca, \n	c.modelo, \n	c.ano \nfrom \n	Carro c"));
   }
 }.call();
}

}

