package br.com.diegues.pcf.pcfexample.repository;

import br.com.diegues.pcf.pcfexample.entity.ApplicationMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationMetaRepository extends JpaRepository<ApplicationMeta, String> {

    List<ApplicationMeta> findByName(String name);

}
