package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 * O T é um placeholder do "tipo" que vai representar uma determinada variável dentro de uma classe.
 * Ele é usado quando se quer criar uma classe ou método onde suas variáveis são de um tipo que não é definido 
 * no momento em que ela é escrita
 * @author Alex
 *
 * @param <T>: seção do tipo do parâmetro usando "generics" associado ao DAO, que pode ser usada em qualquer lugar dentro da classe.
 *             a definição de <T> será realizada quando um objeto concreto que implementa DAO for instanciado. 
 *             
 * Mais informações em: https://docs.oracle.com/javase/tutorial/java/generics/types.html
 */
public interface DAO<T> {
	// Salva um objeto no banco de dados
	void save(T t) throws SQLException;
	// Atualiza um objeto no banco de dados
	void update(T t);
	// remove um objeto do banco de dados
	void delete(T t);
	// retorna os dados de um objeto
	public T get(long id);
	// Retorna todos os registros do banco de dados
	public List<T> getAll();
}
