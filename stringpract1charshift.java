class stringpract1charshift{
    public static void main(String[] args) {
        String tt="Hi there we are 6";
        int i; 
        for(i=0;i<tt.length();i++){
            char y=tt.charAt(i);
            int test=y+1;//converting char to ASCII values and Adding 6 to shift the values foward
            char yi=(char) test; //Type Casting , changing integer values to characters using ASCII code
            System.out.print(yi);//Printing the Shifted Values
           
        }
        // System.out.println("Hi");
    }
}