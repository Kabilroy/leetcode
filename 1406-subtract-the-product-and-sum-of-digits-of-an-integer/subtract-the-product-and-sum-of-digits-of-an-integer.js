/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let sum = 0;
    let pro = 1;
    let res = 0;
    while(n>0){
        let digit = n%10;
        sum+=digit;
        pro*=digit;
        n= Math.floor(n/10);
    }
    return pro-sum;
};