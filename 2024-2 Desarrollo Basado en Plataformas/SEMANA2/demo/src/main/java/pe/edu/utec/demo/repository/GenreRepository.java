package pe.edu.utec.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, long> {
    @Autowired
    GenreRepository repository;

    public List<Genre> genres(){
        return repository.findAll()
    }
}
/*/
Entidad Genero --> Comunicacion con la base de datos (Intermedario es el repositorio)
 */
