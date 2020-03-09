import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class InputOutput 
{

	public static void main(String[] args)
	{
	try
	{
		String input="G:\\IO\\ExcelInput.xlsx";
		String output="G:\\IO\\ExcelOutput.xlsx";
		
		
	
		FileReader fr=new FileReader(input);
		FileWriter fw=new FileWriter(output);
		
		BufferedReader bf=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String x;
		
		while((x=bf.readLine())!=null)
		{
			bw.write(x);
		}
		bw.flush();	

	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}