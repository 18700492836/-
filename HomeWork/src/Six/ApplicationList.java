package Six;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ApplicationList {
	String name;
	int id;
	double englist_grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ApplicationList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplicationList(String name, int id, double englist_grade) {
		super();
		this.name = name;
		this.id = id;
		this.englist_grade = englist_grade;
	}
	@Override
	public String toString() {
		return "ApplicationList [name=" + name + ", id=" + id + ", englist_grade=" + englist_grade + "]";
	}
	public static void main(String[] args) {
		List <String >list2 = new ArrayList<>();
		list2.add("����");
		list2.add("�Һܺ�");
		list2.add(" ����ܿ���");
//		�����Ͻ������Ԫ��
		for(int i =0;i<list2.size();i++) {
			System.out.print(list2.get(i)+"  ");
		}
		System.out.println();
//		��ָ��λ�ý����޸�
		list2.set(1, "��ð���");
		for(int i =0;i<list2.size();i++) {
			System.out.print(list2.get(i)+"  ");
		}
		ApplicationList a = new ApplicationList( "����",17166101,98);
		ApplicationList a1= new ApplicationList( "����",17166102,98.5);
		ApplicationList a2 = new ApplicationList( "����",17166103,60);
		ApplicationList a3 = new ApplicationList( "������",17166104,78);
		List < Object>list3 = new ArrayList<>();
		list3.add(a);
		list3.add(a1);
		list3.add(a2);
		for(int i =0;i<list3.size();i++) {
			System.out.print(((ApplicationList)list3.get(i)).getName()+" ");
		}
		System.out.println();
//		 ʵ�ְ�list3��ӵ�list4 ����
		
		LinkedList<Object> list4 = new LinkedList<Object>(list3);
		list4.addFirst(a3);
		list4.addLast(a3);
		for(int j=0;j<list4.size();j++) {
			System.out.println(list4.get(j));
		}
	}
}
