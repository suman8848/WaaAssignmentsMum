package cs544.sample;

import java.util.List;

public interface ICarDao {

	public  List<Car> getAll();

	public  void add(Car car);

	public Car get(int id);

	public  void update(int carId, Car car);

	public  void delete(int carId);

}