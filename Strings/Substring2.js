let str = "String"

function* subString(str) {
    for (let i = 0; i < str.length; i++) {
        for (let j = i; j < str.length; j++) {
            yield str.substring(i, j + 1);
        }
    }
}

let y = subString(str)
let r = y.next();
while (!r.done) {
  console.log(r.value);
  r = y.next();
}