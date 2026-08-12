/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let r = x;
    let rev = 0;
    if(x<0){
        return false;
    }
    while(r>0)
    {
        let digit = r%10;
        rev = rev*10 + digit;
        r = Math.floor(r/10);
    }
    if(x === rev){
        return true;
    }
    return false;
};