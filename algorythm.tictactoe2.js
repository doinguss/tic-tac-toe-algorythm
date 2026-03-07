var board=[["","",""],["","",""],["","",""]];
var playchar="X";
var opponentchar="O";

class mything{
    constructor(board,playchar,opponentchar){
        this.b=board;
        this.p=playchar;
        this.q=opponentchar;
    }
    trsp(b) {let o=structuredClone(b);for(let i=0;i<3;i){for(let j=0;j<3;j){   [o[i][j],o[j][i]]=[o[j][i],o[i][j]] ;}}return o;}//mirrors on diagonal
    rev (b) {let o=structuredClone(b);for(let i=0;i<3;i){for(let j=0;j<3;j){             o[i][j]=b[2-i][j]         ;}}return o;}//reverses the order in each row

    turn()  {//the thing getting called at each turn, checks if boardstate is in lookuptable otherwise manipulates the matrix and looks again untill it finds a match
        let o=structuredClone(b);
        let u=[[0,1,2],[3,4,5],[6,7,8]];//index matrix, is manipulated the same way the data matrix is but retains the original position of each position in form of value
        let i=-1;
        while(this.lookup (o)===-1){
            o=this.trsp   (o);
            u=this.trsp   (u);
            if(this.lookup(o)!==-1){break;}
            o=this.rev    (o);
            u=this.rev    (u);
        }
        this.b[(int)(u[i]*0.3625)][u[i]%3]=this.p; //the const is 2.9/8 and im taking the floor of that so that itll increase by 1 every third exluding the final one so its 0 0 0 1 1 1 2 2 2 for all the numbers 0 trhough 8
    }

    lookup(i,o) {//lookup table for compressed gamestates, returns optimal* move (*i dont know its optimal its the best i can do tho xd) 
        switch(o){
            case [  ["" ,"" ,""],
                    ["" ,"" ,""],
                    ["" ,"" ,""]]:
                    i=      0;
                    return  0;
        }
    }
}