/**
 * 1. Recursively generate each permutation of characters.
 * 2. For every permutation, iterate through each index and move the last character to each position of the permutation.
 * 3. Add each permutation to the Set
 * Time complexity: O(n^2)
 * Space complexity: O(n^n)
 *
 * See: Generate Unique String Permutations Recursively - Optimization and Complexity
 * [https://codereview.stackexchange.com/a/251518/220526]
 **/
fun getPerms(input: String): HashSet<String> {
    val perms = hashSetOf<String>()
    if (input.length <= 1)
        return hashSetOf(input)
    val allCharsExceptLast = input.substring(0, input.length - 1)
    val permsOfAllCharsExceptLast = getPerms(allCharsExceptLast)
    val lastChar = input.substring(input.length - 1)
    for (s in permsOfAllCharsExceptLast) {
        for (i in 0.. allCharsExceptLast.length) {
            perms.add(s.substring(0, i) + lastChar + s.substring(i))
        }
    }
    return perms
}
