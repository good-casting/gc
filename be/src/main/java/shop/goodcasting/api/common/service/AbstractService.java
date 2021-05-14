
package shop.goodcasting.api.common.service;


import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T> {
    public abstract long save(T t);
    public abstract Optional<T> findById(long id);
    public abstract List<T> findAll();
    public abstract long count();
    public abstract Optional<T> getOne(long id);
    public abstract long delete(T t);
    public abstract boolean existById(long id);
}
