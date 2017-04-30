package trees;
/**
 * @author upendrasingh
 * Lowest Common ancestor in a Binary Search tree (recursive)
 * @param <T>
 */
public class LcaBst<T> {
	Node<T> findLca(Node<T> root, int a, int b) {
		if (a<b) {
			return hFindLca(root, a, b);
		}else{
			return hFindLca(root, b, a);
		}
	}

	Node<T> hFindLca(Node<T> r, int a , int b) {
		if (r==null)
			return null;
		if(a < r.key && b > r.key){
			return r;
		}
		else if (b < r.key) {
			return hFindLca(r.left, a, b);
		}
		else if (a > r.key) {
			return hFindLca(r.right, a, b);
		}
		return null;
	}
}
