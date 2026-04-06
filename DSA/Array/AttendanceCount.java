public class AttendanceCount {
    public static void main(String[] args) {
        int[] attendance = {1,1,0,1,0,1};
        int PresentCount = 0;
        int AbsentCount = 0; 
        for(int i : attendance){
            if(i == 1){
                PresentCount++;
            }
            else{
                AbsentCount++;
            }
        }

        System.out.println("Total Present: " + PresentCount);
        System.out.println("Total Absent: " + AbsentCount);

    }
}