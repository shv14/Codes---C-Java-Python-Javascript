// Declare an array with 10 names, including some duplicates
const arr = ["Liam", "Emma", "Olivia", "Noah", "Ava", "Liam", "Sophia", "Mason", "Olivia", "Isabella", "Mason"];

// Use a Set to automatically remove duplicate names from the array
// The spread operator (...) is used to convert the Set back into an array
const uniqueNames = [...new Set(arr)];

// Loop through each unique name in the array and print it to the console
uniqueNames.forEach(item => console.log(item));