// Declare an array with 10 names, including some duplicates
const arr = ["Liam", "Emma", "Olivia", "Noah", "Ava", "Liam", "Sophia", "Mason", "Olivia", "Isabella", "Mason"];

// Use filter to remove duplicate names and keep only unique ones
const uniqueNames = arr.filter((item, index) =>
    // Only keep the item if its first occurrence index matches the current index
    arr.indexOf(item) === index
);

// Loop through and print each unique name to the console
uniqueNames.forEach(item => console.log(item));