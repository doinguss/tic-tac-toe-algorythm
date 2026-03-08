import java.util.ArrayList;

public class setvalmain {
	private ArrayList<String> sets;
	public setvalmain() {
		sets=new ArrayList<String>();
		validate(new String[][] 
				{{".",".","."},
			     {".",".","."}, 
			     {".",".","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".",".","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".",".","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","."},
			     {".",".","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","."},
			     {".",".","."},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X",".","."},
			     {".","O","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X","X","."},
			     {".","O","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X","X","."},
			     {".","O","."},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X","X","."},
			     {".","O","."},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X","X","."},
			     {".","O","."},
			     {"O",".","."}}
			     ,new String[][] 
			     {{"X","X","."},
			     {"O","O","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","."},
			     {".","X","O"},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","X","."},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","."},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X","X","O"},
			     {".","O","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","X","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","."},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","."},
			     {"O",".","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"O","X","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","X","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","X","."},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","X","."},
			     {"O",".","."}}
			     ,new String[][] 
			     {{"X",".","."},
			     {".","X","O"},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X",".","X"},
			     {".","X","O"},
			     {"O",".","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","X","X"},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","X","X"},
			     {"O",".","O"}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","X","X"},
			     {".","O","O"}}
			     ,new String[][] 
			     {{"X","X","O"},
			     {".","O","O"},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"X","X","O"},
			     {".","O","."},
			     {"X","O","."}}
			     ,new String[][] 
			     {{"X","X","O"},
			     {".","O","."},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"X","X","O"},
			     {"O","O","."},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"X","O","X"},
			     {".","X","O"},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X",".","X"},
			     {".","X","O"},
			     {".","O","O"}}
			     ,new String[][] 
			     {{"X",".","X"},
			     {"O","X","O"},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {"O","X","X"},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {"O","X","X"},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {"O","X","X"},
			     {"X","O","O"}}
			     ,new String[][] 
			     {{"X","X","O"},
			     {"O","O","X"},
			     {"X","O","."}}
			     ,new String[][] 
			     {{"X","X","O"},
			     {"O","O","X"},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{".",".","."},
			     {".","O","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"O",".","."},
			     {".",".","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{".","O","."},
			     {".",".","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","O","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","O","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","."},
			     {".","O","."},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"O",".","."},
			     {".","X","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"O",".","."},
			     {".","X","."},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X",".","."},
			     {".","O","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"O","O","."},
			     {".","X","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"O",".","O"},
			     {".","X","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{".","O","."},
			     {".","X","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{".","O","."},
			     {".","X","."},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","O","."},
			     {".","X","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"O","O","."},
			     {".","X","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","O","O"},
			     {".","X","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","O","."},
			     {"O","X","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","O","."},
			     {".","X","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","O","."},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {"O","O","."},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","O","O"},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","O","."},
			     {"X","O","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {".","O","."},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O","O","."},
			     {".","X","O"},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"O",".","O"},
			     {".","X","O"},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"O",".","."},
			     {"O","X","O"},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"O",".","."},
			     {".","X","O"},
			     {"X","O","."}}
			     ,new String[][] 
			     {{"O",".","."},
			     {".","X","O"},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O","O","."},
			     {".","X","."},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O",".","O"},
			     {".","X","."},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O",".","."},
			     {"O","X","."},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O",".","."},
			     {".","X","O"},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O",".","."},
			     {".","X","."},
			     {"X","O","O"}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"X","O","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {"X","O","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X",".","."},
			     {"X","O","O"},
			     {"O",".","."}}
			     ,new String[][] 
			     {{"X",".","."},
			     {"X","O","O"},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X",".","."},
			     {"X","O","O"},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"O","O","X"},
			     {"O","X","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"O","O","X"},
			     {".","X","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"O","O","X"},
			     {".","X","."},
			     {"O",".","."}}
			     ,new String[][] 
			     {{"O","O","X"},
			     {".","X","."},
			     {".","O","."}}
			     ,new String[][] 
			     {{"O","O","X"},
			     {".","X","."},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {"O","X","."},
			     {".",".","."}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {".","X","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {".","X","."},
			     {"O",".","."}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {".","X","."},
			     {".","O","."}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {".","X","."},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","X","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"O","X","O"},
			     {".",".","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","O"},
			     {"O",".","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","O"},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","O"},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","X","."},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"O","X","."},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","O"},
			     {".","O","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","."},
			     {"O","O","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","."},
			     {".","O","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {"O","O","."},
			     {"X","X","."}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","O","O"},
			     {"X","X","."}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","O","."},
			     {"X","X","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {"O","O","X"},
			     {".","X","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"O","O","X"},
			     {"O","X","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"O","O","X"},
			     {".","X","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {"X","O","O"},
			     {".","X","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"X","O","O"},
			     {"O","X","."}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"X","O","O"},
			     {".","X","O"}}
			     ,new String[][] 
			     {{"X","O","X"},
			     {"O","O","."},
			     {"O","X","."}}
			     ,new String[][] 
			     {{"X","O","X"},
			     {".","O","O"},
			     {"O","X","."}}
			     ,new String[][] 
			     {{"X","O","X"},
			     {".","O","."},
			     {"O","X","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","O","."},
			     {"X","X","O"}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"O","O","."},
			     {"X","X","O"}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","O","O"},
			     {"X","X","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {"O","O","X"},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {"O","O","X"},
			     {"X","O","."}}
			     ,new String[][] 
			     {{"X",".","O"},
			     {"O","O","X"},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {"O","X","O"},
			     {"X",".","."}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {".","X","O"},
			     {"X","O","."}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {".","X","O"},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {"O","X","."},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {".","X","O"},
			     {"X",".","O"}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {".","X","."},
			     {"X","O","O"}}
			     ,new String[][] 
			     {{"X","O","X"},
			     {"X","O","O"},
			     {"O",".","."}}
			     ,new String[][] 
			     {{"X",".","X"},
			     {"X","O","O"},
			     {"O","O","."}}
			     ,new String[][] 
			     {{"X",".","X"},
			     {"X","O","O"},
			     {"O",".","O"}}
			     ,new String[][] 
			     {{"O","O","X"},
			     {"X","X","O"},
			     {"O",".","."}}
			     ,new String[][] 
			     {{"O","O","X"},
			     {"X","X","."},
			     {"O","O","."}}
			     ,new String[][] 
			     {{"O","O","X"},
			     {"X","X","."},
			     {"O",".","O"}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {"X","X","O"},
			     {".","O","."}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {"X","X","."},
			     {"O","O","."}}
			     ,new String[][] 
			     {{"O","X","O"},
			     {"X","X","."},
			     {".","O","O"}}
			     ,new String[][] 
			     {{"X","O","X"},
			     {"O","X","O"},
			     {".",".","O"}}
			     ,new String[][] 
			     {{"X","O","X"},
			     {".","X","O"},
			     {"O",".","O"}}
			     ,new String[][] 
			     {{"X","O","X"},
			     {".","X","O"},
			     {".","O","O"}}
			     ,new String[][] 
			     {{"X","O","O"},
			     {".","X","."},
			     {"X","O","O"}}
			     ,new String[][] 
			     {{"X","O","."},
			     {"O","X","."},
			     {"X","O","O"}}
			     ,new String[][] 
			     {{"X","O","."},
			     {".","X","O"},
			     {"X","O","O"}}
		);
	}

	public static void main(String[] args) {
		System.out.println("running");
		setvalmain s= new setvalmain();
		s.nill();
	}

	//from algorytm.tictactoe2.js
	private String[][] trsp(String[][] b) {String[][] o=b.clone();String temp;for(int i=0;i<3;i++){for(int j=0;j<3;j++){   temp=o[i][j];o[i][j]=o[j][i];o[j][i]=temp;}}return o;}//mirrors on diagonal
	private String[][] rev (String[][] b) {String[][] o=b.clone();for(int i=0;i<3;i++){for(int j=0;j<3;j++){             o[i][j]=b[2-i][j]         ;}}return o;}//reverses the order in each row

	//w111 10g 411 1n574nc35 0f r3p3471ng b04rd 574735 (wr173n 1n 13375p34k 4 funn5i35)
	private void validate(String[][]... mtrx){
		sets.clear();
		int count=0;
		boolean con;
    	String[][] o;
	    for(String[][] Element:mtrx) {
	    	count++;
	    	con=true;
	    	o=Element.clone();
	        if (sets.contains(cont(o))){ System.out.println("!1 : "+count+"\t\t"+cont(Element));con=false;}
	        if(con) {
	        for (int i=0;i<4;i++){
	            o=trsp(o);
	            if (sets.contains(cont(o))){ System.out.println("!2 : "+count+"\t\t"+cont(Element));con=false;break;}
	            o=rev(o);
	            if (sets.contains(cont(o))){ System.out.println("!3 : "+count+"\t\t"+cont(Element));con=false;break;}
	            o=trsp(o);
	            if (sets.contains(cont(o))){ System.out.println("!4 : "+count+"\t\t"+cont(Element));con=false;break;}
	            o=trsp(o);
	        }}
	        if (con) {
	        sets.add(cont(Element));
	        }
	    };
	}
	private String cont(String[][] s) {
		return s[0][0]+s[0][1]+s[0][2]+s[1][0]+s[1][1]+s[1][2]+s[2][0]+s[2][1]+s[2][2];
	}
	public void nill() {}


}
