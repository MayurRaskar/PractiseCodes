public class Main {
  public static void main(String[] args) {
  // Write your code here
  int[] nums={1,6,3,0,8,4,1,7};
 int n=nums.length;
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    for(int k=0;k<n;k++){
    if(nums[i]+nums[j]+nums[k]==7){
      System.out.println("("+nums[i]+","+nums[j]+","+nums[k]+")");
    }
  }
  }
  }
 }
}