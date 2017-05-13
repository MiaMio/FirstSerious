import shape.*;

public class shapes{
	private static randomShape gen=new randomShape();
	public static void main(String[] args){
		shape[] s=new shape[9];
		for(int i=0; i<s.length; i++)
			s[i]=gen.next();
		for(shape shp:s)
			shp.draw();
		System.out.println("modify");
	}
}