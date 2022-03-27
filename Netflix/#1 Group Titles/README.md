First, we need to figure out a way to individually group all the character combinations of each title. Suppose the content library contains the following titles: `"duel", "dule", "speed", "spede", "deul", "cars"`. How would you efficiently implement a functionality so that if a user misspells `speed` as `spede`, they are shown the correct title?

We want to split the list of titles into sets of words so that all words in a set are anagrams. In the above list, there are three sets: `{"duel", "dule", "deul"}, {"speed", "spede"}, and {"cars"}`. Search results should comprise all members of the set that the search string is found in. We should pre-compute these sets instead of forming them when the user searches a title.

Here is an illustration of this process:



![Screen Shot 2022-03-27 at 1.22.34 PM](/Users/yu/Library/Application Support/typora-user-images/Screen Shot 2022-03-27 at 1.22.34 PM.png)