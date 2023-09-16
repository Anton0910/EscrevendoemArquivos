package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String []lines = new String[] {"ola", "Bom dia"};
		
		String path = "D:\\eclipse\\projetos\\EscrevendoemArquivos\\escrever.txt";
		
		try(BufferedWriter bf = new BufferedWriter(new FileWriter(path,true))){
			for (String line : lines) {
				bf.write(line);
				bf.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
