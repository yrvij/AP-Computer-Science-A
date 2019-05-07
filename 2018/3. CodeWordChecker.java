public class CodeWordChecker implements StringChecker {
  private String str;
  private int upper;
  private int lower;
  private String unincluded;

  public CodeWordChecker(String str) {
    this.str = str;
  }

  public CodeWordChecker(int lower, int upper, String unincluded) {
    this.lower = lower;
    this.upper = upper;
    this.unincluded = unincluded;
  }

  public CodeWordChecker(String str) {
    this.str = str;
  }

  public boolean isValid() {
    if (upper == 0 && lower == 0) {
      if (str.length() >= 6 && str.length() <= 20) {
        return true;
      }
      return false;
    } else {
      if (str.length() >= lower && str.length() <= upper) {
        for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == unincluded) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
  }

}
