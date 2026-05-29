
public class TryCatchConstructor {
	//when you do constructor you don't need try-catch no more !!
	//**
	//just do TryCatchConstructor(parameter,Type.class)
	// id a have attribute "int age" then in constructor parameter "T ParameterAge"
	//you do "this.age = TryCatchConstructor(ParameterAge,Integer.class);"
	//thanks
	//**
	//written by Smiler
	private TryCatchConstructor() {
        // prevents instantiation
    }

    public static <T> T check(Object val, Class<T> type) {

        if (type.isInstance(val)) {
            return type.cast(val);
        }

        throw new IllegalArgumentException(
            "Invalid type. Expected: " + type.getSimpleName()
        );
    }
}
