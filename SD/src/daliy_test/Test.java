package daliy_test;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int i,k,n=1;
		Num nu=new Num();
		char operator []={'+','-','*','/'};
		System.out.println("����������ʽ");
		System.out.print("��������Ҫ������Ŀ����");
		Scanner sc = new Scanner(System.in);
		int votenum=sc.nextInt();	
		System.out.print("����������������ֵ��1~");
		int max=sc.nextInt();		
		System.out.print("�Ƿ���ӳ˷��ͳ�����1||0?:");
		int choose=sc.nextInt();
		if(choose==1){
			for(int j=1;;j++){
				i=(int)(1+Math.random()*(max-1+1));//���һ���������1-100��
				k=(int)(1+Math.random()*(max-1+1));//���һ���������1-100��
				char fuhao;
				int index = (int)(Math.random()*operator.length);
				fuhao=operator[index];
				int num;
				nu.adjustResult(char fuhao, i, k);
				} 
			}else{
		for(int j=1;;j++){
			i=(int)(1+Math.random()*(max-1+1));//���һ���������1-100��
			k=(int)(1+Math.random()*(max-1+1));//���һ���������1-100��
			char fuhao;
			int index = (int)(Math.random()*operator.length);
			fuhao=operator[index];
			int num;
			if(fuhao=='+'){
				 num=i+k;
				 if(num<100&&n<votenum){
						System.out.println("��"+n+"�⣺"+i+""+fuhao+""+k+"=");
						n++;
					}else{
						//j=1;
						continue;
					}
			}else if(fuhao=='-'){
				 num=i-k;
				 if(num<100&&n<10){
						System.out.println("��"+n+"�⣺"+i+""+fuhao+""+k+"=");
						n++;
					}else{
						//j=1;
						continue;
					}
			}
		} 
		}
	}
}
