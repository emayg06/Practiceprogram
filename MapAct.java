import java.util.HashMap;

public class MapAct
{
    public static void main(String[] args)
    {
        Map<String, String> programs = new HashMap<>();
        
        programs.put("BSIT", "Bachelor of Science in Information Technology");
        programs.put("BSCS", "Bachelor of Science in Computer Science");
        programs.put("BSIS", "Bachelor of Science in Information Systems");
        
        System.out.println("Keys: " + programs.keySet());
        
        programs.remove("BSIT");
        
        for(Map.Entry e : programs.entrySet())
        {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        
        System.out.println("Does it have BSCpE?" + programs.containsKey("BSCpE"));
    }
}