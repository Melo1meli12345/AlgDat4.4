package org.example;

import org.w3c.dom.Node;

public class Main {
  double element;
  Node neste;
  Node forrige;

  public static void main(String[] args) {


  }

  public void Node(double e, Node n, Node f) {
    element = e;
    neste = n;
    forrige = f;
  }

  public double finnElement() {
    return element;
  }

  public Node finnNeste() {
    return neste;
  }

  public Node finnForrige() {
    return forrige;
  }
}