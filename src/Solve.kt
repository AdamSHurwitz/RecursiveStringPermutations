/**
 * 1. Iterate through each char and move the char to each position of the input String
 * 2. Add each version to the Set
 * Time complexity: O(n^2)
 **/
fun allPerm(input: String, lookAtIndex: Int, set: HashSet<String>): HashSet<String> {
    if (lookAtIndex <= input.length - 1) {
        for (i in 0 .. input.length - 1) {
            val combo = input.substring(0, lookAtIndex) +
                    input.substring(lookAtIndex + 1)
            set.add(combo.substring(0, i) + input.get(lookAtIndex) +
                    combo.substring(i))
        }
        allPerm(input, lookAtIndex + 1, set)
    }
    return set
}
