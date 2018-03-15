package com.msk.automobiles.util;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class UtilityClass
{

	public String postRedirect(String url, String applicationState)
	{
		
		String htmlResponse = "<html> <body> \n"
                + "      \n"
                + "  \n"
                + "  <h1></h1>\n"
                + "  \n" + "<div>"
                + "        <form id=\"form\" action=\"" + url + "\"  name=\"form\" method=POST >\n"
                + "      <input type=\"hidden\" name=\"applicationState\" value="+applicationState+">"
                + "    </form>\n"
                + " <script> "
                + " document.getElementById(\"form\").submit(); "
                + " </script> "
                + "       </div>   "
                + "  \n"
                + "  </body>\n"
                + "</html>";
		
		
		return htmlResponse;
	
	}//postRedirect()
	
	
	public String generateUniqueValue()
	{
		String result = RandomStringUtils.random(12, 1, 25, true, true, "9vund96d2tf43e04m825ditfi".toCharArray());
		return result;
	}
	
	
}//Class UtilityClass