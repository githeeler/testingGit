package jdk7;


public class TryWithResources {

	
	//From Jdk7 add classes implementing AutoCloseable interface (and its close() method) can be used with in this block. 
	//Usefully for closing streams on files/sockets (BufferedReader, BufferedWriter, PrintWriter, ....)
	//These resources are usually closed within finally method (try/catch/finally structure).  
	
	public static void main(String[] args) {
	

			try(
					HTMLTag h1 = new HTMLTag("H1");
					HTMLTag em = new HTMLTag("em");
			)
			{
				em.body("some body of html page");
			}
			catch (Exception e) {				//must be implemented for automatic close() calling.
												//IMPORTANT: Resources are closed in backward order (close first the latest created) 
				e.printStackTrace();
			}
	}
}

class HTMLTag implements AutoCloseable
{
		public String name;
		
		public HTMLTag(String tagName)				//constructor is called always first
		{
			System.out.println("<" + tagName + ">");
			this.name = tagName;
		}

		@Override
		public void close() throws Exception		//called during resource closing
		{
			System.out.println("</" + name + ">");	//show closing tag
		}

		//some additional method
		public void body(String content)
		{
			System.out.println("<body>" + content  + "</body>" );
		}
		
}