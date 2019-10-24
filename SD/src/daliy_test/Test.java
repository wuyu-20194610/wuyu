package daliy_test;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int i,k,n=1;
		Num nu=new Num();
		char operator []={'+','-','*','/'};
		System.out.println("简单四则运算式");
		System.out.print("请输入需要生成题目数：");
		Scanner sc = new Scanner(System.in);
		int votenum=sc.nextInt();	
		System.out.print("请输入操作数的最大值：1~");
		int max=sc.nextInt();		
		System.out.print("是否添加乘法和除法？1||0?:");
		int choose=sc.nextInt();
		if(choose==1){
			for(int j=1;;j++){
				i=(int)(1+Math.random()*(max-1+1));//输出一个随机数（1-100）
				k=(int)(1+Math.random()*(max-1+1));//输出一个随机数（1-100）
				char fuhao;
				int index = (int)(Math.random()*operator.length);
				fuhao=operator[index];
				int num;
				nu.adjustResult(char fuhao, i, k);
				} 
			}else{
		for(int j=1;;j++){
			i=(int)(1+Math.random()*(max-1+1));//输出一个随机数（1-100）
			k=(int)(1+Math.random()*(max-1+1));//输出一个随机数（1-100）
			char fuhao;
			int index = (int)(Math.random()*operator.length);
			fuhao=operator[index];
			int num;
			if(fuhao=='+'){
				 num=i+k;
				 if(num<100&&n<votenum){
						System.out.println("第"+n+"题："+i+""+fuhao+""+k+"=");
						n++;
					}else{
						//j=1;
						continue;
					}
			}else if(fuhao=='-'){
				 num=i-k;
				 if(num<100&&n<10){
						System.out.println("第"+n+"题："+i+""+fuhao+""+k+"=");
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
