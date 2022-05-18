var countSheep = function (num){
    let result="";
    if(num>=1){
        for(let i=1; i<=num; i++){
            result+=`${i} sheep...`;
        }
    }
    return result;
}

console.log(countSheep(5));