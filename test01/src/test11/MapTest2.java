package test11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest2 {

	/*
	 * ������	�谳��	���
		��������	�����	�븮
		�λ���	���λ�	����

	 */
	public static void main(String[] args) {
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("�μ�", "������");
		hm1.put("�̸�", "�谳��");
		hm1.put("Depart", "���");
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("�μ�", "��������");
		hm2.put("�̸�", "�����");
		hm2.put("Depart", "�븮");
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("�μ�", "�λ���");
		hm3.put("�̸�", "���λ�");
		hm3.put("Depart", "����");
		ArrayList<HashMap<String,String>> al;
		al = new ArrayList<HashMap<String,String>>();
		al.add(hm1);
		al.add(hm2);
		al.add(hm3);
		int cnt = 1;
		for(int i=0;i<al.size();i++) {
			HashMap<String,String> hm = al.get(i);
			System.out.println((cnt++) + ":" + hm);
		}
		User u = new User();
		u.setName("�ڰ���");
		u.setDepart("������");
		u.setAge("44");
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(u);
		for(int i=0;i<userList.size();i++) {
			User user = userList.get(i);
			System.out.println(user);
		}
	}
}
