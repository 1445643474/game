//jhhs
import java.util.Scanner;

public class Lucky {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String select = null;
		String[] userName = new String[10];
		String[] password = new String[10];
		int[] vipNum = new int[10];
		String userName1 = null;
		String password1 = null;
		String menu = null;
		int count = 0;
		int i = 0;
		int index = 0;
		do {
			System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
			System.out.println("\t1.ע��\n\t2.��¼\n\t3.�齱");
			System.out.println("*****************************");
			System.out.println("��ѡ��˵���");
			Scanner input = new Scanner(System.in);
			menu = input.next();
			switch (menu) {
			case "1":
				System.out.println("�����͸���ϵͳ>ע�᡿");
				if (i < userName.length) {
					System.out.println("���������ע����Ϣ��");
					System.out.println("�û�����");
					userName[i] = input.next();
					System.out.println("���룺");
					password[i] = input.next();
					vipNum[i] = (int) (10 * Math.random());
					for (int j = 0; j < i + 1; j++) {

						if (userName[i].equals(userName[j]) && (i > 0)) {
							System.out.println("���û��ѱ�ע��");
							break;
						} else {
							System.out.println("ע��ɹ�����Ǻ����Ļ�Ա����");
							System.out.println("�û���\t����\t��Ա����");
							System.out.println(userName[i] + "\t" + password[i] + "\t" + vipNum[i]);
							break;
						}

					}
					i++;
				}
				break;

			case "2":
				System.out.println("�����͸���ϵͳ>��¼��");
				if (userName == null) {
					System.out.println("����ע�ᣡ");
					break;
				}
				boolean flag;
				do {
					System.out.println("�������û�����");
					flag = false;
					userName1 = input.next();
					System.out.println("���������룺");
					password1 = input.next();
					for (int j = 0; j < password.length; j++) {
						if ((userName1.equals(userName[j])) && (password[j].equals(password1))) {
							System.out.println("��ӭ����" + userName[j]);
							index = j;
							flag = true;
							break;
						}
					}
					if (!flag) {
						System.out.println("��������û����������������������");
						count++;
					}

					if (count == 3) {
						System.out.println("������û�����������󳬹�3��");
						count = 0;
						break;
					}
				} while (!flag);
				break;

			case "3":
				System.out.println("�����͸���ϵͳ>�齱��");
				if ((userName1 != null)) {
					System.out.println("���Ļ�Ա���ţ�" + vipNum[index]);
					int[] luckyNum = new int[5];
					boolean flag1 = false;
					System.out.print("�������˻�Ա����:");
					for (int j = 0; j < luckyNum.length; j++) {
						luckyNum[j] = (int) (10 * Math.random());
						for (int k = 0; k < j; k++) {
							if (luckyNum[k] == luckyNum[j]) {
								luckyNum[j] = (int) (10 * Math.random());
								k = -1;
							}
						}
						System.out.print(luckyNum[j] + "\t");
					}
					System.out.println();
					for (int j = 0; j < luckyNum.length; j++) {
						if (vipNum[index] == luckyNum[j]) {
							System.out.println("��ϲ����Ϊ�������˻�Ա��");
							flag1 = true;
							break;
						}
					}
					if (!flag1) {
						System.out.println("��Ǹ�������Ǳ��յ����˻�Ա��");
					}
					userName1 = null;
				} else {
					System.out.println("���ȵ�¼,лл��");
				}
				break;
			default:
				System.out.println("������������");
				break;
			}
			boolean flag3;
			do {
				flag3 = false;
				System.out.println("�����𣿣�y/n��:");
				select = input.next();
				if (select.equals("n")) {
					System.out.println("ϵͳ�˳���ллʹ�ã�");
				} else if (!(select.equals("y"))) {
					System.out.println("������������");
					flag3 = true;
				}
			} while (flag3);
		} while (select.equals("y"));

	}

}
