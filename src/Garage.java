import com.greg.vehicule.Vehicule;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Garage implements Serializable {
    private static List<Vehicule>  vehiculeList = new ArrayList<>();

    Garage() {
        ObjectInputStream ois = null;
        File file = new File("garage.pages");


        if (file.length() > 0) {
            try {
                ois = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(file)));
                vehiculeList = (ArrayList<Vehicule>) ois.readObject();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert ois != null;
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    void addVehicule(Vehicule vehicule){
        if (vehiculeList.size() > 0) vehicule.setId((vehiculeList.get(vehiculeList.size() - 1).getId()) + 1);
        else vehicule.setId(1);
        vehiculeList.add(vehicule);
        saveGarage();
    }
    private static void saveGarage(){
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    new File("garage.pages"))));

            oos.writeObject(vehiculeList);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert oos != null;
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String toString(){
        StringBuilder str = new StringBuilder("***************************\n*  Garage OpenClassrooms  *\n***************************\n");

        if ( vehiculeList.size() > 0 )
            for (Vehicule v : vehiculeList) str.append(v.getId()).append(" ").append(v.toString());

        else str.append("Le garage est vide");
        return str.toString();
        }

        void deleteVehicule(){
            char a;
            boolean found = false;
            do {
                System.out.println("\nVoulez- vous supprimer une voiture du garage ? ( O/N )");
                Scanner sc = new Scanner(System.in);
                a = sc.nextLine().charAt(0);

                if (a == 'O') {
                    ListIterator<Vehicule> it = vehiculeList.listIterator();
                    System.out.println(this);
                    System.out.println("Entrez le numéro de la voiture que vous voulez supprimer");
                    int choice = sc.nextInt();
                    while (it.hasNext()){
                        Vehicule v = it.next();
                        if (choice == v.getId()) {
                            it.remove();
                            found = true;
                        }
                    }
                }if (!found && a == 'O') System.out.println("Vous n'avez pas choisi parmi les vehicules du garage !");
            }while ( a == 'O');
            System.out.println(this);
            saveGarage();
        }

}