package daliy_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Num {
	private double num1;//操作符1
	private double num2;//操作符2
	private int num;	//题目数量
	private int min;	//操作符的最小值
	private int max;	//操作符的最大值
	String fuhao[]; 
	private int maxResu;//最大值
	
	
	public int getMaxResu() {
		return maxResu;
	}
	public void setMaxResu(int maxResu) {
		this.maxResu = maxResu;
	}
	public String[] getFuhao() {
		return fuhao; 
	}
	public void setFuhao(String[] fuhao) {
		this.fuhao = fuhao;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	static double Add(double num1,double num2){//加法
		return num1+num2;
	}
	static double Sub(double num1,double num2){//减法
		return num1-num2;
	}
	static double Mul(double num1,double num2){//乘法
		return num1*num2;
	}
	static double Div(double num1,double num2){//除法
		return num1/num2;
	}
	public boolean adjustResult(char fuhao, i, k){
		if((fuhao.equals("+"))&&(Num.Add(num1, num2)<maxResul)){
			return true;
		}else if ((fuhao.equals("-"))&&(Num.Sub(num1, num2)<maxResul)){
			return true;
		}else if ((fuhao.equals("*"))&&(Num.Mul(num1, num2)<maxResul)){
			return true;
		}else if ((fuhao.equals("/"))&&(Num.Div(num1, num2)<maxResul)){
			return true;
		}else{
			return false;
		}
	}
	void adTheSecNum(char fuhao,double num1,double num2,int n){
		//double num1_1=num1;
		if(num2<0){
			System.out.println("第"+n+"题："+num1+""+fuhao+"("+num2+")=");
		}else{
			System.out.println("第"+n+"题："+num1+""+fuhao+""+num2+"=");
		}
	}
	int isInteger(String amount,String min,String max,String maxResul) { 
		try {  
	        Integer am = Integer.valueOf(amount);  
	        Integer mi = Integer.valueOf(min); 
	        Integer ma = Integer.valueOf(max); 
	        Integer re = Integer.valueOf(maxResul); 
			//Integer num2 = Double.valueOf(str);  
	        //System.out.println("Is Number!" + num);  
	        return 1; 
	} catch (Exception e) {  
	        return 0;  
	} 
	
	}
	
	
	
	
}
