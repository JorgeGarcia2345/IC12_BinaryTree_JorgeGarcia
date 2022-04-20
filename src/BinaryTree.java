public class BinaryTree <E extends Comparable<E> >
{

    private Node<E> mRoot;

    public BinaryTree(){
        mRoot = null;
    }

    public void clear(){
        mRoot = null;
        // Request garbage collection
        System.gc();
    }

    public boolean add(E element){
        // calls recursive method add, starting at the root
        mRoot = addRecursive(mRoot, element);
        return true;
    }

    private Node<E> addRecursive(Node <E> current, E element){

        // when the current node is null
        // we've reached a leaf node, and we can insert the new node
        if(current == null)
            return new Node(element);

        // if the element is less than the current node's data, we go to the left child
        // we go to the left child
        else if(element.compareTo(current.mData) < 0)
            return addRecursive(current.mLeft, element);

        // if the element is greater than the current node's data, we go to the right child
        // we go to the right
        else if(element.compareTo(current.mData) > 0)
            return addRecursive(current.mRight, element);

        else
            return current; // what if it a duplicate????
    }

    @Override
    public String toString() {

        /*
        1) Start @ root
        2) if (mLeft != null)
            - go left
           else
           append mLeft.mData
        3) 

         */
        String output = "";


        return output;
    }

    // Nested inner class
    private class Node <E extends Comparable<E> >
    {
        private Node <E> mLeft;
        private E mData;
        private Node <E> mRight;

        public Node(E data, Node <E> left, Node <E> right) {
            mData = data;
            mLeft = left;
            mRight = right;
        }

        public Node(E data){
            this(data, null, null);
        }

        public boolean isLeaf() {
            return mLeft == null && mRight == null;
        }
    }
}
