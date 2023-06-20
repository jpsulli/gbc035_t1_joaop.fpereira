import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persist {
    public static boolean gravar(Object a, String arquivo){
        try{
            //Geraoarquivoparaarmazenarosobjetos
            FileOutputStream arquivoGrav = new FileOutputStream(arquivo);
            //Classeresponsavelporinserirosobjetos
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            //Gravaoobjetoclientenoarquivo
            objGravar.writeObject(a);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            return true;
        }catch(Exception e) {
            return false;
        }
    }

    public static Object recuperar(String arquivo){
        Object obj = null;
        FileInputStream arquivoLeitura = null;
        ObjectInputStream objLeitura = null;
        try{
            //Carregaoarquivo
            arquivoLeitura = new FileInputStream(arquivo);
            //Classeresponsavelporrecuperarosobjetosdoarquivo
            objLeitura = new ObjectInputStream(arquivoLeitura);
            //Leoobjeto
            obj = objLeitura.readObject();
            objLeitura.close();
            arquivoLeitura.close();
        }catch(Exception e){
            return null;
        }
        return obj;
    }
}
