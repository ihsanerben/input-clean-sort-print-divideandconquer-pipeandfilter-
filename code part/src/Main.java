import java.util.List;

public class Main {
    public static void main(String[] args) {

        // HOCAM BU CLASS'I SYSTEM1 İ TEST ETMEK İÇİN OLUŞTURDUK. KULLANMASAK DA OLUR
        // PROBLEM YOK

        Blackboard blackboard = new Blackboard();
        blackboard.addData("ihsan");
        blackboard.addData("eren");
        blackboard.addData("ihsaneren");
        blackboard.addData("ihsanerenerben");

        List<String> data = blackboard.getData();

        // Orijinal listeyi yazdırıyoruz
        System.out.println("Orijinal Liste: " + data);

        // Listeyi sıralamak için mysort sınıfının sortData metodunu çağırıyoruz
        List<String> sortedData = mysort.sortData(data);

        // Sıralanmış listeyi yazdırıyoruz
        System.out.println("Sıralanmış Liste: " + sortedData);
    }
}
