package th.customerjpa.model.repository;

import java.util.List;

public interface IGenericRepository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);

}
