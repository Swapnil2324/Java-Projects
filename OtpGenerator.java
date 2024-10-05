class OtpGenerator
{
    public static void main(String[] args)
    {
        String op=generateOtp();
        System.out.println(op);
    }
    public static String generateOtp()
    {
        String otp="";
        for(int i=1;i<=4;i++)  // for 4 digit otp 
        {
            otp+=(int)(Math.random()*9);
        }
        return otp;
    }
}