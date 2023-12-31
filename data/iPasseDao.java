package data;
import java.util.ArrayList;
import model.*;

public interface iPasseDao{
    ArrayList<Passe> getAllPasses();
    void createPasseAluno (Passe passe);
    void createPasseIdoso (Passe passe);
    void createPasseClt (Passe passe);
    Passe readPasse (String numCartao, int tipoPasse);
    void updatePasse (Passe passe, int tipoPasse);
    void deletePasse (Passe passe);
}