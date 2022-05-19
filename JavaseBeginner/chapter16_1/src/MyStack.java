public class MyStack {
    private Object[] elements;
    private int index;

    public MyStack(int length) {
        this.elements = new Object[length];
        this.index = 0;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void push(Object object){
        if (this.index >= this.elements.length){
            this.index = this.elements.length;
            System.out.print("栈已满，压栈失败。");
        } else{
            if (this.index < 0){
                this.index = 0;
            }
            this.elements[this.index] = object;
            this.index ++;
            System.out.print("压栈成功。");
        }
        display(this.elements);
    }

    public void pop(){
        if (this.index <= 0){
            this.index = 0;
            System.out.print("栈已空，弹栈失败。");
        } else{
            if (this.index > this.elements.length){
                this.index = this.elements.length;
            }
            this.index --;
            this.elements[this.index] = null;
            System.out.print("弹栈成功。");
        }
        display(this.elements);
    }

    public static void display(Object[] elements){
        for (int i = 0; i < elements.length; i ++){
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
