package IDS17J;

public class Compliant17{
    public String resolveEntity(String publicId, String file){

        // Check for known good entities
        String[] whiteList = {"file:/Users/onlinestore/good.xml", "file:/Users/onlinestore/good2.xml"};
        for (int i = 0; i < whiteList.length; i++) {
            if (file.equals(whiteList[i])) {
                System.out.println("Resolving entity: " + publicId + " " + file);
                return file;
            }
        }
        // Disallow unknown entities by returning a blank path
        return "";
    }
}
