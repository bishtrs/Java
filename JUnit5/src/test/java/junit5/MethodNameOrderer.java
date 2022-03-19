package junit5;

import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrdererContext;

public class MethodNameOrderer implements MethodOrderer {
	@Override
	public void orderMethods(MethodOrdererContext context) {
		context.getMethodDescriptors().sort((MethodDescriptor m1, MethodDescriptor m2) -> m1.getMethod().getName()
				.compareTo(m2.getMethod().getName()));
	}

}
