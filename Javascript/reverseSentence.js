let sentence = "He llo ll ds";
console.log("Your Sentence is ", sentence);

let reverse = "";
let n = sentence.length;
let i = n - 1;

while (i >= 0) {
  let rev = "";
  while (i >= 0 && sentence[i] != " ") {
    rev += sentence[i];
    i -= 1;
  }
  reverse = " "+ rev + reverse;
  i -= 1;
}

console.log("Reversed sentence is", reverse.slice(1,n+1));