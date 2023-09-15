package br.com.app.ageplan.arch;

public interface AbstractService {

    /**
     * Como tenho muitas entidades, não é boa prática criar um método para cada uma delas. A camada de serviço
     * deve ser genérica, então criei um método que recebe um objeto e salva no banco de dados. Para isso, o objeto
     * deve implementar a interface Serializable. Para começar, criei uma interface chamada AbstractService, que
     * possui os métodos genéricos que serão utilizados por todas as entidades, sendo eles: save, update, delete e
     * findById.
     */

    public Object findAll();
    public Object findById(Long id);
    public Object save(Object object);
    public Object insert(Object object);
    public Object update(Object object);
    public Object delete(Long id);

    /**
     * Por exemplo, a entidade Pessoa possui a classe PessoaService, que implementa a interface AbstractService.
     * */

}