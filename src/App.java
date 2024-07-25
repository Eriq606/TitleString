public class App {
    private static boolean checkTitle(String title){
        String[] words=title.split("\\s+");
        boolean isTitle=true;
        for(String s:words){
            if(!Character.isUpperCase(s.charAt(0))){
                isTitle=false;
                break;
            }
        }
        return isTitle;
    }
    public static void main(String[] args) throws Exception {
        String title1="A Mind Boggling Achievement";
        String title2="A Simple C++ Program!";
        String title3="Water is transparent";

        System.out.println(checkTitle(title1)); // -> true
        System.out.println(checkTitle(title2)); // -> true
        System.out.println(checkTitle(title3)); // -> false
    }
}
