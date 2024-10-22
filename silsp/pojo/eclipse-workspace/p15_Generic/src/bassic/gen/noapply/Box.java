package bassic.gen.noapply;

public class Box<T> {// T= 모든타입을 지칭 //빈(Bean)

	// 필드
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
