let str = "String"

const subString = (str) => {
    var res = []
    for (let i = 0; i < str.length; i++) {
        for (let j = i; j < str.length; j++) {
            res.push(str.substring(i, j + 1));
        }
    }
    return res;
}

console.log(subString(str))