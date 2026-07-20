class Solution {
    public int countSeniors(String[] details) {
        int seniors = 0; 
        for(int i = 0; i < details.length; i++){
            String current = details[i];
            String age = current.substring(11, 13);
            if(Integer.parseInt(age) > 60){
                seniors++;
            }
        }
        return seniors;
    }
}