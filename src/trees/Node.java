package trees;

public class Node<T> {
	int key;
	T data;
	Node<T> left;
	Node<T> right;


   @SuppressWarnings("unchecked")
   public boolean equals(Object obj) {
		Node<T> tObj = (Node<T>) obj;
		T dataObj = tObj.data;
		return data.equals(dataObj);
	}

	public String toString() {
		return "Key: "+key+"\tdata: "+data.toString();
	}
}