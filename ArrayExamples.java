import tester.*;
class ArrayExamples {

    // Return true if the array has
    // no elements, false otherwise
    boolean isEmpty(int[] array) {
        return array.length == 0;
    }

    int[] nums = {4, 2, 7};
    int[] emptyNums = {};
    int[] nums2 = nums;

    boolean testEmpty(Tester t) {
        return t.checkExpect(this.isEmpty(nums), false) &&
            t.checkExpect(this.isEmpty(emptyNums), true);
    }

    String[] strs = {"a", "b", "z", "y"};
    int countStrs = strs.length;

}