import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private File arquivo;

    public Store(String caminho) {
        this.arquivo = new File(caminho);
    }

    public void salvarComando(String linha) {
        try (FileWriter fw = new FileWriter(arquivo, true)) {
            fw.write(linha + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> carregarComandos() {
        List<String> comandos = new ArrayList<>();

        if (!arquivo.exists()) {
            return comandos;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                comandos.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return comandos;
    }

    public void limpar() {
        try (FileWriter fw = new FileWriter(arquivo, false)) {
            fw.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
