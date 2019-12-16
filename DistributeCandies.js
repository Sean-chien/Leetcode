var distributeCandies = function(candies) {
    const size = new Set(candies).size;
    var n = candies.length;
    if (size >= n/2) {
        return n/2;
    } else {
        return size;
    }
    
};