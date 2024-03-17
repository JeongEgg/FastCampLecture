package part1.ch2;

public class IntArrayBasic {
    // 1
    public static void main(String[] args) {
        int[] nums = new int[5]; // 배열 생성동작
        nums[0]=1; // 배열 저장동작
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;

        // 배열 길이 구하는 동작
        for (int i=0; i<nums.length; i++){
            int data = nums[i]; // 데이터를 가져오는 동작
            System.out.println(nums[i]);
        }
        for (int data : nums){
            System.out.println(data);
        }
    }
}
