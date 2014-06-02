import java.io.*;
import java.net.*;
import java.util.*;

class TCPserver
{

	public static void main(String args[])throws IOException
	{
		
		ServerSocket ss=new ServerSocket(2000);
		Socket s=ss.accept();

		Scanner sc=new Scanner(System.in);
		while(true)
		{
			//System.out.println("enter data:");
			//String str=sc.next();
			DataOutputStream otc=new DataOutputStream(s.getOutputStream());
			BufferedReader ifc=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg=ifc.readLine();
			//System.out.println("from client:" +msg);
			otc.writeBytes(msg.toUpperCase() +"\n");
		}
	}
}