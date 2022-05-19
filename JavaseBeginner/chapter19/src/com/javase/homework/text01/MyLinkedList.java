package com.javase.homework.text01;

public class MyLinkedList {
    private Node header;
    private Node ending;
    private int size;

    // 添加数据的方法
    // 删除数据的方法
    // 修改数据的方法
    // 查找数据的方法
    // 打印集合中每个元素的方法

    public void addNode(Node node) {
        if (this.header == null) {
            this.header = node;
            this.ending = node;
        } else {
            this.ending.setNext(node);
            this.ending = node;
        }
        this.size ++;
    }

    public void deleteNode(int index) throws OverIndexException {
/*        Node delNode = this.header;
        if ((index >= this.size) || (index < 0)) {
            throw new OverIndexException("数据下标超出链表范围。");
        } else if (this.size == 1) {
            this.header = null;
            this.ending = null;
        } else {
            if (index == 0) {
                this.header = this.header.getNext();
            } else {
                for (int i = 0; i < index - 1; i ++) {
                    delNode = delNode.getNext();
                }
                delNode.setNext(delNode.getNext().getNext());
                if (index == (this.size - 1)) {
                    this.ending = delNode;
                }
            }
        }*/

        Node delNode = selectNode(index - 1);
        if (this.size == 1) {
            this.header = null;
            this.ending = null;
        } else {
            if (index == 0) {
                this.header = this.header.getNext();
            } else {
                delNode.setNext(delNode.getNext().getNext());
                if (index == (this.size - 1)) {
                    this.ending = delNode;
                }
            }
        }
        this.size --;
    }

    public void upsetNode(int index, Object data) throws OverIndexException {
        selectNode(index).setData(data);
    }

    public Node selectNode(int index) throws OverIndexException {
        Node selNode = this.header;
        if ((index >= this.size) || (index < 0)) {
            throw new OverIndexException("数据下标超出链表范围。");
        } else {
            for (int i = 0; i < index; i ++) {
                selNode = selNode.getNext();
            }
            return selNode;
        }
    }

    public void selectMyLinkedList() throws OverIndexException {
        if (this.size == 0) {
            System.out.println("此链表中没有元素。");
        } else {
            System.out.println("链表中共" + this.size + "个元素：");
            for (int i = 0; i < this.size; i++) {
                System.out.println("    链表中第" + (i + 1) + "个元素：" + selectNode(i).getData());
            }
        }
    }

    public MyLinkedList() {
    }

    public MyLinkedList(MyLinkedList list) {
        this.size = list.size;
        this.header = list.header;
        this.ending = list.ending;
    }

    public Node getHeader() {
        return header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    public Node getEnding() {
        return ending;
    }

    public void setEnding(Node ending) {
        this.ending = ending;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
