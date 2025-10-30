let str = "Just Another String"
let ch = 'S'

const removeAllOccurences = (str, ch) => {
    return str.split(ch).join('');
}

removeAllOccurences(str, ch);