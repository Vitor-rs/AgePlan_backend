//package br.com.app.ageplan.repository;
//
//import br.com.app.ageplan.entity.Pessoa;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
//}
//
///* O uso da anotação @Repository é opcional, mas é uma boa prática usá-la.
// * A anotação @Repository é uma especialização da anotação @Component,
// * portanto, as classes anotadas com @Repository são detectadas automaticamente
// * pelo Spring e registradas no contexto do aplicativo como beans. Isso permite
// * que o Spring traduza automaticamente as exceções específicas do banco de dados
// * em exceções de acesso a dados mais amigáveis, como DataAccessException.
// * A maior vantagem é que se pode criar uma interface que extende JpaRepository
// * e o Spring Data JPA irá criar automaticamente os métodos de CRUD para a entidade
// * que foi passada como parâmetro, neste caso, a entidade Pessoa. Ou seja, não é
// * necessário criar os métodos de CRUD, o Spring Data JPA cria automaticamente. É uma técnica de criar
// * SQL scripts automaticamente, sem a necessidade de escrever os scripts manualmente.
// * */