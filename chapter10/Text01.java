public class Text01{
	public static void main(String[] args){
		Person p = new Person();
		p.setName("����");
		p.setSex(true);
		p.setAge(150);
		System.out.println("������" + p.getName());
		System.out.println("�Ա�" + p.getSex());
		System.out.println("���䣺" + p.getAge());
	}
}
class Person{
	private String name;
	private boolean sex;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSex(boolean sex){
		this.sex = sex;
	}
	public boolean getSex(){
		return this.sex;
	}
	public void setAge(int age){
		if((0 <= age) && (age <= 100)){
			this.age = age;
		}else{
			System.out.println("�������ֲ��Ϸ���������0~100");
		}
		
	}
	public int getAge(){
		return this.age;
	}
	
	{
		System.out.println("A new class of person have been created.");
	}
	public Person(){}
	public Person(String name,boolean sex,int age){
		setName(name);
		setSex(sex);
		setAge(age);
	}
}