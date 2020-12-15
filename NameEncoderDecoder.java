public class NameEncoderDecoder{
    public String encode(String name){
    name = name.replace("e", "1")
               .replace("u", "2")     
               .replace("i", "3")
               .replace("o", "4")  
               .replace("a", "5");
    return name = String.join("", "NOTFORYOU", name, "YESNOTFORYOU");
    }
    public String decode(String name){
           int length = name.length();
           int length1 = 9;
           int length2 = 12;
           name = name.substring((length1), (length-length2));
           name = name.replace("1", "e")
               .replace("2", "u")     
               .replace("3", "i")
               .replace("4", "o")  
               .replace("5", "a");
    return name;
    }
  
    public static void main(String[] args){
    NameEncoderDecoder decoder = new NameEncoderDecoder();
    System.out.println(decoder.encode("Crab"));
    System.out.println(decoder.decode("NOTFORYOUCr5bYESNOTFORYOU"));
    System.out.println(decoder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }
}
