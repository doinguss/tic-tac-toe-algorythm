class failsafe{
    constructor(playerchar){
        this.p=playerchar;
    }
    tryp(i,j,board){
        if(board[i][j]===""){
            board[i][j]=this.p; return true;
        }return false;
    }
    turn(board){
        while(!this.tryp(Math.floor(Math.random()*2.9),Math.floor(Math.random()*2.9),board)){}
    }

}