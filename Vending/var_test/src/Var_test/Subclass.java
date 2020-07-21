package Var_test;

public class Subclass {
	private String text ="Stringvalue";
	public Subclass(String text) {
		this.text=text;
	}
	public Subclass() {
		
	}
	public String getText() {
		return this.text;
	}
	public void setText(String setText) {
		this.text = setText;
	}
	public void setTex(String setText,String text2) {
		this.text= setText+text2+this.text;
	}
 public void subMethod() {
	 System.out.println("method");
 }
}
