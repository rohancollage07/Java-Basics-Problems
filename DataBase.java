import java.util.HashMap;
import java.util.Map;

public class DataBase {
    
    public static void main(String[] args) {
        // Sample table data
        Map<String, Object> record1 = new HashMap<>();
        record1.put("DOCNAME", "TriggerTest.txt");
        record1.put("CREATEDATE", 2015);
        record1.put("CATEGORY", "DEFAULT");
        
        Map<String, Object> record2 = new HashMap<>();
        record2.put("DOCNAME", "JFAMEM.doc");
        record2.put("CREATEDATE", 2022);
        record2.put("CATEGORY", "EXPENSE");

        
        Map<String, Object> record3 = new HashMap<>();
        record3.put("DOCNAME", "IMG_1482.JPG");
        record3.put("CREATEDATE", 2022);
        record3.put("CATEGORY", "RECIEPT");

        Map<String, Object> record4 = new HashMap<>();
        record4.put("DOCNAME", "IMG_1482.JPG");
        record4.put("CREATEDATE", 2022);
        record4.put("CATEGORY", "RECIEPT");
        
        Map<String, Object> record5 = new HashMap<>();
        record5.put("DOCNAME", "JFAMEM.00162605.doc");
        record5.put("CREATEDATE", 2018);
        record5.put("CATEGORY", "EXPENSE");
        
        // Add more records if needed
        
        // Create an array of records
        Map<String, Object>[] records = new Map[]{record1, record2, record3, record4, record5};
        
        // Iterate over each record and update the document name
        for (Map<String, Object> record : records) {
            String docName = (String) record.get("DOCNAME");
            String CATEGORY = (String) record.get("CATEGORY");

            int createDate = (int) record.get("CREATEDATE");

            String newDocName = "";
            
            if (createDate < 2020) {
                newDocName = "PrePandemic_" + docName;
            } else {
                // Check if the filename is duplicate
                boolean isDuplicate = checkDuplicate(records, docName);
                
                if (isDuplicate) {
                    // Find the duplicate file number
                    int duplicateNumber = getDuplicateNumber(records, docName);
                    
                    // Update the document name with the duplicate number and category
                    newDocName = duplicateNumber + "$"+  CATEGORY +"$" + docName;
                } else {
                    // Update the document name with the category
                    newDocName = CATEGORY + "$" + docName;
                }
            }
            
            // Store the new document name in the "NEW_NAME" column
            record.put("NEW_NAME", newDocName);
            
            // Print the updated record
            System.out.println(record);
        }
    }
    
    // Check if the filename is duplicate
    private static boolean checkDuplicate(Map<String, Object>[] records, String docName) {
        int count = 0;
        
        for (Map<String, Object> record : records) {
            String recordDocName = (String) record.get("DOCNAME");
            
            if (recordDocName.equals(docName)) {
                count++;
                
                if (count > 1) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    // Get the duplicate file number
    private static int getDuplicateNumber(Map<String, Object>[] records, String docName) {
        int count = 0;
        
        for (Map<String, Object> record : records) {
            String recordDocName = (String) record.get("DOCNAME");
            
            if (recordDocName.equals(docName)) {
                count++;
                
                if (count > 1) {
                    return count;
                }
            }
        }
        
        return 0;
    }
}

