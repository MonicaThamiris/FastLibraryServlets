package br.com.fastlibrary.bo;
public interface InterBO<T,K> {
	
	void insert(T entity);
	
	void remove(T entity);
	
	void update(T entity);
	
	T findById(K id);

}
