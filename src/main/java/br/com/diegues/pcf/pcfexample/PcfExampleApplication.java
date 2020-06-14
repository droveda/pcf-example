package br.com.diegues.pcf.pcfexample;

import br.com.diegues.pcf.pcfexample.entity.ApplicationMeta;
import br.com.diegues.pcf.pcfexample.repository.ApplicationMetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PcfExampleApplication implements CommandLineRunner {

    @Autowired
    private ApplicationMetaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(PcfExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationMeta meta = new ApplicationMeta();
        meta.setName("MyNewApp");
        meta.setDescription("This is a completely new application!");
        repository.save(meta);

        ApplicationMeta meta1 = new ApplicationMeta();
        meta1.setName("CoolApp");
        meta1.setDescription("This is a cool application!");
        repository.save(meta1);
    }
}
