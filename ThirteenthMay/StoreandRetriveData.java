//Write a class in which we can store and fetch generic data sequentially. Write your own methods to store and retrieve the data. Do not use any collections framework.
public class StoreandRetriveData<T> {
	
	T obj;
	StoreandRetriveData(T obj)
	{
		this.obj=obj;
	}
	public T getObj()
	{
		return this.obj;
	}

	public static void main(String[] args) {
		StoreandRetriveData <String> obj1 = new StoreandRetriveData <String> ("Hello");
		StoreandRetriveData <String> obj2 = new StoreandRetriveData <String> ("good");
		StoreandRetriveData <String> obj3 = new StoreandRetriveData <String> ("morning");
		System.out.print(obj1.getObj()+" "+obj2.getObj()+" "+obj3.getObj());
	}

}