import java.io.*;
import java.net.*;
import java.util.*;

class TCPclient
{

	public static void main(String args[])throws IOException
	{
		Socket s=new Socket("localhost",2000);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter data:");
			String str=sc.next();
			DataOutputStream ots=new DataOutputStream(s.getOutputStream());
			BufferedReader ifs=new BufferedReader(new InputStreamReader(s.getInputStream()));
			ots.writeBytes(str +"\n");
			System.out.println("from server:" +ifs.readLine());
		}
	}
}