/**
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 */

 function highAndLow(numbers){
    let array= numbers.split(" ");
    array=array.sort();
    array.sort(function(a,b){return b-a});
    return array[0]+" " +array.pop();
  }

  console.log(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));