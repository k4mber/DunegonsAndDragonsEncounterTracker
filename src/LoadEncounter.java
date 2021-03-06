import java.io.FileInputStream;
import java.io.ObjectInputStream;

class LoadEncounter {
    Encounter loadEncounter(){
        try {
            FileInputStream saveFile = new FileInputStream("EncounterSave.txt");
            ObjectInputStream save = new ObjectInputStream(saveFile);
            Encounter encounter = (Encounter) save.readObject();
            save.close();
            return encounter;
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return null;
    }
}
