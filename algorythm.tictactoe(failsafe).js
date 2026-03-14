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














// class exampleclass{
//     constructor(exampleParam1,exampleParam2, ...other){
//         this.property1=exampleParam1;
//         this.property2=exampleParam2;
//         this.other=other;
//     }
//     exampleFunc(){ 
//         this.exampleInternalFunc2();
//         return this.exampleInternalFunc(1,"ab",['x','y']);
//     }
//     exampleInternalFunc(a,b,c){return b;}
//     exampleInternalFunc2(){}
// }


















// class urClassNameHere{
//     constructor(playerchar){
//         this.p=playerchar;      //"p" specificlly
//     }
//     turn(board){                //"turn" specifically, 
//         //...                   //board is a matrix 3 string arr in an arr        
//     }
// }                               //set the board index u wanna play inside the class