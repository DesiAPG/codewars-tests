package org.example;

/*
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

Note: For 4 or more names, the number in "and 2 others" simply increases.

*/
public class WhoLikesIt {
    public String whoLikesIt(String... array) {
        String output = "";
        if (array.length <= 0) {
            output = "no one likes this";
        } else if (array.length == 1) {
            output = array[0] + " likes this";
        } else if (array.length == 2) {
            output = array[0] + " and " + array[1] + " like this";
        } else if (array.length == 3) {
            output = array[0] + ", " + array[1] + " and " + array[2] + " like this";
        } else if (array.length >= 4) {
            output = array[0] + ", " + array[1] + " and " + (array.length - 2) + " others like this";
        }
        return output;
    }
}
