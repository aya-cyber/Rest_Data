package ma.ensaj.restData.repositories;

import ma.ensaj.restData.entities.Client;
import ma.ensaj.restData.entities.Compte;
import ma.ensaj.restData.entities.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource//(path = "comptes", collectionResourceRel = "comptes", itemResourceRel = "compte")
public interface ClientRepository extends JpaRepository<Client, Long> {

}
