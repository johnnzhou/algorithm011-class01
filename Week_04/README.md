

```java

int binarySearch(int[] nums) {

    if (nums.length == 0) { return -1; }
    else if (nums[0] < nums[nums.length - 1]) {return -1;}

    int lo = 0;
    int hi = nums.length - 1;

    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if ( nums[mid] > nums[mid + 1] ) {
            return mid + 1;
        } else if ( nums[mid] < nums[mid -1] ) {
            return mid;
        } else if ( nums[mid] > nums[0] ) {
            lo = mid + 1;
        } else {
            hi = mid -1;
        }
    }

}

```