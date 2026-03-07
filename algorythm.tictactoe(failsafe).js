var board=[["","",""],["","",""],["","",""]];
var playchar="X";

function tryp(i,j){
if(board[i][j]===""){
    board[i][j]=playerchar; return true;
}return false;
}

function turn(){
    while(!tryp((int)(Math.random*2.9),(int)(Math.random*2.9))){}
}