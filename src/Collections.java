import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void main (String[] args){
        manageData();
        notes();
        hotelReservation();
        translator();
    }

    public static void manageData (){
        List<String> userDatas = new ArrayList<>();
        userDatas.add("Buse");
        userDatas.add("buseayrancioglu@gmail.com");
        userDatas.add("(telephone number)");
        for(String userData : userDatas){
            System.out.println(userData);
        }
    }
    public static void notes (){
        List<Integer> classNotes = new ArrayList<>();
        classNotes.add(50);
        classNotes.add(87);
        classNotes.add(63);
        classNotes.add(26);

        int totalNotes = 0;
        for(Integer note: classNotes){
            totalNotes += note;
        }
        double averageNote = (double) totalNotes / (classNotes.size());
        System.out.println("The average note:" + averageNote);
    }
    public static void hotelReservation (){
        Map<Integer, String> reservation = new HashMap<>();
        reservation.put(1,"Full");
        reservation.put(2,"Full");
        reservation.put(3,"Empty");
        reservation.put(4,"Empty");
        reservation.put(5,"Full");
        System.out.println("Rooms:");
        for(Map.Entry < Integer, String > entry : reservation.entrySet()){
            System.out.println(entry.getKey() + ">" + entry.getValue());
        }
    }
    public static void translator (){
        Map<String, String> translation = new HashMap<>();
        translation.put("la campagne", "the countryside");
        translation.put("la nature", "the nature");
        translation.put("la champ", "the field");
        translation.put("le nuage", "the cloud");
        translation.put("le lac", "the lake");
        System.out.println("French-English dictionary:");
        for (Map.Entry < String, String > entry : translation.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
