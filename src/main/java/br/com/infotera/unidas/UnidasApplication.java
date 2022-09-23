package br.com.infotera.unidas;

import br.com.infotera.common.util.Utils;
import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * SpringBoot default configuration class
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@EnableAsync
@SpringBootApplication
public class UnidasApplication {

    public static String nrVersao = "";

    public static void main(String[] args) {
        if (args.length > 0) {
            Utils.setTpAmbiente(args[0]);
        } else {
            Utils.setTpAmbiente("H");
        }
        nrVersao = UnidasApplication.class.getPackage().getImplementationVersion();
        SpringApplication.run(UnidasApplication.class, args);
    }

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

}
