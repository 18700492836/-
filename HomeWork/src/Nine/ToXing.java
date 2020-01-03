package Nine;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ToXing extends JFrame{
	JButton[] a=new JButton[2];
	JLabel bq1,bq2,bq3,bq4,bq5;
	JPanel mb1,mb2,mb3,mb4,mb5;
	JTextArea wbk,wbk1;	
	JComboBox b,b1,b2;
	JRadioButton[] an=new JRadioButton[2];
	ButtonGroup dxz=new ButtonGroup();
	JCheckBox []j=new JCheckBox[9];
	public ToXing() {
//		创建单个画板
		mb1=new JPanel();
		mb2=new JPanel();
		mb3=new JPanel();
		mb4=new JPanel();
		mb5=new JPanel();
//		进行第一部分的确定
		bq1=new JLabel("请输入您的个人资料，完成后单击确定。");
		mb4.add(bq1);
		bq2=new JLabel("姓名：");
		wbk1=new JTextArea(20,15);
		bq5=new JLabel("性别：");
		an[0]=new JRadioButton("男");
		an[1]=new JRadioButton("女");
		this.setLayout(new FlowLayout());
//		dxz.add(an[0]);
//		dxz.add(an[1]);		
		mb1.add(bq2);
		mb1.add(wbk1);
		mb1.add(bq5);
		mb1.add(an[0]);
		mb1.add(an[1]);
//		进行生日的判断
		bq4=new JLabel("生日：");
		String []k= {"1999年","1998年","1997年"};
		b=new JComboBox(k);
		String []k1= {"1月","3月","7月"};
		b1=new JComboBox(k1);
		String []k2= {"27日","18日","19日"};
		b2=new JComboBox(k2);
		this.setLayout(new FlowLayout());
		mb5.add(bq4);
		mb5.add(b);
		mb5.add(b1);
		mb5.add(b2);
//		进行多个复选框
		bq3=new JLabel("爱好：");
	 j[0]=new JCheckBox("电影");
	 j[1]=new JCheckBox("阅读");
	 j[2]=new JCheckBox("网络");
	 j[3]=new JCheckBox("编程");
//	 this.setLayout(new FlowLayout());
	 j[4]=new JCheckBox("艺术");
	 j[5]=new JCheckBox("旅游");
	 j[6]=new JCheckBox("游戏");
	 j[7]=new JCheckBox("其他");
	this.setLayout(new FlowLayout());
	 mb2.add(bq3);
	 mb2.add(j[0]);
	 mb2.add(j[1]);
	 mb2.add(j[2]);
	 mb2.add(j[3]);
	 mb2.add(j[4]);
	 mb2.add(j[5]);
	 mb2.add(j[6]);
	 mb2.add(j[7]);
//		创建两个按钮
		a[0]=new JButton("确定");
		a[1]=new JButton("退出");	
//		将按钮添加到对应的最后一个画板里面
		mb2.add(wbk1);
		mb3.add(a[0]);
		mb3.add(a[1]);
		this.add(mb4);	
	 	this.add(mb1);
	 	this.add(mb5);
		this.add(mb2);
		this.add(mb3);
		this.setTitle("用户个人信息");
		this.setVisible(true);
		this.setSize(150,300);
		this.setLocation(350, 400);
	}
	public static void main(String[] args) {
		ToXing aa=new ToXing();
		
	}

}