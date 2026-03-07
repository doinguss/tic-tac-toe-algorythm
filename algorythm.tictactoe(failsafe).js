var board=[["","",""],["","",""],["","",""]];
var playchar="X";

function tryp(i,j){
if(board[i][j]===""){
    board[i][j]=playerchar; return true;
}return false;
}

function turn(){
    while(!tryp(Math.random%3,Math.random%3)){}
}