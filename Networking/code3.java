import java.net.*;
import java.awt.*;
import java.io.*;

class OpenWebSite {

	public static void main(String [] args)throws IOException,URISyntaxException{

		String url = "www.google.com";

		URI obj = new URI(url);

		Desktop desk = Desktop.getDesktop();

		if(desk.isSupported(Desktop.Action.BROWSE))
			desk.browse(obj);
		else
			System.out.println("Desktop Browsing is not supported");
	}
}
