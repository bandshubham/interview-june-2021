package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    int[] binaryNum=new int[1000];
    int i=0;
    int m=n;
    
    while(m>0)
    {
        binaryNum[i]=m%2;
        m=m/2;
        i++;
    }
    
    String[] strArray = new String[binaryNum.length];
    for (i = 0; i < binaryNum.length; i++) {
            strArray[i] = String.valueOf(binaryNum[i]);
        }
        
    return "strArray";
  }
}
