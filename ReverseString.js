var reverseString = function(s) {
    a = 0;
    let res = s.length -1;
    (function swap() {
        if (a >= res) {
            return;
        }
    const tmp = s[a];
    s[a] = s[res];
    s[res] = tmp
    a++;
    res--;
    swap();
    }());
};
console.log(reverseString());