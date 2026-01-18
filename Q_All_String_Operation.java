public class Q_All_String_Operation {
    public static void main(String[] args){

        String str = "  Hello World  ";
        
        // 1. Creation
        String str2 = new String("Java");
        
        // 2. Length & Access
        System.out.println("Length: " + str.length());
        System.out.println("CharAt(1): " + str.charAt(1));
        
        // 3. Comparison
        System.out.println("Equals: " + str2.equals("Java"));
        System.out.println("EqualsIgnoreCase: " + str2.equalsIgnoreCase("java"));
        System.out.println("CompareTo: " + str2.compareTo("Python"));
        
        // 4. Searching
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("IndexOf 'o': " + str.indexOf('o'));
        System.out.println("LastIndexOf 'o': " + str.lastIndexOf('o'));
        System.out.println("StartsWith 'He': " + str.trim().startsWith("He"));
        System.out.println("EndsWith 'ld': " + str.trim().endsWith("ld"));
        
        // 5. Modification
        System.out.println("UpperCase: " + str.toUpperCase());
        System.out.println("LowerCase: " + str.toLowerCase());
        System.out.println("Trim: '" + str.trim() + "'");
        System.out.println("Replace 'l' with 'x': " + str.replace("l", "x"));
        System.out.println("Substring(0,5): " + str.substring(0, 5));
        
        // 6. Splitting & Joining
        String[] parts = str.trim().split(" ");
        System.out.println("Split: " + java.util.Arrays.toString(parts));
        System.out.println("Join: " + String.join("-", parts));
        
        // 7. Conversion
        System.out.println("ValueOf int: " + String.valueOf(123));
        System.out.println("ParseInt: " + Integer.parseInt("456"));
        System.out.println("ToCharArray: " + java.util.Arrays.toString(str.toCharArray()));
        
        // 8. Other Utilities
        System.out.println("IsEmpty: " + "".isEmpty());
        System.out.println("Repeat: " + "Hi".repeat(3));
        System.out.println("Concat: " + str.concat("!!!"));
    }
}
