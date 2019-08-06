import com.greg.vehicule.Vehicule;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

    static void addVehicule(Vehicule vehicule){
        vehiculeList.add(vehicule);
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
            for (Vehicule v : vehiculeList) str.append(v.toString());
        else str.append("Le garage est vide");
        return str.toString();
        }

}