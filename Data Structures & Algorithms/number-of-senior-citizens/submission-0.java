class Solution {
    public int countSeniors(String[] details) {
        int seniors = 0; 
        for(int i = 0; i < details.length; i++){
            String current = details[i];
            
            String phone = current.substring(0, 10);

            String gender = current.substring(10, 11);

            String age = current.substring(11, 13);

            String seat = current.substring(13, current.length());

            if(Integer.parseInt(age) > 60){
                seniors++;
            }
        }
        return seniors;
    }
}