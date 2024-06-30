public class LinkedList{
  private Node head;
  private Node tail;
  private int length;

  public LinkedList(int value){
    head = new Node(value);
    tail = head;
    length = 1;
  }

  public void append(int value){
    Node newNode = new Node(value);
    if (length == 0){
      head = newNode;
      tail = newNode;
    }else{
      tail.next = newNode;
      tail = newNode;
    }
  length++;
  }

  public void prepend(int value){
    Node newNode = new Node(value);
    if (length == 0){
      head = newNode;
      tail= newNode;
    }else{
      newNode.next = head;
      head = newNode;
    }
    length++;
  }

  public Node removeLast(){
    if (length == 0) return null;
    Node temp = head;
    Node pre = head;
    
    while(temp.next != null)
    {
      pre = temp;
      temp = temp.next;
    }
    tail = pre;
    tail.next = null;
    length--;
    if (length == 0){
      head= null;
      tail = null;
    }
    return temp;
  }

  public void printList() {
      Node current = head;
      while (current != null) {
          System.out.print(current.value + " ");
          current = current.next;
      }
      System.out.println();
  }
 
}