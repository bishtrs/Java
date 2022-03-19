import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private SerializableSingleton() {
	}

	private static SerializableSingleton instance = new SerializableSingleton();

	private static SerializableSingleton getInstance() {
		return instance;
	}

	// implement readResolve method
	protected Object readResolve() {
		return instance;
	}

	public static void main(String[] args) {
		try {
			SerializableSingleton instance1 = SerializableSingleton.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("E:\\file.text"));
			out.writeObject(instance1);
			out.close();

			// deserialize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("E:\\file.text"));

			SerializableSingleton instance2 = (SerializableSingleton) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
