package annotations;

import java.lang.annotation.Annotation;

@IsSerializable(type="no")
public class TestClassLevelAnnotation {

	public static void main(String[] args) {
		Class<TestClassLevelAnnotation> obj = TestClassLevelAnnotation.class;
        if (obj.isAnnotationPresent(IsSerializable.class)) {

            Annotation annotation = obj.getAnnotation(IsSerializable.class);
            IsSerializable isSerializable = (IsSerializable) annotation;

            System.out.println("IsSerializable type : " +  isSerializable.type());
        }
	}
}
