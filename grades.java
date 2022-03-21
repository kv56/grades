import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public  class grades{
    public static void main(String[] args){
        String file = "grades.csv";
        String line;
        int i=0;
        float grades1=0,grades2=0,grades3=0,grades4=0;
        String Topper1="",Topper2="",Topper3="",Topper4="",S1="",S2="",S3="",S4="";
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        try (BufferedReader br =new BufferedReader(new FileReader(file))){
            while((line = br.readLine()) != null){
                if(i!=0){
                    String[] key =line.split(",");
                if(Float.parseFloat(key[3].trim())>grades1){
                    grades1=Float.parseFloat(key[3].trim());
                    Topper1=key[1].replaceAll("^\"|\"$", "") + " "+key[0].replaceAll("^\"|\"$", "");
                    S1=key[2];
                }
                if(Float.parseFloat(key[4])>grades2){
                    grades2=Float.parseFloat(key[4].trim());
                    Topper2=key[1].replaceAll("^\"|\"$", "") + " "+key[0].replaceAll("^\"|\"$", "");
                    S2=key[2];
                }
                if(Float.parseFloat(key[5])>grades3){
                    grades3=Float.parseFloat(key[5].trim());
                    Topper3=key[1].replaceAll("^\"|\"$", "") + " "+key[0].replaceAll("^\"|\"$", "");
                    S3=key[2];
                } 
                if(Float.parseFloat(key[6])>grades4){
                    grades4=Float.parseFloat(key[6].trim());
                    Topper4=key[1].replaceAll("^\"|\"$", "") + " "+key[0].replaceAll("^\"|\"$", "");
                    S4=key[2];
                }                 
            }
                else{
                    i=i+1;
                }


            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Test 1 topper name is: "+Topper1+"  SSN is: "+S1.trim());
        System.out.println("Test 2 topper name is: "+Topper2+"  SSN is: "+S2.trim());
        System.out.println("Test 3 topper name is: "+Topper3+"  SSN is: "+S3.trim());
        System.out.println("Test 4 topper name is: "+Topper4+"  SSN is: "+S4.trim());
    }
}