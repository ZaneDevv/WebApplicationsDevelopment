let numbers = [];
for (let i = 0; i < 100; i++)
    numbers.push(1 + Math.round(Math.random() * 99));

let strings = [];
for (let i = 0; i < 100; i++)
{
    let length = 1 + Math.round(Math.random() * 99);
    let string = "";

    for (let j = 0; j < length; j++)
        string += String.fromCharCode("A".charCodeAt(0) + Math.round(Math.random() * 26));
    
    strings.push(string);
}

console.log(numbers);
console.log(strings);
console.log(Math.max(...numbers));
console.log(strings.sort((a, b) => a.length - b.length)[strings.length - 1]);
console.log(numbers.filter(n => (n & 1) === 0));
console.log(numbers.filter(n => (n & 1) === 1));
console.log(strings.filter(string => string.includes("IS")));
console.log(numbers.filter(n => n % 3 === 0));
console.log(numbers.concat(strings));
console.log(strings.sort((a, b) => a.length - b.length).join(", "));
console.log(strings.shift());

strings.unshift("ABCD");
console.log(strings);

strings[Math.floor(Math.random() * strings.length)] = 'AAAAAAAAAAAAAAAAAAAAAAAAAAA';
console.log(strings);