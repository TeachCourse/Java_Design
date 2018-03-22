package observer;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
