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
			System.out.println("*****欢迎进入奖客富翁系统*****");
			System.out.println("\t1.注册\n\t2.登录\n\t3.抽奖");
			System.out.println("*****************************");
			System.out.println("请选择菜单：");
			Scanner input = new Scanner(System.in);
			menu = input.next();
			switch (menu) {
			case "1":
				System.out.println("【奖客富翁系统>注册】");
				if (i < userName.length) {
					System.out.println("请输入个人注册信息：");
					System.out.println("用户名：");
					userName[i] = input.next();
					System.out.println("密码：");
					password[i] = input.next();
					vipNum[i] = (int) (10 * Math.random());
					for (int j = 0; j < i + 1; j++) {

						if (userName[i].equals(userName[j]) && (i > 0)) {
							System.out.println("该用户已被注册");
							break;
						} else {
							System.out.println("注册成功，请记好您的会员卡号");
							System.out.println("用户名\t密码\t会员卡号");
							System.out.println(userName[i] + "\t" + password[i] + "\t" + vipNum[i]);
							break;
						}

					}
					i++;
				}
				break;

			case "2":
				System.out.println("【奖客富翁系统>登录】");
				if (userName == null) {
					System.out.println("请先注册！");
					break;
				}
				boolean flag;
				do {
					System.out.println("请输入用户名：");
					flag = false;
					userName1 = input.next();
					System.out.println("请输入密码：");
					password1 = input.next();
					for (int j = 0; j < password.length; j++) {
						if ((userName1.equals(userName[j])) && (password[j].equals(password1))) {
							System.out.println("欢迎您：" + userName[j]);
							index = j;
							flag = true;
							break;
						}
					}
					if (!flag) {
						System.out.println("您输入的用户名或密码错误，请重新输入");
						count++;
					}

					if (count == 3) {
						System.out.println("输入的用户名或密码错误超过3次");
						count = 0;
						break;
					}
				} while (!flag);
				break;

			case "3":
				System.out.println("【奖客富翁系统>抽奖】");
				if ((userName1 != null)) {
					System.out.println("您的会员卡号：" + vipNum[index]);
					int[] luckyNum = new int[5];
					boolean flag1 = false;
					System.out.print("本日幸运会员卡号:");
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
							System.out.println("恭喜您成为本日幸运会员！");
							flag1 = true;
							break;
						}
					}
					if (!flag1) {
						System.out.println("抱歉，您不是本日的幸运会员！");
					}
					userName1 = null;
				} else {
					System.out.println("请先登录,谢谢！");
				}
				break;
			default:
				System.out.println("您的输入有误！");
				break;
			}
			boolean flag3;
			do {
				flag3 = false;
				System.out.println("继续吗？（y/n）:");
				select = input.next();
				if (select.equals("n")) {
					System.out.println("系统退出，谢谢使用！");
				} else if (!(select.equals("y"))) {
					System.out.println("您的输入有误！");
					flag3 = true;
				}
			} while (flag3);
		} while (select.equals("y"));

	}

}
