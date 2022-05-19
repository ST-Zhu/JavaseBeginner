/*编写程序实现单向链表数据结构：
	public class Node {
		Object data;
		Node next;
	}
	public class MyLinkedList{
		Node header;
		....
		// 添加数据的方法
		// 删除数据的方法
		// 修改数据的方法
		// 查找数据的方法
		// 打印集合中每个元素的方法
	}

	最后编写测试程序*/

package com.javase.homework.text01;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        try {
            list.selectMyLinkedList();
            System.out.println("====================");

            list.addNode(new Node("张一"));
            list.addNode(new Node("张二"));
            list.addNode(new Node("张三"));
            list.addNode(new Node("李四"));
            list.addNode(new Node("王五"));
            list.addNode(new Node("赵六"));
            list.addNode(new Node("赵七"));
            list.addNode(new Node("赵八"));
            list.addNode(new Node("赵九"));
            list.addNode(new Node("赵十"));

            System.out.println(list.selectNode(2));
            System.out.println(list.selectNode(0));
            System.out.println(list.selectNode(1));
            System.out.println(list.selectNode(3));
            System.out.println("====================");

            list.deleteNode(1);
            list.selectMyLinkedList();
            System.out.println("====================");

            list.deleteNode(5);
            list.selectMyLinkedList();
            System.out.println("====================");

            list.deleteNode(3);
            list.selectMyLinkedList();
            System.out.println("====================");

        } catch (OverIndexException e) {
            System.out.println(e.getMessage());
        }
    }
}
