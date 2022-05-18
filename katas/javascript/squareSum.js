function squareSum(numbers){
    let suma=0;
    numbers.forEach(element => {suma+=element**2;});
    return suma;
}

console.log(squareSum([]));