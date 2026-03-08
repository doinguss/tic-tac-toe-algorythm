import java.util.ArrayList;

public class setvalmain {
	private ArrayList<String> sets;
	private setvalmain() {
		sets=new ArrayList<String>();
		validate(
				new String[][]{{".",".","."},{".",".","."},{".",".","."}},
				new String[][]{{".",".","."},{".","O","."},{".",".","."}},
				new String[][]{{".","O","."},{".","X","O"},{".",".","."}},
				new String[][]{{".","O","."},{".","X","."},{".","O","."}},////0->1
				new String[][]{{"X",".","."},{".","O","."},{".",".","."}},
				new String[][]{{"X",".","X"},{".","X","O"},{"O",".","O"}},
				new String[][]{{"X",".","O"},{"O","X","X"},{"X","O","O"}},
				new String[][]{{"O",".","O"},{".","X","."},{".",".","."}},
				new String[][]{{"O",".","O"},{".","X","."},{"X",".","O"}},
				new String[][]{{"X",".","O"},{"O","O","X"},{"X",".","O"}},
				new String[][]{{"X",".","X"},{"X","O","O"},{"O","O","."}},
				new String[][]{{"X",".","O"},{"O","O","X"},{"X","O","."}},
				new String[][]{{"X",".","X"},{"X","O","O"},{"O",".","O"}},////1->2
				new String[][]{{"X","X","."},{".","O","O"},{".",".","."}},
				new String[][]{{"X","X","."},{".","O","."},{".",".","O"}},
				new String[][]{{"X","X","."},{".","O","."},{".","O","."}},
				new String[][]{{"X","X","."},{".","O","."},{"O",".","."}},
				new String[][]{{"X","X","."},{"O","O","."},{".",".","."}},
				new String[][]{{"X",".","."},{".","X","O"},{".",".","O"}},
				new String[][]{{"O","O","."},{".","X","."},{".",".","."}},
				new String[][]{{"X","O","."},{".","O","."},{"O","X","."}},
				new String[][]{{"O","O","."},{".","X","O"},{"X",".","."}},
				new String[][]{{"O",".","."},{"O","X","O"},{"X",".","."}},
				new String[][]{{"O",".","."},{".","X","O"},{"X","O","."}},
				new String[][]{{"O",".","."},{".","X","O"},{"X",".","O"}},		//new String[][]{{"O","O","."},{".","X","."},{"X",".","O"}},
				new String[][]{{"O",".","."},{"O","X","."},{"X",".","O"}},			//* 27*/ new String[][]{{"O",".","."},{".","X","O"},{"X",".","O"}},		//new String[][]{{"O",".","."},{".","X","."},{"X","O","O"}},
				new String[][]{{"X",".","."},{"X","O","O"},{"O",".","."}},
				new String[][]{{"X","O","."},{".","X","O"},{".",".","O"}},
				new String[][]{{"X","O","."},{"O","O","X"},{"O","X","."}},
				new String[][]{{"X","O","."},{"O","O","X"},{".","X","O"}},
				new String[][]{{"X","O","."},{"X","O","O"},{"O","X","."}},
				new String[][]{{"X","O","."},{"O","X","."},{"X","O","O"}},
				new String[][]{{"X","O","."},{".","X","O"},{"X","O","O"}},////2->3
				new String[][]{{"X","O","O"},{".","X","X"},{".",".","O"}},
				new String[][]{{"X",".","O"},{".","X","X"},{"O",".","O"}},
				new String[][]{{"X",".","O"},{".","X","X"},{".","O","O"}},
				new String[][]{{"X","X","O"},{".","O","O"},{"X",".","."}},
				new String[][]{{"X","X","O"},{".","O","."},{"X","O","."}},
				new String[][]{{"X","X","O"},{".","O","."},{"X",".","O"}},
				new String[][]{{"X",".","."},{".","O","O"},{".",".","."}},
				new String[][]{{"X","O","."},{".","O","O"},{".","X","."}},
				new String[][]{{"X","O","O"},{".","O","."},{"X",".","."}},
				new String[][]{{"X",".","O"},{".","O","O"},{"X",".","."}},
				new String[][]{{"X",".","O"},{".","O","."},{"X","O","."}},
				new String[][]{{"X",".","O"},{".","O","."},{"X",".","O"}},
				new String[][]{{"O","O","X"},{".","X","."},{"O",".","."}},
				new String[][]{{"O","X","O"},{".","X","."},{".","O","."}},
				new String[][]{{"X","O","O"},{".","O","O"},{"X","X","."}},		//new String[][]{{"X","O","O"},{".","O","."},{"X","X","O"}},		//new String[][]{{"X","O","X"},{".","O","O"},{"O","X","."}},		//new String[][]{{"X","O","X"},{".","O","."},{"O","X","O"}},			//* 54*/ new String[][]{{"X","O","O"},{".","O","."},{"X","X","O"}},		//new String[][]{{"X","O","."},{".","O","O"},{"X","X","O"}},
				new String[][]{{"X","O","O"},{".","X","."},{"X","O","O"}},////3->4
				new String[][]{{"X","O","."},{".",".","."},{".",".","."}},
				new String[][]{{"X",".","O"},{".",".","."},{".",".","."}},
				new String[][]{{"X",".","."},{".",".","O"},{".",".","."}},
				new String[][]{{"X",".","."},{".",".","."},{".",".","O"}},
				new String[][]{{"O",".","."},{".",".","."},{".",".","."}},
				new String[][]{{".","O","."},{".",".","."},{".",".","."}},////4->5
				new String[][]{{"X",".","O"},{".","X","."},{".",".","O"}},
				new String[][]{{"X","X","O"},{"O","O","."},{"X",".","."}},
				new String[][]{{"X","O","."},{"O","O","."},{".","X","."}},
				new String[][]{{"X",".","O"},{"O","O","."},{"X",".","."}},
				new String[][]{{"X","O","X"},{"O","O","."},{"O","X","."}},
				new String[][]{{"X","O","."},{"O","O","."},{"X","X","O"}},
				new String[][]{{"O","X","O"},{".","X","."},{"X","O","O"}},
				new String[][]{{"O","O","X"},{"X","X","."},{"O","O","."}},
				new String[][]{{"O","O","X"},{"X","X","."},{"O",".","O"}},
				new String[][]{{"O","X","O"},{"X","X","."},{"O","O","."}},////5->6
				new String[][]{{"O","X","O"},{"X","X","."},{".","O","O"}},
				new String[][]{{"X","O","."},{".","X","."},{".",".","O"}},
				new String[][]{{"X","X","O"},{".","O","."},{".",".","."}},
				new String[][]{{"X","O","X"},{".","X","O"},{".",".","O"}},
				new String[][]{{"X",".","X"},{".","X","O"},{".","O","O"}},
				new String[][]{{"X",".","X"},{"O","X","O"},{".",".","O"}},
				new String[][]{{"X",".","O"},{"O","X","X"},{".",".","O"}},
				new String[][]{{"X",".","O"},{".","O","."},{".",".","."}},
				new String[][]{{"X",".","."},{".","O","."},{".",".","O"}},
				new String[][]{{"O",".","."},{".","X","O"},{".",".","."}},
				new String[][]{{"O",".","."},{".","X","."},{".",".","O"}},
				new String[][]{{"X","O","O"},{".","O","."},{".","X","."}},
				new String[][]{{"X","O","."},{".","O","."},{".","X","O"}},
				new String[][]{{"X","O","."},{"X","O","O"},{".",".","."}},
				new String[][]{{"X",".","O"},{"X","O","O"},{".",".","."}},
				new String[][]{{"X",".","."},{"X","O","O"},{".","O","."}},
				new String[][]{{"X",".","."},{"X","O","O"},{".",".","O"}},
				new String[][]{{"O","O","X"},{"O","X","."},{".",".","."}},
				new String[][]{{"O","O","X"},{".","X","O"},{".",".","."}},		//new String[][]{{"O","O","X"},{".","X","."},{".","O","."}},		//new String[][]{{"O","O","X"},{".","X","."},{".",".","O"}},
				new String[][]{{"X","O","."},{".","X","."},{".","O","O"}},		//new String[][]{{"X","O","O"},{"O","O","X"},{".","X","."}},
				new String[][]{{"X","O","O"},{"X","O","O"},{".","X","."}},
				new String[][]{{"X","O","."},{"X","O","O"},{".","X","O"}},		//new String[][]{{"X","O","X"},{"O","X","O"},{".",".","O"}},			//* 99*/ new String[][]{{"X","O","X"},{"O","X","O"},{".",".","O"}},
				new String[][]{{"X","O","X"},{".","X","O"},{".","O","O"}},////6->7		//new String[][]{{"X","O","O"},{"O","X","X"},{"X",".","O"}},
				new String[][]{{"X","X","O"},{"O","O","X"},{"X",".","O"}},
				new String[][]{{"X","O","."},{".","O","."},{".",".","."}},
				new String[][]{{"O","X","O"},{"O","X","."},{".",".","."}},			//* 105*/ new String[][]{{"O","X","O"},{".","X","O"},{".",".","."}},
				new String[][]{{"O","X","O"},{".","X","."},{"O",".","."}},			//* 107*/ new String[][]{{"O","X","O"},{".","X","."},{".",".","O"}},		//new String[][]{{"X","O","O"},{"O","O","X"},{"X",".","."}},		//new String[][]{{"O","X","O"},{"O","X","O"},{"X",".","."}},
				new String[][]{{"O","X","O"},{".","X","O"},{"X",".","O"}},		//new String[][]{{"O","X","O"},{"O","X","."},{"X",".","O"}},		//new String[][]{{"X","O","X"},{"X","O","O"},{"O",".","."}},
				new String[][]{{"O","O","X"},{"X","X","O"},{"O",".","."}},
				new String[][]{{"X","O","X"},{".","X","O"},{"O",".","O"}},////7->8
				new String[][]{{"X","O","O"},{".","X","."},{".",".","."}},
				new String[][]{{"X","O","."},{".","X","O"},{".",".","."}},
				new String[][]{{"X","O","."},{".","X","."},{".","O","."}},
				new String[][]{{"X","O","."},{".","X","."},{"O",".","."}},
				new String[][]{{"X","O","."},{"O","X","."},{".",".","."}},
				new String[][]{{"X",".","O"},{".","X","O"},{".",".","."}},
				new String[][]{{"X",".","O"},{".","X","."},{".","O","."}},
				new String[][]{{"X",".","O"},{".","X","."},{"O",".","."}},
				new String[][]{{"X",".","."},{".","X","O"},{".","O","."}},
				new String[][]{{"X","X","O"},{"O","O","X"},{"X","O","."}},
				new String[][]{{"O",".","O"},{".","X","O"},{"X",".","."}},			//* 126*/ new String[][]{{"X","O","O"},{".","X","O"},{".",".","."}},
				new String[][]{{"X","O","."},{"O","X","O"},{".",".","."}},		//new String[][]{{"X","O","."},{".","X","O"},{"O",".","."}},
				new String[][]{{"X","O","."},{".","X","O"},{".","O","."}},			//* 130*/ new String[][]{{"X","O","O"},{".","X","."},{".","O","."}},		//new String[][]{{"X","O","."},{"O","X","."},{".","O","."}},			//* 132*/ new String[][]{{"X","O","."},{".","X","O"},{".","O","."}},
				new String[][]{{"X","O","."},{".","X","."},{"O","O","."}},
				new String[][]{{"X","O","O"},{"O","O","."},{"X","X","."}},
				new String[][]{{"O","X","O"},{".","X","O"},{"X","O","."}},
				new String[][]{{"O","X","O"},{"X","X","O"},{".","O","."}}
		);
	}

	public static void main(String[] args) {
		setvalmain s= new setvalmain();
		s.nill();
	}

	//from algorytm.tictactoe2.js
	private String[][] trsp(String[][] b) {String[][] o=new String[3][3];for(int i=0;i<3;i++){for(int j=0;j<3;j++){ o[i][j]=b[j][i]			  ;}}return o;}//mirrors on diagonal
	private String[][] rev (String[][] b) {String[][] o=new String[3][3];for(int i=0;i<3;i++){for(int j=0;j<3;j++){	o[i][j]=b[i][2-j]         ;}}return o;}//reverses the order in each row

	//w111 10g 411 1n574nc35 0f r3p3471ng b04rd 574735 (wr173n 1n 13375p34k 4 funn5i35)
	private void validate(String[][]... mtrx){
		System.out.println("running");
		sets.clear();
		boolean con;
    	String[][] o;
	    for(int count=0; count<mtrx.length;count++) {
	    	con=true;
	    	o=mtrx[count].clone();
	        for (int i=0;i<8;i++){
	        	if (sets.contains(cont(o))){ System.out.println("!1 : "+(count+8)+" ("+count+")\t\t"+cont(mtrx[count])+" at: "+(sets.indexOf(cont(o))+8)+" ("+sets.indexOf(cont(o))+") \n\t\t\t=====\n\t\t\t"+cont(o)+"\n");con=false;break;}
	            o=trsp(o);
	            if (sets.contains(cont(o))){ System.out.println("!2 : "+(count+8)+" ("+count+")\t\t"+cont(mtrx[count])+" at: "+(sets.indexOf(cont(o))+8)+" ("+sets.indexOf(cont(o))+") \n\t\t\t=====\n\t\t\t"+cont(o)+"\n");con=false;break;}
	            o=rev(o);
	            if (sets.contains(cont(o))){ System.out.println("!3 : "+(count+8)+" ("+count+")\t\t"+cont(mtrx[count])+" at: "+(sets.indexOf(cont(o))+8)+" ("+sets.indexOf(cont(o))+") \n\t\t\t=====\n\t\t\t"+cont(o)+"\n");con=false;break;}
	            o=trsp(o);
	            if (sets.contains(cont(o))){ System.out.println("!4 : "+(count+8)+" ("+count+")\t\t"+cont(mtrx[count])+" at: "+(sets.indexOf(cont(o))+8)+" ("+sets.indexOf(cont(o))+") \n\t\t\t=====\n\t\t\t"+cont(o)+"\n");con=false;break;}
	            o=trsp(o);
	        }
	        if (con) {
	        sets.add(cont(mtrx[count]));
	        }
	    }
	    System.out.println("done");
	}
	private String cont(String[][] s) {
		return "|"+s[0][0]+s[0][1]+s[0][2]+"|\n\t\t\t|"+s[1][0]+s[1][1]+s[1][2]+"|\n\t\t\t|"+s[2][0]+s[2][1]+s[2][2]+"|";
	}
	private void nill() {
		/* add a "*" here-->/
		String[][] test= {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		System.out.println("\n\t\t\t"+cont(test));
		test=trsp(test);
		test=rev(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=trsp(test);
		test=rev(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=trsp(test);
		test=rev(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=trsp(test);
		test=rev(test);
		System.out.println("\n\t\t\t"+cont(test));
		/** /
		test=trsp(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=rev(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=trsp(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=rev(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=trsp(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=rev(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=trsp(test);
		System.out.println("\n\t\t\t"+cont(test));
		test=rev(test);
		System.out.println("\n\t\t\t"+cont(test));
		/**/
	}


}
