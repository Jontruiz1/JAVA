/*
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
 * 
 * close10(8, 13) → 8
 * close10(13, 8) → 8
 * close10(13, 7) → 0
 */
public int close10(int a, int b) {
    return (Math.abs(a - 10) < Math.abs(b - 10) ? a : Math.abs(a-10) == Math.abs(b-10) ? 0 : b);
  }
  