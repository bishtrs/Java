package dp.creational.singleton;

public enum SingletonEnum {
	INSTANCE;

	public static void main(String[] args) {
		System.out.println(SingletonEnum.INSTANCE);
		System.out.println(SingletonEnum.INSTANCE);
	}

}
