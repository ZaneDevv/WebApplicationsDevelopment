let names = ["Jane", "John", "Maria", "Alex", "Albert", "Takashi"];
let filteredNames = names
                    .sort((name0, name1) => name0.localeCompare(name1))
                    .filter(name => name[0].toUpperCase() === 'J');

console.log(filteredNames);
filteredNames.forEach(name => console.log(name[0]));