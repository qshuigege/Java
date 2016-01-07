package abstracttest;

public abstract class Parent {

	public Parent getInstance(){
		return new Child();
	}
}
